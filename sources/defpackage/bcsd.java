package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcsd {
    public final String a;
    public final long b;
    public final long c;
    public final Optional d;

    public bcsd(String str, long j, long j2, Optional optional) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcsd)) {
            return false;
        }
        bcsd bcsdVar = (bcsd) obj;
        return this.b == bcsdVar.b && this.c == bcsdVar.c && Objects.equals(this.a, bcsdVar.a) && Objects.equals(this.d, bcsdVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b), Long.valueOf(this.c), this.d);
    }
}
