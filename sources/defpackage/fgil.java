package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgil extends ffsd {
    public static final fgil a = new fgil();

    private fgil() {
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        fgif.a.c(runnable, false);
    }

    @Override // defpackage.ffsd
    public final void h(ffhd ffhdVar, Runnable runnable) {
        fgif.a.c(runnable, true);
    }

    @Override // defpackage.ffsd
    public final ffsd i(int i) {
        fggy.a(i);
        return i >= fgik.d ? this : super.i(i);
    }

    @Override // defpackage.ffsd
    public final String toString() {
        return "Dispatchers.IO";
    }
}
