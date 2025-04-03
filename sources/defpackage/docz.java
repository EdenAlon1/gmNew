package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class docz {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final List g;
    public final int h;
    public final int i;

    public docz(int i, int i2, int i3, int i4, int i5, int i6, List list, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = list;
        this.h = i7;
        this.i = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof docz)) {
            return false;
        }
        docz doczVar = (docz) obj;
        return this.a == doczVar.a && this.b == doczVar.b && this.c == doczVar.c && this.d == doczVar.d && this.e == doczVar.e && this.f == doczVar.f && ffkj.e(this.g, doczVar.g) && this.h == doczVar.h && this.i == doczVar.i;
    }

    public final int hashCode() {
        return (((((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        return "RichCardTextContentIntrinsics(maxHeight=" + this.a + ", spacer=" + this.b + ", titleMin=" + this.c + ", titleMax=" + this.d + ", descMin=" + this.e + ", descMax=" + this.f + ", actions=" + this.g + ", actionMax=" + this.h + ", bottomSpacer=" + this.i + ")";
    }
}
