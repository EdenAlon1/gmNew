package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clel implements clej {
    private final ffbr a;

    public clel(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.clej
    public final elfl a() {
        return elfl.g(((ejoc) this.a.b()).a("RcsLimboMessagesResolverWorker"));
    }

    @Override // defpackage.clej
    public final elfl b() {
        ejoc ejocVar = (ejoc) this.a.b();
        cfup cfupVar = clen.a;
        ejoe n = ejoi.n(clen.class);
        n.g(new ejnx("RcsLimboMessagesResolverWorker", poz.KEEP));
        poh pohVar = new poh();
        pohVar.c(2);
        n.d(pohVar.a());
        n.e(new ejnv(new ejnw(((Long) clen.a.e()).longValue(), TimeUnit.HOURS), emux.a));
        return elfl.g(ejocVar.c(n.h())).h(new emwl() { // from class: clek
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }
}
