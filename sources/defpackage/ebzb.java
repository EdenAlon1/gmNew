package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebzb implements ebwq {
    private final ebwq a;
    private final ebzd b;
    private final ebzg c;

    public ebzb(ebwq ebwqVar, int i, ebun ebunVar, String str) {
        this.a = ebwqVar;
        this.c = new ebzg(ebwqVar, i, ebunVar, str);
        this.b = new ebzd(ebwqVar, i, ebunVar, str);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture a() {
        return this.c.a(true);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture b(String str) {
        ebzg ebzgVar = this.c;
        ListenableFuture b = ebzgVar.a.b(str);
        elfr.l(b, new ebzf(ebzgVar), erpp.a);
        return b;
    }

    @Override // defpackage.ebwq
    public final ListenableFuture c() {
        return this.c.a(false);
    }

    @Override // defpackage.ebwq
    public final void d(ejhg ejhgVar) {
        this.a.d(ejhgVar);
    }

    @Override // defpackage.ebwq
    public final void e(ejhg ejhgVar) {
        this.a.e(ejhgVar);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture f(String str, int i) {
        return this.b.a(true, str, i);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture g(String str, int i) {
        return this.b.a(false, str, i);
    }
}
