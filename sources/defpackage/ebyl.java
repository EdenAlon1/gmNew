package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebyl implements ebwq {
    public ebwq a;
    public final List b = new ArrayList();

    public ebyl(ebwq ebwqVar, ebwq ebwqVar2) {
        this.a = new ebyk(this, ebwqVar, ebwqVar2);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture a() {
        return this.a.a();
    }

    @Override // defpackage.ebwq
    public final ListenableFuture b(String str) {
        return this.a.b(str);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture c() {
        return this.a.c();
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
        return this.a.f(str, i);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture g(String str, int i) {
        return this.a.g(str, i);
    }
}
