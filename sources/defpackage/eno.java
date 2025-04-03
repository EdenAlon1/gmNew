package defpackage;

import com.android.vcard.VCardConfig;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eno {
    public static final boolean a(eot eotVar, ffsk ffskVar) {
        if (!eotVar.g()) {
            return false;
        }
        ffqy.d(ffskVar, null, null, new enm(eotVar, null), 3);
        return true;
    }

    public static final boolean b(eot eotVar, ffsk ffskVar) {
        if (!eotVar.h()) {
            return false;
        }
        ffqy.d(ffskVar, null, null, new enn(eotVar, null), 3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.eot r30, defpackage.hvi r31, defpackage.ebe r32, defpackage.emx r33, int r34, float r35, defpackage.hus r36, defpackage.dtt r37, boolean r38, defpackage.ijf r39, defpackage.dvz r40, defpackage.dik r41, defpackage.ffjo r42, defpackage.hfd r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eno.c(eot, hvi, ebe, emx, int, float, hus, dtt, boolean, ijf, dvz, dik, ffjo, hfd, int, int, int):void");
    }

    @ffbs
    public static final /* synthetic */ void d(eot eotVar, hvi hviVar, ebe ebeVar, emx emxVar, hus husVar, dtt dttVar, boolean z, ijf ijfVar, dvz dvzVar, ffjo ffjoVar, hfd hfdVar, int i, int i2) {
        int i3;
        hvi hviVar2;
        ebe ebeVar2;
        emx emxVar2;
        hus husVar2;
        boolean z2;
        ijf ijfVar2;
        hus husVar3;
        ijf b;
        int i4;
        boolean z3;
        hfd b2 = hfdVar.b(1870896258);
        if ((i & 6) == 0) {
            i3 = (true != b2.D(eotVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            hviVar2 = hviVar;
            i3 |= true != b2.D(hviVar2) ? 16 : 32;
        } else {
            hviVar2 = hviVar;
        }
        if ((i & 384) == 0) {
            ebeVar2 = ebeVar;
            i3 |= true != b2.D(ebeVar2) ? 128 : 256;
        } else {
            ebeVar2 = ebeVar;
        }
        if ((i & 3072) == 0) {
            emxVar2 = emxVar;
            i3 |= true != b2.D(emxVar2) ? 1024 : 2048;
        } else {
            emxVar2 = emxVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b2.B(2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b2.A(8.0f) ? 65536 : 131072;
        }
        int i5 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            i5 |= true != b2.D(dttVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i6 = i2 | 6;
        if ((i2 & 48) == 0) {
            i6 = i2 | 22;
        }
        if ((i2 & 384) == 0) {
            i6 |= true != b2.D(dvzVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i6 |= true == b2.F(ffjoVar) ? 2048 : 1024;
        }
        int i7 = i5 | 905969664;
        if (b2.J(((306783379 & i7) == 306783378 && (i6 & 1171) == 1170) ? false : true, i7 & 1)) {
            int i8 = i6 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
            int i9 = i7 & 14;
            b2.t();
            if ((i & 1) == 0 || b2.G()) {
                int i10 = huo.a;
                husVar3 = hum.n;
                b = enb.b(eotVar, dqs.b, b2, i9 | 432);
                i4 = i8;
                z3 = true;
            } else {
                b2.s();
                husVar3 = husVar;
                z3 = z;
                i4 = i8;
                b = ijfVar;
            }
            b2.l();
            hus husVar4 = husVar3;
            c(eotVar, hviVar2, ebeVar2, emxVar2, 2, 8.0f, husVar4, dttVar, z3, b, dvzVar, dim.a(b2), ffjoVar, b2, i7 & 2147483646, ((i4 << 3) & 57344) | (i6 & 910), 0);
            husVar2 = husVar4;
            z2 = z3;
            ijfVar2 = b;
        } else {
            b2.s();
            husVar2 = husVar;
            z2 = z;
            ijfVar2 = ijfVar;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ene(eotVar, hviVar, ebeVar, emxVar, husVar2, dttVar, z2, ijfVar2, dvzVar, ffjoVar, i, i2);
        }
    }

    public static final void e(eot eotVar, hvi hviVar, ebe ebeVar, emx emxVar, hun hunVar, dtt dttVar, boolean z, ijf ijfVar, dvz dvzVar, dik dikVar, ffjo ffjoVar, hfd hfdVar, int i, int i2) {
        eot eotVar2;
        int i3;
        ebe ebeVar2;
        emx emxVar2;
        boolean z2;
        int i4;
        dvz dvzVar2;
        dik dikVar2;
        hfd hfdVar2;
        hfd b = hfdVar.b(632853564);
        if ((i & 6) == 0) {
            eotVar2 = eotVar;
            i3 = (true != b.D(eotVar2) ? 2 : 4) | i;
        } else {
            eotVar2 = eotVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            ebeVar2 = ebeVar;
            i3 |= true != b.D(ebeVar2) ? 128 : 256;
        } else {
            ebeVar2 = ebeVar;
        }
        if ((i & 3072) == 0) {
            emxVar2 = emxVar;
            i3 |= true != b.D(emxVar2) ? 1024 : 2048;
        } else {
            emxVar2 = emxVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b.B(2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b.A(8.0f) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b.D(hunVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != b.D(dttVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            z2 = z;
            i3 |= true != b.E(z2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            z2 = z;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b.E(false) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != b.F(null) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b.F(ijfVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            dvzVar2 = dvzVar;
            i4 |= true != b.D(dvzVar2) ? 128 : 256;
        } else {
            dvzVar2 = dvzVar;
        }
        if ((i2 & 3072) == 0) {
            dikVar2 = dikVar;
            i4 |= true != b.D(dikVar2) ? 1024 : 2048;
        } else {
            dikVar2 = dikVar;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true == b.F(ffjoVar) ? 16384 : 8192;
        }
        if (b.J(((306783379 & i3) == 306783378 && (i4 & 9363) == 9362) ? false : true, i3 & 1)) {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            dqs dqsVar = dqs.a;
            int i5 = huo.a;
            int i6 = ((i3 >> 3) & 14) | 24576;
            int i7 = i3 << 3;
            hfdVar2 = b;
            int i8 = i3 & 896;
            int i9 = i3 >> 18;
            int i10 = i3 >> 6;
            int i11 = i3 << 12;
            int i12 = i3 >> 9;
            int i13 = i4 << 6;
            ebe ebeVar3 = ebeVar2;
            boolean z3 = z2;
            emx emxVar3 = emxVar2;
            dik dikVar3 = dikVar2;
            ems.a(hviVar, eotVar2, ebeVar3, dqsVar, dttVar, z3, dikVar3, 2, 8.0f, emxVar3, ijfVar, hunVar, hum.n, dvzVar2, ffjoVar, hfdVar2, (i9 & 7168) | i6 | (i7 & 112) | i8 | (i10 & 458752) | (i10 & 3670016) | ((i4 << 12) & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i12 & 7168) | (i12 & 14) | 24576 | (i4 & 112) | (i13 & 896) | (458752 & (i4 << 9)) | (3670016 & i13));
        } else {
            hfdVar2 = b;
            hfdVar2.s();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new enf(eotVar, hviVar, ebeVar, emxVar, hunVar, dttVar, z, ijfVar, dvzVar, dikVar, ffjoVar, i, i2);
        }
    }

    @ffbs
    public static final /* synthetic */ void f(eot eotVar, hvi hviVar, ebe ebeVar, emx emxVar, hun hunVar, dtt dttVar, boolean z, ijf ijfVar, dvz dvzVar, ffjo ffjoVar, hfd hfdVar, int i, int i2) {
        int i3;
        hvi hviVar2;
        ebe ebeVar2;
        emx emxVar2;
        dtt dttVar2;
        dvz dvzVar2;
        hun hunVar2;
        boolean z2;
        ijf ijfVar2;
        hun hunVar3;
        ijf b;
        int i4;
        boolean z3;
        hfd b2 = hfdVar.b(909160706);
        if ((i & 6) == 0) {
            i3 = (true != b2.D(eotVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            hviVar2 = hviVar;
            i3 |= true != b2.D(hviVar2) ? 16 : 32;
        } else {
            hviVar2 = hviVar;
        }
        if ((i & 384) == 0) {
            ebeVar2 = ebeVar;
            i3 |= true != b2.D(ebeVar2) ? 128 : 256;
        } else {
            ebeVar2 = ebeVar;
        }
        if ((i & 3072) == 0) {
            emxVar2 = emxVar;
            i3 |= true != b2.D(emxVar2) ? 1024 : 2048;
        } else {
            emxVar2 = emxVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b2.B(2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b2.A(8.0f) ? 65536 : 131072;
        }
        int i5 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            dttVar2 = dttVar;
            i5 |= true != b2.D(dttVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            dttVar2 = dttVar;
        }
        int i6 = i2 | 6;
        if ((i2 & 48) == 0) {
            i6 = i2 | 22;
        }
        if ((i2 & 384) == 0) {
            dvzVar2 = dvzVar;
            i6 |= true != b2.D(dvzVar2) ? 128 : 256;
        } else {
            dvzVar2 = dvzVar;
        }
        if ((i2 & 3072) == 0) {
            i6 |= true == b2.F(ffjoVar) ? 2048 : 1024;
        }
        int i7 = i5 | 905969664;
        if (b2.J(((306783379 & i7) == 306783378 && (i6 & 1171) == 1170) ? false : true, i7 & 1)) {
            int i8 = i6 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
            int i9 = i7 & 14;
            b2.t();
            if ((i & 1) == 0 || b2.G()) {
                int i10 = huo.a;
                hunVar3 = hum.k;
                b = enb.b(eotVar, dqs.a, b2, i9 | 432);
                i4 = i8;
                z3 = true;
            } else {
                b2.s();
                hunVar3 = hunVar;
                z3 = z;
                i4 = i8;
                b = ijfVar;
            }
            b2.l();
            hvi hviVar3 = hviVar2;
            hun hunVar4 = hunVar3;
            e(eotVar, hviVar3, ebeVar2, emxVar2, hunVar4, dttVar2, z3, b, dvzVar2, dim.a(b2), ffjoVar, b2, i7 & 2147483646, ((i4 << 3) & 57344) | (i6 & 910));
            hunVar2 = hunVar4;
            ijfVar2 = b;
            z2 = z3;
        } else {
            b2.s();
            hunVar2 = hunVar;
            z2 = z;
            ijfVar2 = ijfVar;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new eng(eotVar, hviVar, ebeVar, emxVar, hunVar2, dttVar, z2, ijfVar2, dvzVar, ffjoVar, i, i2);
        }
    }
}
