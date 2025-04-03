package defpackage;

import android.content.Context;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzcw {
    static final febj a;
    private static dzcw b;

    static {
        dzcv dzcvVar = new dzcv();
        int i = febj.d;
        a = new febg("google.internal.communications.instantmessaging.v1.tachyonerror-bin", dzcvVar);
        b = null;
    }

    public static dzcw b() {
        if (b == null) {
            b = new dzcw();
        }
        return b;
    }

    public final int a(Context context, Throwable th) {
        if (!dyjr.a(context)) {
            return 6;
        }
        if (th.getCause() instanceof dezu) {
            return 7;
        }
        return th instanceof dzcl ? 8 : 9;
    }

    public final fgtr c(Throwable th) {
        febo a2 = Status.a(th);
        if (a2 == null) {
            return fgtr.UNKNOWN;
        }
        fcge fcgeVar = (fcge) a2.b(a);
        if (fcgeVar != null) {
            int i = fcgeVar.b;
            fgtr b2 = fgtr.b(i);
            if (b2 == null) {
                b2 = fgtr.UNRECOGNIZED;
            }
            fgtr fgtrVar = fgtr.UNRECOGNIZED;
            if (b2 != fgtrVar) {
                fgtr b3 = fgtr.b(i);
                return b3 == null ? fgtrVar : b3;
            }
        }
        return fgtr.UNKNOWN;
    }
}
