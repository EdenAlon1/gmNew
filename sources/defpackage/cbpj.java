package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbpj implements erqj {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ cbpk b;

    public cbpj(cbpk cbpkVar, SettableFuture settableFuture) {
        this.a = settableFuture;
        this.b = cbpkVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.b = null;
        this.a.set((cbne) obj);
        this.b.b();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.set(cbne.e());
        this.b.b();
    }
}
