package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgfb implements ejuh {
    final /* synthetic */ eisx a;
    final /* synthetic */ cgfd b;

    public cgfb(cgfd cgfdVar, eisx eisxVar) {
        this.a = eisxVar;
        this.b = cgfdVar;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        ekzz f = eleg.f("GaiaSettingsDataService#getGaiaAuthCheck#loadData");
        try {
            erph erphVar = new erph(erqt.i((ejug) this.b.j.get()));
            f.a(erphVar);
            f.close();
            return erphVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        elfl e;
        ekzz f = eleg.f("GaiaSettingsDataService#getGaiaAuthCheck#fetchAndStoreData");
        try {
            if (adhu.a() && !((Optional) this.b.h.b()).isEmpty()) {
                e = ((cgcw) ((Optional) this.b.h.b()).get()).a(this.a).h(new emwl() { // from class: cgfa
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        cgfd cgfdVar = cgfb.this.b;
                        return (ejug) cgfdVar.j.getAndSet(ejug.a((cgdh) obj, ((cqoh) cgfdVar.i.b()).f()));
                    }
                }, this.b.d);
                f.close();
                return e;
            }
            cgfd cgfdVar = this.b;
            e = elfo.e((ejug) cgfdVar.j.getAndSet(ejug.a(new cgdd(), ((cqoh) cgfdVar.i.b()).f())));
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return cgfd.b;
    }
}
