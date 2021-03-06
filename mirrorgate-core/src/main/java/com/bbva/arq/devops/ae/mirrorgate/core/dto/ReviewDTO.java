/*
 * Copyright 2017 Banco Bilbao Vizcaya Argentaria, S.A..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bbva.arq.devops.ae.mirrorgate.core.dto;

/**
 * Created by alfonso on 30/6/17.
 */
public class ReviewDTO {

    private String author;
    private double rate;
    private long timestamp;
    private String comment;

    public String getAuthor() {
        return author;
    }

    public ReviewDTO setAuthor(String author) {
        this.author = author;
        return this;
    }

    public double getRate() {
        return rate;
    }

    public ReviewDTO setRate(double rate) {
        this.rate = rate;
        return this;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public ReviewDTO setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public ReviewDTO setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
