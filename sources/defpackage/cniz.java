package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cniz extends cnjf {
    private static final enru T = enru.c("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver");
    public ffbr K;
    public ffbr L;
    public ffbr M;
    public ffbr N;
    public ffbr O;
    private BroadcastReceiver.PendingResult U;
    private cnjc V;

    private final cnjc f(ListenableFuture listenableFuture) {
        final cnjc a = ((cnjd) this.O.b()).a(listenableFuture);
        axnw.i(a.d, new Consumer() { // from class: cniy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cniz.this.s(a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, (Executor) this.N.b());
        return a;
    }

    public abstract ekzm a();

    public abstract String b();

    public abstract void c(Context context, Intent intent);

    protected int e() {
        return 18;
    }

    @Override // defpackage.cnjf, android.content.BroadcastReceiver
    public synchronized void onReceive(Context context, Intent intent) {
        d(context);
        if (TextUtils.isEmpty(intent.getAction())) {
            ((akzt) this.M.b()).e("Bugle.Receiver.NonExportedReceivers.NullActionIntent.Counts", e());
        }
        ekzm a = a();
        try {
            emxf.a(this.V == null);
            String b = b();
            if (!TextUtils.isEmpty(b)) {
                ((albq) this.K.b()).b(b);
            }
            Iterable$EL.forEach((Set) ((cnix) this.L.b()).a.b(), new Consumer() { // from class: cniu
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    final cnih cnihVar = (cnih) obj;
                    final cniz cnizVar = cniz.this;
                    axnw.h(elfo.f(new Runnable() { // from class: cnie
                        @Override // java.lang.Runnable
                        public final void run() {
                            cnih cnihVar2 = cnih.this;
                            emxf.l(cnihVar2.b.add(cnizVar));
                            if (cnihVar2.b.size() == 1) {
                                final cnid cnidVar = cnihVar2.c;
                                axnw.h(elfo.f(new Runnable() { // from class: cnia
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        cnid cnidVar2 = cnid.this;
                                        cnidVar2.c = true;
                                        if (cnidVar2.d) {
                                            return;
                                        }
                                        ((cnjq) cnidVar2.a.b()).b();
                                    }
                                }, cnidVar.b));
                            }
                        }
                    }, cnihVar.a));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.U = null;
            try {
                c(context, intent);
                a.close();
            } finally {
                ((cnix) this.L.b()).b(this, r());
                if (!r()) {
                    ensk e = T.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onReceive", 114, "BugleBroadcastReceiver.java")).t("Immediately completing broadcast of %s", this);
                    t();
                }
            }
        } finally {
        }
    }

    public synchronized void q(String str, ListenableFuture listenableFuture) {
        if (r()) {
            cnjc cnjcVar = this.V;
            cnjcVar.getClass();
            if (!cnjcVar.a(listenableFuture)) {
                ensk g = T.g();
                g.Y(ente.a, "Bugle");
                ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "addAsyncWork", 137, "BugleBroadcastReceiver.java")).q("Creating new dynamicFutureListListener since previous work has completed");
                this.V = f(listenableFuture);
            }
        } else {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            this.U = goAsync;
            goAsync.getClass();
            this.V = f(listenableFuture);
            ensk e = T.e();
            e.Y(ente.a, "Bugle");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "addAsyncWork", 133, "BugleBroadcastReceiver.java")).t("Broadcast of %s is going async", this);
        }
        ensk e2 = T.e();
        e2.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "addAsyncWork", 142, "BugleBroadcastReceiver.java")).D("Adding %s to broadcast of %s", str, this);
        ekzz f = eleg.f("ReceiverAsyncWork");
        try {
            f.b(listenableFuture);
            f.close();
        } finally {
        }
    }

    protected synchronized boolean r() {
        return this.U != null;
    }

    public final synchronized void s(cnjc cnjcVar) {
        if (this.V != cnjcVar) {
            enru enruVar = T;
            ensk g = enruVar.g();
            g.Y(ente.a, "Bugle");
            ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onAsyncWorkComplete", 169, "BugleBroadcastReceiver.java")).q("Ignoring #onAsyncWorkComplete because new work has been added");
            ensk j = enruVar.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onAsyncWorkComplete", 170, "BugleBroadcastReceiver.java")).q("skipping calling pendingResult.finish.  Work was enqueued after the processing of first batch of work was complete.");
            return;
        }
        ensk e = T.e();
        e.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onAsyncWorkComplete", 176, "BugleBroadcastReceiver.java")).t("Completing broadcast of %s", this);
        this.V = null;
        BroadcastReceiver.PendingResult pendingResult = this.U;
        pendingResult.getClass();
        pendingResult.finish();
        ((cnix) this.L.b()).a(this);
        t();
    }

    protected final void t() {
        String b = b();
        if (TextUtils.isEmpty(b)) {
            return;
        }
        ((albq) this.K.b()).n(b);
    }
}
