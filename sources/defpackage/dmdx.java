package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmdx {
    public final dmdt a;
    public final ffix b;
    public final dmck c;

    public dmdx(dmck dmckVar, dmdt dmdtVar, ffix ffixVar) {
        dmdtVar.getClass();
        this.c = dmckVar;
        this.a = dmdtVar;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmdx)) {
            return false;
        }
        dmdx dmdxVar = (dmdx) obj;
        return ffkj.e(this.c, dmdxVar.c) && this.a == dmdxVar.a && ffkj.e(this.b, dmdxVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BannerUiData(content=" + this.c + ", state=" + this.a + ", onExpandClicked=" + this.b + ")";
    }
}
