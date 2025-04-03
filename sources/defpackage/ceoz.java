package defpackage;

import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceoz extends ceut {
    public final ckds a;
    private final errl b;

    public ceoz(errl errlVar, ckds ckdsVar) {
        this.b = errlVar;
        this.a = ckdsVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CancelRcsFileTransferHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cepb.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cepb cepbVar = (cepb) eyhsVar;
        return elfo.g(new Callable() { // from class: ceoy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator<E> it = cepbVar.b.iterator();
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    if (longValue != -1) {
                        ceoz.this.a.x(longValue);
                        csjb c = ceoz.D.c();
                        c.I("Deleting file transfer from RCS engine.");
                        c.z("rcsFileTransferSessionId", longValue);
                        c.r();
                    }
                }
                return ceyt.i();
            }
        }, this.b);
    }
}
