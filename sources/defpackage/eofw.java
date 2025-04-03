package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eofw extends eofx {
    final int a;

    public eofw(int i) {
        this.a = eofx.c(i);
    }

    @Override // defpackage.eofx
    public final Duration a(int i) {
        return b(i) ? Duration.ZERO : eofx.d;
    }

    @Override // defpackage.eofx
    public final boolean b(int i) {
        emxf.h(r3 >= 0, "%s (%s) must be >= 0", "tries", i);
        return i < this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof eofw) && this.a == ((eofw) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
