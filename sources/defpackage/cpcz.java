package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cpcz {
    static cpcz d(UUID uuid, Instant instant, Instant instant2) {
        return new cpcm(uuid, instant, Optional.of(instant2));
    }

    public abstract Instant a();

    public abstract Optional b();

    public abstract UUID c();
}
