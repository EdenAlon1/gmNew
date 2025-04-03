package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avml extends avmy {
    private avoi a;
    private Instant b;

    @Override // defpackage.avmy
    public final avmz a() {
        if (this.a != null && this.b != null) {
            return new avmn(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rcsCapabilities");
        }
        if (this.b == null) {
            sb.append(" lastRefreshTimestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.avmy
    public final void b(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null lastRefreshTimestamp");
        }
        this.b = instant;
    }

    @Override // defpackage.avmy
    public final void c(avoi avoiVar) {
        if (avoiVar == null) {
            throw new NullPointerException("Null rcsCapabilities");
        }
        this.a = avoiVar;
    }
}
