package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ersj extends errh {
    final /* synthetic */ ersl a;
    private final erog b;

    public ersj(ersl erslVar, erog erogVar) {
        this.a = erslVar;
        erogVar.getClass();
        this.b = erogVar;
    }

    @Override // defpackage.errh
    public final /* bridge */ /* synthetic */ Object a() {
        ListenableFuture a = this.b.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.errh
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.errh
    public final void d(Throwable th) {
        this.a.setException(th);
    }

    @Override // defpackage.errh
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.m((ListenableFuture) obj);
    }

    @Override // defpackage.errh
    public final boolean g() {
        return this.a.isDone();
    }
}
