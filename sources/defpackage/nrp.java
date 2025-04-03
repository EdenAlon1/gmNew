package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nrp implements erqj {
    final /* synthetic */ nrr a;

    public nrp(nrr nrrVar) {
        this.a = nrrVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final lqc lqcVar;
        boolean hasGainmap;
        final Bitmap bitmap = (Bitmap) obj;
        this.a.d = 50;
        lqb lqbVar = new lqb();
        lqbVar.u = bitmap.getHeight();
        lqbVar.t = bitmap.getWidth();
        lqbVar.c("image/raw");
        lqbVar.A = lpo.b;
        lqc lqcVar2 = new lqc(lqbVar);
        try {
            if (this.a.b && lvf.a >= 34) {
                hasGainmap = bitmap.hasGainmap();
                if (hasGainmap) {
                    lqb lqbVar2 = new lqb(lqcVar2);
                    lqbVar2.c("image/jpeg_r");
                    lqcVar = new lqc(lqbVar2);
                    this.a.a.d(lqcVar2, 2);
                    this.a.c.submit(new Runnable() { // from class: nro
                        @Override // java.lang.Runnable
                        public final void run() {
                            nrp.this.a.a(bitmap, lqcVar);
                        }
                    });
                    return;
                }
            }
            this.a.a.d(lqcVar2, 2);
            this.a.c.submit(new Runnable() { // from class: nro
                @Override // java.lang.Runnable
                public final void run() {
                    nrp.this.a.a(bitmap, lqcVar);
                }
            });
            return;
        } catch (RuntimeException e) {
            nrr nrrVar = this.a;
            nrrVar.a.b(new nrd("Asset loader error", e, 1000));
            return;
        }
        lqcVar = lqcVar2;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.a.b(new nrd("Asset loader error", th, 2000));
    }
}
