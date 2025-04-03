package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjmd {
    public final eijp a;
    public final awul b;
    public final awzj c;

    public cjmd(eijp eijpVar, awul awulVar, awzj awzjVar) {
        this.a = eijpVar;
        this.b = awulVar;
        this.c = awzjVar;
    }

    public static /* synthetic */ cjmd a(cjmd cjmdVar, eijp eijpVar, awul awulVar, awzj awzjVar, int i) {
        if ((i & 1) != 0) {
            eijpVar = cjmdVar.a;
        }
        if ((i & 2) != 0) {
            awulVar = cjmdVar.b;
        }
        if ((i & 4) != 0) {
            awzjVar = cjmdVar.c;
        }
        return new cjmd(eijpVar, awulVar, awzjVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjmd)) {
            return false;
        }
        cjmd cjmdVar = (cjmd) obj;
        return ffkj.e(this.a, cjmdVar.a) && ffkj.e(this.b, cjmdVar.b) && ffkj.e(this.c, cjmdVar.c);
    }

    public final int hashCode() {
        eijp eijpVar = this.a;
        int hashCode = eijpVar == null ? 0 : eijpVar.hashCode();
        awul awulVar = this.b;
        int hashCode2 = awulVar == null ? 0 : awulVar.hashCode();
        int i = hashCode * 31;
        awzj awzjVar = this.c;
        return ((i + hashCode2) * 31) + (awzjVar != null ? awzjVar.hashCode() : 0);
    }

    public final String toString() {
        return "ChatApiData(serializedContent=" + this.a + ", chatMessageContent=" + this.b + ", opaqueData=" + this.c + ")";
    }
}
