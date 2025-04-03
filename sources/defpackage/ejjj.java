package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejjj implements ekrm {
    private final ffbr a;

    public ejjj(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        final ejji ejjiVar = (ejji) this.a.b();
        emxf.l(true);
        return elfl.g(ejjiVar.c.e(new efkr() { // from class: ejjg
            @Override // defpackage.efkr
            public final void a(efks efksVar) {
                ejji ejjiVar2 = ejji.this;
                efksVar.b("cache_table", "write_ms<?", Long.toString(ejjiVar2.d.f().toEpochMilli() - ejjiVar2.f));
            }
        })).i(new eroh() { // from class: ejjh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ejji.this.c.a.c().f(eldl.e(new erot() { // from class: efis
                    @Override // defpackage.erot
                    public final erph a(erpc erpcVar, Object obj2) {
                        final efjh efjhVar = (efjh) obj2;
                        ekzz f = eleg.f("ExecSQL: VACUUM");
                        try {
                            ListenableFuture b = efjhVar.b(new Callable() { // from class: efiy
                                public final /* synthetic */ String b = "VACUUM";

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    efjh.this.a.execSQL(this.b);
                                    return null;
                                }
                            });
                            f.b(b);
                            f.close();
                            return new erph(b);
                        } catch (Throwable th) {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }), erpp.a).g();
            }
        }, ejjiVar.b);
    }
}
