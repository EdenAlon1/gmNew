package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzge {
    public final fcek a;
    public final String b;
    public final Optional c;
    public final fcek d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bzge(fcek fcekVar, String str, Optional optional) {
        this(fcekVar, str, optional, null);
        fcekVar.getClass();
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzge)) {
            return false;
        }
        bzge bzgeVar = (bzge) obj;
        return ffkj.e(this.a, bzgeVar.a) && ffkj.e(this.b, bzgeVar.b) && ffkj.e(this.c, bzgeVar.c) && ffkj.e(this.d, bzgeVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DittoIdContainer(tachyonId=" + this.a + ", desktopId=" + this.b + ", destinationRegistrationId=" + this.c + ", desktopIdAsTachyonId=" + this.d + ")";
    }

    public /* synthetic */ bzge(fcek fcekVar, String str, Optional optional, byte[] bArr) {
        fcej fcejVar = (fcej) fcekVar.toBuilder();
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).c = str;
        fcek fcekVar2 = (fcek) fcejVar.build();
        fcekVar2.getClass();
        this.a = fcekVar;
        this.b = str;
        this.c = optional;
        this.d = fcekVar2;
    }
}
