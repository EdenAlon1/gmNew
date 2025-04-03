package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffti extends ffsd {
    private long a;
    public ffdn b;
    private boolean c;

    private static final long hU(boolean z) {
        return z ? 4294967296L : 1L;
    }

    @Override // defpackage.ffsd
    public final ffsd i(int i) {
        fggy.a(1);
        return this;
    }

    public void l() {
        throw null;
    }

    public long m() {
        throw null;
    }

    public final void n(boolean z) {
        long hU = this.a - hU(z);
        this.a = hU;
        if (hU > 0) {
            return;
        }
        boolean z2 = ffso.a;
        if (this.c) {
            l();
        }
    }

    public final void o(ffsz ffszVar) {
        ffdn ffdnVar = this.b;
        if (ffdnVar == null) {
            ffdnVar = new ffdn();
            this.b = ffdnVar;
        }
        ffdnVar.addLast(ffszVar);
    }

    public final void p(boolean z) {
        this.a += hU(z);
        if (z) {
            return;
        }
        this.c = true;
    }

    public final boolean q() {
        return this.a >= hU(true);
    }

    public final boolean r() {
        ffdn ffdnVar = this.b;
        if (ffdnVar != null) {
            return ffdnVar.isEmpty();
        }
        return true;
    }

    public final boolean s() {
        ffsz ffszVar;
        ffdn ffdnVar = this.b;
        if (ffdnVar == null || (ffszVar = (ffsz) ffdnVar.g()) == null) {
            return false;
        }
        ffszVar.run();
        return true;
    }
}
