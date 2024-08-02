package cloud.solvo.worker.utils;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Getter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Life implements Serializable
{
    @Column(name = "since")
    private ZonedDateTime since;

    @Column(name = "until")
    private ZonedDateTime until;
}