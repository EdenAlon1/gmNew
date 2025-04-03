package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myd implements Runnable {
    private final myc a;

    public myd(myc mycVar) {
        this.a = mycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        muq muqVar = (muq) this.a;
        for (mvb mvbVar : muqVar.m) {
            mvbVar.l(true);
            mvbVar.j();
        }
        msd msdVar = (msd) muqVar.g;
        nco ncoVar = msdVar.a;
        if (ncoVar != null) {
            ncoVar.d();
            msdVar.a = null;
        }
        msdVar.b = null;
    }
}
