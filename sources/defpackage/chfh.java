package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chfh {
    public static final ensn a = new ensn("tachyon_grpc_status_code", Status.Code.class, false, false);
    public static final febj b;

    static {
        chfg chfgVar = new chfg();
        int i = febj.d;
        b = new febg("google.internal.communications.instantmessaging.v1.tachyonerror-bin", chfgVar);
    }

    public static Status.Code a(Throwable th) {
        Status c = Status.c(th);
        return c == null ? Status.Code.UNKNOWN : c.getCode();
    }

    public static fgtr b(Throwable th) {
        febo a2 = Status.a(th);
        if (a2 == null) {
            return fgtr.UNKNOWN;
        }
        fcge fcgeVar = (fcge) a2.b(b);
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

    public static boolean c(Status.Code code) {
        Status.Code code2 = Status.Code.OK;
        int ordinal = code.ordinal();
        return ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 13 || ordinal == 14;
    }

    public static boolean d(Throwable th) {
        return c(a(th));
    }
}
