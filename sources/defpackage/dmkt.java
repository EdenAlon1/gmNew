package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmkt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.dmmq r21, defpackage.dmpg r22, final float r23, boolean r24, final defpackage.ffjm r25, defpackage.hfd r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmkt.a(dmmq, dmpg, float, boolean, ffjm, hfd, int, int):void");
    }

    public static final void b(final dmpj dmpjVar, final hvi hviVar, final hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        hziVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1231696797);
        if (i3 == 0) {
            i2 = (true != b.D(dmpjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hziVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            dmnh dmnhVar = dmpjVar.c;
            if (dmnhVar != null) {
                b.v(1208546926);
                int i4 = i2;
                dmms dmmsVar = dmpjVar.a;
                dmov dmovVar = dmpjVar.b;
                dmpg dmpgVar = dmpjVar.d;
                float f = dmpjVar.e;
                dmpi dmpiVar = dmpjVar.g;
                dmqo.a(dmmsVar, dmovVar, dmnhVar, dmpgVar, f, dmpiVar.b, dmpjVar.f, hviVar, hziVar, dmpiVar, b, (i4 << 18) & 264241152);
                ((hfm) b).Z();
            } else {
                b.v(1208976121);
                dmrh.b(dmpjVar.a, dmpjVar.b, dmpjVar.d, dmpjVar.e, hviVar, hziVar, dmpjVar.g, b, (i2 << 9) & 516096);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmks
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmpj dmpjVar2 = dmpj.this;
                    hvi hviVar2 = hviVar;
                    int i5 = i;
                    dmkt.b(dmpjVar2, hviVar2, hziVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
