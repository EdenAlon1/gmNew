package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctnf implements erqj {
    final /* synthetic */ ctnh a;

    public ctnf(ctnh ctnhVar) {
        this.a = ctnhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.erqj
    public final /* synthetic */ void b(Object obj) {
        if (this.a.h()) {
            enqv it = ((engw) this.a.j()).iterator();
            while (it.hasNext()) {
                ((dhre) ((excv) it.next()).a.get()).a(new dhqy() { // from class: excr
                    @Override // defpackage.dhqy
                    public final void e(Object obj2) {
                        dhre b = ((dgub) obj2).b();
                        b.a(new dhqy() { // from class: excp
                            @Override // defpackage.dhqy
                            public final void e(Object obj3) {
                                if (Log.isLoggable("BrellaInAppTraining", 4)) {
                                    Log.i("BrellaInAppTraining", "In-app training schedule succeeded.");
                                }
                            }
                        });
                        b.t(new dhqv() { // from class: excq
                            @Override // defpackage.dhqv
                            public final void d(Exception exc) {
                                if (Log.isLoggable("BrellaInAppTraining", 4)) {
                                    Log.i("BrellaInAppTraining", "In-app training schedule failed.");
                                }
                            }
                        });
                    }
                }).t(new dhqv() { // from class: excs
                    @Override // defpackage.dhqv
                    public final void d(Exception exc) {
                        if (Log.isLoggable("BrellaInAppTraining", 4)) {
                            Log.i("BrellaInAppTraining", "Cannot schedule in-app training because trainer failed to initialize.");
                        }
                    }
                });
            }
        } else {
            enqv it2 = ((engw) this.a.j()).iterator();
            while (it2.hasNext()) {
                ((dhre) ((excv) it2.next()).a.get()).a(new dhqy() { // from class: excn
                    @Override // defpackage.dhqy
                    public final void e(Object obj2) {
                        dhre a = ((dgub) obj2).a();
                        a.a(new dhqy() { // from class: exck
                            @Override // defpackage.dhqy
                            public final void e(Object obj3) {
                                if (Log.isLoggable("BrellaInAppTraining", 4)) {
                                    Log.i("BrellaInAppTraining", "In-app training cancel succeeded.");
                                }
                            }
                        });
                        a.t(new dhqv() { // from class: excm
                            @Override // defpackage.dhqv
                            public final void d(Exception exc) {
                                if (Log.isLoggable("BrellaInAppTraining", 4)) {
                                    Log.i("BrellaInAppTraining", "In-app training cancel failed.");
                                }
                            }
                        });
                    }
                }).t(new dhqv() { // from class: exco
                    @Override // defpackage.dhqv
                    public final void d(Exception exc) {
                        if (Log.isLoggable("BrellaInAppTraining", 4)) {
                            Log.i("BrellaInAppTraining", "Cannot cancel in-app training because trainer failed to initialize.");
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ctnh.b.n("Could not start or stop Brella training, Brella GMSCore likely not available");
    }
}
