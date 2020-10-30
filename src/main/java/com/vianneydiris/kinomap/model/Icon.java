package com.vianneydiris.kinomap.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

/**
 * The type Icon.
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Icon {
    public Icon() {
    }

    private Anchor anchor;
    private Size size;
    private Url url;
}
