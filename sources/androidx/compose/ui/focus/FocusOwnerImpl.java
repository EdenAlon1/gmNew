package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusOwnerImpl;
import defpackage.coe;
import defpackage.cok;
import defpackage.ffcd;
import defpackage.ffix;
import defpackage.ffji;
import defpackage.ffjm;
import defpackage.ffkj;
import defpackage.ffkm;
import defpackage.fflb;
import defpackage.hne;
import defpackage.hvh;
import defpackage.hvi;
import defpackage.hyh;
import defpackage.hyp;
import defpackage.hyq;
import defpackage.hyv;
import defpackage.hyw;
import defpackage.hyz;
import defpackage.hza;
import defpackage.hzb;
import defpackage.hzo;
import defpackage.hzt;
import defpackage.hzv;
import defpackage.hzw;
import defpackage.iam;
import defpackage.imn;
import defpackage.isx;
import defpackage.isz;
import defpackage.iui;
import defpackage.ivp;
import defpackage.ivu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements hyv {
    public final ffix a;
    public final hyp c;
    public FocusTargetNode g;
    private final ffjm h;
    private final ffji i;
    private final ffix j;
    private final ffix k;
    private coe l;
    public final FocusTargetNode b = new FocusTargetNode(2, null, 6);
    public final hzt d = new hzt();
    public final hvi e = new ivp<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // defpackage.ivp
        public final /* bridge */ /* synthetic */ hvh d() {
            return FocusOwnerImpl.this.b;
        }

        @Override // defpackage.ivp
        public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return FocusOwnerImpl.this.b.hashCode();
        }
    };
    public final cok f = new cok(1);

    public FocusOwnerImpl(ffji ffjiVar, ffjm ffjmVar, ffji ffjiVar2, ffix ffixVar, ffix ffixVar2, ffix ffixVar3) {
        this.h = ffjmVar;
        this.i = ffjiVar2;
        this.a = ffixVar;
        this.j = ffixVar2;
        this.k = ffixVar3;
        this.c = new hyp(ffjiVar, new hyw(this), new ffkm(this) { // from class: hyx
            @Override // defpackage.ffkm, defpackage.ffmu
            public final Object a() {
                return ((FocusOwnerImpl) this.g).g;
            }
        });
    }

    private final void j() {
        ivu ivuVar;
        FocusTargetNode focusTargetNode = this.g;
        if (focusTargetNode == null) {
            return;
        }
        e(null);
        focusTargetNode.j(hzo.a, hzo.d);
        if (!focusTargetNode.p.z) {
            imn.c("visitAncestors called on an unattached node");
        }
        hvh hvhVar = focusTargetNode.p.s;
        iui d = isx.d(focusTargetNode);
        while (d != null) {
            if ((d.x.e.r & 1024) != 0) {
                while (hvhVar != null) {
                    if ((hvhVar.q & 1024) != 0) {
                        hne hneVar = null;
                        hvh hvhVar2 = hvhVar;
                        while (hvhVar2 != null) {
                            if (hvhVar2 instanceof FocusTargetNode) {
                                ((FocusTargetNode) hvhVar2).j(hzo.b, hzo.d);
                            } else if ((hvhVar2.q & 1024) != 0 && (hvhVar2 instanceof isz)) {
                                int i = 0;
                                for (hvh hvhVar3 = ((isz) hvhVar2).n; hvhVar3 != null; hvhVar3 = hvhVar3.t) {
                                    if ((hvhVar3.q & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            hvhVar2 = hvhVar3;
                                        } else {
                                            if (hneVar == null) {
                                                hneVar = new hne(new hvh[16]);
                                            }
                                            if (hvhVar2 != null) {
                                                hneVar.n(hvhVar2);
                                            }
                                            hneVar.n(hvhVar3);
                                            hvhVar2 = null;
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            hvhVar2 = isx.a(hneVar);
                        }
                    }
                    hvhVar = hvhVar.s;
                }
            }
            d = d.u();
            hvhVar = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
        }
    }

    @Override // defpackage.hyr
    public final void a(boolean z) {
        g(z, true, 8);
    }

    @Override // defpackage.hyr
    public final boolean b(int i) {
        Boolean d;
        if (((Boolean) this.i.invoke(new hyh(i))).booleanValue()) {
            return true;
        }
        fflb fflbVar = new fflb();
        fflbVar.a = false;
        int i2 = this.d.b;
        FocusTargetNode focusTargetNode = this.g;
        Boolean d2 = d(i, (iam) this.j.invoke(), new hyz(fflbVar, i));
        int i3 = this.d.b;
        if (ffkj.e(d2, true) && focusTargetNode != this.g) {
            return true;
        }
        if (d2 != null && fflbVar.a != null) {
            if (ffkj.e(d2, true) && ffkj.e(fflbVar.a, true)) {
                return true;
            }
            if (hzb.a(i) && g(false, false, i) && (d = d(i, null, new hza(i))) != null && d.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hyv
    public final iam c() {
        FocusTargetNode i = i();
        if (i != null) {
            return hzw.c(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0111  */
    /* JADX WARN: Type inference failed for: r3v12, types: [hvh] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v10, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.compose.ui.focus.FocusTargetNode] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [hne] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [hne] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.hyv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean d(int r20, defpackage.iam r21, defpackage.ffji r22) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.d(int, iam, ffji):java.lang.Boolean");
    }

    @Override // defpackage.hyv
    public final void e(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.g;
        this.g = focusTargetNode;
        cok cokVar = this.f;
        Object[] objArr = cokVar.b;
        int i = cokVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((hyq) objArr[i2]).a(focusTargetNode2, focusTargetNode);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:378:0x00bb, code lost:
    
        r32 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00c5, code lost:
    
        if (((((~r12) << 6) & r12) & (-9187201950435737472L)) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x00c7, code lost:
    
        r3 = r2.b(r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x00cf, code lost:
    
        if (r2.e != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x00e0, code lost:
    
        if (((r2.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x00e4, code lost:
    
        r3 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x00e6, code lost:
    
        if (r3 <= 8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x00e8, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0100, code lost:
    
        if (java.lang.Long.compare((r2.d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x020a, code lost:
    
        r3 = defpackage.cpg.b(r2.c);
        r6 = r2.a;
        r8 = r2.b;
        r9 = r2.c;
        r2.d(r3);
        r3 = r2.a;
        r10 = r2.b;
        r11 = r2.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0221, code lost:
    
        if (r12 >= r9) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0231, code lost:
    
        if (((r6[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r21) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0233, code lost:
    
        r24 = r8[r12];
        r13 = defpackage.cod.a(r24) * (-862048943);
        r27 = r3;
        r3 = r2.b((r13 ^ (r13 << 16)) >>> 7);
        r28 = r3 >> 3;
        r29 = (r3 & 7) << 3;
        r33 = r8;
        r34 = r9;
        r8 = (r27[r28] & (~(255 << r29))) | ((r13 & 127) << r29);
        r27[r28] = r8;
        r27[(((r3 - 7) & r11) + (r11 & 7)) >> 3] = r8;
        r10[r3] = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0277, code lost:
    
        r12 = r12 + 1;
        r3 = r27;
        r8 = r33;
        r9 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0271, code lost:
    
        r27 = r3;
        r33 = r8;
        r34 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0280, code lost:
    
        r3 = r2.b(r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0287, code lost:
    
        r31 = r3;
        r2.d++;
        r3 = r2.e;
        r6 = r2.a;
        r7 = r31 >> 3;
        r8 = r6[r7];
        r10 = (r31 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x02a1, code lost:
    
        if (((r8 >> r10) & 255) != r21) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x02a3, code lost:
    
        r11 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x02a8, code lost:
    
        r2.e = r3 - r11;
        r3 = r2.c;
        r8 = (r8 & (~(255 << r10))) | (r14 << r10);
        r6[r7] = r8;
        r6[(((r31 - 7) & r3) + (r3 & 7)) >> 3] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x02a6, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0104, code lost:
    
        r3 = r2.a;
        r6 = r2.c;
        r8 = r2.b;
        r9 = (r6 + 7) >> 3;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0110, code lost:
    
        if (r10 >= r9) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0112, code lost:
    
        r12 = r3[r10] & (-9187201950435737472L);
        r3[r10] = ((~r12) + (r12 >>> 7)) & (-72340172838076674L);
        r10 = r10 + 1;
        r8 = r8;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x012d, code lost:
    
        r31 = r8;
        r8 = defpackage.ffdo.A(r3);
        r9 = r8 - 1;
        r3[r9] = (r3[r9] & 72057594037927935L) | (-72057594037927936L);
        r3[r8] = r3[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x014a, code lost:
    
        if (r8 == r6) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x014c, code lost:
    
        r9 = r8 >> 3;
        r10 = (r8 & 7) << 3;
        r12 = (r3[r9] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0159, code lost:
    
        if (r12 != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0160, code lost:
    
        if (r12 == 254) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0163, code lost:
    
        r12 = defpackage.cod.a(r31[r8]) * (-862048943);
        r12 = r12 ^ (r12 << 16);
        r13 = r12 >>> 7;
        r35 = r2.b(r13);
        r13 = r13 & r6;
        r37 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0182, code lost:
    
        if ((((r35 - r13) & r6) / 8) != (((r8 - r13) & r6) / 8)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0184, code lost:
    
        r3[r9] = ((~(255 << r10)) & r3[r9]) | ((r12 & 127) << r10);
        r3[defpackage.ffdo.A(r3)] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x01a6, code lost:
    
        r11 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x01a9, code lost:
    
        r36 = r8;
        r8 = r35 >> 3;
        r9 = r3[r8];
        r11 = r12 & 127;
        r12 = (r35 & 7) << 3;
        r8 = ~(255 << r12);
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x01c8, code lost:
    
        if (((r9 >> r12) & 255) != 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x01ca, code lost:
    
        r3[r8] = (r8 << r12) | (r9 & r8);
        r3[r9] = (r3[r9] & (~(255 << r10))) | (128 << r10);
        r31[r35] = r31[r36];
        r31[r36] = 0;
        r8 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x01f4, code lost:
    
        r3[defpackage.ffdo.A(r3)] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x01e4, code lost:
    
        r3[r8] = (r8 << r12) | (r9 & r8);
        r8 = r31[r35];
        r31[r35] = r31[r36];
        r31[r36] = r8;
        r8 = r36 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x015b, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0203, code lost:
    
        r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0208, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0285, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03c5, code lost:
    
        if (r7 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x035b, code lost:
    
        if (((r11 & ((~r11) << 6)) & (-9187201950435737472L)) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x035d, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04dd A[Catch: all -> 0x06b7, TryCatch #0 {all -> 0x06b7, blocks: (B:3:0x0009, B:5:0x000f, B:9:0x0019, B:11:0x0038, B:13:0x003c, B:14:0x0043, B:15:0x005a, B:18:0x009c, B:23:0x02c0, B:24:0x0392, B:27:0x039d, B:29:0x03a3, B:30:0x03a8, B:32:0x03b0, B:34:0x03b5, B:36:0x03bb, B:40:0x03c1, B:46:0x04dd, B:48:0x04e5, B:49:0x04e8, B:51:0x04f5, B:54:0x055b, B:56:0x0561, B:63:0x0565, B:67:0x0502, B:71:0x050c, B:105:0x0512, B:106:0x0517, B:97:0x0553, B:73:0x051b, B:75:0x0521, B:77:0x0525, B:79:0x052e, B:81:0x0534, B:87:0x053d, B:89:0x0546, B:90:0x0549, B:85:0x054d, B:108:0x0558, B:113:0x056c, B:115:0x0574, B:123:0x058a, B:124:0x059a, B:126:0x059e, B:167:0x05a2, B:160:0x05fd, B:128:0x05ab, B:130:0x05b4, B:132:0x05b8, B:134:0x05c0, B:136:0x05c6, B:138:0x05cb, B:141:0x05ce, B:143:0x05d4, B:144:0x05db, B:146:0x05e3, B:148:0x05e9, B:149:0x05ec, B:150:0x05ee, B:152:0x05f4, B:140:0x05f7, B:172:0x0608, B:175:0x0616, B:176:0x0626, B:178:0x062a, B:221:0x062e, B:213:0x068c, B:180:0x0638, B:182:0x0641, B:184:0x0645, B:186:0x064d, B:188:0x0653, B:190:0x0658, B:193:0x065b, B:195:0x0661, B:196:0x0668, B:198:0x0670, B:200:0x0676, B:201:0x0679, B:202:0x067b, B:204:0x0681, B:192:0x0684, B:228:0x069a, B:230:0x06a2, B:240:0x03c9, B:242:0x03cf, B:243:0x03d2, B:245:0x03da, B:248:0x0436, B:250:0x043c, B:257:0x0440, B:261:0x03e7, B:265:0x03f1, B:299:0x0446, B:301:0x044a, B:267:0x03f6, B:269:0x03fc, B:271:0x0400, B:273:0x0409, B:275:0x040f, B:281:0x0418, B:283:0x0421, B:284:0x0424, B:279:0x0428, B:291:0x042e, B:303:0x0433, B:308:0x0450, B:310:0x0458, B:311:0x045b, B:313:0x0465, B:316:0x04c1, B:318:0x04c7, B:325:0x04cb, B:329:0x0472, B:333:0x047c, B:367:0x04d1, B:369:0x04d5, B:335:0x0481, B:337:0x0487, B:339:0x048b, B:341:0x0494, B:343:0x049a, B:349:0x04a3, B:351:0x04ac, B:352:0x04af, B:347:0x04b3, B:359:0x04b9, B:372:0x04be, B:20:0x00b2, B:378:0x00bb, B:382:0x00c7, B:384:0x00d1, B:387:0x00e4, B:389:0x00e8, B:392:0x020a, B:394:0x0223, B:396:0x0233, B:398:0x0277, B:402:0x0280, B:403:0x0287, B:406:0x02a8, B:408:0x0104, B:410:0x0112, B:412:0x012d, B:414:0x014c, B:432:0x015b, B:419:0x0163, B:421:0x0184, B:425:0x01a9, B:427:0x01ca, B:428:0x01f4, B:429:0x01e4, B:436:0x0203, B:380:0x02c6, B:439:0x02d2, B:441:0x02e8, B:443:0x02ec, B:445:0x02f2, B:447:0x02f6, B:448:0x0306, B:451:0x033b, B:457:0x0361, B:453:0x034c, B:459:0x0353, B:461:0x0388), top: B:2:0x0009 }] */
    @Override // defpackage.hyv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.view.KeyEvent r45, defpackage.ffix r46) {
        /*
            Method dump skipped, instructions count: 1724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.f(android.view.KeyEvent, ffix):boolean");
    }

    @Override // defpackage.hyv
    public final boolean g(boolean z, boolean z2, int i) {
        boolean z3;
        if (z) {
            j();
        } else {
            int c = hzv.c(this.b, i);
            int i2 = c - 1;
            if (c == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw new ffcd();
                }
                z3 = false;
                if (z3 || !z2) {
                    return z3;
                }
                this.a.invoke();
                return true;
            }
            j();
        }
        z3 = true;
        if (z3) {
        }
        return z3;
    }

    @Override // defpackage.hyv
    public final boolean h(hyh hyhVar) {
        return ((Boolean) this.h.a(hyhVar, null)).booleanValue();
    }

    public final FocusTargetNode i() {
        return hzw.a(this.b);
    }
}
