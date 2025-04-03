package defpackage;

import j$.util.Optional;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvho {
    public static final cfva a = cfvl.i(cfvl.b, "enable_wear_clearcut_rpc_logging", true);
    public static final eqmh b = eqmh.SUCCESS;
    public static final eqmh c = eqmh.GMS_ERROR;
    private final ffbr d;
    private final Optional e;

    public cvho(ffbr ffbrVar, Optional optional) {
        ffbrVar.getClass();
        this.d = ffbrVar;
        this.e = optional;
    }

    public final eqmh a(Throwable th) {
        return th instanceof dfqu ? cvhj.a(((dfqu) th).a()) : th instanceof TimeoutException ? eqmh.TASK_TIMEOUT : eqmh.CLIENT_FAILURE;
    }

    public final boolean b() {
        Object e = a.e();
        e.getClass();
        return ((Boolean) e).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (r9.equals("/bugle/rpc/send_message/") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r8, java.lang.String r9, java.lang.String r10, j$.time.Duration r11, defpackage.eqmh r12) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvho.c(int, java.lang.String, java.lang.String, j$.time.Duration, eqmh):void");
    }
}
