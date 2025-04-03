package defpackage;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhz {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = lvf.ae("OpusHead");

    public static int a(int i) {
        return i & 16777215;
    }

    public static int b(int i) {
        return (i >> 24) & PrivateKeyType.INVALID;
    }

    public static int c(luv luvVar) {
        luvVar.K(16);
        return luvVar.e();
    }

    public static lrb d(luv luvVar) {
        short C = luvVar.C();
        luvVar.L(2);
        String y = luvVar.y(C);
        int max = Math.max(y.lastIndexOf(43), y.lastIndexOf(45));
        try {
            return new lrb(new lvl(Float.parseFloat(y.substring(0, max)), Float.parseFloat(y.substring(max, y.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static lvm e(luv luvVar) {
        long q;
        long q2;
        luvVar.K(8);
        if (b(luvVar.e()) == 0) {
            q = luvVar.r();
            q2 = luvVar.r();
        } else {
            q = luvVar.q();
            q2 = luvVar.q();
        }
        return new lvm(q, q2, luvVar.r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x029a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a5 A[ADDED_TO_REGION, LOOP:3: B:84:0x02a5->B:87:0x02b0, LOOP_START, PHI: r19
      0x02a5: PHI (r19v14 int) = (r19v10 int), (r19v15 int) binds: [B:83:0x02a3, B:87:0x02b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0360  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.niv f(defpackage.nis r41, defpackage.lvi r42, defpackage.ndc r43) {
        /*
            Method dump skipped, instructions count: 1565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhz.f(nis, lvi, ndc):niv");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        if (r26 == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0cea  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0cbb  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0d1f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:572:0x01be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List g(defpackage.lvi r74, defpackage.ndc r75, long r76, defpackage.lpw r78, boolean r79, boolean r80, defpackage.emwl r81) {
        /*
            Method dump skipped, instructions count: 3371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhz.g(lvi, ndc, long, lpw, boolean, boolean, emwl):java.util.List");
    }

    public static void h(luv luvVar) {
        int i = luvVar.b;
        luvVar.L(4);
        if (luvVar.e() != 1751411826) {
            i += 4;
        }
        luvVar.K(i);
    }

    private static int i(luv luvVar) {
        int j = luvVar.j();
        int i = j & 127;
        while ((j & 128) == 128) {
            j = luvVar.j();
            i = (i << 7) | (j & 127);
        }
        return i;
    }

    private static Pair j(luv luvVar, int i, int i2) {
        Integer num;
        nit nitVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = luvVar.b;
        while (i5 - i < i2) {
            luvVar.K(i5);
            int e = luvVar.e();
            ncs.b(e > 0, "childAtomSize must be positive");
            if (luvVar.e() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < e) {
                    luvVar.K(i6);
                    int e2 = luvVar.e();
                    int e3 = luvVar.e();
                    if (e3 == 1718775137) {
                        num3 = Integer.valueOf(luvVar.e());
                    } else if (e3 == 1935894637) {
                        luvVar.L(4);
                        str = luvVar.y(4);
                    } else if (e3 == 1935894633) {
                        i8 = i6;
                        i7 = e2;
                    }
                    i6 += e2;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    ncs.b(num3 != null, "frma atom is mandatory");
                    ncs.b(i8 != -1, "schi atom is mandatory");
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num3;
                            nitVar = null;
                            break;
                        }
                        luvVar.K(i9);
                        int e4 = luvVar.e();
                        if (luvVar.e() == 1952804451) {
                            int b2 = b(luvVar.e());
                            luvVar.L(1);
                            if (b2 == 0) {
                                luvVar.L(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int j = luvVar.j();
                                i3 = j & 15;
                                i4 = (j & 240) >> 4;
                            }
                            if (luvVar.j() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int j2 = luvVar.j();
                            byte[] bArr2 = new byte[16];
                            luvVar.F(bArr2, 0, 16);
                            if (z && j2 == 0) {
                                int j3 = luvVar.j();
                                byte[] bArr3 = new byte[j3];
                                luvVar.F(bArr3, 0, j3);
                                bArr = bArr3;
                            }
                            num = num2;
                            nitVar = new nit(z, str, j2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += e4;
                        }
                    }
                    ncs.b(nitVar != null, "tenc atom is mandatory");
                    int i10 = lvf.a;
                    create = Pair.create(num, nitVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += e;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0151, code lost:
    
        if (r6 == 1) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.lpo k(defpackage.luv r19) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhz.k(luv):lpo");
    }

    private static nhr l(luv luvVar, int i) {
        luvVar.K(i + 12);
        luvVar.L(1);
        i(luvVar);
        luvVar.L(2);
        int j = luvVar.j();
        if ((j & 128) != 0) {
            luvVar.L(2);
        }
        if ((j & 64) != 0) {
            luvVar.L(luvVar.j());
        }
        if ((j & 32) != 0) {
            luvVar.L(2);
        }
        luvVar.L(1);
        i(luvVar);
        String e = lre.e(luvVar.j());
        if ("audio/mpeg".equals(e) || "audio/vnd.dts".equals(e) || "audio/vnd.dts.hd".equals(e)) {
            return new nhr(e, null, -1L, -1L);
        }
        luvVar.L(4);
        long r = luvVar.r();
        long r2 = luvVar.r();
        luvVar.L(1);
        int i2 = i(luvVar);
        long j2 = r2;
        byte[] bArr = new byte[i2];
        luvVar.F(bArr, 0, i2);
        if (j2 <= 0) {
            j2 = -1;
        }
        return new nhr(e, bArr, j2, r > 0 ? r : -1L);
    }

    private static ByteBuffer m() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x054d, code lost:
    
        if (r12 != 6) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0682, code lost:
    
        r12 = r3.d(7);
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0687, code lost:
    
        if (r15 >= r12) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0689, code lost:
    
        r3.n(15);
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0692, code lost:
    
        if (r10 <= 0) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0698, code lost:
    
        if (r3.p() == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x069e, code lost:
    
        if (defpackage.nbs.e(r3) == false) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x06ab, code lost:
    
        throw new defpackage.lrg("Can't parse bitrate DSI.", null, false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x06b0, code lost:
    
        if (r3.p() == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x06b2, code lost:
    
        r3.h();
        r3.o(r3.d(16));
        r12 = r3.d(5);
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x06c4, code lost:
    
        if (r15 >= r12) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x06c6, code lost:
    
        r3.n(3);
        r3.n(8);
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x06d3, code lost:
    
        r4 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x06da, code lost:
    
        r3.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x06de, code lost:
    
        if (r14 != 1) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x06e0, code lost:
    
        r12 = ((r11 - r3.a()) / r4) - r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x06e9, code lost:
    
        if (r1 < r12) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x06eb, code lost:
    
        r3.o(r1 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x06f9, code lost:
    
        throw new defpackage.lrg("pres_bytes is smaller than presentation bytes read.", null, false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x06fc, code lost:
    
        if (r9.a == false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0701, code lost:
    
        if (r9.b == (-1)) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x071a, code lost:
    
        throw new defpackage.lrg("Can't determine channel mode of presentation " + r11, null, false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x06d6, code lost:
    
        r4 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x05cb, code lost:
    
        if (r10 == 2) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x067e, code lost:
    
        if (r3.p() != false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0166, code lost:
    
        if (r8 == (-1)) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x07c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void n(defpackage.luv r39, int r40, int r41, int r42, int r43, java.lang.String r44, boolean r45, defpackage.lpw r46, defpackage.nhv r47, int r48) {
        /*
            Method dump skipped, instructions count: 2710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhz.n(luv, int, int, int, int, java.lang.String, boolean, lpw, nhv, int):void");
    }
}
