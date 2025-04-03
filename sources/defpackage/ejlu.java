package defpackage;

import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejlu extends ejlq implements ljv {
    public static final enru a = enru.c("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl");
    private final boolean b;
    private ejmb c;
    private final ffbr d;
    private final lmy e;
    private final lkk f;
    private final ejlt g = new ejlt();
    private boolean h = false;
    private boolean i = false;
    private final Set j = new HashSet();

    public ejlu(ffbr ffbrVar, lmy lmyVar, lkk lkkVar) {
        this.d = ffbrVar;
        this.e = lmyVar;
        lkkVar.c(this);
        this.f = lkkVar;
        this.b = true;
    }

    private final void m() {
        if (!this.b) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                this.c.c((ejlr) it.next());
            }
            this.j.clear();
        }
        this.i = true;
        efbd.f(this.g);
        this.g.a.clear();
        this.g.b = null;
        this.h = true;
        ejmb ejmbVar = this.c;
        ejmbVar.e = true;
        ejmbVar.b.g();
        for (ejmf ejmfVar : ejmbVar.c) {
            if (ejmfVar.b) {
                try {
                    ejmbVar.b.b(ejmfVar.a);
                } catch (NullPointerException e) {
                    throw new IllegalStateException("future=".concat(String.valueOf(String.valueOf(ejmfVar))), e);
                }
            } else {
                ejmb.a((ejlr) ejmbVar.b.b(ejmfVar.a), ejmfVar);
            }
            ejmfVar.c(ejmbVar);
        }
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        if (this.h) {
            return;
        }
        m();
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        if (this.h) {
            ejmb ejmbVar = this.c;
            ejmbVar.e = false;
            Iterator it = ejmbVar.c.iterator();
            while (it.hasNext()) {
                ((ejmf) it.next()).c(null);
            }
            this.h = false;
        }
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        ejmb ejmbVar = this.c;
        emxf.m(!ejmbVar.e, "FuturesMixinViewModel.stopCallbacks() must be called before it becomes detached from its parent.");
        ejmbVar.b.c();
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        this.c = (ejmb) new lmw(this.e).a(ejmb.class);
        if (this.b) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                this.c.c((ejlr) it.next());
            }
            this.j.clear();
        }
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        emxf.m(!this.h, "FuturesMixin.onStart() was manually invoked, and is now re-running.");
        m();
    }

    @Override // defpackage.ejlq
    protected final void j(ListenableFuture listenableFuture, Object obj, ejlr ejlrVar) {
        efbd.c();
        emxf.m(!((fr) this.d.b()).ai(), "Futures should not be triggered by lifecycle changes, and cannot be listened to while a Fragment is stopped. Consider using SubscriptionMixin instead. See go/tiktok/concurrent/futuresmixin.md. listen() was called while the Fragment's state is saved - work started at this point in the lifecycle can't be persisted, and can lose state.");
        elab elabVar = elam.a;
        elat c = ekyf.c();
        if (c != null) {
            elaa i = c.i(elam.a);
            if (i.b() && ((Boolean) i.a()).booleanValue()) {
                StrictMode.noteSlowCall("FuturesMixin called from Lifecycle");
            }
        }
        this.c.b(listenableFuture, obj, ejlrVar);
        if (this.h) {
            return;
        }
        Throwable th = new Throwable();
        th.fillInStackTrace();
        ((enrr) ((enrr) ((enrr) a.j()).g(th)).h("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl", "listen", (char) 227, "FuturesMixinImpl.java")).q("listen() called outside listening window");
        this.g.a.add(ejlrVar);
        this.g.b = eldl.l(new ejls());
        ejlt ejltVar = this.g;
        efbd.f(ejltVar);
        efbd.e(ejltVar);
    }

    @Override // defpackage.ejlq
    public final void k(ejlr ejlrVar) {
        efbd.c();
        emxf.m(!this.i, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        emxf.m(!this.f.a().a(lkj.STARTED), "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        emxf.m(!this.h, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        if (!this.b) {
            this.j.add(ejlrVar);
            return;
        }
        ejmb ejmbVar = this.c;
        if (ejmbVar != null) {
            ejmbVar.c(ejlrVar);
        } else {
            this.j.add(ejlrVar);
        }
    }

    @Override // defpackage.ejlq
    public final void l(ejlp ejlpVar, ejlm ejlmVar, ejlr ejlrVar) {
        efbd.c();
        emxf.m(!((fr) this.d.b()).ai(), "Listen called outside safe window. State loss is possible.");
        this.c.b(ejlpVar.a, ejlmVar.a, ejlrVar);
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }
}
