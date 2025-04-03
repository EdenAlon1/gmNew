package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkjc extends dkjw {
    public final int a;
    public final Duration b;
    private final int h;

    public dkjc(int i, int i2, Duration duration) {
        this.a = i;
        this.h = i2;
        this.b = duration;
    }

    @Override // defpackage.dkjw
    public final int a() {
        return this.h;
    }

    @Override // defpackage.dkjw
    public final int b() {
        return this.a;
    }

    @Override // defpackage.dkjw
    public final Duration c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkjw) {
            dkjw dkjwVar = (dkjw) obj;
            if (this.a == dkjwVar.b() && this.h == dkjwVar.a() && this.b.equals(dkjwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.h) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "InstantMessageError{type=" + this.a + ", reason=" + this.h + ", retryAfter=" + String.valueOf(this.b) + "}";
    }
}
