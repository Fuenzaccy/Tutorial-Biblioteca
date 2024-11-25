package com.ccsw.tutorial.loan.model;

import com.ccsw.tutorial.client.model.ClientDto;
import com.ccsw.tutorial.game.model.GameDto;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class LoanDto {

    private Long id;
    private GameDto game;
    private ClientDto client;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date startDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date endDate;

    /**
     * @return id
     */
    public Long getId() {

        return this.id;
    }

    /**
     * @param id new value of {@link #getId}.
     */
    public void setId(Long id) {

        this.id = id;
    }

    /**
     * @return game
     */
    public GameDto getGame() {

        return this.game;
    }

    /**
     * @param game new value of {@link #getGame}.
     */
    public void setGame(GameDto game) {

        this.game = game;
    }

    /**
     * @return client
     */
    public ClientDto getClient() {

        return this.client;
    }

    /**
     * @param client new value of {@link #getClient}.
     */
    public void setClient(ClientDto client) {

        this.client = client;
    }

    /**
     * @return startDate
     */
    public Date getStartDate() {

        return this.startDate;
    }

    /**
     * @param startDate new value of {@link #startDate}.
     */
    public void setStartDate(Date startDate) {

        this.startDate = startDate;
    }

    /**
     * @return endDate
     */
    public Date getEndDate() {

        return this.endDate;
    }

    /**
     * @param endDate new value of {@link #endDate}.
     */
    public void setEndDate(Date endDate) {

        this.endDate = endDate;
    }
}
