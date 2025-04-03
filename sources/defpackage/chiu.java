package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chiu {
    public static final /* synthetic */ int b = 0;
    private static final cfup c = cfvl.e(cfvl.b, "tachyon_streaming_grpc_deadline_seconds", 900);
    static final cfup a = cfvl.e(cfvl.b, "tachyon_grpc_deadline_seconds", 30);

    public static ffak a(ffak ffakVar, boolean z, int i) {
        return z ? ffakVar.m(evgq.b, Integer.valueOf(i)) : ffakVar;
    }

    public static ffak b(ffak ffakVar, boolean z) {
        if (((Boolean) cful.h.e()).booleanValue()) {
            ffakVar = ffakVar.n();
        }
        int intValue = z ? ((Integer) c.e()).intValue() : ((Integer) a.e()).intValue();
        return intValue > 0 ? ffakVar.j(intValue, TimeUnit.SECONDS) : ffakVar;
    }

    public static ffak c(ffak ffakVar, febo feboVar, boolean z) {
        return b(ffakVar.l(new ffaw(feboVar)), z);
    }
}
