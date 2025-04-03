package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdp extends fbbs {
    private final fbbm b;

    public djdp(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar) {
        super(fbbfVar2, new fbcd(djdp.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        TraceId d;
        Optional optional = (Optional) obj;
        diyy diyyVar = djdd.a;
        if (optional.isEmpty()) {
            d = TraceId.b().d();
        } else {
            fayv fayvVar = ((dkjt) optional.get()).i;
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
        }
        return erqt.i(d);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
