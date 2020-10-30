package com.vianneydiris.kinomap.model;

import lombok.*;

/**
 * The type Url.
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Url {
    public Url() {
    }

    private String left;
    private String right;
    private String size50x50;
}
