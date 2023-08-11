package com.example.tset.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

public class BoardDto {

    @Getter
    @AllArgsConstructor
    public static class Post {
        @NotBlank(message = "title은 비어 있으면 안됩니다")
        private String title;
        @NotBlank(message = "problem은 비어 있으면 안됩니다")
        private String problem;
        @NotBlank(message = "expecting는 비어 있으면 안됩니다")
        private String expecting;

        private Timestamp createdat;
    }

    @Getter
    public static class Patch {
        private long boardId;

        @NotBlank(message = "title은 비어 있으면 안됩니다")
        private String title;
        @NotBlank(message = "problem은 비어 있으면 안됩니다")
        private String problem;
        @NotBlank(message = "expecting는 비어 있으면 안됩니다")
        private String expecting;

        private Timestamp updatedat;

        public void setBroadId(long boardId) {
            this.boardId = boardId;
        }
    }

    @Builder
    @Getter
    public static class Reponse {
        private long boardId;

        private String title;

        private String problem;

        private String expecting;
    }
}
