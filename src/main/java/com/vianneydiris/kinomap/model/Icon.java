package com.vianneydiris.kinomap.model;

import lombok.*;

/**
 * The type Icon.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Icon {
    private Anchor anchor;
    private Size size;
    private Url url;
}
