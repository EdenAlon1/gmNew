package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekca implements ekap {
    private final ekdb a;
    private final ecvo b;
    private final Map c;
    private final String d;

    public ekca(ekdb ekdbVar, ecvo ecvoVar, Map map, String str) {
        ekdbVar.getClass();
        ecvoVar.getClass();
        this.a = ekdbVar;
        this.b = ecvoVar;
        this.c = map;
        this.d = str;
    }

    private final ListenableFuture c(ecwu ecwuVar) {
        return this.a.a(this.d, ecwuVar);
    }

    private final void d(eyee eyeeVar) {
        if (eyeeVar != null) {
            ecvo ecvoVar = this.b;
            Set set = (Set) this.c.get(ecvd.b(this.d));
            if (set == null) {
                set = ffen.a;
            }
            ((ecyx) ecvoVar.c).a(eyeeVar, set, "", this.d, false, true);
        }
    }

    @Override // defpackage.ekap
    public final ListenableFuture a(String str, eyee eyeeVar, ecwu ecwuVar) {
        if (!ffkj.e(str, "")) {
            throw new IllegalStateException("DEVICE tier packages may only commit with LOGGED_OUT_USER");
        }
        d(eyeeVar);
        return c(ecwuVar);
    }

    @Override // defpackage.ekap
    public final ListenableFuture b(eyee eyeeVar, ecwu ecwuVar) {
        d(eyeeVar);
        return c(ecwuVar);
    }
}
