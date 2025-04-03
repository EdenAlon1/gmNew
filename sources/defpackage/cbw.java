package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbw implements bfk {
    public final cci a;
    ListenableFuture b;
    private final bcq c;
    private final llg d;
    private cch e;
    private boolean f = false;

    public cbw(bcq bcqVar, llg llgVar, cci cciVar) {
        this.c = bcqVar;
        this.d = llgVar;
        this.a = cciVar;
        synchronized (this) {
            this.e = (cch) llgVar.a();
        }
    }

    @Override // defpackage.bfk
    public final void a(Throwable th) {
        c();
        d(cch.IDLE);
    }

    @Override // defpackage.bfk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bcs bcsVar = (bcs) obj;
        if (bcsVar == bcs.CLOSING || bcsVar == bcs.CLOSED || bcsVar == bcs.RELEASING || bcsVar == bcs.RELEASED) {
            d(cch.IDLE);
            if (this.f) {
                this.f = false;
                c();
                return;
            }
            return;
        }
        if ((bcsVar == bcs.OPENING || bcsVar == bcs.OPEN || bcsVar == bcs.PENDING_OPEN) && !this.f) {
            final bcq bcqVar = this.c;
            d(cch.IDLE);
            final ArrayList arrayList = new ArrayList();
            ListenableFuture f = bkj.f(bkj.g(bjv.a(kfg.a(new kfd() { // from class: cbr
                /* JADX WARN: Type inference failed for: r0v0, types: [ati, bcq] */
                @Override // defpackage.kfd
                public final Object a(kfb kfbVar) {
                    ?? r0 = ati.this;
                    cbv cbvVar = new cbv(kfbVar, r0);
                    arrayList.add(cbvVar);
                    r0.p(bjb.a(), cbvVar);
                    return "waitForCaptureResult";
                }
            })), new bjq() { // from class: cbs
                @Override // defpackage.bjq
                public final ListenableFuture a(Object obj2) {
                    return cbw.this.a.c();
                }
            }, bjb.a()), new afd() { // from class: cbt
                @Override // defpackage.afd
                public final Object a(Object obj2) {
                    cbw.this.d(cch.STREAMING);
                    return null;
                }
            }, bjb.a());
            this.b = f;
            bkj.i(f, new cbu(this, arrayList, bcqVar), bjb.a());
            this.f = true;
        }
    }

    public final void c() {
        ListenableFuture listenableFuture = this.b;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.b = null;
        }
    }

    final void d(cch cchVar) {
        synchronized (this) {
            if (this.e.equals(cchVar)) {
                return;
            }
            this.e = cchVar;
            Objects.toString(cchVar);
            avw.a("StreamStateObserver", "Update Preview stream state to ".concat(String.valueOf(cchVar)));
            this.d.j(cchVar);
        }
    }
}
