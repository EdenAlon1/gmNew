package defpackage;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cnhy extends cnje {
    private static final cskc a = cskc.g("Bugle", "AsyncBroadcastReceiver");
    public erqa D;
    public ffbr E;
    public errm F;
    public cnis G;
    public ffbr H;
    public ffbr I;
    private cnir c;
    private final Object b = new Object();
    public boolean J = false;

    protected String N() {
        return null;
    }

    @Override // defpackage.cniz
    public final void c(final Context context, final Intent intent) {
        if (h(context, intent)) {
            final long a2 = ((cqoh) this.H.b()).a();
            synchronized (this.b) {
                ekzz f = eleg.f("ReceiverDoInBackground");
                try {
                    ListenableFuture b = this.D.b(eldl.c(new erog() { // from class: cnhv
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            cnhy cnhyVar = cnhy.this;
                            String N = cnhyVar.N();
                            if (!TextUtils.isEmpty(N)) {
                                ((akzt) cnhyVar.I.b()).g(N, ((cqoh) cnhyVar.H.b()).a() - a2);
                            }
                            return cnhyVar.j(context, intent);
                        }
                    }), (Executor) this.E.b());
                    f.b(b);
                    f.close();
                    cnir cnirVar = this.c;
                    if (cnirVar == null || !cnirVar.d(b)) {
                        cskc cskcVar = a;
                        csjb a3 = cskcVar.a();
                        a3.I("Creating new tracker for");
                        a3.I(this);
                        a3.r();
                        BroadcastReceiver.PendingResult goAsync = goAsync();
                        cnis cnisVar = this.G;
                        Context context2 = (Context) cnisVar.a.b();
                        context2.getClass();
                        cnjd cnjdVar = (cnjd) cnisVar.b.b();
                        cnjdVar.getClass();
                        ffbr ffbrVar = cnisVar.c;
                        ejjz ejjzVar = (ejjz) cnisVar.d.b();
                        ejjzVar.getClass();
                        errm errmVar = (errm) cnisVar.e.b();
                        errmVar.getClass();
                        akzt akztVar = (akzt) cnisVar.f.b();
                        akztVar.getClass();
                        albq albqVar = (albq) cnisVar.g.b();
                        albqVar.getClass();
                        cnix cnixVar = (cnix) cnisVar.h.b();
                        cnixVar.getClass();
                        b.getClass();
                        goAsync.getClass();
                        final cnir cnirVar2 = new cnir(context2, cnjdVar, ffbrVar, ejjzVar, errmVar, akztVar, albqVar, cnixVar, b, goAsync, this);
                        this.c = cnirVar2;
                        if (i(intent)) {
                            long longValue = ((Long) cnit.b.e()).longValue();
                            axnw.h(this.F.schedule(eldl.l(new Runnable() { // from class: cnhw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String k = cnhy.this.k(context, intent);
                                    final cnir cnirVar3 = cnirVar2;
                                    if (!cnirVar3.j.d.isDone()) {
                                        csjb c = cnir.a.c();
                                        c.I("Launching foreground service for");
                                        c.I(cnirVar3.c);
                                        c.r();
                                        cins cinsVar = (cins) cnirVar3.e.b();
                                        if (TextUtils.isEmpty(k)) {
                                            k = ((Boolean) cnit.a.e()).booleanValue() ? cnirVar3.d.getString(R.string.broadcast_receiver_notification_text_extra_info, cnirVar3.c.getClass().getName()) : cnirVar3.d.getString(R.string.foreground_service_notification_generic_text);
                                        }
                                        final Notification c2 = cinsVar.c(k);
                                        cgcs.a(new cgcr() { // from class: cnik
                                            @Override // defpackage.cgcr
                                            public final void a() {
                                                final cnir cnirVar4 = cnir.this;
                                                elfl e = elfl.g(kfg.a(new kfd() { // from class: cnim
                                                    @Override // defpackage.kfd
                                                    public final Object a(final kfb kfbVar) {
                                                        cnir.this.b(new Consumer() { // from class: cnij
                                                            @Override // java.util.function.Consumer
                                                            public final void accept(Object obj) {
                                                                kfb.this.b(null);
                                                            }

                                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                return Consumer$CC.$default$andThen(this, consumer);
                                                            }
                                                        });
                                                        return "Starting foreground notification";
                                                    }
                                                })).h(new emwl() { // from class: cnin
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj) {
                                                        csjb c3 = cnir.a.c();
                                                        c3.I("Ending foreground service on async work complete for broadcast of");
                                                        cnir cnirVar5 = cnir.this;
                                                        c3.I(cnirVar5.c);
                                                        c3.r();
                                                        cnirVar5.c();
                                                        cnirVar5.h.e("Bugle.Broadcast.ForegroundNotification.Dismiss.Count", 2);
                                                        return true;
                                                    }
                                                }, cnirVar4.g).e(RuntimeException.class, new emwl() { // from class: cnio
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj) {
                                                        RuntimeException runtimeException = (RuntimeException) obj;
                                                        cnir.this.e(runtimeException);
                                                        throw runtimeException;
                                                    }
                                                }, cnirVar4.g);
                                                Notification notification = c2;
                                                notification.getClass();
                                                cnirVar4.f.h(e, notification);
                                            }
                                        });
                                        String f2 = cnirVar3.c.f();
                                        if (!TextUtils.isEmpty(f2)) {
                                            cnirVar3.k = cnirVar3.i.c(f2, UUID.randomUUID().toString());
                                        }
                                    }
                                    cnirVar3.a();
                                }
                            }), longValue, TimeUnit.MILLISECONDS));
                            csjb a4 = cskcVar.a();
                            a4.I("Scheduled foreground service launch in");
                            a4.H(longValue);
                            a4.I("milliseconds");
                            a4.r();
                        }
                    } else {
                        csjb a5 = a.a();
                        a5.I("Adding new broadcast to existing asyncWorkTracker of receiver:");
                        a5.I(this);
                        a5.r();
                    }
                } finally {
                }
            }
        }
    }

    protected abstract String f();

    protected boolean h(Context context, Intent intent) {
        return true;
    }

    public boolean i(Intent intent) {
        return false;
    }

    protected elfl j(final Context context, final Intent intent) {
        return elfo.f(new Runnable() { // from class: cnhx
            @Override // java.lang.Runnable
            public final void run() {
                cnhy.this.g(context, intent);
            }
        }, (Executor) this.E.b());
    }

    protected String k(Context context, Intent intent) {
        return null;
    }

    @Override // defpackage.cniz
    public final synchronized void q(String str, ListenableFuture listenableFuture) {
        if (this.J) {
            super.q(str, listenableFuture);
            return;
        }
        synchronized (this.b) {
            csjb a2 = a.a();
            a2.I("Adding");
            a2.I(str);
            a2.I("to broadcast of");
            a2.I(this);
            a2.r();
            ekzz f = eleg.f("ReceiverAsyncWork");
            try {
                cnir cnirVar = this.c;
                cnirVar.getClass();
                f.b(listenableFuture);
                emxf.m(cnirVar.d(listenableFuture), "Cannot call addAsyncWork if all async work is complete.");
                f.close();
            } finally {
            }
        }
    }

    @Override // defpackage.cniz
    protected final synchronized boolean r() {
        boolean z;
        if (this.J) {
            return super.r();
        }
        synchronized (this.b) {
            cnir cnirVar = this.c;
            z = false;
            if (cnirVar != null && !cnirVar.j.d.isDone()) {
                z = true;
            }
        }
        return z;
    }

    protected void g(Context context, Intent intent) {
    }
}
