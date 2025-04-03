package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdgv {
    public final Optional a;

    public bdgv(long j) {
        if (j < 0) {
            this.a = Optional.empty();
        } else {
            this.a = Optional.of(Long.valueOf(j));
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((bdgv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
