package com.vianneydiris.kinomap.model;

import lombok.*;

/**
 * The type Size.
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Size {
    public Size() {
    }

    private int height;
    private int width;
}
