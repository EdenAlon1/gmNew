package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfa {
    public final dmpj a;
    public final dsho b;
    public final ffji c;
    public final ffxx d;
    public final xsb e;

    public xfa(dmpj dmpjVar, dsho dshoVar, ffji ffjiVar, ffxx ffxxVar, xsb xsbVar) {
        this.a = dmpjVar;
        this.b = dshoVar;
        this.c = ffjiVar;
        this.d = ffxxVar;
        this.e = xsbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfa)) {
            return false;
        }
        xfa xfaVar = (xfa) obj;
        return ffkj.e(this.a, xfaVar.a) && ffkj.e(this.b, xfaVar.b) && ffkj.e(this.c, xfaVar.c) && ffkj.e(this.d, xfaVar.d) && ffkj.e(this.e, xfaVar.e);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        xsb xsbVar = this.e;
        return (hashCode * 31) + (xsbVar == null ? 0 : xsbVar.hashCode());
    }

    public final String toString() {
        return "ComposeRowHolderUiData(composeRow=" + this.a + ", hugo=" + this.b + ", onInteractive=" + this.c + ", effectIsRunning=" + this.d + ", disabledComposeRow=" + this.e + ")";
    }
}
