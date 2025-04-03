package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nil implements nco, ndn {
    private long A;
    private int B;
    private ngk C;
    private final nkh a;
    private final int b;
    private final luv c;
    private final luv d;
    private final luv e;
    private final luv f;
    private final ArrayDeque g;
    private final niq h;
    private final List i;
    private engw j;
    private int k;
    private int l;
    private long m;
    private int n;
    private luv o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private long v;
    private ncr w;
    private nik[] x;
    private long[][] y;
    private int z;

    @Deprecated
    public nil() {
        this(nkh.a, 16);
    }

    private static int h(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int i(niv nivVar, long j) {
        int a = nivVar.a(j);
        return a == -1 ? nivVar.b(j) : a;
    }

    private static long j(niv nivVar, long j, long j2) {
        int i = i(nivVar, j);
        return i == -1 ? j2 : Math.min(nivVar.c[i], j2);
    }

    private final void k() {
        this.k = 0;
        this.n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fb, code lost:
    
        if (r5 != 1668311404) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fd, code lost:
    
        r5 = defpackage.nih.b(1668311404, "TCMP", r6, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020b, code lost:
    
        if (r5 != 1668249202) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020d, code lost:
    
        r5 = r6.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0218, code lost:
    
        if (r6.e() != 1684108385) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021a, code lost:
    
        r11 = defpackage.nhz.a(r6.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0224, code lost:
    
        if (r11 != 13) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0226, code lost:
    
        r12 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0238, code lost:
    
        if (r12 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x023a, code lost:
    
        defpackage.luj.f("MetadataUtil", "Unrecognized cover art flags: " + r11);
        r22 = r9;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0284, code lost:
    
        r6.K(r10);
        r33 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0253, code lost:
    
        r6.L(4);
        r5 = r5 - 16;
        r11 = new byte[r5];
        r6.F(r11, 0, r5);
        r22 = r9;
        r13 = new defpackage.nfu(r12, null, 3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x022b, code lost:
    
        if (r11 != 14) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022d, code lost:
    
        r12 = "image/png";
        r11 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0237, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0269, code lost:
    
        r22 = r9;
        defpackage.luj.f("MetadataUtil", "Failed to parse cover art attribute");
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0273, code lost:
    
        r22 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0279, code lost:
    
        if (r5 != 1631670868) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x027b, code lost:
    
        r13 = defpackage.nih.d(1631670868, "TPE2", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028e, code lost:
    
        if (r5 != 1936682605) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0290, code lost:
    
        r13 = defpackage.nih.d(1936682605, "TSOT", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x029d, code lost:
    
        if (r5 != 1936679276) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x029f, code lost:
    
        r13 = defpackage.nih.d(1936679276, "TSOA", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ac, code lost:
    
        if (r5 != 1936679282) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ae, code lost:
    
        r13 = defpackage.nih.d(1936679282, "TSOP", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02bb, code lost:
    
        if (r5 != 1936679265) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02bd, code lost:
    
        r13 = defpackage.nih.d(1936679265, "TSO2", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ca, code lost:
    
        if (r5 != 1936679791) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cc, code lost:
    
        r13 = defpackage.nih.d(1936679791, "TSOC", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d9, code lost:
    
        if (r5 != 1920233063) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02db, code lost:
    
        r5 = defpackage.nih.b(1920233063, "ITUNESADVISORY", r6, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e5, code lost:
    
        r6.K(r10);
        r33 = r2;
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f0, code lost:
    
        if (r5 != 1885823344) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f2, code lost:
    
        r5 = defpackage.nih.b(1885823344, "ITUNESGAPLESS", r6, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0301, code lost:
    
        if (r5 != 1936683886) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0303, code lost:
    
        r13 = defpackage.nih.d(1936683886, "TVSHOWSORT", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0311, code lost:
    
        if (r5 != 1953919848) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0313, code lost:
    
        r13 = defpackage.nih.d(1953919848, "TVSHOW", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0321, code lost:
    
        if (r5 != 757935405) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0323, code lost:
    
        r5 = null;
        r13 = null;
        r9 = r17;
        r12 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0328, code lost:
    
        r11 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x032a, code lost:
    
        if (r11 >= r10) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x032c, code lost:
    
        r30 = r6.e();
        r11 = r6.e();
        r32 = r12;
        r6.L(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x033f, code lost:
    
        if (r11 != 1835360622) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x034a, code lost:
    
        r12 = r30 - 12;
        r33 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0351, code lost:
    
        if (r11 != 1851878757) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0353, code lost:
    
        r5 = r6.x(r12);
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0359, code lost:
    
        r2 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x035f, code lost:
    
        if (r11 != 1684108385) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0364, code lost:
    
        if (r11 != 1684108385) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0366, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0368, code lost:
    
        r6.L(r12);
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0362, code lost:
    
        r30 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0341, code lost:
    
        r13 = r6.x(r30 - 12);
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x036e, code lost:
    
        r33 = r2;
        r32 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0372, code lost:
    
        if (r13 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0374, code lost:
    
        if (r5 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0378, code lost:
    
        if (r9 != r17) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x037b, code lost:
    
        r6.K(r9);
        r6.L(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x038e, code lost:
    
        r13 = new defpackage.ngf(r13, r5, r6.x(r32 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0391, code lost:
    
        r6.K(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0390, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0396, code lost:
    
        r33 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x044e, code lost:
    
        defpackage.luj.b("MetadataUtil", "Skipped unknown metadata entry: " + defpackage.lvk.e(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0466, code lost:
    
        r6.K(r10);
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0199, code lost:
    
        r5 = defpackage.nge.a(defpackage.nih.a(r6) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01a3, code lost:
    
        if (r5 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01a5, code lost:
    
        r11 = new defpackage.ngi("TCON", null, defpackage.engw.r(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x01b8, code lost:
    
        r6.K(r10);
        r33 = r2;
        r22 = r9;
        r13 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01b2, code lost:
    
        defpackage.luj.f("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01b7, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03db, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x048e, code lost:
    
        r6.K(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0491, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x039d, code lost:
    
        r33 = r2;
        r22 = r9;
        r2 = 16777215 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a8, code lost:
    
        if (r2 != 6516084) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03aa, code lost:
    
        r2 = r6.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b5, code lost:
    
        if (r6.e() != 1684108385) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b7, code lost:
    
        r6.L(8);
        r2 = r6.x(r2 - 16);
        r13 = new defpackage.nfy("und", r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0478, code lost:
    
        r6.K(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03cb, code lost:
    
        defpackage.luj.f("MetadataUtil", "Failed to parse comment attribute: ".concat(defpackage.lvk.e(r5)));
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03e4, code lost:
    
        if (r2 == 7233901) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03e9, code lost:
    
        if (r2 != 7631467) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03f0, code lost:
    
        if (r2 == 6516589) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03f5, code lost:
    
        if (r2 != 7828084) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03fc, code lost:
    
        if (r2 != 6578553) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03fe, code lost:
    
        r13 = defpackage.nih.d(r5, "TDRC", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0409, code lost:
    
        if (r2 != 4280916) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x040b, code lost:
    
        r13 = defpackage.nih.d(r5, "TPE1", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0415, code lost:
    
        if (r2 != 7630703) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0417, code lost:
    
        r13 = defpackage.nih.d(r5, "TSSE", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0421, code lost:
    
        if (r2 != 6384738) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0423, code lost:
    
        r13 = defpackage.nih.d(r5, "TALB", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x042d, code lost:
    
        if (r2 != 7108978) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x042f, code lost:
    
        r13 = defpackage.nih.d(r5, "USLT", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0439, code lost:
    
        if (r2 != 6776174) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x043b, code lost:
    
        r13 = defpackage.nih.d(r5, "TCON", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0445, code lost:
    
        if (r2 != 6779504) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0447, code lost:
    
        r13 = defpackage.nih.d(r5, "TIT1", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x046b, code lost:
    
        r13 = defpackage.nih.d(r5, "TCOM", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0472, code lost:
    
        r13 = defpackage.nih.d(r5, "TIT2", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0492, code lost:
    
        r33 = r2;
        r22 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x049d, code lost:
    
        if (r0.isEmpty() == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04a0, code lost:
    
        r13 = new defpackage.lrb(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016b, code lost:
    
        r6.K(r10);
        r6.L(r12);
        r0 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0176, code lost:
    
        r10 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0178, code lost:
    
        if (r10 >= r15) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017a, code lost:
    
        r10 = r10 + r6.e();
        r5 = r6.e();
        r12 = (r5 >> 24) & org.chromium.net.PrivateKeyType.INVALID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018c, code lost:
    
        if (r12 == 169) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0190, code lost:
    
        if (r12 != 253) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0197, code lost:
    
        if (r5 != 1735291493) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c4, code lost:
    
        if (r5 != 1684632427) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c6, code lost:
    
        r13 = defpackage.nih.c(1684632427, "TPOS", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cc, code lost:
    
        r6.K(r10);
        r33 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d1, code lost:
    
        r22 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x047b, code lost:
    
        if (r13 == null) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x047d, code lost:
    
        r0.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0480, code lost:
    
        r9 = r22;
        r2 = r33;
        r17 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01db, code lost:
    
        if (r5 != 1953655662) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dd, code lost:
    
        r13 = defpackage.nih.c(1953655662, "TRCK", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r5 != 1953329263) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r5 = defpackage.nih.b(1953329263, "TBPM", r6, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f1, code lost:
    
        r6.K(r10);
        r33 = r2;
        r13 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x077a A[EDGE_INSN: B:395:0x077a->B:396:0x077a BREAK  A[LOOP:10: B:316:0x0609->B:322:0x076d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0799 A[LOOP:13: B:397:0x0796->B:399:0x0799, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l(long r36) {
        /*
            Method dump skipped, instructions count: 2094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nil.l(long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x02af, code lost:
    
        if (r33 < r29) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:271:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02bf A[SYNTHETIC] */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.ncp r38, defpackage.ndk r39) {
        /*
            Method dump skipped, instructions count: 1824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nil.a(ncp, ndk):int");
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        long j2;
        long j3;
        int b;
        nik[] nikVarArr = this.x;
        if (nikVarArr.length == 0) {
            ndo ndoVar = ndo.a;
            return new ndl(ndoVar, ndoVar);
        }
        int i = this.z;
        long j4 = -1;
        if (i != -1) {
            niv nivVar = nikVarArr[i].b;
            int i2 = i(nivVar, j);
            if (i2 == -1) {
                ndo ndoVar2 = ndo.a;
                return new ndl(ndoVar2, ndoVar2);
            }
            long j5 = nivVar.f[i2];
            j2 = nivVar.c[i2];
            if (j5 >= j || i2 >= nivVar.b - 1 || (b = nivVar.b(j)) == -1 || b == i2) {
                j3 = -9223372036854775807L;
            } else {
                j3 = nivVar.f[b];
                j4 = nivVar.c[b];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            nik[] nikVarArr2 = this.x;
            if (i3 >= nikVarArr2.length) {
                break;
            }
            if (i3 != this.z) {
                niv nivVar2 = nikVarArr2[i3].b;
                long j6 = j(nivVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = j(nivVar2, j3, j4);
                }
                j2 = j6;
            }
            i3++;
        }
        ndo ndoVar3 = new ndo(j, j2);
        return j3 == -9223372036854775807L ? new ndl(ndoVar3, ndoVar3) : new ndl(ndoVar3, new ndo(j3, j4));
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        if ((this.b & 16) == 0) {
            ncrVar = new nkk(ncrVar, this.a);
        }
        this.w = ncrVar;
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (j == 0) {
            if (this.k != 3) {
                k();
                return;
            }
            niq niqVar = this.h;
            niqVar.c.clear();
            niqVar.d = 0;
            this.i.clear();
            return;
        }
        for (nik nikVar : this.x) {
            niv nivVar = nikVar.b;
            int a = nivVar.a(j2);
            if (a == -1) {
                a = nivVar.b(j2);
            }
            nikVar.e = a;
            ndv ndvVar = nikVar.d;
            if (ndvVar != null) {
                ndvVar.b();
            }
        }
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        engw engwVar;
        ndr a = nir.a(ncpVar, false, (this.b & 2) != 0);
        if (a != null) {
            engwVar = engw.r(a);
        } else {
            int i = engw.d;
            engwVar = enou.a;
        }
        this.j = engwVar;
        return a == null;
    }

    @Override // defpackage.ndn
    public final long w() {
        return this.A;
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        return this.j;
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return true;
    }

    public nil(nkh nkhVar, int i) {
        this.a = nkhVar;
        this.b = i;
        int i2 = engw.d;
        this.j = enou.a;
        this.k = (i & 4) != 0 ? 3 : 0;
        this.h = new niq();
        this.i = new ArrayList();
        this.f = new luv(16);
        this.g = new ArrayDeque();
        this.c = new luv(lwa.a);
        this.d = new luv(6);
        this.e = new luv();
        this.p = -1;
        this.w = ncr.y;
        this.x = new nik[0];
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
