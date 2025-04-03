package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes5.dex */
public class efid {
    public final String a;
    public final efie b;
    public final ejlc c;
    public final ekyr e;
    private final ListenableFuture g;
    private final ejlc i = new ejlc(new efia(this), erpp.a);
    public final Object d = new Object();
    public List f = new ArrayList();
    private final erqa h = new erqa();

    public efid(efie efieVar, ListenableFuture listenableFuture, boolean z) {
        this.b = efieVar;
        this.g = listenableFuture;
        this.a = efieVar.f();
        this.c = new ejlc(efieVar.a(), erpp.a);
        if (z) {
            this.e = new ekyq();
        } else {
            this.e = new ekyp();
        }
        d(new eroh() { // from class: efhw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return efid.this.c.c();
            }
        });
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFuture;
        this.e.a();
        emyg.c(emtt.a);
        if (this.i.e()) {
            listenableFuture = this.b.i();
        } else {
            ekzz b = this.e.b("Get ".concat(String.valueOf(this.a)));
            try {
                ListenableFuture g = erny.g(this.i.c(), eldl.d(new eroh() { // from class: efhy
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return efid.this.b.i();
                    }
                }), erpp.a);
                b.b(g);
                b.close();
                listenableFuture = g;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        erqt.j(this.g);
        return erqt.j(listenableFuture);
    }

    public final ListenableFuture b(final emwl emwlVar, Executor executor) {
        return c(eldl.d(new eroh() { // from class: efht
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return erqt.i(emwl.this.apply(obj));
            }
        }), executor);
    }

    public final ListenableFuture c(final eroh erohVar, final Executor executor) {
        emyg.c(emtt.a);
        ekzz b = this.e.b("Update ".concat(String.valueOf(this.a)));
        try {
            final ListenableFuture c = this.i.c();
            this.h.b(new erog() { // from class: efhu
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return ListenableFuture.this;
                }
            }, erpp.a);
            ListenableFuture b2 = this.h.b(eldl.c(new erog() { // from class: efhv
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    final efid efidVar = efid.this;
                    final eroh erohVar2 = erohVar;
                    final Executor executor2 = executor;
                    return erny.g(c, eldl.d(new eroh() { // from class: efhx
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return efid.this.b.h(erohVar2, executor2);
                        }
                    }), erpp.a);
                }
            }), erpp.a);
            erqt.t(b2, c);
            erqt.j(this.g);
            ListenableFuture a = efih.a(b2);
            b.b(a);
            b.close();
            return a;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(eroh erohVar) {
        synchronized (this.d) {
            this.f.add(erohVar);
        }
    }
}
