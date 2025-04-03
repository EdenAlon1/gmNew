package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eckx implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ ecky a;
    private final Thread.UncaughtExceptionHandler b;

    public eckx(ecky eckyVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = eckyVar;
        this.b = uncaughtExceptionHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[Catch: all -> 0x03e1, Exception -> 0x03e3, TryCatch #1 {Exception -> 0x03e3, blocks: (B:3:0x0006, B:5:0x002c, B:7:0x0032, B:9:0x003f, B:10:0x0050, B:12:0x0058, B:14:0x0066, B:15:0x0068, B:17:0x006f, B:19:0x007b, B:20:0x00b0, B:22:0x00b8, B:23:0x00be, B:25:0x00c6, B:27:0x00d2, B:28:0x00d4, B:30:0x00da, B:33:0x00ea, B:34:0x00f0, B:36:0x0145, B:43:0x0152, B:48:0x016b, B:50:0x0177, B:52:0x0189, B:54:0x0195, B:56:0x01c5, B:62:0x01ce, B:65:0x0212, B:67:0x025b, B:69:0x0261, B:70:0x0289, B:72:0x028f, B:111:0x0293, B:86:0x031c, B:89:0x0324, B:90:0x032c, B:92:0x0333, B:94:0x0355, B:96:0x035b, B:99:0x0363, B:101:0x0374, B:102:0x037a, B:103:0x037f, B:105:0x039a, B:106:0x03a0, B:108:0x03a7, B:109:0x03bf, B:74:0x02b1, B:84:0x02c6, B:76:0x02e3, B:78:0x02e9, B:81:0x0308, B:114:0x03d7, B:122:0x01f1, B:125:0x01fc, B:128:0x0206), top: B:2:0x0006, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r22, java.lang.Throwable r23) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eckx.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
