package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejpe implements ejns {
    public static final enru a = enru.c("com/google/apps/tiktok/contrib/work/impl/TikTokInternalAccountWorker");
    public final Executor b;
    private final Context c;
    private final eivc d;
    private final Map e;
    private final Executor f;
    private final emwl g;
    private final String h;

    /* compiled from: PG */
    public interface a {
        ejol fF();
    }

    public ejpe(Context context, eivc eivcVar, Map map, Executor executor, Executor executor2, emwl emwlVar, String str) {
        this.c = context;
        this.d = eivcVar;
        this.e = map;
        this.b = executor;
        this.f = executor2;
        this.g = emwlVar;
        this.h = str;
    }

    @Override // defpackage.ejok
    public final ListenableFuture a(final WorkerParameters workerParameters) {
        return elfr.k(c(ejqf.b(workerParameters)), new eroh() { // from class: ejpd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((ejns) obj).a(WorkerParameters.this);
            }
        }, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ejns, defpackage.ejok
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        ListenableFuture e;
        elac b = elae.b();
        eisy.a(b, ejqf.b(workerParameters));
        final ekzz g = eleg.g("AccountWorkerFactory startWork()", ((elae) b).f());
        try {
            if (workerParameters.c.contains("tiktok_account_work")) {
                final eisx b2 = ejqf.b(workerParameters);
                e = elfr.e(((a) ekhv.a(this.c, a.class, b2)).fF().b(new erog() { // from class: ejoz
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        ejpe ejpeVar = ejpe.this;
                        ListenableFuture c = ejpeVar.c(b2);
                        final WorkerParameters workerParameters2 = workerParameters;
                        ListenableFuture k = elfr.k(c, new eroh() { // from class: ejpc
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                return ((ejns) obj).b(WorkerParameters.this);
                            }
                        }, ejpeVar.b);
                        g.b(k);
                        return k;
                    }
                }), ejor.class, new emwl() { // from class: ejpa
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ((enrr) ((enrr) ((enrr) ejpe.a.j()).g((ejor) obj)).h("com/google/apps/tiktok/contrib/work/impl/TikTokInternalAccountWorker", "startWork", 120, "TikTokInternalAccountWorker.java")).q("Account Worker did not pass Account requirements and will be skipped.");
                        return new ppn();
                    }
                }, this.f);
            } else {
                e = erqt.h(new ejor());
            }
            g.close();
            return e;
        } catch (Throwable th) {
            try {
                g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ListenableFuture c(eisx eisxVar) {
        return elfr.j(elfr.f(this.e.containsKey(this.h) ? this.d.f(eisxVar, (engw) this.e.get(this.h)) : this.d.a(eisxVar), eizq.class, new eroh() { // from class: ejpb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return erqt.h(new ejor((eizq) obj));
            }
        }, this.b), this.g, this.b);
    }
}
