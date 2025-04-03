package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jph {
    public final jou a;
    public final jou b;
    public final jou c;
    public final jou d;

    public jph() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jph)) {
            return false;
        }
        jph jphVar = (jph) obj;
        return ffkj.e(this.a, jphVar.a) && ffkj.e(this.b, jphVar.b) && ffkj.e(this.c, jphVar.c) && ffkj.e(this.d, jphVar.d);
    }

    public final int hashCode() {
        jou jouVar = this.a;
        int hashCode = jouVar != null ? jouVar.hashCode() : 0;
        jou jouVar2 = this.b;
        int hashCode2 = jouVar2 != null ? jouVar2.hashCode() : 0;
        int i = hashCode * 31;
        jou jouVar3 = this.c;
        int hashCode3 = (((i + hashCode2) * 31) + (jouVar3 != null ? jouVar3.hashCode() : 0)) * 31;
        jou jouVar4 = this.d;
        return hashCode3 + (jouVar4 != null ? jouVar4.hashCode() : 0);
    }

    public jph(jou jouVar, jou jouVar2, jou jouVar3, jou jouVar4) {
        this.a = jouVar;
        this.b = jouVar2;
        this.c = jouVar3;
        this.d = jouVar4;
    }

    public /* synthetic */ jph(jou jouVar, int i) {
        this(1 == (i & 1) ? null : jouVar, null, null, null);
    }
}
