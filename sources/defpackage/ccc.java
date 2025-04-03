package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ccc {
    public final /* synthetic */ ccd a;
    public final /* synthetic */ cbw b;
    public final /* synthetic */ bct c;

    public /* synthetic */ ccc(ccd ccdVar, cbw cbwVar, bct bctVar) {
        this.a = ccdVar;
        this.b = cbwVar;
        this.c = bctVar;
    }

    public final void a() {
        cbw cbwVar;
        while (true) {
            ccd ccdVar = this.a;
            cbwVar = this.b;
            AtomicReference atomicReference = ccdVar.a.f;
            if (atomicReference.compareAndSet(cbwVar, null)) {
                cbwVar.d(cch.IDLE);
                break;
            } else if (atomicReference.get() != cbwVar) {
                break;
            }
        }
        bct bctVar = this.c;
        cbwVar.c();
        bctVar.g().d(cbwVar);
    }
}
