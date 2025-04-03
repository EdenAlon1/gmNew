package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmck {
    public final String a;
    public final dmcj b;
    public final dmcj c;
    public final dmdw d;
    public final String e;
    public final ffix f;
    private final boolean g;

    public dmck() {
        this(null, null, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmck)) {
            return false;
        }
        dmck dmckVar = (dmck) obj;
        if (!ffkj.e(this.a, dmckVar.a) || !ffkj.e(this.b, dmckVar.b) || !ffkj.e(this.c, dmckVar.c) || !ffkj.e(this.d, dmckVar.d) || !ffkj.e(this.e, dmckVar.e)) {
            return false;
        }
        boolean z = dmckVar.g;
        return ffkj.e(this.f, dmckVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        dmcj dmcjVar = this.b;
        int hashCode2 = dmcjVar == null ? 0 : dmcjVar.hashCode();
        int i = hashCode * 31;
        dmcj dmcjVar2 = this.c;
        int hashCode3 = (((i + hashCode2) * 31) + (dmcjVar2 == null ? 0 : dmcjVar2.hashCode())) * 31;
        dmdw dmdwVar = this.d;
        int hashCode4 = (hashCode3 + (dmdwVar == null ? 0 : dmdwVar.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + 1237) * 31;
        ffix ffixVar = this.f;
        return hashCode5 + (ffixVar != null ? ffixVar.hashCode() : 0);
    }

    public final String toString() {
        return "Full(title=" + this.a + ", confirmButtonData=" + this.b + ", dismissButtonData=" + this.c + ", symbol=" + this.d + ", text=" + this.e + ", isError=false, onClose=" + this.f + ")";
    }

    public /* synthetic */ dmck(String str, dmcj dmcjVar, dmcj dmcjVar2, dmdw dmdwVar, String str2, ffix ffixVar, int i) {
        this.a = 1 == (i & 1) ? null : str;
        this.b = (i & 2) != 0 ? null : dmcjVar;
        this.c = (i & 4) != 0 ? null : dmcjVar2;
        this.d = (i & 8) != 0 ? null : dmdwVar;
        this.e = (i & 16) != 0 ? null : str2;
        this.g = false;
        this.f = (i & 64) != 0 ? null : ffixVar;
    }
}
