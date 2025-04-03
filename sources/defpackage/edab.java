package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edab {
    public static final /* synthetic */ int a = 0;
    private static final efil b = new efil(ecym.a);
    private static final Object c = new Object();
    private static volatile efgc d = null;

    public static effy a(ecvo ecvoVar) {
        Context context = ecvoVar.d;
        effz h = efga.h();
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(context);
        efbrVar.f("phenotype");
        efbrVar.g("all_accounts.pb");
        h.f(efbrVar.a());
        h.e(ecym.a);
        h.d(b);
        h.c();
        efga a2 = h.a();
        efgc efgcVar = d;
        if (efgcVar == null) {
            synchronized (c) {
                efgcVar = d;
                if (efgcVar == null) {
                    efim efimVar = efim.a;
                    HashMap hashMap = new HashMap();
                    errm e = ecvoVar.e();
                    efbm c2 = ecvoVar.c();
                    efgd.a(efho.a, hashMap);
                    efgc efgcVar2 = new efgc(e, c2, efimVar, hashMap);
                    d = efgcVar2;
                    efgcVar = efgcVar2;
                }
            }
        }
        return efgcVar.a(a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        if (r4 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.io.File r6) {
        /*
            boolean r0 = r6.isDirectory()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            java.io.File[] r0 = r6.listFiles()
            if (r0 == 0) goto L25
            r4 = r1
            r3 = r2
        L10:
            int r5 = r0.length
            if (r3 >= r5) goto L23
            r5 = r0[r3]
            if (r4 == 0) goto L1f
            boolean r4 = b(r5)
            if (r4 == 0) goto L1f
            r4 = r1
            goto L20
        L1f:
            r4 = r2
        L20:
            int r3 = r3 + 1
            goto L10
        L23:
            if (r4 == 0) goto L2c
        L25:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L2c
            return r1
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edab.b(java.io.File):boolean");
    }
}
