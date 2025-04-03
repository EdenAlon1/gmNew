package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* renamed from: for, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001for {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hvi r24, defpackage.idh r25, long r26, long r28, float r30, defpackage.ffjm r31, defpackage.hfd r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0001for.a(hvi, idh, long, long, float, ffjm, hfd, int, int):void");
    }

    public static final /* synthetic */ long c(long j, fjc fjcVar, float f, hfd hfdVar) {
        long f2;
        long l = fla.a(hfdVar).l();
        long j2 = ibw.a;
        if (!ffcp.a(j, l) || fjcVar == null) {
            hfdVar.v(1082990783);
            hfdVar.o();
            return j;
        }
        hfdVar.v(1082922676);
        hfdVar.v(-1687113661);
        fin a = fla.a(hfdVar);
        if (Float.compare(f, 0.0f) <= 0 || a.m()) {
            hfdVar.v(1169156439);
            hfdVar.o();
        } else {
            hfdVar.v(1169017931);
            hik hikVar = fkd.a;
            f2 = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, ibw.f(fip.a(j, hfdVar)));
            j = iby.h(f2, j);
            hfdVar.o();
        }
        hfdVar.o();
        hfdVar.o();
        return j;
    }

    public static final void d(ffix ffixVar, hvi hviVar, boolean z, idh idhVar, long j, long j2, float f, dwn dwnVar, ffjm ffjmVar, hfd hfdVar, int i) {
        ffix ffixVar2;
        int i2;
        idh idhVar2;
        dwn dwnVar2;
        ffjm ffjmVar2;
        boolean z2;
        boolean z3;
        int i3 = i & 6;
        hfd b = hfdVar.b(1560876237);
        if (i3 == 0) {
            ffixVar2 = ffixVar;
            i2 = (true != b.F(ffixVar2) ? 2 : 4) | i;
        } else {
            ffixVar2 = ffixVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            idhVar2 = idhVar;
            i4 |= true != b.D(idhVar2) ? 1024 : 2048;
        } else {
            idhVar2 = idhVar;
        }
        if ((i & 24576) == 0) {
            i4 |= true != b.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i4 |= true != b.C(j2) ? 65536 : 131072;
        }
        int i5 = i4 | 1572864;
        if ((12582912 & i) == 0) {
            i5 |= true != b.A(f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            dwnVar2 = dwnVar;
            i5 |= true != b.D(dwnVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            dwnVar2 = dwnVar;
        }
        if ((805306368 & i) == 0) {
            ffjmVar2 = ffjmVar;
            i5 |= true != b.F(ffjmVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            ffjmVar2 = ffjmVar;
        }
        if (b.J((306783379 & i5) != 306783378, i5 & 1)) {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                z3 = true;
            } else {
                b.s();
                z3 = z;
            }
            b.l();
            float f2 = ((jzq) b.e(fkd.b)).a + f;
            hfz.b(new hil[]{fjb.a.c(new ibw(j2)), fkd.b.c(new jzq(f2))}, hpx.d(2031491085, new fop(hviVar, idhVar2, j, f2, f, dwnVar2, z3, ffixVar2, ffjmVar2), b), b, 56);
            z2 = z3;
        } else {
            b.s();
            z2 = z;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new foq(ffixVar, hviVar, z2, idhVar, j, j2, f, dwnVar, ffjmVar, i);
        }
    }
}
