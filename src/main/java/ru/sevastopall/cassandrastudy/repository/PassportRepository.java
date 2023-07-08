package ru.sevastopall.cassandrastudy.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sevastopall.cassandrastudy.domain.Passport;

public interface PassportRepository extends CrudRepository<Passport, Long> {
}
