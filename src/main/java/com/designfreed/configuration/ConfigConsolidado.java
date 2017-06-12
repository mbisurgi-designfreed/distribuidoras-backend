package com.designfreed.configuration;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import com.designfreed.services.EmpresaService;
import com.designfreed.services.implementation.EmpresaServiceRepositoryImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "consolidadoEntityManagerFactory",
        transactionManagerRef = "consolidadoTransactionManager",
        basePackages = { "com.designfreed.consolidado.repositories" })
public class ConfigConsolidado {
    @Bean(name = "consolidadoDataSource")
    @ConfigurationProperties(prefix="spring.datasource.consolidado")
    public DataSource barDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "consolidadoEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean barEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("consolidadoDataSource") DataSource barDataSource) {
        return builder
                .dataSource(barDataSource)
                .packages("com.designfreed.consolidado.domain")
                .persistenceUnit("consolidado")
                .build();
    }

    @Bean(name = "consolidadoTransactionManager")
    public PlatformTransactionManager barTransactionManager(
            @Qualifier("consolidadoEntityManagerFactory") EntityManagerFactory barEntityManagerFactory) {
        return new JpaTransactionManager(barEntityManagerFactory);
    }
}
