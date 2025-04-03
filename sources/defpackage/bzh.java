package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzh implements bxw {
    public final Map a = new LinkedHashMap();
    public bux b = bux.INACTIVE;
    public final List c = new ArrayList();
    final /* synthetic */ bzy d;

    public bzh(bzy bzyVar) {
        this.d = bzyVar;
    }

    @Override // defpackage.buy
    public final ListenableFuture a() {
        return kfg.a(new kfd() { // from class: byz
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final bzh bzhVar = bzh.this;
                bzhVar.d.h.execute(new Runnable() { // from class: bza
                    @Override // java.lang.Runnable
                    public final void run() {
                        kfb kfbVar2 = kfbVar;
                        final bzh bzhVar2 = bzh.this;
                        bux buxVar = bzhVar2.b;
                        if (buxVar == bux.ACTIVE) {
                            final ListenableFuture g = bzhVar2.d.g();
                            bkj.j(g, kfbVar2);
                            kfbVar2.a(new Runnable() { // from class: bzc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bzh.this.e(g);
                                }
                            }, bjb.a());
                            bzhVar2.c.add(g);
                            g.b(new Runnable() { // from class: bzd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bzh.this.c.remove(g);
                                }
                            }, bzhVar2.d.h);
                            return;
                        }
                        if (buxVar == bux.INACTIVE) {
                            kfbVar2.c(new IllegalStateException("BufferProvider is not active."));
                            return;
                        }
                        bux buxVar2 = bzhVar2.b;
                        Objects.toString(buxVar2);
                        kfbVar2.c(new IllegalStateException("Unknown state: ".concat(String.valueOf(buxVar2))));
                    }
                });
                return "acquireBuffer";
            }
        });
    }

    @Override // defpackage.bfl
    public final ListenableFuture b() {
        return kfg.a(new kfd() { // from class: byy
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final bzh bzhVar = bzh.this;
                bzhVar.d.h.execute(new Runnable() { // from class: bzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        kfbVar.b(bzh.this.b);
                    }
                });
                return "fetchData";
            }
        });
    }

    @Override // defpackage.bfl
    public final void c(final Executor executor, final bfk bfkVar) {
        this.d.h.execute(new Runnable() { // from class: byx
            @Override // java.lang.Runnable
            public final void run() {
                final bfk bfkVar2 = bfkVar;
                ksw.h(bfkVar2);
                Executor executor2 = executor;
                ksw.h(executor2);
                bzh bzhVar = bzh.this;
                bzhVar.a.put(bfkVar2, executor2);
                final bux buxVar = bzhVar.b;
                executor2.execute(new Runnable() { // from class: bzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        bfk.this.b(buxVar);
                    }
                });
            }
        });
    }

    @Override // defpackage.bfl
    public final void d(final bfk bfkVar) {
        this.d.h.execute(new Runnable() { // from class: bzg
            @Override // java.lang.Runnable
            public final void run() {
                bfk bfkVar2 = bfkVar;
                ksw.h(bfkVar2);
                bzh.this.a.remove(bfkVar2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(ListenableFuture listenableFuture) {
        if (listenableFuture.cancel(true)) {
            return;
        }
        ksw.c(listenableFuture.isDone());
        try {
            ((cac) listenableFuture.get()).d();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            bzy bzyVar = this.d;
            e.toString();
            avw.f(bzyVar.a, "Unable to cancel the input buffer: ".concat(e.toString()));
        }
    }

    final void f(boolean z) {
        final bux buxVar = z ? bux.ACTIVE : bux.INACTIVE;
        if (this.b == buxVar) {
            return;
        }
        this.b = buxVar;
        if (buxVar == bux.INACTIVE) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(true);
            }
            this.c.clear();
        }
        for (final Map.Entry entry : this.a.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new Runnable() { // from class: bze
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((bfk) entry.getKey()).b(buxVar);
                    }
                });
            } catch (RejectedExecutionException e) {
                avw.d(this.d.a, "Unable to post to the supplied executor.", e);
            }
        }
    }
}
