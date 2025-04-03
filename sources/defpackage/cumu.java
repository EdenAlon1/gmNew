package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cumu {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/fuzzymatching/TachyonTemplateFetcher");
    public final ffbr b;
    public final ffsk c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public cumu(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.b = ffbrVar4;
        this.c = ffskVar;
    }

    private final void b(HashMap hashMap, String str, fbrr fbrrVar) {
        fbrr fbrrVar2;
        fbrr fbrrVar3 = (fbrr) hashMap.get(str);
        if (fbrrVar3 == null) {
            hashMap.put(str, fbrrVar);
            return;
        }
        fbrr fbrrVar4 = fbrr.RCS;
        if ((fbrrVar3 == fbrrVar4 && fbrrVar == fbrr.XMS) || ((fbrrVar3 == fbrr.XMS && fbrrVar == fbrrVar4) || fbrrVar3 == (fbrrVar2 = fbrr.PROTOCOL_UNSPECIFIED) || fbrrVar == fbrrVar2)) {
            hashMap.put(str, fbrr.PROTOCOL_UNSPECIFIED);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00af A[Catch: all -> 0x0076, TryCatch #3 {all -> 0x0076, blocks: (B:29:0x015b, B:32:0x0161, B:35:0x0180, B:41:0x01a2, B:42:0x01bd, B:44:0x01c5, B:47:0x01ea, B:55:0x0201, B:59:0x0208, B:60:0x0222, B:62:0x025f, B:63:0x0266, B:67:0x0264, B:70:0x0297, B:71:0x029e, B:129:0x03e4, B:139:0x043b, B:140:0x043e, B:141:0x029c, B:143:0x0441, B:149:0x01ba, B:156:0x0446, B:157:0x0449, B:168:0x0072, B:169:0x00a5, B:171:0x00af, B:172:0x0130, B:174:0x0138, B:177:0x013f, B:180:0x00ce, B:182:0x00df, B:183:0x00ff, B:185:0x0110, B:186:0x0117, B:190:0x008e, B:37:0x0199, B:39:0x019c, B:147:0x01a6, B:153:0x0444, B:73:0x02d5, B:74:0x02e3, B:76:0x02e9, B:78:0x02f8, B:79:0x0301, B:81:0x0307, B:83:0x0316, B:84:0x031a, B:86:0x0320, B:88:0x0333, B:90:0x0335, B:93:0x033c, B:94:0x0340, B:96:0x0346, B:98:0x0359, B:99:0x035b, B:101:0x0366, B:110:0x0383, B:106:0x0387, B:112:0x036d, B:118:0x0378, B:119:0x037b, B:122:0x038b, B:123:0x039c, B:125:0x03a2, B:127:0x03df, B:136:0x0439), top: B:7:0x0030, inners: #0, #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0138 A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #3 {all -> 0x0076, blocks: (B:29:0x015b, B:32:0x0161, B:35:0x0180, B:41:0x01a2, B:42:0x01bd, B:44:0x01c5, B:47:0x01ea, B:55:0x0201, B:59:0x0208, B:60:0x0222, B:62:0x025f, B:63:0x0266, B:67:0x0264, B:70:0x0297, B:71:0x029e, B:129:0x03e4, B:139:0x043b, B:140:0x043e, B:141:0x029c, B:143:0x0441, B:149:0x01ba, B:156:0x0446, B:157:0x0449, B:168:0x0072, B:169:0x00a5, B:171:0x00af, B:172:0x0130, B:174:0x0138, B:177:0x013f, B:180:0x00ce, B:182:0x00df, B:183:0x00ff, B:185:0x0110, B:186:0x0117, B:190:0x008e, B:37:0x0199, B:39:0x019c, B:147:0x01a6, B:153:0x0444, B:73:0x02d5, B:74:0x02e3, B:76:0x02e9, B:78:0x02f8, B:79:0x0301, B:81:0x0307, B:83:0x0316, B:84:0x031a, B:86:0x0320, B:88:0x0333, B:90:0x0335, B:93:0x033c, B:94:0x0340, B:96:0x0346, B:98:0x0359, B:99:0x035b, B:101:0x0366, B:110:0x0383, B:106:0x0387, B:112:0x036d, B:118:0x0378, B:119:0x037b, B:122:0x038b, B:123:0x039c, B:125:0x03a2, B:127:0x03df, B:136:0x0439), top: B:7:0x0030, inners: #0, #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x013f A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #3 {all -> 0x0076, blocks: (B:29:0x015b, B:32:0x0161, B:35:0x0180, B:41:0x01a2, B:42:0x01bd, B:44:0x01c5, B:47:0x01ea, B:55:0x0201, B:59:0x0208, B:60:0x0222, B:62:0x025f, B:63:0x0266, B:67:0x0264, B:70:0x0297, B:71:0x029e, B:129:0x03e4, B:139:0x043b, B:140:0x043e, B:141:0x029c, B:143:0x0441, B:149:0x01ba, B:156:0x0446, B:157:0x0449, B:168:0x0072, B:169:0x00a5, B:171:0x00af, B:172:0x0130, B:174:0x0138, B:177:0x013f, B:180:0x00ce, B:182:0x00df, B:183:0x00ff, B:185:0x0110, B:186:0x0117, B:190:0x008e, B:37:0x0199, B:39:0x019c, B:147:0x01a6, B:153:0x0444, B:73:0x02d5, B:74:0x02e3, B:76:0x02e9, B:78:0x02f8, B:79:0x0301, B:81:0x0307, B:83:0x0316, B:84:0x031a, B:86:0x0320, B:88:0x0333, B:90:0x0335, B:93:0x033c, B:94:0x0340, B:96:0x0346, B:98:0x0359, B:99:0x035b, B:101:0x0366, B:110:0x0383, B:106:0x0387, B:112:0x036d, B:118:0x0378, B:119:0x037b, B:122:0x038b, B:123:0x039c, B:125:0x03a2, B:127:0x03df, B:136:0x0439), top: B:7:0x0030, inners: #0, #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00ce A[Catch: all -> 0x0076, TryCatch #3 {all -> 0x0076, blocks: (B:29:0x015b, B:32:0x0161, B:35:0x0180, B:41:0x01a2, B:42:0x01bd, B:44:0x01c5, B:47:0x01ea, B:55:0x0201, B:59:0x0208, B:60:0x0222, B:62:0x025f, B:63:0x0266, B:67:0x0264, B:70:0x0297, B:71:0x029e, B:129:0x03e4, B:139:0x043b, B:140:0x043e, B:141:0x029c, B:143:0x0441, B:149:0x01ba, B:156:0x0446, B:157:0x0449, B:168:0x0072, B:169:0x00a5, B:171:0x00af, B:172:0x0130, B:174:0x0138, B:177:0x013f, B:180:0x00ce, B:182:0x00df, B:183:0x00ff, B:185:0x0110, B:186:0x0117, B:190:0x008e, B:37:0x0199, B:39:0x019c, B:147:0x01a6, B:153:0x0444, B:73:0x02d5, B:74:0x02e3, B:76:0x02e9, B:78:0x02f8, B:79:0x0301, B:81:0x0307, B:83:0x0316, B:84:0x031a, B:86:0x0320, B:88:0x0333, B:90:0x0335, B:93:0x033c, B:94:0x0340, B:96:0x0346, B:98:0x0359, B:99:0x035b, B:101:0x0366, B:110:0x0383, B:106:0x0387, B:112:0x036d, B:118:0x0378, B:119:0x037b, B:122:0x038b, B:123:0x039c, B:125:0x03a2, B:127:0x03df, B:136:0x0439), top: B:7:0x0030, inners: #0, #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0161 A[Catch: all -> 0x0076, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0076, blocks: (B:29:0x015b, B:32:0x0161, B:35:0x0180, B:41:0x01a2, B:42:0x01bd, B:44:0x01c5, B:47:0x01ea, B:55:0x0201, B:59:0x0208, B:60:0x0222, B:62:0x025f, B:63:0x0266, B:67:0x0264, B:70:0x0297, B:71:0x029e, B:129:0x03e4, B:139:0x043b, B:140:0x043e, B:141:0x029c, B:143:0x0441, B:149:0x01ba, B:156:0x0446, B:157:0x0449, B:168:0x0072, B:169:0x00a5, B:171:0x00af, B:172:0x0130, B:174:0x0138, B:177:0x013f, B:180:0x00ce, B:182:0x00df, B:183:0x00ff, B:185:0x0110, B:186:0x0117, B:190:0x008e, B:37:0x0199, B:39:0x019c, B:147:0x01a6, B:153:0x0444, B:73:0x02d5, B:74:0x02e3, B:76:0x02e9, B:78:0x02f8, B:79:0x0301, B:81:0x0307, B:83:0x0316, B:84:0x031a, B:86:0x0320, B:88:0x0333, B:90:0x0335, B:93:0x033c, B:94:0x0340, B:96:0x0346, B:98:0x0359, B:99:0x035b, B:101:0x0366, B:110:0x0383, B:106:0x0387, B:112:0x036d, B:118:0x0378, B:119:0x037b, B:122:0x038b, B:123:0x039c, B:125:0x03a2, B:127:0x03df, B:136:0x0439), top: B:7:0x0030, inners: #0, #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0180 A[Catch: all -> 0x0076, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0076, blocks: (B:29:0x015b, B:32:0x0161, B:35:0x0180, B:41:0x01a2, B:42:0x01bd, B:44:0x01c5, B:47:0x01ea, B:55:0x0201, B:59:0x0208, B:60:0x0222, B:62:0x025f, B:63:0x0266, B:67:0x0264, B:70:0x0297, B:71:0x029e, B:129:0x03e4, B:139:0x043b, B:140:0x043e, B:141:0x029c, B:143:0x0441, B:149:0x01ba, B:156:0x0446, B:157:0x0449, B:168:0x0072, B:169:0x00a5, B:171:0x00af, B:172:0x0130, B:174:0x0138, B:177:0x013f, B:180:0x00ce, B:182:0x00df, B:183:0x00ff, B:185:0x0110, B:186:0x0117, B:190:0x008e, B:37:0x0199, B:39:0x019c, B:147:0x01a6, B:153:0x0444, B:73:0x02d5, B:74:0x02e3, B:76:0x02e9, B:78:0x02f8, B:79:0x0301, B:81:0x0307, B:83:0x0316, B:84:0x031a, B:86:0x0320, B:88:0x0333, B:90:0x0335, B:93:0x033c, B:94:0x0340, B:96:0x0346, B:98:0x0359, B:99:0x035b, B:101:0x0366, B:110:0x0383, B:106:0x0387, B:112:0x036d, B:118:0x0378, B:119:0x037b, B:122:0x038b, B:123:0x039c, B:125:0x03a2, B:127:0x03df, B:136:0x0439), top: B:7:0x0030, inners: #0, #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ekzz, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cumu.a(ffgu):java.lang.Object");
    }
}
