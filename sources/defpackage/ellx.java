package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ellx implements erqj {
    final /* synthetic */ elly a;
    final /* synthetic */ ellz b;

    public ellx(elly ellyVar, ellz ellzVar) {
        this.a = ellyVar;
        this.b = ellzVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        this.a.a.set(obj);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ellz ellzVar = this.b;
        emwl emwlVar = ellzVar.a;
        SettableFuture settableFuture = ellzVar.b;
        try {
            Throwable th2 = (Throwable) emwlVar.apply(th);
            th2.getClass();
            settableFuture.setException(th2);
        } catch (Throwable th3) {
            settableFuture.setException(new elma(engw.p(new Throwable[]{th, th3})));
        }
    }
}
