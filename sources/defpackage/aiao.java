package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiao {
    /* JADX WARN: Removed duplicated region for block: B:41:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.ahzr r25, final defpackage.aibo r26, final defpackage.olu r27, final defpackage.aibt r28, defpackage.hfd r29, final int r30) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiao.a(ahzr, aibo, olu, aibt, hfd, int):void");
    }

    public static final void b(ahzr ahzrVar, hfd hfdVar, final int i) {
        int i2;
        final ahzr ahzrVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-915801987);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(ahzrVar) : b.F(ahzrVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            ahzrVar2 = ahzrVar;
        } else {
            ffhd ffhdVar = ((axni) b.e(axoy.a)).a;
            ahzrVar2 = ahzrVar;
            a(ahzrVar2, (aibo) hkf.a(ahzrVar.a, b).a(), olz.a(ahzrVar.b, ffhdVar, b, 0), (aibt) hkf.a(ahzrVar.c, b).a(), b, (i2 & 14) | 520);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ahzu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aiao.b(ahzr.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
