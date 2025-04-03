package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgx {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.igq r18, java.lang.String r19, defpackage.hvi r20, defpackage.huo r21, defpackage.inp r22, float r23, defpackage.ibx r24, defpackage.hfd r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgx.a(igq, java.lang.String, hvi, huo, inp, float, ibx, hfd, int, int):void");
    }

    public static final void b(ich ichVar, String str, hvi hviVar, huo huoVar, inp inpVar, hfd hfdVar, int i, int i2) {
        inp inpVar2;
        if ((i2 & 4) != 0) {
            hviVar = hvi.e;
        }
        hvi hviVar2 = hviVar;
        if ((i2 & 8) != 0) {
            int i3 = huo.a;
            huoVar = hum.e;
        }
        huo huoVar2 = huoVar;
        if ((i2 & 16) != 0) {
            int i4 = inp.a;
            inpVar2 = ino.b;
        } else {
            inpVar2 = inpVar;
        }
        boolean D = hfdVar.D(ichVar);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            igo igoVar = new igo(ichVar, (ichVar.b() & 4294967295L) | (ichVar.c() << 32));
            igoVar.a = 1;
            hfdVar.y(igoVar);
            f = igoVar;
        }
        a((igo) f, str, hviVar2, huoVar2, inpVar2, 1.0f, null, hfdVar, i & 65520, 0);
    }
}
