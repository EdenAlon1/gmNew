package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejoq implements ejop {
    private final pqs a;

    public ejoq(pqs pqsVar) {
        this.a = pqsVar;
    }

    @Override // defpackage.ejop
    public final ListenableFuture a(String str) {
        return ejoo.b(((pqc) this.a.a(str)).c);
    }

    @Override // defpackage.ejop
    public final ListenableFuture b(String str) {
        return ejoo.b(((pqc) this.a.b(str)).c);
    }

    @Override // defpackage.ejop
    public final ListenableFuture c(UUID uuid) {
        return ejoo.b(((pqc) this.a.c(uuid)).c);
    }

    @Override // defpackage.ejop
    public final ListenableFuture d(pqv pqvVar) {
        return ejoo.b(((pqc) this.a.d(pqvVar)).c);
    }

    @Override // defpackage.ejop
    public final ListenableFuture e(String str, poz pozVar, pqi pqiVar) {
        return ejoo.b(((pqc) this.a.f(str, pozVar, pqiVar)).c);
    }

    @Override // defpackage.ejop
    public final /* synthetic */ ListenableFuture f(String str, ppa ppaVar, ppw ppwVar) {
        return ejoo.a(this, str, ppaVar, ppwVar);
    }

    @Override // defpackage.ejop
    public final ListenableFuture g(String str, ppa ppaVar, List list) {
        return ejoo.b(((pqc) this.a.h(str, ppaVar, list)).c);
    }

    @Override // defpackage.ejop
    public final ListenableFuture h(pqt pqtVar) {
        return this.a.l(pqtVar);
    }

    @Override // defpackage.ejop
    public final ListenableFuture i() {
        return ejoo.b(((pqc) this.a.i()).c);
    }
}
