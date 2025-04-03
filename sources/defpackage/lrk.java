package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrk {
    public static final /* synthetic */ int b = 0;
    public final lpz a;

    static {
        lrj.a(new lpy());
        lvf.N(0);
    }

    public lrk(lpz lpzVar) {
        this.a = lpzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lrk) {
            return this.a.equals(((lrk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
