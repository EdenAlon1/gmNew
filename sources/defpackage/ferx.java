package defpackage;

import io.grpc.Status;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ferx extends fear {
    static final boolean a = fend.i("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.feag
    public final feaq a(feai feaiVar) {
        return a ? new ferq(feaiVar) : new ferw(feaiVar);
    }

    @Override // defpackage.fear
    public final febw b(Map map) {
        try {
            Boolean a2 = feok.a(map, "shuffleAddressList");
            return new febw(a ? new ferl(a2) : new fers(a2));
        } catch (RuntimeException e) {
            return new febw(Status.p.d(e).withDescription("Failed parsing configuration for pick_first"));
        }
    }

    @Override // defpackage.fear
    public final String c() {
        return "pick_first";
    }

    @Override // defpackage.fear
    public final void d() {
    }

    @Override // defpackage.fear
    public final void e() {
    }
}
