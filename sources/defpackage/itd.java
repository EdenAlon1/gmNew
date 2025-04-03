package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itd {
    public final ita a = new ita();
    public final ita b = new ita();

    public final void a(iui iuiVar, boolean z) {
        if (z) {
            this.a.b(iuiVar);
            this.b.b(iuiVar);
        } else {
            if (this.a.c(iuiVar)) {
                return;
            }
            this.b.b(iuiVar);
        }
    }

    public final boolean b(iui iuiVar, boolean z) {
        boolean c = this.a.c(iuiVar);
        return z ? c : c || this.b.c(iuiVar);
    }

    public final boolean c(boolean z) {
        return (z ? this.a : this.b).d();
    }

    public final boolean d() {
        return (this.b.d() && this.a.d()) ? false : true;
    }

    public final void e(iui iuiVar) {
        this.a.e(iuiVar);
        this.b.e(iuiVar);
    }
}
