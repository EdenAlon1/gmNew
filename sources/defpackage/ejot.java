package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ejot;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejot extends ejnr {
    public final Context a;
    public final ejpq b;
    private final Executor c;
    private final eisx d;

    /* compiled from: PG */
    public interface a {
        ejol fF();
    }

    public ejot(Context context, ejpq ejpqVar, Executor executor, eisx eisxVar) {
        this.a = context;
        this.b = ejpqVar;
        this.c = executor;
        this.d = eisxVar;
    }

    @Override // defpackage.ejnr
    public final ListenableFuture a(ejoi ejoiVar) {
        return b(this.d, ejoiVar);
    }

    @Override // defpackage.ejnr
    public final ListenableFuture b(final eisx eisxVar, ejoi ejoiVar) {
        ejqn.d(ejoiVar);
        final ejoi f = this.b.f(ejoiVar);
        final ejoi o = f.o(enip.r("tiktok_account_work", ejqf.c(eisxVar)));
        ejnu ejnuVar = (ejnu) o;
        if (ejnuVar.h.g()) {
            ejnx ejnxVar = new ejnx("unique_" + ((ejnx) ejnuVar.h.c()).a + ejqf.c(eisxVar), ((ejnx) ejnuVar.h.c()).b);
            ejnt ejntVar = new ejnt(o);
            ejntVar.g(ejnxVar);
            o = ejntVar.h();
        }
        ejpq ejpqVar = this.b;
        Executor executor = this.c;
        ejoe n = ejoi.n(ejqc.class);
        n.e(ejof.c(new ejnw(3L, TimeUnit.DAYS), new ejnw(1L, TimeUnit.DAYS)));
        n.g(new ejnx("tiktok_wipeout_worker", poz.KEEP));
        poh pohVar = new poh();
        pohVar.a = true;
        n.d(pohVar.a());
        ListenableFuture c = ejpqVar.c(n.h());
        elfr.l(c, ejqc.b, executor);
        return elfr.k(c, new eroh() { // from class: ejos
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eisx eisxVar2 = eisxVar;
                ejot ejotVar = ejot.this;
                return ((ejot.a) ekhv.a(ejotVar.a, ejot.a.class, eisxVar2)).fF().a(ejotVar.b.g(o));
            }
        }, this.c);
    }
}
