package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejom implements ejop {
    private final qbu a;
    private final pqs b;

    public ejom(qbu qbuVar, pqs pqsVar) {
        this.a = qbuVar;
        this.b = pqsVar;
    }

    @Override // defpackage.ejop
    public final ListenableFuture a(String str) {
        return this.a.a();
    }

    @Override // defpackage.ejop
    public final ListenableFuture b(String str) {
        return this.a.b();
    }

    @Override // defpackage.ejop
    public final ListenableFuture c(UUID uuid) {
        return this.a.c();
    }

    @Override // defpackage.ejop
    public final ListenableFuture d(pqv pqvVar) {
        return this.a.d();
    }

    @Override // defpackage.ejop
    public final ListenableFuture e(String str, poz pozVar, pqi pqiVar) {
        return this.a.e();
    }

    @Override // defpackage.ejop
    public final /* synthetic */ ListenableFuture f(String str, ppa ppaVar, ppw ppwVar) {
        return ejoo.a(this, str, ppaVar, ppwVar);
    }

    @Override // defpackage.ejop
    public final ListenableFuture g(String str, ppa ppaVar, List list) {
        return this.a.f();
    }

    @Override // defpackage.ejop
    public final ListenableFuture h(pqt pqtVar) {
        return this.a.g();
    }

    @Override // defpackage.ejop
    public final ListenableFuture i() {
        return ejoo.b(((pqc) this.b.i()).c);
    }
}
