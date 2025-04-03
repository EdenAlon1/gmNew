package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cckc {
    public static final ccki a(Throwable th, int i) {
        th.getClass();
        if ((th instanceof baan) || (th instanceof csgw)) {
            return new cckh(th);
        }
        if (!(th instanceof csgy)) {
            if (th instanceof Exception) {
                return (Status.c(th).getCode() == Status.Code.INVALID_ARGUMENT && i == ccue.a(17)) ? new cckd(th) : new ccke(th);
            }
            throw th;
        }
        csgx csgxVar = ((csgy) th).b;
        if (csgxVar != null) {
            int ordinal = csgxVar.ordinal();
            if (ordinal == 0) {
                return new cckd(th);
            }
            if (ordinal == 1) {
                return new ccke(th);
            }
            if (ordinal == 2) {
                return new cckh(th);
            }
            if (ordinal == 3) {
                return new cckf();
            }
        }
        throw new ffcd();
    }
}
