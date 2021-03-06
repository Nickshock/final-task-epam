package com.epam.hotelbooking.builder.factory;

import com.epam.hotelbooking.builder.*;
import com.epam.hotelbooking.entity.*;
import com.epam.hotelbooking.entity.dto.ApplicationBillDto;
import com.epam.hotelbooking.entity.dto.ApplicationDto;
import com.epam.hotelbooking.entity.dto.RoomDto;

/**
 * Creates an object of {@link Identifiable} builder.
 *
 * @author Nickolai Barysevich.
 */
public class BuilderFactory {

    /**
     * Creates specified builder by {@code tableName}.
     *
     * @param tableName the name of the entity which builder is needed.
     * @return specified builder.
     */
    public static Builder<? extends Identifiable> create(String tableName) {
        switch (tableName) {
            case User.TABLE_NAME:
                return new UserBuilder();
            case Application.TABLE_NAME:
                return new ApplicationBuilder();
            case Bill.TABLE_NAME:
                return new BillBuilder();
            case Room.TABLE_NAME:
                return new RoomBuilder();
            case ApplicationBillDto.TABLE_NAME:
                return new ApplicationBillDtoBuilder();
            case ApplicationDto.TABLE_NAME:
                return new ApplicationDtoBuilder();
            case RoomDto.TABLE_NAME:
                return new RoomDtoBuilder();
            default:
                throw new UnsupportedOperationException();
        }
    }


}
