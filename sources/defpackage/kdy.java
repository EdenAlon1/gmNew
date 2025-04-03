package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdy {
    public static final /* synthetic */ int a = 0;
    private static final hik b = new hgq(hla.a, kdd.a);

    public static final int a(kex kexVar, boolean z) {
        boolean z2 = kexVar.b;
        int i = kexVar.a;
        return z ? i | 8192 : i & (-8193);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.kev r22, defpackage.ffix r23, defpackage.kex r24, defpackage.ffjm r25, defpackage.hfd r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdy.b(kev, ffix, kex, ffjm, hfd, int, int):void");
    }

    public static final boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final void d(huo huoVar, ffix ffixVar, kex kexVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        ffjm ffjmVar2;
        kex kexVar2;
        ffix ffixVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(295309329);
        if (i3 == 0) {
            i2 = (true != b2.D(huoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != b2.F(ffixVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != b2.D(kexVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != b2.F(ffjmVar) ? 8192 : 16384;
        }
        if (b2.J((i4 & 9363) != 9362, i4 & 1)) {
            boolean z = (i4 & 14) == 4;
            boolean z2 = (i4 & 112) == 32;
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if ((z | z2) || R == hfc.a) {
                R = new kcq(huoVar);
                hfmVar.ad(R);
            }
            b((kcq) R, ffixVar, kexVar, ffjmVar, b2, (i4 >> 3) & 8176, 0);
            ffixVar2 = ffixVar;
            kexVar2 = kexVar;
            ffjmVar2 = ffjmVar;
        } else {
            ffjmVar2 = ffjmVar;
            kexVar2 = kexVar;
            ffixVar2 = ffixVar;
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new kde(huoVar, ffixVar2, kexVar2, ffjmVar2, i);
        }
    }
}
