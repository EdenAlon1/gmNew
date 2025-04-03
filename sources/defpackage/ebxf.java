package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebxf implements ebwq {
    public final emyl a;
    public final AtomicReference b = new AtomicReference();
    private final errl c;

    public ebxf(ExecutorService executorService, emyl emylVar) {
        this.c = errs.a(executorService);
        this.a = emys.a(emylVar);
    }

    private final ListenableFuture h(final emwl emwlVar) {
        if (this.b.get() != null) {
            return (ListenableFuture) emwlVar.apply((ebwq) this.b.get());
        }
        final emyl emylVar = this.a;
        emylVar.getClass();
        return elfl.g(elfr.h(new Callable() { // from class: ebwz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (ebwq) emyl.this.get();
            }
        }, this.c)).i(new eroh() { // from class: ebxa
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ebwq ebwqVar = (ebwq) obj;
                ebxf.this.b.set(ebwqVar);
                return (ListenableFuture) emwlVar.apply(ebwqVar);
            }
        }, erpp.a);
    }

    private final void i(final Runnable runnable) {
        if (this.b.get() != null) {
            runnable.run();
        } else {
            this.c.execute(eldl.l(new Runnable() { // from class: ebwy
                @Override // java.lang.Runnable
                public final void run() {
                    ebxf ebxfVar = ebxf.this;
                    ebxfVar.b.set((ebwq) ebxfVar.a.get());
                    runnable.run();
                }
            }));
        }
    }

    @Override // defpackage.ebwq
    public final ListenableFuture a() {
        return h(new emwl() { // from class: ebww
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ebwq) obj).a();
            }
        });
    }

    @Override // defpackage.ebwq
    public final ListenableFuture b(final String str) {
        return h(new emwl() { // from class: ebwx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ebwq) obj).b(str);
            }
        });
    }

    @Override // defpackage.ebwq
    public final ListenableFuture c() {
        return h(new emwl() { // from class: ebxe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ebwq) obj).c();
            }
        });
    }

    @Override // defpackage.ebwq
    public final void d(final ejhg ejhgVar) {
        i(new Runnable() { // from class: ebxb
            @Override // java.lang.Runnable
            public final void run() {
                ((ebwq) ebxf.this.b.get()).d(ejhgVar);
            }
        });
    }

    @Override // defpackage.ebwq
    public final void e(final ejhg ejhgVar) {
        i(new Runnable() { // from class: ebwv
            @Override // java.lang.Runnable
            public final void run() {
                ((ebwq) ebxf.this.b.get()).e(ejhgVar);
            }
        });
    }

    @Override // defpackage.ebwq
    public final ListenableFuture f(final String str, final int i) {
        return h(new emwl() { // from class: ebxc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ebwq) obj).f(str, i);
            }
        });
    }

    @Override // defpackage.ebwq
    public final ListenableFuture g(final String str, final int i) {
        return h(new emwl() { // from class: ebxd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ebwq) obj).g(str, i);
            }
        });
    }
}
