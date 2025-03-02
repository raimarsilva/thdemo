package rai.practices.thdemo.domain.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

//import org.springframework.data.annotation.Id;

@EntityScan
public record Comment(Long id, String text) {
}
