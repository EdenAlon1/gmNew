package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefz extends Thread {
    final /* synthetic */ eefq a;
    final /* synthetic */ eegb b;

    public eefz(eegb eegbVar, eefq eefqVar) {
        this.a = eefqVar;
        this.b = eegbVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.a.b();
        } catch (Exception e) {
            dkty.j(e, this.b.f, "Can't create the MSRP server session", new Object[0]);
        }
    }
}
