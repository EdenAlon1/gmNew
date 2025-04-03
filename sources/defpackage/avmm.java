package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
class avmm extends avmz {
    public final avoi a;
    private final Instant c;

    public avmm(avoi avoiVar, Instant instant) {
        if (avoiVar == null) {
            throw new NullPointerException("Null rcsCapabilities");
        }
        this.a = avoiVar;
        if (instant == null) {
            throw new NullPointerException("Null lastRefreshTimestamp");
        }
        this.c = instant;
    }

    @Override // defpackage.avmz
    public final avoi a() {
        return this.a;
    }

    @Override // defpackage.avmz
    public final Instant b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avmz) {
            avmz avmzVar = (avmz) obj;
            if (this.a.equals(avmzVar.a()) && this.c.equals(avmzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }
}
