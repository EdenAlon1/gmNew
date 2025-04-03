package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmpf implements dmmq {
    public final String a;
    public final boolean b;
    public final ffji c;
    public final ffji d;
    public final ffix e;
    public final ffix f;

    public dmpf(String str, boolean z, ffji ffjiVar, ffji ffjiVar2, ffix ffixVar, ffix ffixVar2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = ffjiVar;
        this.d = ffjiVar2;
        this.e = ffixVar;
        this.f = ffixVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmpf)) {
            return false;
        }
        dmpf dmpfVar = (dmpf) obj;
        return ffkj.e(this.a, dmpfVar.a) && this.b == dmpfVar.b && ffkj.e(this.c, dmpfVar.c) && ffkj.e(this.d, dmpfVar.d) && ffkj.e(this.e, dmpfVar.e) && ffkj.e(this.f, dmpfVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "ComposeRowSubjectUrgentUiData(subject=" + this.a + ", isUrgent=" + this.b + ", onSubjectChange=" + this.c + ", onUrgentChange=" + this.d + ", onClick=" + this.e + ", onDismiss=" + this.f + ")";
    }
}
