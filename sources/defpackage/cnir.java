package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnir {
    public static final cskc a = cskc.g("Bugle", "BroadcastReceiverAsyncWorkTracker");
    public final cnix b;
    public final cnhy c;
    public final Context d;
    public final ffbr e;
    public final ejjz f;
    public final errm g;
    public final akzt h;
    public final albq i;
    public final cnjc j;
    public akzw k;
    private boolean l = false;
    private final Object m = new Object();
    private final BroadcastReceiver.PendingResult n;

    public cnir(Context context, cnjd cnjdVar, ffbr ffbrVar, ejjz ejjzVar, errm errmVar, akzt akztVar, albq albqVar, cnix cnixVar, ListenableFuture listenableFuture, BroadcastReceiver.PendingResult pendingResult, cnhy cnhyVar) {
        this.d = context;
        this.e = ffbrVar;
        this.f = ejjzVar;
        this.g = errmVar;
        this.h = akztVar;
        this.i = albqVar;
        this.b = cnixVar;
        this.n = pendingResult;
        this.c = cnhyVar;
        this.j = cnjdVar.a(listenableFuture);
        b(new Consumer() { // from class: cnil
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cnir cnirVar = cnir.this;
                cnirVar.a();
                cnirVar.b.a(cnirVar.c);
                cnirVar.c.t();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void a() {
        boolean z;
        synchronized (this.m) {
            if (this.l) {
                z = false;
            } else {
                z = true;
                this.l = true;
            }
        }
        if (z) {
            csjb c = a.c();
            c.I("Acknowledging broadcast of");
            c.I(this.c);
            c.r();
            this.n.finish();
        }
    }

    public final void b(Consumer consumer) {
        axnw.i(this.j.d, consumer, erpp.a);
    }

    public final void c() {
        akzw akzwVar = this.k;
        if (akzwVar != null) {
            akzwVar.c();
            this.k = null;
        }
    }

    public final boolean d(ListenableFuture listenableFuture) {
        return this.j.a(elfl.g(listenableFuture).h(new emwl() { // from class: cnip
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, this.g).e(RuntimeException.class, new emwl() { // from class: cniq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cnir cnirVar = cnir.this;
                RuntimeException runtimeException = (RuntimeException) obj;
                cnirVar.e(runtimeException);
                cnirVar.h.a();
                throw runtimeException;
            }
        }, this.g));
    }

    public final void e(Exception exc) {
        csjb c = a.c();
        c.I("Ending foreground service for broadcast of");
        c.I(this.c);
        c.s(exc);
        c();
        this.h.e("Bugle.Broadcast.ForegroundNotification.Dismiss.Count", 1);
    }
}
