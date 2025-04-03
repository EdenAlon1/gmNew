package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahox implements erqj {
    final /* synthetic */ ahoy a;

    public ahox(ahoy ahoyVar) {
        this.a = ahoyVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (this.a.b) {
            return;
        }
        synchronized (ahoz.b) {
            ahov ahovVar = (ahov) this.a.a.c.get();
            if (ahovVar != null) {
                if (optional.isPresent()) {
                    ahovVar.b((edqc) optional.get());
                } else {
                    ahovVar.b(null);
                    ahoz.a.n("ReverseGeocode: place is null");
                }
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (!(th instanceof dfqu)) {
            throw new emyx(th);
        }
        if (this.a.b) {
            return;
        }
        ahoz.a.o("Failed to get place by calling ReverseGeocode", th);
        synchronized (ahoz.b) {
            ahov ahovVar = (ahov) this.a.a.c.get();
            if (ahovVar != null) {
                ahovVar.b(null);
            }
        }
    }
}
