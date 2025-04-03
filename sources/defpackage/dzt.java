package defpackage;

import androidx.car.app.model.Alert;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzt {
    public static final /* synthetic */ int a = 0;

    static {
        int i = dza.b;
        int i2 = huo.a;
        int i3 = dyz.a;
        int i4 = dyx.a;
    }

    public static final ipl a(Iterator it, dzz dzzVar) {
        try {
            if (!(it instanceof dyu)) {
                return (ipl) it.next();
            }
            dzzVar.getClass();
            throw null;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.hvi r19, defpackage.dxi r20, defpackage.dxq r21, defpackage.hus r22, int r23, int r24, defpackage.ffjn r25, defpackage.hfd r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzt.b(hvi, dxi, dxq, hus, int, int, ffjn, hfd, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ab, code lost:
    
        if (r4 == defpackage.hfc.a) goto L134;
     */
    @defpackage.ffbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hvi r18, defpackage.dxi r19, defpackage.dxq r20, defpackage.hus r21, int r22, defpackage.eaf r23, defpackage.ffjn r24, defpackage.hfd r25, int r26) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzt.c(hvi, dxi, dxq, hus, int, eaf, ffjn, hfd, int):void");
    }

    public static final int d(inx inxVar, int i) {
        return inxVar.c(i);
    }

    public static final int e(inx inxVar, int i) {
        return inxVar.d(i);
    }

    public static final long f(ipl iplVar, long j, ffji ffjiVar) {
        if (ebi.a(ebi.b(iplVar)) != 0.0f) {
            int e = e(iplVar, Alert.DURATION_SHOW_INDEFINITELY);
            return cmv.c(e, d(iplVar, e));
        }
        ebi.b(iplVar);
        iqk e2 = iplVar.e(j);
        ffjiVar.invoke(e2);
        return cmv.c(e2.w(), e2.v());
    }
}
