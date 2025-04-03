package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiir implements aihu {
    public final String a;
    public final adu b;
    public final Object c;
    public final kli d;

    public aiir(String str, adu aduVar, Object obj, kli kliVar) {
        str.getClass();
        aduVar.getClass();
        this.a = str;
        this.b = aduVar;
        this.c = obj;
        this.d = kliVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiir)) {
            return false;
        }
        aiir aiirVar = (aiir) obj;
        return ffkj.e(this.a, aiirVar.a) && ffkj.e(this.b, aiirVar.b) && ffkj.e(this.c, aiirVar.c) && ffkj.e(this.d, aiirVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Object obj = this.c;
        int hashCode2 = ((hashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31;
        kli kliVar = this.d;
        return hashCode2 + (kliVar != null ? kliVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityResult(key=" + this.a + ", contract=" + this.b + ", input=" + this.c + ", options=" + this.d + ")";
    }

    public /* synthetic */ aiir(String str, adu aduVar, Object obj) {
        this(str, aduVar, obj, null);
    }
}
