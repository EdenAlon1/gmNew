package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmgh {
    public final String a;
    public final dmzz b;
    public final boolean c;
    public final boolean d;
    public final ffix e;
    private final boolean f;

    public dmgh(String str, dmzz dmzzVar, boolean z, boolean z2, ffix ffixVar) {
        str.getClass();
        ffixVar.getClass();
        this.a = str;
        this.b = dmzzVar;
        this.f = true;
        this.c = z;
        this.d = z2;
        this.e = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmgh)) {
            return false;
        }
        dmgh dmghVar = (dmgh) obj;
        if (!ffkj.e(this.a, dmghVar.a) || this.b != dmghVar.b) {
            return false;
        }
        boolean z = dmghVar.f;
        return this.c == dmghVar.c && this.d == dmghVar.d && ffkj.e(this.e, dmghVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dmzz dmzzVar = this.b;
        return ((((((((hashCode + (dmzzVar == null ? 0 : dmzzVar.hashCode())) * 31) + dmgg.a(true)) * 31) + dmgg.a(this.c)) * 31) + dmgg.a(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "AiButtonUiData(text=" + this.a + ", icon=" + this.b + ", inProgress=true, enableAnimatedWidth=" + this.c + ", enableRevealAnimation=" + this.d + ", onClick=" + this.e + ")";
    }
}
