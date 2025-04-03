package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nts implements ntn, lsj {
    public final boolean a = true;
    final /* synthetic */ ntt b;
    private final ntn c;
    private final lts d;

    public nts(ntt nttVar, Context context, ntm ntmVar, lpo lpoVar, lts ltsVar, lpr lprVar, lse lseVar, List list) {
        this.b = nttVar;
        this.d = ltsVar;
        this.c = ntmVar.a(context, lpoVar, lprVar, this, erpp.a, lseVar, list);
    }

    @Override // defpackage.lsj
    public final void a(long j) {
        this.b.f = j;
        try {
            ntr ntrVar = this.b.e;
            if (ntrVar.i != null) {
                npo npoVar = ntrVar.i;
                if (!((npw) npoVar).f.get()) {
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                int i = lyt.a;
                try {
                    ((npw) npoVar).b.signalEndOfInputStream();
                } catch (RuntimeException e) {
                    luj.h(e);
                    throw ((npw) npoVar).k(e);
                }
            }
        } catch (nrd e2) {
            this.d.a(e2);
        }
    }

    @Override // defpackage.lsj
    public final void b(lsf lsfVar) {
        this.d.a(new nrd("Video frame processing error", lsfVar, 5001));
    }

    @Override // defpackage.ntn
    public final nrl c(int i) {
        return this.c.c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x039d, code lost:
    
        if (r4.equals("T603") != false) goto L164;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0447 A[Catch: nrd -> 0x0454, TryCatch #0 {nrd -> 0x0454, blocks: (B:3:0x0004, B:10:0x000e, B:15:0x001b, B:16:0x0025, B:18:0x0031, B:19:0x0037, B:21:0x0058, B:23:0x005c, B:24:0x0075, B:27:0x00b6, B:28:0x00c4, B:30:0x00c9, B:33:0x00d1, B:36:0x00db, B:39:0x00e5, B:42:0x010a, B:46:0x01f7, B:49:0x022e, B:51:0x0232, B:52:0x0260, B:54:0x0266, B:57:0x0274, B:59:0x0280, B:60:0x028b, B:62:0x0292, B:64:0x029b, B:65:0x02ee, B:68:0x02f6, B:70:0x02fe, B:72:0x0319, B:73:0x032a, B:77:0x0341, B:78:0x03ab, B:80:0x03b1, B:81:0x03bd, B:83:0x03f9, B:84:0x03fb, B:86:0x0405, B:88:0x040c, B:90:0x0412, B:91:0x041d, B:93:0x043f, B:94:0x0444, B:95:0x0415, B:97:0x041b, B:101:0x034b, B:103:0x0357, B:105:0x0363, B:107:0x036f, B:109:0x037b, B:111:0x0387, B:113:0x0393, B:115:0x039f, B:116:0x03a5, B:117:0x031d, B:118:0x0323, B:119:0x0324, B:122:0x02a3, B:124:0x02ad, B:126:0x02b7, B:129:0x02c2, B:131:0x02ce, B:133:0x02d2, B:135:0x02d9, B:137:0x02e2, B:138:0x02e5, B:140:0x023f, B:142:0x0249, B:143:0x0447, B:144:0x044d, B:145:0x0113, B:147:0x011b, B:150:0x0122, B:151:0x0130, B:154:0x0137, B:157:0x014b, B:160:0x017c, B:163:0x018c, B:166:0x019f, B:168:0x01d9, B:170:0x01dd, B:173:0x01e7, B:174:0x01e4, B:175:0x0161, B:177:0x0165, B:178:0x012c, B:182:0x044e, B:183:0x0453, B:184:0x00a7, B:186:0x00ab, B:189:0x005f, B:191:0x006b, B:192:0x006e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0137 A[Catch: nrd -> 0x0454, TryCatch #0 {nrd -> 0x0454, blocks: (B:3:0x0004, B:10:0x000e, B:15:0x001b, B:16:0x0025, B:18:0x0031, B:19:0x0037, B:21:0x0058, B:23:0x005c, B:24:0x0075, B:27:0x00b6, B:28:0x00c4, B:30:0x00c9, B:33:0x00d1, B:36:0x00db, B:39:0x00e5, B:42:0x010a, B:46:0x01f7, B:49:0x022e, B:51:0x0232, B:52:0x0260, B:54:0x0266, B:57:0x0274, B:59:0x0280, B:60:0x028b, B:62:0x0292, B:64:0x029b, B:65:0x02ee, B:68:0x02f6, B:70:0x02fe, B:72:0x0319, B:73:0x032a, B:77:0x0341, B:78:0x03ab, B:80:0x03b1, B:81:0x03bd, B:83:0x03f9, B:84:0x03fb, B:86:0x0405, B:88:0x040c, B:90:0x0412, B:91:0x041d, B:93:0x043f, B:94:0x0444, B:95:0x0415, B:97:0x041b, B:101:0x034b, B:103:0x0357, B:105:0x0363, B:107:0x036f, B:109:0x037b, B:111:0x0387, B:113:0x0393, B:115:0x039f, B:116:0x03a5, B:117:0x031d, B:118:0x0323, B:119:0x0324, B:122:0x02a3, B:124:0x02ad, B:126:0x02b7, B:129:0x02c2, B:131:0x02ce, B:133:0x02d2, B:135:0x02d9, B:137:0x02e2, B:138:0x02e5, B:140:0x023f, B:142:0x0249, B:143:0x0447, B:144:0x044d, B:145:0x0113, B:147:0x011b, B:150:0x0122, B:151:0x0130, B:154:0x0137, B:157:0x014b, B:160:0x017c, B:163:0x018c, B:166:0x019f, B:168:0x01d9, B:170:0x01dd, B:173:0x01e7, B:174:0x01e4, B:175:0x0161, B:177:0x0165, B:178:0x012c, B:182:0x044e, B:183:0x0453, B:184:0x00a7, B:186:0x00ab, B:189:0x005f, B:191:0x006b, B:192:0x006e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x044e A[Catch: nrd -> 0x0454, TryCatch #0 {nrd -> 0x0454, blocks: (B:3:0x0004, B:10:0x000e, B:15:0x001b, B:16:0x0025, B:18:0x0031, B:19:0x0037, B:21:0x0058, B:23:0x005c, B:24:0x0075, B:27:0x00b6, B:28:0x00c4, B:30:0x00c9, B:33:0x00d1, B:36:0x00db, B:39:0x00e5, B:42:0x010a, B:46:0x01f7, B:49:0x022e, B:51:0x0232, B:52:0x0260, B:54:0x0266, B:57:0x0274, B:59:0x0280, B:60:0x028b, B:62:0x0292, B:64:0x029b, B:65:0x02ee, B:68:0x02f6, B:70:0x02fe, B:72:0x0319, B:73:0x032a, B:77:0x0341, B:78:0x03ab, B:80:0x03b1, B:81:0x03bd, B:83:0x03f9, B:84:0x03fb, B:86:0x0405, B:88:0x040c, B:90:0x0412, B:91:0x041d, B:93:0x043f, B:94:0x0444, B:95:0x0415, B:97:0x041b, B:101:0x034b, B:103:0x0357, B:105:0x0363, B:107:0x036f, B:109:0x037b, B:111:0x0387, B:113:0x0393, B:115:0x039f, B:116:0x03a5, B:117:0x031d, B:118:0x0323, B:119:0x0324, B:122:0x02a3, B:124:0x02ad, B:126:0x02b7, B:129:0x02c2, B:131:0x02ce, B:133:0x02d2, B:135:0x02d9, B:137:0x02e2, B:138:0x02e5, B:140:0x023f, B:142:0x0249, B:143:0x0447, B:144:0x044d, B:145:0x0113, B:147:0x011b, B:150:0x0122, B:151:0x0130, B:154:0x0137, B:157:0x014b, B:160:0x017c, B:163:0x018c, B:166:0x019f, B:168:0x01d9, B:170:0x01dd, B:173:0x01e7, B:174:0x01e4, B:175:0x0161, B:177:0x0165, B:178:0x012c, B:182:0x044e, B:183:0x0453, B:184:0x00a7, B:186:0x00ab, B:189:0x005f, B:191:0x006b, B:192:0x006e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9 A[Catch: nrd -> 0x0454, TryCatch #0 {nrd -> 0x0454, blocks: (B:3:0x0004, B:10:0x000e, B:15:0x001b, B:16:0x0025, B:18:0x0031, B:19:0x0037, B:21:0x0058, B:23:0x005c, B:24:0x0075, B:27:0x00b6, B:28:0x00c4, B:30:0x00c9, B:33:0x00d1, B:36:0x00db, B:39:0x00e5, B:42:0x010a, B:46:0x01f7, B:49:0x022e, B:51:0x0232, B:52:0x0260, B:54:0x0266, B:57:0x0274, B:59:0x0280, B:60:0x028b, B:62:0x0292, B:64:0x029b, B:65:0x02ee, B:68:0x02f6, B:70:0x02fe, B:72:0x0319, B:73:0x032a, B:77:0x0341, B:78:0x03ab, B:80:0x03b1, B:81:0x03bd, B:83:0x03f9, B:84:0x03fb, B:86:0x0405, B:88:0x040c, B:90:0x0412, B:91:0x041d, B:93:0x043f, B:94:0x0444, B:95:0x0415, B:97:0x041b, B:101:0x034b, B:103:0x0357, B:105:0x0363, B:107:0x036f, B:109:0x037b, B:111:0x0387, B:113:0x0393, B:115:0x039f, B:116:0x03a5, B:117:0x031d, B:118:0x0323, B:119:0x0324, B:122:0x02a3, B:124:0x02ad, B:126:0x02b7, B:129:0x02c2, B:131:0x02ce, B:133:0x02d2, B:135:0x02d9, B:137:0x02e2, B:138:0x02e5, B:140:0x023f, B:142:0x0249, B:143:0x0447, B:144:0x044d, B:145:0x0113, B:147:0x011b, B:150:0x0122, B:151:0x0130, B:154:0x0137, B:157:0x014b, B:160:0x017c, B:163:0x018c, B:166:0x019f, B:168:0x01d9, B:170:0x01dd, B:173:0x01e7, B:174:0x01e4, B:175:0x0161, B:177:0x0165, B:178:0x012c, B:182:0x044e, B:183:0x0453, B:184:0x00a7, B:186:0x00ab, B:189:0x005f, B:191:0x006b, B:192:0x006e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f7 A[Catch: nrd -> 0x0454, TRY_LEAVE, TryCatch #0 {nrd -> 0x0454, blocks: (B:3:0x0004, B:10:0x000e, B:15:0x001b, B:16:0x0025, B:18:0x0031, B:19:0x0037, B:21:0x0058, B:23:0x005c, B:24:0x0075, B:27:0x00b6, B:28:0x00c4, B:30:0x00c9, B:33:0x00d1, B:36:0x00db, B:39:0x00e5, B:42:0x010a, B:46:0x01f7, B:49:0x022e, B:51:0x0232, B:52:0x0260, B:54:0x0266, B:57:0x0274, B:59:0x0280, B:60:0x028b, B:62:0x0292, B:64:0x029b, B:65:0x02ee, B:68:0x02f6, B:70:0x02fe, B:72:0x0319, B:73:0x032a, B:77:0x0341, B:78:0x03ab, B:80:0x03b1, B:81:0x03bd, B:83:0x03f9, B:84:0x03fb, B:86:0x0405, B:88:0x040c, B:90:0x0412, B:91:0x041d, B:93:0x043f, B:94:0x0444, B:95:0x0415, B:97:0x041b, B:101:0x034b, B:103:0x0357, B:105:0x0363, B:107:0x036f, B:109:0x037b, B:111:0x0387, B:113:0x0393, B:115:0x039f, B:116:0x03a5, B:117:0x031d, B:118:0x0323, B:119:0x0324, B:122:0x02a3, B:124:0x02ad, B:126:0x02b7, B:129:0x02c2, B:131:0x02ce, B:133:0x02d2, B:135:0x02d9, B:137:0x02e2, B:138:0x02e5, B:140:0x023f, B:142:0x0249, B:143:0x0447, B:144:0x044d, B:145:0x0113, B:147:0x011b, B:150:0x0122, B:151:0x0130, B:154:0x0137, B:157:0x014b, B:160:0x017c, B:163:0x018c, B:166:0x019f, B:168:0x01d9, B:170:0x01dd, B:173:0x01e7, B:174:0x01e4, B:175:0x0161, B:177:0x0165, B:178:0x012c, B:182:0x044e, B:183:0x0453, B:184:0x00a7, B:186:0x00ab, B:189:0x005f, B:191:0x006b, B:192:0x006e), top: B:2:0x0004 }] */
    @Override // defpackage.lsj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nts.e(int, int):void");
    }

    @Override // defpackage.lsk
    public final void f() {
        this.c.f();
    }

    @Override // defpackage.lsk
    public final void g() {
        this.c.g();
    }

    @Override // defpackage.lsk
    public final void h(lrq lrqVar) {
        this.c.h(lrqVar);
    }

    @Override // defpackage.lsk
    public final boolean i() {
        return this.c.i();
    }

    @Override // defpackage.lsj
    public final /* synthetic */ void d(float f) {
    }

    @Override // defpackage.lsj
    public final void k(long j) {
    }
}
