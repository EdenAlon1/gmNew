package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dygt implements dydc {
    public final emyl a;
    private final Executor b;
    private final erqa c = new erqa();

    public dygt(emyl emylVar, Executor executor) {
        this.a = emylVar;
        this.b = executor;
    }

    private final ListenableFuture j(erog erogVar) {
        return this.c.b(eldl.c(erogVar), this.b);
    }

    private static void k(ListenableFuture listenableFuture) {
        erqt.r(erqc.o(listenableFuture), new dygs(), erpp.a);
    }

    @Override // defpackage.dydc
    public final ListenableFuture a() {
        return j(new erog() { // from class: dyfz
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ((elfl) dygt.this.a.get()).i(new eroh() { // from class: dyga
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((dydc) obj).a();
                    }
                }, erpp.a);
            }
        });
    }

    @Override // defpackage.dydc
    public final ListenableFuture b() {
        return j(new erog() { // from class: dygl
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ((elfl) dygt.this.a.get()).i(new eroh() { // from class: dyge
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((dydc) obj).b();
                    }
                }, erpp.a);
            }
        });
    }

    @Override // defpackage.dydc
    public final ListenableFuture c(final dydb dydbVar, final int i) {
        return j(new erog() { // from class: dygb
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl elflVar = (elfl) dygt.this.a.get();
                final dydb dydbVar2 = dydbVar;
                final int i2 = i;
                return elflVar.i(new eroh() { // from class: dygd
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((dydc) obj).c(dydb.this, i2);
                    }
                }, erpp.a);
            }
        });
    }

    @Override // defpackage.dydc
    public final ListenableFuture d() {
        return j(new erog() { // from class: dygf
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ((elfl) dygt.this.a.get()).i(new eroh() { // from class: dygk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((dydc) obj).d();
                    }
                }, erpp.a);
            }
        });
    }

    @Override // defpackage.dydc
    public final ListenableFuture e(final dydb dydbVar, final int i) {
        return j(new erog() { // from class: dygr
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl elflVar = (elfl) dygt.this.a.get();
                final dydb dydbVar2 = dydbVar;
                final int i2 = i;
                return elflVar.i(new eroh() { // from class: dygi
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((dydc) obj).e(dydb.this, i2);
                    }
                }, erpp.a);
            }
        });
    }

    @Override // defpackage.dydc
    public final ListenableFuture f(final byte[] bArr, final ewse ewseVar) {
        return j(new erog() { // from class: dygc
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl elflVar = (elfl) dygt.this.a.get();
                final byte[] bArr2 = bArr;
                final ewse ewseVar2 = ewseVar;
                return elflVar.i(new eroh() { // from class: dygm
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((dydc) obj).f(bArr2, ewseVar2);
                    }
                }, erpp.a);
            }
        });
    }

    @Override // defpackage.dydc
    public final void g(final dyda dydaVar, final Executor executor) {
        k(j(new erog() { // from class: dygq
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl elflVar = (elfl) dygt.this.a.get();
                final dyda dydaVar2 = dydaVar;
                final Executor executor2 = executor;
                return elflVar.h(new emwl() { // from class: dygo
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ((dydc) obj).g(dyda.this, executor2);
                        return null;
                    }
                }, erpp.a);
            }
        }));
    }

    @Override // defpackage.dydc
    public final void h(final dyda dydaVar) {
        k(j(new erog() { // from class: dygg
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl elflVar = (elfl) dygt.this.a.get();
                final dyda dydaVar2 = dydaVar;
                return elflVar.h(new emwl() { // from class: dygh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ((dydc) obj).h(dyda.this);
                        return null;
                    }
                }, erpp.a);
            }
        }));
    }

    @Override // defpackage.dydc
    public final ListenableFuture i(final byte[] bArr) {
        return j(new erog() { // from class: dygj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl elflVar = (elfl) dygt.this.a.get();
                final byte[] bArr2 = bArr;
                return elflVar.i(new eroh() { // from class: dygp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((dydc) obj).i(bArr2);
                    }
                }, erpp.a);
            }
        });
    }
}
