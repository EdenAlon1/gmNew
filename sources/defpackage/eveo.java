package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eveo extends fdxk {
    private final ejlc a;
    private final String b;
    private final Executor c;

    public eveo(final evbq evbqVar, final evbp evbpVar) {
        euzu euzuVar = (euzu) evbpVar;
        this.b = euzuVar.b.getAuthority();
        this.c = euzuVar.d;
        this.a = new ejlc(new erog() { // from class: evef
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ekzz f = eleg.f("FrameworkChannel#getTransportChannel");
                try {
                    ListenableFuture i = erqt.i(evbq.this.a(evbpVar));
                    f.close();
                    return i;
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, euzuVar.c);
    }

    @Override // defpackage.fdxk
    public final fdxo a(final febs febsVar, final fdxj fdxjVar) {
        duip.a();
        ListenableFuture c = this.a.c();
        emwl emwlVar = new emwl() { // from class: evee
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((fdxk) obj).a(febs.this, fdxjVar);
            }
        };
        Executor executor = fdxjVar.c;
        if (executor == null) {
            executor = this.c;
        }
        return new even(elfr.j(c, emwlVar, executor));
    }

    @Override // defpackage.fdxk
    public final String b() {
        return this.b;
    }
}
