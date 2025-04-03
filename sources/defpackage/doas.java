package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doas {
    public final String a;
    public final boolean b;
    public final ffix c;

    public doas(String str, boolean z, ffix ffixVar) {
        str.getClass();
        ffixVar.getClass();
        this.a = str;
        this.b = z;
        this.c = ffixVar;
    }

    public static /* synthetic */ doas a(doas doasVar, String str, ffix ffixVar, int i) {
        if ((i & 1) != 0) {
            str = doasVar.a;
        }
        boolean z = (i & 2) != 0 ? doasVar.b : false;
        if ((i & 4) != 0) {
            ffixVar = doasVar.c;
        }
        str.getClass();
        ffixVar.getClass();
        return new doas(str, z, ffixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doas)) {
            return false;
        }
        doas doasVar = (doas) obj;
        return ffkj.e(this.a, doasVar.a) && this.b == doasVar.b && ffkj.e(this.c, doasVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PopupButton(text=" + this.a + ", enabled=" + this.b + ", onClick=" + this.c + ")";
    }

    public /* synthetic */ doas(String str, ffix ffixVar) {
        this(str, true, ffixVar);
    }
}
