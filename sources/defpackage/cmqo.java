package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmqo {
    public final alcb a;
    private final cmqw b;

    public cmqo(alcb alcbVar, cmqw cmqwVar) {
        this.a = alcbVar;
        this.b = cmqwVar;
    }

    public final void a(final cmrm cmrmVar, final eprt eprtVar, String str) {
        axnw.h(this.b.a(bdhb.b(str)).i(new eroh() { // from class: cmqn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eqaw eqawVar = (eqaw) obj;
                eppq eppqVar = (eppq) eppr.a.createBuilder();
                eprq eprqVar = eprq.a;
                eppqVar.copyOnWrite();
                eppr epprVar = (eppr) eppqVar.instance;
                eprqVar.getClass();
                epprVar.f = eprqVar;
                epprVar.e = 209;
                eprr eprrVar = (eprr) epru.a.createBuilder();
                eprrVar.copyOnWrite();
                epru epruVar = (epru) eprrVar.instance;
                epruVar.c = eprtVar.k;
                int i = 1;
                epruVar.b |= 1;
                eppqVar.copyOnWrite();
                eppr epprVar2 = (eppr) eppqVar.instance;
                epru epruVar2 = (epru) eprrVar.build();
                epruVar2.getClass();
                epprVar2.d = epruVar2;
                epprVar2.c = 103;
                eppr epprVar3 = (eppr) eppqVar.build();
                int ordinal = cmrmVar.ordinal();
                if (ordinal == 1) {
                    i = 2;
                } else if (ordinal == 2) {
                    i = 3;
                } else if (ordinal == 3) {
                    i = 6;
                }
                return cmqo.this.a.k(i, epprVar3, -1, eqawVar);
            }
        }, erpp.a));
    }
}
