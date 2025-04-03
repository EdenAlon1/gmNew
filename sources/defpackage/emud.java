package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emud {
    public final emyl a;
    public final emtv b;
    public final emyl c;

    private emud(lkk lkkVar, emyl emylVar, final emyl emylVar2, emtv emtvVar) {
        emxf.m(((lkv) lkkVar).c == lkj.INITIALIZED, "FutureCallbackRegistry must be created in onCreate of the Activity/Fragment.");
        this.a = emylVar;
        this.b = emtvVar;
        this.c = emys.a(new emyl() { // from class: emty
            @Override // defpackage.emyl
            public final Object get() {
                emun emunVar = (emun) ((lmw) emylVar2.get()).a(emun.class);
                emunVar.d = emud.this.b;
                return emunVar;
            }
        });
        lkkVar.c(new emua(this));
    }

    public static emub a(ListenableFuture listenableFuture) {
        return new emub(erny.f(listenableFuture, new emwn(null), erpp.a));
    }

    public static emud b(final ea eaVar) {
        lkk P = eaVar.P();
        eaVar.getClass();
        return new emud(P, new emyl() { // from class: emtw
            @Override // defpackage.emyl
            public final Object get() {
                return ea.this.I();
            }
        }, emys.a(new emyl() { // from class: emtx
            @Override // defpackage.emyl
            public final Object get() {
                return new lmw(ea.this);
            }
        }), emtv.a);
    }

    public final void c(emub emubVar, emtz emtzVar, Object obj) {
        fr frVar = (fr) this.a.get();
        emxf.m((frVar.ai() || frVar.x) ? false : true, "Called when state-loss is possible.");
        emun emunVar = (emun) this.c.get();
        emun.f();
        cpo cpoVar = emunVar.a;
        if (cpoVar.a) {
            cpp.b(cpoVar);
        }
        int i = cpoVar.d;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            } else if (cpoVar.c[i2] == emtzVar) {
                break;
            } else {
                i2++;
            }
        }
        emxf.m(i2 != -1, "Callback not registered.");
        int b = emunVar.a.b(i2);
        final emur emurVar = new emur(b, obj, emubVar.a);
        emun.f();
        emxf.m(cpp.a(emunVar.a, b) != null, "Callback not registered.");
        emxf.m(emunVar.c != null, "Listening outside of callback window.");
        emxf.m(emunVar.g, "Executing tasks from lifecycle methods is disallowed since it can result in unnecessary operations during configuration changes or other lifecycle transitions.");
        emxf.m(!emunVar.h, "Calling listen() from FutureCallbackRegistry callbacks is disallowed because hopping through the UI thread adds extra latency. Chain the new Future to the original Future using Futures.transformAsync instead.");
        emtv emtvVar = emunVar.d;
        emurVar.c.b(new Runnable() { // from class: emuo
            @Override // java.lang.Runnable
            public final void run() {
                emur.this.a();
            }
        }, erpp.a);
        emunVar.b.add(emurVar);
        emurVar.b(emunVar);
        if (emurVar.c()) {
            return;
        }
        emunVar.k(emurVar);
    }

    public final void d(int i, emtz emtzVar) {
        emxf.b(true, "Use an R.id value as the callbackId");
        emun emunVar = (emun) this.c.get();
        emun.f();
        emxf.m(!emunVar.f, "Callbacks must be registered in onCreate().");
        emxf.m(cpp.a(emunVar.a, i) == null, "Callback already registered.");
        cpo cpoVar = emunVar.a;
        emtzVar.getClass();
        cpoVar.f(i, emtzVar);
    }
}
