package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdy extends fbbs {
    private final fbbm b;

    public djdy(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar) {
        super(fbbfVar2, new fbcd(djdy.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        TraceId d;
        djeb djebVar = (djeb) obj;
        dktn dktnVar = djdq.a;
        fayv fayvVar = djebVar.a().isPresent() ? ((dkjt) djebVar.a().get()).i : (!djebVar.b().isPresent() || ((dkkj) djebVar.b().get()).N == null) ? null : ((dkkj) djebVar.b().get()).N.i;
        if (fayvVar != null) {
            eihm b = TraceId.b();
            fayz fayzVar = fayz.a;
            eyhm eyhmVar = fayvVar.b;
            if (eyhmVar.containsKey("urn:goog:am")) {
                fayzVar = (fayz) eyhmVar.get("urn:goog:am");
            }
            eyhm eyhmVar2 = fayzVar.b;
            b.c(eyhmVar2.containsKey("Trace-Id") ? (String) eyhmVar2.get("Trace-Id") : "");
            d = b.d();
        } else {
            d = TraceId.b().d();
        }
        return erqt.i(d);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
