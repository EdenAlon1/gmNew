package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsrv {
    public final dmzz a;
    public final String b;
    public final ffix c;

    public dsrv(dmzz dmzzVar, String str, ffix ffixVar) {
        dmzzVar.getClass();
        str.getClass();
        ffixVar.getClass();
        this.a = dmzzVar;
        this.b = str;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsrv)) {
            return false;
        }
        dsrv dsrvVar = (dsrv) obj;
        return this.a == dsrvVar.a && ffkj.e(this.b, dsrvVar.b) && ffkj.e(this.c, dsrvVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ToolbarAction(icon=" + this.a + ", title=" + this.b + ", onClick=" + this.c + ")";
    }
}
