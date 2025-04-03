package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpcm extends cpcz {
    private final UUID a;
    private final Instant b;
    private final Optional c;

    public cpcm(UUID uuid, Instant instant, Optional optional) {
        if (uuid == null) {
            throw new NullPointerException("Null syncId");
        }
        this.a = uuid;
        if (instant == null) {
            throw new NullPointerException("Null currentExecutionStartTime");
        }
        this.b = instant;
        this.c = optional;
    }

    @Override // defpackage.cpcz
    public final Instant a() {
        return this.b;
    }

    @Override // defpackage.cpcz
    public final Optional b() {
        return this.c;
    }

    @Override // defpackage.cpcz
    public final UUID c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpcz) {
            cpcz cpczVar = (cpcz) obj;
            if (this.a.equals(cpczVar.c()) && this.b.equals(cpczVar.a()) && this.c.equals(cpczVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Instant instant = this.b;
        return "CurrentSyncData{syncId=" + this.a.toString() + ", currentExecutionStartTime=" + instant.toString() + ", firstExecutionStartTime=" + optional.toString() + "}";
    }
}
