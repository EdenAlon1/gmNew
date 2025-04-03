package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class llc {
    final llh c;
    boolean d;
    int e = -1;
    final /* synthetic */ lld f;

    public llc(lld lldVar, llh llhVar) {
        this.f = lldVar;
        this.c = llhVar;
    }

    public boolean c(lkr lkrVar) {
        return false;
    }

    final void d(boolean z) {
        boolean z2;
        if (z == this.d) {
            return;
        }
        this.d = z;
        lld lldVar = this.f;
        int i = true != z ? -1 : 1;
        int i2 = lldVar.d;
        lldVar.d = i + i2;
        if (!lldVar.e) {
            lldVar.e = true;
            while (true) {
                try {
                    int i3 = lldVar.d;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 != 0) {
                        z2 = false;
                    } else if (i3 > 0) {
                        i2 = 0;
                        z2 = true;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        lldVar.h();
                    } else if (z3) {
                        lldVar.i();
                    }
                    i2 = i3;
                } finally {
                    lldVar.e = false;
                }
            }
        }
        if (this.d) {
            this.f.e(this);
        }
    }

    public abstract boolean ez();

    public void b() {
    }
}
