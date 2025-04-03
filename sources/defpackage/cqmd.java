package defpackage;

import j$.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqmd implements cqlx {
    private final ejoc a;

    public cqmd(ejoc ejocVar) {
        this.a = ejocVar;
    }

    @Override // defpackage.cqlx
    public final elfl a() {
        if (!((Boolean) cqlz.a.e()).booleanValue()) {
            return elfo.e(Optional.empty());
        }
        ejoc ejocVar = this.a;
        ejoe n = ejoi.n(cqlz.class);
        n.g(new ejnx("UniqueKeyGarbageCollectorTikTokWork", poz.KEEP));
        n.e(new ejnv(new ejnw(1L, TimeUnit.DAYS), emux.a));
        return elfl.g(ejocVar.c(n.h())).h(new emwl() { // from class: cqmc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Optional.of((UUID) obj);
            }
        }, erpp.a);
    }
}
