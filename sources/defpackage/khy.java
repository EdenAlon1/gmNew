package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khy {
    public static float a(kie kieVar, float f) {
        return kieVar.l.a(f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static khz b(String str) {
        char c;
        khz a = khz.a(0);
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -995424086:
                if (str.equals("parent")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new khz(khz.b);
        }
        if (c == 1) {
            return khz.c(khz.b);
        }
        if (c == 2) {
            return khz.c(khz.c);
        }
        if (c == 3) {
            return new khz(khz.d);
        }
        if (str.endsWith("%")) {
            float parseFloat = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
            khz khzVar = new khz(khz.e);
            khzVar.i = parseFloat;
            khzVar.m = true;
            khzVar.h = 0;
            return khzVar;
        }
        if (!str.contains(":")) {
            return a;
        }
        khz khzVar2 = new khz(khz.f);
        khzVar2.k = str;
        khzVar2.f(khz.c);
        return khzVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static void c(kie kieVar, khw khwVar, khs khsVar, kho khoVar, String str) {
        char c;
        long j;
        char c2;
        char c3 = 3;
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                khsVar.ad = k(khoVar, str, kieVar, kieVar.l);
                break;
            case 1:
                khsVar.ae = k(khoVar, str, kieVar, kieVar.l);
                break;
            case 2:
                String n = khoVar.n(str);
                khs b = n.equals("parent") ? kieVar.b(kie.c) : kieVar.b(n);
                khsVar.t(b);
                khsVar.l(b);
                khsVar.v(b);
                khsVar.i(b);
                break;
            case 3:
                String n2 = khoVar.n(str);
                boolean equals = n2.equals("parent");
                Object obj = n2;
                if (equals) {
                    obj = kie.c;
                }
                khs b2 = kieVar.b(obj);
                khsVar.t(b2);
                khsVar.l(b2);
                break;
            case 4:
                String n3 = khoVar.n(str);
                boolean equals2 = n3.equals("parent");
                Object obj2 = n3;
                if (equals2) {
                    obj2 = kie.c;
                }
                khs b3 = kieVar.b(obj2);
                khsVar.v(b3);
                khsVar.i(b3);
                break;
            case 5:
                khsVar.F = khwVar.a(khoVar.i(str));
                break;
            case 6:
                khsVar.G = khwVar.a(khoVar.i(str));
                break;
            case 7:
                khsVar.H = khwVar.a(khoVar.i(str));
                break;
            case '\b':
                khsVar.C = a(kieVar, khwVar.a(khoVar.i(str)));
                break;
            case '\t':
                khsVar.D = a(kieVar, khwVar.a(khoVar.i(str)));
                break;
            case '\n':
                khsVar.E = a(kieVar, khwVar.a(khoVar.i(str)));
                break;
            case 11:
                khsVar.x = khwVar.a(khoVar.i(str));
                break;
            case '\f':
                khsVar.y = khwVar.a(khoVar.i(str));
                break;
            case '\r':
                khsVar.z = khwVar.a(khoVar.i(str));
                break;
            case 14:
                khsVar.A = khwVar.a(khoVar.i(str));
                break;
            case 15:
                khsVar.B = khwVar.a(khoVar.i(str));
                break;
            case 16:
                String n4 = khoVar.n(str);
                int hashCode = n4.hashCode();
                if (hashCode != -1901805651) {
                    if (hashCode != 3178655) {
                        if (hashCode == 466743410 && n4.equals("visible")) {
                            c4 = 0;
                        }
                    } else if (n4.equals("gone")) {
                        c4 = 2;
                    }
                } else if (n4.equals("invisible")) {
                    c4 = 1;
                }
                if (c4 == 0) {
                    khsVar.I = 0;
                    break;
                } else if (c4 == 1) {
                    khsVar.I = 4;
                    khsVar.F = 0.0f;
                    break;
                } else if (c4 == 2) {
                    khsVar.I = 8;
                    break;
                }
                break;
            case 17:
                khsVar.i = khwVar.a(khoVar.i(str));
                break;
            case 18:
                float a = khwVar.a(khoVar.i(str));
                if (kieVar.f()) {
                    a = 1.0f - a;
                }
                khsVar.h = a;
                break;
            case 19:
                khsVar.h = khwVar.a(khoVar.i(str));
                break;
            case 20:
                khsVar.g = khwVar.a(khoVar.i(str));
                break;
            case 21:
                khsVar.f = khwVar.a(khoVar.i(str));
                break;
            case 22:
                kho l = khoVar.l(str);
                if (l != null) {
                    ArrayList p = l.p();
                    int size = p.size();
                    for (int i = 0; i < size; i++) {
                        String str2 = (String) p.get(i);
                        khk i2 = l.i(str2);
                        if (i2 instanceof khm) {
                            float t = i2.t();
                            if (khsVar.ai == null) {
                                khsVar.ai = new HashMap();
                            }
                            khsVar.ai.put(str2, Float.valueOf(t));
                        } else if (i2 instanceof khq) {
                            String v = i2.v();
                            if (v.startsWith("#")) {
                                String substring = v.substring(1);
                                if (substring.length() == 6) {
                                    substring = "FF".concat(String.valueOf(substring));
                                }
                                j = Long.parseLong(substring, 16);
                            } else {
                                j = -1;
                            }
                            if (j != -1) {
                                khsVar.ah.put(str2, Integer.valueOf((int) j));
                            }
                        }
                    }
                    break;
                }
                break;
            case 23:
                khk i3 = khoVar.i(str);
                if (i3 instanceof kho) {
                    kho khoVar2 = (kho) i3;
                    khh khhVar = new khh();
                    ArrayList p2 = khoVar2.p();
                    int size2 = p2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        String str3 = (String) p2.get(i4);
                        switch (str3.hashCode()) {
                            case -1897525331:
                                if (str3.equals("stagger")) {
                                    c2 = c3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1310311125:
                                if (str3.equals("easing")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1285003983:
                                if (str3.equals("quantize")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -791482387:
                                if (str3.equals("pathArc")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -236944793:
                                if (str3.equals("relativeTo")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 == 0) {
                            String n5 = khoVar2.n(str3);
                            String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                            int i5 = 0;
                            while (true) {
                                if (i5 >= 6) {
                                    i5 = -1;
                                } else if (!strArr[i5].equals(n5)) {
                                    i5++;
                                }
                            }
                            if (i5 == -1) {
                                System.err.println(a.a(n5, "0 pathArc = '", "'"));
                            } else {
                                khhVar.b(607, i5);
                            }
                        } else if (c2 == 1) {
                            khhVar.c(605, khoVar2.n(str3));
                        } else if (c2 == 2) {
                            khhVar.c(603, khoVar2.n(str3));
                        } else if (c2 == c3) {
                            khhVar.a(600, khoVar2.b(str3));
                        } else if (c2 == 4) {
                            khk i6 = khoVar2.i(str3);
                            if (i6 instanceof khi) {
                                khi khiVar = (khi) i6;
                                int d = khiVar.d();
                                if (d > 0) {
                                    khhVar.b(610, khiVar.c(0));
                                    if (d > 1) {
                                        khhVar.c(611, khiVar.m(1));
                                        if (d > 2) {
                                            khhVar.a(602, khiVar.a(2));
                                        }
                                    }
                                }
                            } else {
                                khk i7 = khoVar2.i(str3);
                                i7.getClass();
                                khhVar.b(610, i7.u());
                            }
                        }
                        i4++;
                        c3 = 3;
                    }
                    khsVar.aj = khhVar;
                    break;
                }
                break;
            default:
                e(kieVar, khwVar, khoVar, khsVar, str);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(int r8, defpackage.kie r9, defpackage.khw r10, defpackage.khi r11) {
        /*
            if (r8 != 0) goto L7
            kim r8 = r9.c()
            goto Lb
        L7:
            kin r8 = r9.d()
        Lb:
            r0 = 1
            khk r1 = r11.h(r0)
            boolean r2 = r1 instanceof defpackage.khi
            if (r2 == 0) goto Lc5
            khi r1 = (defpackage.khi) r1
            int r2 = r1.d()
            if (r2 <= 0) goto Lc5
            r2 = 0
            r3 = r2
        L1e:
            int r4 = r1.d()
            if (r3 >= r4) goto L32
            java.lang.String r4 = r1.m(r3)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r2] = r4
            r8.z(r5)
            int r3 = r3 + 1
            goto L1e
        L32:
            int r1 = r11.d()
            r3 = 2
            if (r1 <= r3) goto Lc5
            khk r11 = r11.h(r3)
            boolean r1 = r11 instanceof defpackage.kho
            if (r1 != 0) goto L43
            goto Lc5
        L43:
            kho r11 = (defpackage.kho) r11
            java.util.ArrayList r1 = r11.p()
            int r3 = r1.size()
            r4 = r2
        L4e:
            if (r4 >= r3) goto Lc5
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r5.hashCode()
            r7 = 109780401(0x68b1db1, float:5.2329616E-35)
            if (r6 == r7) goto L60
            goto Lbf
        L60:
            java.lang.String r6 = "style"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Lbf
            khk r5 = r11.i(r5)
            boolean r6 = r5 instanceof defpackage.khi
            if (r6 == 0) goto L84
            r6 = r5
            khi r6 = (defpackage.khi) r6
            int r7 = r6.d()
            if (r7 <= r0) goto L84
            java.lang.String r5 = r6.m(r2)
            float r6 = r6.a(r0)
            r8.ao = r6
            goto L88
        L84:
            java.lang.String r5 = r5.v()
        L88:
            int r6 = r5.hashCode()
            r7 = -995865480(0xffffffffc4a44c78, float:-1314.3896)
            if (r6 == r7) goto La1
            r7 = 1311368264(0x4e29e448, float:7.1257754E8)
            if (r6 == r7) goto L97
            goto Lab
        L97:
            java.lang.String r6 = "spread_inside"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lab
            r5 = r0
            goto Lac
        La1:
            java.lang.String r6 = "packed"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lab
            r5 = r2
            goto Lac
        Lab:
            r5 = -1
        Lac:
            if (r5 == 0) goto Lba
            if (r5 == r0) goto Lb5
            kic r5 = defpackage.kic.SPREAD
            r8.as = r5
            goto Lc2
        Lb5:
            kic r5 = defpackage.kic.SPREAD_INSIDE
            r8.as = r5
            goto Lc2
        Lba:
            kic r5 = defpackage.kic.PACKED
            r8.as = r5
            goto Lc2
        Lbf:
            e(r9, r10, r11, r8, r5)
        Lc2:
            int r4 = r4 + 1
            goto L4e
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khy.d(int, kie, khw, khi):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(defpackage.kie r19, defpackage.khw r20, defpackage.kho r21, defpackage.khs r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khy.e(kie, khw, kho, khs, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e4 A[Catch: NumberFormatException -> 0x036b, TryCatch #1 {NumberFormatException -> 0x036b, blocks: (B:64:0x01d6, B:66:0x01e4, B:67:0x01ea, B:69:0x01f2, B:81:0x023c, B:83:0x024a, B:84:0x0250, B:86:0x0258), top: B:63:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2 A[Catch: NumberFormatException -> 0x036b, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x036b, blocks: (B:64:0x01d6, B:66:0x01e4, B:67:0x01ea, B:69:0x01f2, B:81:0x023c, B:83:0x024a, B:84:0x0250, B:86:0x0258), top: B:63:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024a A[Catch: NumberFormatException -> 0x036b, TryCatch #1 {NumberFormatException -> 0x036b, blocks: (B:64:0x01d6, B:66:0x01e4, B:67:0x01ea, B:69:0x01f2, B:81:0x023c, B:83:0x024a, B:84:0x0250, B:86:0x0258), top: B:63:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0258 A[Catch: NumberFormatException -> 0x036b, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x036b, blocks: (B:64:0x01d6, B:66:0x01e4, B:67:0x01ea, B:69:0x01f2, B:81:0x023c, B:83:0x024a, B:84:0x0250, B:86:0x0258), top: B:63:0x01d6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(java.lang.String r19, defpackage.kie r20, java.lang.String r21, defpackage.khw r22, defpackage.kho r23) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khy.f(java.lang.String, kie, java.lang.String, khw, kho):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void g(String str, kie kieVar, String str2, khw khwVar, kho khoVar) {
        char c;
        float u;
        float f;
        float f2;
        float f3;
        int i;
        char c2;
        int i2;
        khk i3;
        khs b = kieVar.b(str2);
        kii kiiVar = b.c;
        if (kiiVar == null || !(kiiVar instanceof kik)) {
            b.g(new kik(kieVar, str.charAt(0) == 'r' ? 10 : str.charAt(0) == 'c' ? 11 : 9));
        }
        kik kikVar = (kik) b.c;
        ArrayList p = khoVar.p();
        int size = p.size();
        for (int i4 = 0; i4 < size; i4++) {
            String str3 = (String) p.get(i4);
            switch (str3.hashCode()) {
                case -1439500848:
                    if (str3.equals("orientation")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -806339567:
                    if (str3.equals("padding")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -567445985:
                    if (str3.equals("contains")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3169614:
                    if (str3.equals("hGap")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3506649:
                    if (str3.equals("rows")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3586688:
                    if (str3.equals("vGap")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 97513095:
                    if (str3.equals("flags")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 109497044:
                    if (str3.equals("skips")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 109638249:
                    if (str3.equals("spans")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 144441793:
                    if (str3.equals("rowWeights")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 949721053:
                    if (str3.equals("columns")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 2033353925:
                    if (str3.equals("columnWeights")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    khi e = khoVar.e(str3);
                    if (e != null) {
                        for (int i5 = 0; i5 < e.d(); i5++) {
                            kikVar.z(kieVar.b(e.h(i5).v()));
                        }
                    }
                    break;
                case 1:
                    kikVar.as = khoVar.i(str3).u();
                    break;
                case 2:
                    int u2 = khoVar.i(str3).u();
                    if (u2 > 0 && kikVar.an != 11) {
                        kikVar.at = u2;
                    }
                    break;
                case 3:
                    int u3 = khoVar.i(str3).u();
                    if (u3 > 0 && kikVar.an != 10) {
                        kikVar.au = u3;
                    }
                    break;
                case 4:
                    kikVar.av = a(kieVar, khoVar.i(str3).t());
                    break;
                case 5:
                    kikVar.aw = a(kieVar, khoVar.i(str3).t());
                    break;
                case 6:
                    String v = khoVar.i(str3).v();
                    if (v != null && v.contains(":")) {
                        kikVar.az = v;
                    }
                    break;
                case 7:
                    String v2 = khoVar.i(str3).v();
                    if (v2 != null && v2.contains(":")) {
                        kikVar.aA = v2;
                    }
                    break;
                case '\b':
                    String v3 = khoVar.i(str3).v();
                    if (v3 != null && v3.contains(",")) {
                        kikVar.ax = v3;
                    }
                    break;
                case '\t':
                    String v4 = khoVar.i(str3).v();
                    if (v4 != null && v4.contains(",")) {
                        kikVar.ay = v4;
                    }
                    break;
                case '\n':
                    khk i6 = khoVar.i(str3);
                    if (i6 instanceof khi) {
                        khi khiVar = (khi) i6;
                        if (khiVar.d() > 1) {
                            u = khiVar.c(0);
                            f2 = khiVar.c(1);
                            if (khiVar.d() > 2) {
                                f3 = khiVar.c(2);
                                try {
                                    f = khiVar.c(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f = 0.0f;
                                }
                            } else {
                                f3 = u;
                                f = f2;
                            }
                            kikVar.ao = Math.round(a(kieVar, u));
                            kikVar.aq = Math.round(a(kieVar, f2));
                            kikVar.ap = Math.round(a(kieVar, f3));
                            kikVar.ar = Math.round(a(kieVar, f));
                            break;
                        }
                    }
                    u = i6.u();
                    f = u;
                    f2 = f;
                    f3 = f2;
                    kikVar.ao = Math.round(a(kieVar, u));
                    kikVar.aq = Math.round(a(kieVar, f2));
                    kikVar.ap = Math.round(a(kieVar, f3));
                    kikVar.ar = Math.round(a(kieVar, f));
                case 11:
                    String str4 = "";
                    try {
                        i3 = khoVar.i(str3);
                    } catch (Exception e2) {
                        PrintStream printStream = System.err;
                        e2.toString();
                        printStream.println("Error parsing grid flags ".concat(e2.toString()));
                    }
                    if (i3 instanceof khm) {
                        i = i3.u();
                        if (str4 != null || str4.isEmpty()) {
                            kikVar.aB = i;
                        } else if (!str4.isEmpty()) {
                            String[] split = str4.split("\\|");
                            kikVar.aB = 0;
                            for (String str5 : split) {
                                String lowerCase = str5.toLowerCase();
                                int hashCode = lowerCase.hashCode();
                                if (hashCode != -578405641) {
                                    if (hashCode == 2144989229 && lowerCase.equals("spansrespectwidgetorder")) {
                                        c2 = 1;
                                    }
                                    c2 = 65535;
                                } else {
                                    if (lowerCase.equals("subgridbycolrow")) {
                                        c2 = 0;
                                    }
                                    c2 = 65535;
                                }
                                if (c2 == 0) {
                                    i2 = kikVar.aB | 1;
                                } else if (c2 == 1) {
                                    i2 = kikVar.aB | 2;
                                }
                                kikVar.aB = i2;
                            }
                        }
                        break;
                    } else {
                        str4 = i3.v();
                        i = 0;
                        if (str4 != null) {
                        }
                        kikVar.aB = i;
                    }
                    break;
                default:
                    c(kieVar, khwVar, kieVar.b(str2), khoVar, str3);
                    break;
            }
        }
    }

    public static void h(int i, kie kieVar, khi khiVar) {
        kho khoVar;
        String o;
        khk h = khiVar.h(1);
        if ((h instanceof kho) && (o = (khoVar = (kho) h).o("id")) != null) {
            i(i, kieVar, o, khoVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void i(int i, kie kieVar, String str, kho khoVar) {
        char c;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        char c2;
        ArrayList p = khoVar.p();
        khs b = kieVar.b(str);
        if (i == 0) {
            kieVar.g(str, 0);
        } else {
            kieVar.g(str, 1);
        }
        boolean z3 = !kieVar.f() || i == 0;
        kil kilVar = (kil) b.c;
        int size = p.size();
        int i2 = 0;
        boolean z4 = false;
        boolean z5 = true;
        float f = 0.0f;
        while (i2 < size) {
            String str2 = (String) p.get(i2);
            boolean z6 = z3;
            switch (str2.hashCode()) {
                case -678927291:
                    if (str2.equals("percent")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (str2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str2.equals("left")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str2.equals("right")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (str2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                arrayList = p;
                z = true;
                if (c != 1) {
                    if (c == 2) {
                        z2 = false;
                        f = a(kieVar, khoVar.b(str2));
                    } else if (c != 3) {
                        if (c == 4) {
                            khi e = khoVar.e(str2);
                            if (e == null) {
                                f = khoVar.b(str2);
                                z4 = true;
                                z5 = true;
                            } else {
                                if (e.d() > 1) {
                                    z2 = false;
                                    String m = e.m(0);
                                    f = e.a(1);
                                    switch (m.hashCode()) {
                                        case 100571:
                                            if (m.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3317767:
                                            if (m.equals("left")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 108511772:
                                            if (m.equals("right")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 109757538:
                                            if (m.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    z = true;
                                    if (c2 == 0) {
                                        z4 = true;
                                        z5 = true;
                                    } else if (c2 == 1) {
                                        z4 = true;
                                    } else if (c2 == 2) {
                                        z4 = true;
                                    } else if (c2 == 3) {
                                        z5 = !z6;
                                    }
                                } else {
                                    z2 = false;
                                }
                                z4 = z;
                            }
                        }
                        z2 = false;
                    } else {
                        z2 = false;
                        z5 = !z6;
                        f = a(kieVar, khoVar.b(str2));
                    }
                    z5 = z6;
                } else {
                    z2 = false;
                    f = a(kieVar, khoVar.b(str2));
                }
                z5 = z2;
            } else {
                arrayList = p;
                z = true;
                z2 = false;
                f = a(kieVar, khoVar.b(str2));
                z5 = true;
            }
            i2++;
            z3 = z6;
            p = arrayList;
        }
        if (z4) {
            if (z5) {
                kilVar.c(f);
                return;
            } else {
                kilVar.c(1.0f - f);
                return;
            }
        }
        if (z5) {
            kilVar.c = kilVar.a.a(Float.valueOf(f));
            kilVar.d = -1;
            kilVar.e = 0.0f;
        } else {
            Float valueOf = Float.valueOf(f);
            kilVar.c = -1;
            kilVar.d = kilVar.a.a(valueOf);
            kilVar.e = 0.0f;
        }
    }

    public static void j(kie kieVar, khw khwVar, String str, kho khoVar) {
        khs b = kieVar.b(str);
        if (b.ad == null) {
            b.ad = new khz(khz.b);
        }
        if (b.ae == null) {
            b.ae = new khz(khz.b);
        }
        ArrayList p = khoVar.p();
        int size = p.size();
        for (int i = 0; i < size; i++) {
            c(kieVar, khwVar, b, khoVar, (String) p.get(i));
        }
    }

    static khz k(kho khoVar, String str, kie kieVar, kgs kgsVar) {
        khk i = khoVar.i(str);
        boolean z = i instanceof khq;
        khz a = khz.a(0);
        if (z) {
            return b(i.v());
        }
        if (i instanceof khm) {
            return khz.a(kieVar.a(Float.valueOf(kgsVar.a(khoVar.b(str)))));
        }
        if (i instanceof kho) {
            kho khoVar2 = (kho) i;
            String o = khoVar2.o(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE);
            if (o != null) {
                a = b(o);
            }
            khk k = khoVar2.k("min");
            if (k != null) {
                if (k instanceof khm) {
                    a.e(kieVar.a(Float.valueOf(kgsVar.a(((khm) k).t()))));
                } else if (k instanceof khq) {
                    a.g = -2;
                }
            }
            khk k2 = khoVar2.k("max");
            if (k2 != null) {
                if (k2 instanceof khm) {
                    int a2 = kieVar.a(Float.valueOf(kgsVar.a(((khm) k2).t())));
                    if (a.h >= 0) {
                        a.h = a2;
                        return a;
                    }
                } else if (k2 instanceof khq) {
                    Object obj = khz.b;
                    if (a.m) {
                        a.l = obj;
                        a.h = Alert.DURATION_SHOW_INDEFINITELY;
                    }
                }
            }
        }
        return a;
    }
}
