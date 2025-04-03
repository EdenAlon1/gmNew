package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConfig;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbb {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final android.net.Uri r29, final java.lang.String r30, final defpackage.hvi r31, final android.net.Uri r32, android.net.Uri r33, final defpackage.huo r34, final defpackage.inp r35, final float r36, final java.lang.Integer r37, final java.lang.Integer r38, final j$.time.Duration r39, final java.lang.String r40, final java.lang.String r41, final defpackage.dnal r42, final defpackage.rdi r43, defpackage.hfd r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnbb.a(android.net.Uri, java.lang.String, hvi, android.net.Uri, android.net.Uri, huo, inp, float, java.lang.Integer, java.lang.Integer, j$.time.Duration, java.lang.String, java.lang.String, dnal, rdi, hfd, int, int, int):void");
    }

    public static final void b(final Uri uri, final String str, final hvi hviVar, final Uri uri2, final Uri uri3, final huo huoVar, final inp inpVar, final float f, final Integer num, final Integer num2, final Duration duration, final String str2, final String str3, final dnal dnalVar, final rdi rdiVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        int i4;
        boolean z;
        String str4;
        boolean z2;
        hfd hfdVar2;
        hfm hfmVar;
        hfd hfdVar3;
        int i5 = i & 6;
        hfd b = hfdVar.b(1543883858);
        if (i5 == 0) {
            i3 = (true != b.F(uri) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.F(uri2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b.F(uri3) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != b.E(false) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != b.D(huoVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != b.D(inpVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i & 100663296) == 0) {
            i3 |= true != b.A(f) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i & 805306368) == 0) {
            i3 |= true != b.D(null) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = (true != b.D(num) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i4;
        if ((i2 & 48) == 0) {
            i4 = i7 | (true == b.D(num2) ? 32 : 16);
        }
        if ((i2 & 384) == 0) {
            z = true;
            i4 |= true == b.F(duration) ? 256 : 128;
        } else {
            z = true;
        }
        int i8 = i4;
        if ((i2 & 3072) == 0) {
            i4 = i8 | (z == b.E(false) ? 2048 : 1024);
        }
        if ((i2 & 24576) == 0) {
            i4 |= z == b.D(str2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            str4 = str3;
            i4 |= z != b.D(str4) ? 65536 : 131072;
        } else {
            str4 = str3;
        }
        if ((i2 & 1572864) == 0) {
            z2 = true;
            i4 |= true != ((i2 & 2097152) == 0 ? b.D(dnalVar) : b.F(dnalVar)) ? 524288 : 1048576;
        } else {
            z2 = true;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= z2 != b.F(rdiVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i6 & 306783379) == 306783378 && (4793491 & i4) == 4793490 && b.I()) {
            b.s();
            hfdVar3 = b;
        } else {
            final cteg ctegVar = (cteg) b.e(dnae.a);
            hvi a = str2 != null ? hviVar.a(jfw.a(hvi.e, str2)) : hviVar;
            b.v(-950339281);
            boolean F = ((3670016 & i4) == 1048576 || ((2097152 & i4) != 0 && b.F(dnalVar))) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | b.F(uri) | b.F(duration) | ((i4 & 458752) == 131072) | b.F(ctegVar) | b.F(uri3) | ((i6 & 458752) == 131072) | ((i4 & 7168) == 2048) | b.F(uri2) | b.F(rdiVar);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (F || R == hfc.a) {
                hfdVar2 = b;
                final String str5 = str4;
                hfmVar = hfmVar2;
                ffji ffjiVar = new ffji() { // from class: dnax
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Integer num3;
                        qqo qqoVar = (qqo) obj;
                        qqoVar.getClass();
                        dnal dnalVar2 = dnalVar;
                        Uri uri4 = uri;
                        Integer num4 = num;
                        if (num4 != null && (num3 = num2) != null) {
                            if (uri4 != null && dnalVar2 != null) {
                                dnalVar2.a(uri4, num4.intValue(), num3.intValue());
                            }
                            rhx Q = qqoVar.Q(num4.intValue(), num3.intValue());
                            Q.getClass();
                            qqoVar = (qqo) Q;
                        }
                        Duration duration2 = duration;
                        if (duration2 != null) {
                            rhx K = qqoVar.K(duration2.toNanos() / 1000);
                            K.getClass();
                            qqoVar = (qqo) K;
                        }
                        String str6 = str5;
                        if (str6 != null) {
                            rhx W = qqoVar.W(new rjn(str6));
                            W.getClass();
                            qqoVar = (qqo) W;
                        }
                        Uri uri5 = uri3;
                        if (uri5 != null) {
                            cteg ctegVar2 = ctegVar;
                            ((enrr) cteg.a.e().h("com/google/android/apps/messaging/shared/util/media/image/TikTokGlideImageManager", "applyThumbnail", 45, "TikTokGlideImageManager.kt")).t("Applying thumbnail with uri: %s", uri5);
                            qqo e = ctegVar2.b.e(uri5);
                            e.getClass();
                            rhx af = e.af();
                            af.getClass();
                            qqo qqoVar2 = (qqo) ((qqo) af).Q(Integer.MIN_VALUE, Integer.MIN_VALUE);
                            qqoVar2.getClass();
                            qqoVar = qqoVar.o(qqoVar2.a(null));
                            qqoVar.getClass();
                        }
                        Uri uri6 = uri2;
                        if (uri6 != null) {
                            qqoVar = qqoVar.e(uri6);
                            qqoVar.getClass();
                        }
                        if (dnalVar2 != null) {
                            dnalVar2.c(uri4);
                            qqoVar = qqoVar.a(new dnba(dnalVar2));
                            qqoVar.getClass();
                        }
                        rdi rdiVar2 = rdiVar;
                        if (rdiVar2 == null) {
                            return qqoVar;
                        }
                        rhx F2 = qqoVar.F(rdiVar2);
                        F2.getClass();
                        return (qqo) F2;
                    }
                };
                hfmVar.ad(ffjiVar);
                R = ffjiVar;
            } else {
                hfmVar = hfmVar2;
                hfdVar2 = b;
            }
            hfmVar.Z();
            int i9 = i6 >> 9;
            hfdVar3 = hfdVar2;
            qrv.a(uri, str, a, huoVar, inpVar, f, null, null, (ffji) R, hfdVar3, (i9 & 57344) | (i9 & 7168) | (i6 & 126) | (i9 & 458752) | (3670016 & i9), 384);
        }
        hio L = hfdVar3.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnay
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Uri uri4 = uri;
                    String str6 = str;
                    hvi hviVar2 = hviVar;
                    Uri uri5 = uri2;
                    Uri uri6 = uri3;
                    huo huoVar2 = huoVar;
                    inp inpVar2 = inpVar;
                    float f2 = f;
                    Integer num3 = num;
                    Integer num4 = num2;
                    Duration duration2 = duration;
                    String str7 = str2;
                    String str8 = str3;
                    dnal dnalVar2 = dnalVar;
                    int i10 = i;
                    dnbb.b(uri4, str6, hviVar2, uri5, uri6, huoVar2, inpVar2, f2, num3, num4, duration2, str7, str8, dnalVar2, rdiVar, (hfd) obj, hip.a(i10 | 1), hip.a(i2));
                    return ffcu.a;
                }
            };
        }
    }
}
