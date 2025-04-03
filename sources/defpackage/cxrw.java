package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxrw {
    final int a;
    final int b;
    public final int c;
    Integer d;
    public String e;

    public cxrw(int i, int i2, int i3, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxrw)) {
            return false;
        }
        cxrw cxrwVar = (cxrw) obj;
        return this.a == cxrwVar.a && this.b == cxrwVar.b && this.c == cxrwVar.c && Objects.equals(this.d, cxrwVar.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public cxrw(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }
}
