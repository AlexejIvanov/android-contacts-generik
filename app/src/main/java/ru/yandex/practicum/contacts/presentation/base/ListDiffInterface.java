package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

    // Интерфейс для сравнения
public interface ListDiffInterface<T> {
    // Сравнение по ID
    boolean theSameAs(T newItem);

    // Сравнение по содержимому
    @Override
    boolean equals(Object newItem);
}
