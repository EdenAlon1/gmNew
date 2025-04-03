package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejpq implements ejoc {
    public final ejop a;
    public final Executor b;
    private final Context c;
    private final Map d;
    private final emxc e;
    private final ejol f;

    public ejpq(Context context, ejop ejopVar, Map map, Executor executor, emxc emxcVar, ejol ejolVar) {
        this.c = context;
        this.a = ejopVar;
        this.d = map;
        this.b = executor;
        this.e = emxcVar;
        this.f = ejolVar;
    }

    private final ppw h(ejoi ejoiVar) {
        ejnu ejnuVar = (ejnu) ejoiVar;
        emxf.l(!ejnuVar.g.g());
        ppv ppvVar = new ppv(TikTokListenableWorker.class);
        ppvVar.g(ejnuVar.b);
        ejnw ejnwVar = (ejnw) ejnuVar.d;
        ppvVar.h(ejnwVar.a, ejnwVar.b);
        ppvVar.j(ejnuVar.f);
        k(ejoiVar, ppvVar);
        return (ppw) ppvVar.b();
    }

    private final pqi i(ejoi ejoiVar, ejog ejogVar, emxc emxcVar) {
        ejnu ejnuVar = (ejnu) ejoiVar;
        emxf.l(ejnuVar.g.g());
        if (emxcVar.g()) {
            ejnw ejnwVar = (ejnw) ejogVar;
            pqh pqhVar = new pqh(TikTokListenableWorker.class, ejnwVar.a, ejnwVar.b, ((ejnw) emxcVar.c()).a, ((ejnw) emxcVar.c()).b);
            k(ejoiVar, pqhVar);
            pqhVar.g(ejnuVar.b);
            ejnw ejnwVar2 = (ejnw) ejnuVar.d;
            pqhVar.h(ejnwVar2.a, ejnwVar2.b);
            return (pqi) pqhVar.b();
        }
        ejnw ejnwVar3 = (ejnw) ejogVar;
        pqh pqhVar2 = new pqh(TikTokListenableWorker.class, ejnwVar3.a, ejnwVar3.b);
        k(ejoiVar, pqhVar2);
        pqhVar2.g(ejnuVar.b);
        ejnw ejnwVar4 = (ejnw) ejnuVar.d;
        pqhVar2.h(ejnwVar4.a, ejnwVar4.b);
        return (pqi) pqhVar2.b();
    }

    private final String j(Class cls) {
        String str = (String) this.d.get(cls);
        cls.toString();
        str.getClass();
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    private final void k(ejoi ejoiVar, pqu pquVar) {
        ejnu ejnuVar = (ejnu) ejoiVar;
        enqu listIterator = ejnuVar.i.listIterator();
        while (listIterator.hasNext()) {
            pquVar.d((String) listIterator.next());
        }
        if (ejnuVar.c.g()) {
            pquVar.c((pqg) ejnuVar.c.c());
        }
        if (ejnuVar.j.g() && ejnuVar.k.g()) {
            emxc emxcVar = ejnuVar.k;
            emxc emxcVar2 = ejnuVar.j;
            ejnw ejnwVar = (ejnw) emxcVar.c();
            pquVar.f((poa) emxcVar2.c(), ejnwVar.a, ejnwVar.b);
        }
        if (ejnuVar.e.g() && (pquVar instanceof pqh)) {
            pqh pqhVar = (pqh) pquVar;
            long longValue = ((Long) ejnuVar.e.c()).longValue();
            if (longValue == Long.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            pyj pyjVar = pqhVar.c;
            pyjVar.w = longValue;
            pyjVar.x = 1;
        }
        pon ponVar = new pon();
        ponVar.b(ejnuVar.f);
        if (ejnuVar.l.g()) {
            ComponentName componentName = (ComponentName) ((emxn) this.e).a.get(ejnuVar.l.c());
            ponVar.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", componentName.getPackageName());
            ponVar.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", componentName.getClassName());
        }
        pquVar.j(ponVar.a());
        String j = j(ejnuVar.a);
        int length = j.length();
        int i = ejqn.c;
        pquVar.k("TikTokWorker#".concat(String.valueOf(j.substring(Math.max(0, length + NetError.ERR_SSL_RENEGOTIATION_REQUESTED)))));
    }

    @Override // defpackage.ejoc
    public final ListenableFuture a(String str) {
        return ((ejqm) this.f).c(this.a.b(str), new eroh() { // from class: ejqh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((ejod) obj).a();
            }
        });
    }

    @Override // defpackage.ejoc
    public final ListenableFuture b(UUID uuid) {
        return ((ejqm) this.f).c(this.a.c(uuid), new eroh() { // from class: ejqj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((ejod) obj).b();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ejoc
    public final ListenableFuture c(ejoi ejoiVar) {
        ejqn.d(ejoiVar);
        ejnu ejnuVar = (ejnu) ejoiVar;
        if (ejnuVar.l.g()) {
            emxc emxcVar = ejnuVar.l;
            Context context = this.c;
            emxf.m(!((String) emxcVar.c()).equals(context.getPackageName()), "Default process must be targeted using shorthand '' empty string, not the package name.");
            emxf.m(false, "You must depend upon //java/com/google/apps/tiktok/contrib/work/impl:multiprocess_module in order to use .setTargetProcess");
            emxf.p(((emxn) this.e).a.containsKey(ejnuVar.l.c()), "You must generate remote worker services using java/com/google/apps/tiktok/contrib/work/codegen/generated_remote_worker_service.bzl before targeting them by process name and include the service target in every scheduling process's dagger deps. Could not find [%s]", ejnuVar.l.c());
            emxf.b(Collections.disjoint(ejnuVar.f.e().keySet(), enip.s("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME")), "You may not specify RemoteListenableWorker arguments at the same time as TikTok's targetProcess feature.");
        }
        return this.f.a(g(f(ejoiVar)));
    }

    @Override // defpackage.ejoc
    public final ListenableFuture d(UUID uuid) {
        return erny.f(erny.f(this.a.h(new pqt(ffdo.L(new UUID[]{uuid}), null, 14)), new emwl() { // from class: ejpl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return null;
                }
                return (pqq) enjk.l(list);
            }
        }, this.b), new emwl() { // from class: ejpm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                pqq pqqVar = (pqq) obj;
                if (pqqVar == null) {
                    throw new NoSuchElementException("Work ID not found");
                }
                emxf.a(!pqqVar.c.contains("tiktok_account_work"));
                return pqqVar;
            }
        }, this.b);
    }

    @Override // defpackage.ejoc
    public final ListenableFuture e(String str) {
        return erny.f(this.a.h(pqt.a(str)), new emwl() { // from class: ejpk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = engw.d;
                engr engrVar = new engr();
                for (pqq pqqVar : (List) obj) {
                    if (!pqqVar.c.contains("tiktok_account_work")) {
                        engrVar.h(pqqVar);
                    }
                }
                return engrVar.g();
            }
        }, this.b);
    }

    final ejoi f(ejoi ejoiVar) {
        return ejoiVar.o(new enpx(ejqn.b(j(((ejnu) ejoiVar).a))));
    }

    final ListenableFuture g(ejoi ejoiVar) {
        ppa ppaVar;
        ejnu ejnuVar = (ejnu) ejoiVar;
        if (ejnuVar.g.g()) {
            emxf.l(ejnuVar.g.g());
            if (ejnuVar.h.g()) {
                emxf.l(ejnuVar.g.g());
                emxf.l(ejnuVar.h.g());
                final pqi i = i(ejoiVar, ((ejnv) ejnuVar.g.c()).a, ((ejnv) ejnuVar.g.c()).b);
                return erny.f(this.a.e(((ejnx) ejnuVar.h.c()).a, ((ejnx) ejnuVar.h.c()).b, i), new emwl() { // from class: ejpn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return pqi.this.a;
                    }
                }, erpp.a);
            }
            emxf.l(ejnuVar.g.g());
            emxf.l(!ejnuVar.h.g());
            final pqi i2 = i(ejoiVar, ((ejnv) ejnuVar.g.c()).a, ((ejnv) ejnuVar.g.c()).b);
            return erny.f(this.a.d(i2), new emwl() { // from class: ejpp
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return pqi.this.a;
                }
            }, erpp.a);
        }
        emxf.l(!ejnuVar.g.g());
        if (!ejnuVar.h.g()) {
            emxf.l(!ejnuVar.g.g());
            emxf.l(!ejnuVar.h.g());
            final ppw h = h(ejoiVar);
            return erny.f(this.a.d(h), new emwl() { // from class: ejpi
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ppw.this.a;
                }
            }, erpp.a);
        }
        emxf.l(!ejnuVar.g.g());
        emxf.l(ejnuVar.h.g());
        final ppw h2 = h(ejoiVar);
        ejop ejopVar = this.a;
        String str = ((ejnx) ejnuVar.h.c()).a;
        int ordinal = ((ejnx) ejnuVar.h.c()).b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ppaVar = ppa.KEEP;
                return erny.f(ejopVar.f(str, ppaVar, h2), new emwl() { // from class: ejph
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ppw.this.a;
                    }
                }, erpp.a);
            }
            if (ordinal == 2) {
                throw new IllegalArgumentException("One-time unique work does not support ExistingPeriodicWorkPolicy UPDATE. Use CANCEL_AND_REENQUEUE or KEEP instead");
            }
            if (ordinal != 3) {
                throw new IllegalArgumentException("Unknown mapping from ExistingPeriodicWorkPolicy to ExistingWorkPolicy.");
            }
        }
        ppaVar = ppa.REPLACE;
        return erny.f(ejopVar.f(str, ppaVar, h2), new emwl() { // from class: ejph
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ppw.this.a;
            }
        }, erpp.a);
    }
}
