package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndd {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    public final String l;
    public final lvx m;

    private ndd(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, String str, lvx lvxVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = f;
        this.k = i9;
        this.l = str;
        this.m = lvxVar;
    }

    public static ndd a(luv luvVar) {
        return b(luvVar, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c5 A[Catch: ArrayIndexOutOfBoundsException -> 0x0afd, TryCatch #3 {ArrayIndexOutOfBoundsException -> 0x0afd, blocks: (B:6:0x0015, B:25:0x0040, B:27:0x0061, B:29:0x0073, B:32:0x008d, B:37:0x00cb, B:39:0x00d7, B:46:0x010c, B:51:0x0116, B:55:0x0144, B:57:0x014a, B:59:0x0154, B:62:0x0159, B:64:0x015c, B:66:0x0162, B:68:0x016d, B:69:0x0170, B:71:0x017a, B:73:0x017f, B:79:0x01c5, B:81:0x01cb, B:84:0x01d2, B:87:0x01e8, B:91:0x01f6, B:93:0x01fe, B:95:0x0204, B:98:0x020a, B:100:0x020d, B:101:0x01e0, B:102:0x01dd, B:104:0x0212, B:105:0x018f, B:110:0x01a1, B:112:0x01a7, B:113:0x01b1, B:115:0x01b8, B:116:0x01bc, B:119:0x021c, B:121:0x0222, B:127:0x0aab, B:128:0x0235, B:130:0x024e, B:132:0x0256, B:134:0x0258, B:138:0x025f, B:141:0x0267, B:142:0x0270, B:144:0x0274, B:146:0x027e, B:152:0x0288, B:154:0x0297, B:156:0x029a, B:157:0x029e, B:160:0x02c0, B:164:0x02d3, B:166:0x0302, B:169:0x02e9, B:171:0x02ca, B:173:0x0305, B:175:0x030d, B:178:0x031c, B:182:0x0323, B:183:0x032c, B:185:0x032e, B:191:0x0338, B:197:0x0351, B:193:0x0345, B:199:0x034a, B:204:0x0358, B:208:0x0366, B:210:0x036b, B:212:0x0374, B:214:0x0379, B:216:0x0388, B:218:0x0392, B:220:0x03a0, B:222:0x03a5, B:226:0x03b8, B:228:0x03c9, B:232:0x03d6, B:238:0x03ea, B:239:0x03f1, B:243:0x041f, B:245:0x042e, B:253:0x0440, B:255:0x0446, B:258:0x044c, B:262:0x0451, B:260:0x0454, B:266:0x0459, B:268:0x045e, B:272:0x046a, B:274:0x0473, B:278:0x047e, B:280:0x0484, B:282:0x0486, B:287:0x048c, B:288:0x0494, B:292:0x04a3, B:297:0x04c0, B:299:0x04c4, B:301:0x04d9, B:303:0x04e4, B:307:0x04ef, B:309:0x04f4, B:311:0x04fa, B:313:0x0503, B:319:0x050a, B:321:0x051d, B:323:0x0523, B:325:0x0531, B:327:0x053c, B:328:0x0544, B:330:0x0564, B:332:0x056f, B:334:0x05bb, B:341:0x0591, B:344:0x059c, B:359:0x05b5, B:362:0x05c4, B:367:0x05e9, B:369:0x05ed, B:371:0x0601, B:373:0x0607, B:377:0x060c, B:379:0x0614, B:382:0x061c, B:384:0x0620, B:386:0x0626, B:390:0x062d, B:396:0x0632, B:400:0x0639, B:402:0x0652, B:404:0x0661, B:408:0x0675, B:409:0x0683, B:413:0x068d, B:416:0x0694, B:415:0x069e, B:406:0x067c, B:424:0x06a7, B:426:0x06b2, B:428:0x06b8, B:430:0x06bb, B:436:0x06cb, B:437:0x06d5, B:439:0x06e4, B:441:0x06f4, B:443:0x06fe, B:444:0x0701, B:445:0x0716, B:447:0x071c, B:449:0x0741, B:456:0x0763, B:458:0x0769, B:460:0x0773, B:462:0x0788, B:464:0x0798, B:466:0x079e, B:468:0x07a1, B:473:0x07a7, B:474:0x07ac, B:478:0x07b4, B:481:0x07c1, B:483:0x07c5, B:485:0x07cb, B:487:0x07ce, B:490:0x07d1, B:492:0x07d7, B:498:0x07da, B:500:0x07dd, B:502:0x07eb, B:503:0x0804, B:505:0x080b, B:507:0x0813, B:509:0x0819, B:511:0x0822, B:513:0x082b, B:516:0x0868, B:518:0x086e, B:519:0x0879, B:521:0x0882, B:525:0x0891, B:535:0x08ba, B:537:0x08c4, B:538:0x08d2, B:544:0x083b, B:547:0x0841, B:549:0x0849, B:551:0x0851, B:553:0x085b, B:555:0x0860, B:561:0x0863, B:563:0x0828, B:569:0x07f5, B:571:0x07fb, B:573:0x07fe, B:576:0x0801, B:580:0x077f, B:582:0x04af, B:234:0x03e3, B:585:0x08e3, B:587:0x08f0, B:589:0x0902, B:597:0x093a, B:599:0x0964, B:608:0x09ad, B:609:0x09b3, B:612:0x09bb, B:617:0x0a88, B:628:0x09c8, B:629:0x09d1, B:631:0x09d7, B:634:0x09e2, B:636:0x09e9, B:638:0x09f1, B:640:0x09f8, B:642:0x09fb, B:647:0x0a06, B:649:0x0a10, B:650:0x0a16, B:652:0x0a1f, B:655:0x0a33, B:656:0x0a43, B:658:0x0a48, B:661:0x0a54, B:662:0x0a64, B:663:0x0a6b, B:665:0x0a71, B:667:0x0a76, B:669:0x0a5c, B:674:0x0a3b, B:678:0x0a79, B:688:0x0acd, B:692:0x0aeb, B:693:0x0af2, B:696:0x0aee, B:5:0x0012), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f0  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ndd b(defpackage.luv r59, boolean r60, defpackage.lvx r61) {
        /*
            Method dump skipped, instructions count: 2836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndd.b(luv, boolean, lvx):ndd");
    }
}
