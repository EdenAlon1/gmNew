package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlur {
    public static final /* synthetic */ int a = 0;
    private static final Set b = fffi.d(dlus.n, dlus.o, dlus.p, dlus.q);

    public static final ioc a(hho hhoVar) {
        return (ioc) hhoVar.a();
    }

    public static final jpg b(hho hhoVar) {
        return (jpg) hhoVar.a();
    }

    public static final Object c(ild ildVar, final jpg jpgVar, final ioc iocVar, final List list, ffgu ffguVar) {
        Object a2;
        a2 = douy.a(ildVar, new ffji() { // from class: dluf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ffji e;
                iak iakVar = (iak) obj;
                int i = dlur.a;
                jpg jpgVar2 = jpg.this;
                boolean z = false;
                if (jpgVar2 != null) {
                    ioc iocVar2 = iocVar;
                    if (iocVar2 == null) {
                        throw new IllegalStateException("layoutCoordinates should never be null!");
                    }
                    List list2 = list;
                    int k = jpgVar2.k(iakVar.a);
                    long k2 = iocVar2.k(iakVar.a);
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        dltq dltqVar = (dltq) it.next();
                        if (k >= dltqVar.b() && k < dltqVar.a() && (e = dltqVar.e()) != null && ((Boolean) e.invoke(new iak(k2))).booleanValue()) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }, false, ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ffcf d(java.lang.String r24, java.util.List r25, long r26, defpackage.hfd r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlur.d(java.lang.String, java.util.List, long, hfd, int, int):ffcf");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.dlut r24, defpackage.hvi r25, long r26, defpackage.jpo r28, defpackage.jyj r29, long r30, defpackage.ffji r32, boolean r33, defpackage.ffjm r34, defpackage.hfd r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlur.e(dlut, hvi, long, jpo, jyj, long, ffji, boolean, ffjm, hfd, int, int):void");
    }

    public static final void f(final String str, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(2071795734);
        if (i3 == 0) {
            i2 = (true != b2.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b2.I()) {
            b2.s();
        } else {
            gpa.c(hviVar, gft.c(b2).a, gft.a(b2).p, 0L, 0.0f, 0.0f, null, hpx.d(-747277349, new dlup(str), b2), b2, 120);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlug
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    String str2 = str;
                    int a2 = hip.a(i4 | 1);
                    dlur.f(str2, hviVar, (hfd) obj, a2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final dys dysVar, final dltn dltnVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(477427974);
        if (i3 == 0) {
            i2 = (true != b2.D(dysVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(dltnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            String str = dltnVar.a;
            String str2 = dltnVar.b;
            Uri parse = Uri.parse(str);
            int i4 = inp.a;
            inp inpVar = ino.d;
            hve hveVar = hvi.e;
            int i5 = huo.a;
            hvi a2 = hxo.a(eba.i(ebs.f(dys.a(hveVar, hum.j), 48.0f, 400.0f), z ? 16.0f : 0.0f, 0.0f, 2), gft.c(b2).c);
            b2.v(262398027);
            int i6 = i2 & 112;
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (i6 == 32 || R == hfc.a) {
                R = new ffix() { // from class: dltu
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        int i7 = dlur.a;
                        ffji ffjiVar = dltn.this.c;
                        if (ffjiVar != null) {
                            ffjiVar.invoke(new iak(9205357640488583168L));
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hfdVar2 = b2;
            dnac.a(parse, str2, dfb.d(a2, false, null, (ffix) R, 7), null, null, null, inpVar, null, 0.0f, 500, 500, null, null, null, null, null, hfdVar2, 12582912, 432, 518008);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dltv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dys dysVar2 = dys.this;
                    int i7 = i;
                    dltn dltnVar2 = dltnVar;
                    int a3 = hip.a(i7 | 1);
                    dlur.g(dysVar2, dltnVar2, z, (hfd) obj, a3);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final String str, final List list, final String str2, final hvi hviVar, final long j, final jpo jpoVar, final jyj jyjVar, final long j2, final ffji ffjiVar, hfd hfdVar, final int i) {
        String str3;
        int i2;
        hvi c;
        hvi c2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(1741899937);
        if (i3 == 0) {
            str3 = str;
            i2 = (true != b2.D(str3) ? 2 : 4) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.D(str2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(hviVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.D(jpoVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.D(jyjVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b2.C(j2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b2.F(ffjiVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i2) == 38347922 && b2.I()) {
            b2.s();
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            final Context context = (Context) b2.e(AndroidCompositionLocals_androidKt.b);
            int i4 = i2;
            ffcf d = d(str3, list, j2, b2, (i2 & 126) | ((i2 >> 15) & 896), 0);
            jlm jlmVar = (jlm) d.a;
            List list2 = (List) d.b;
            b2.v(1009717825);
            boolean D = b2.D(jlmVar) | b2.D(list2);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new hic(null, hla.a);
                hfmVar.ad(R);
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            b2.v(1009721634);
            boolean D2 = b2.D(jlmVar) | b2.D(list2);
            Object R2 = hfmVar.R();
            if (D2 || R2 == hfc.a) {
                R2 = new hic(null, hla.a);
                hfmVar.ad(R2);
            }
            final hho hhoVar2 = (hho) R2;
            hfmVar.Z();
            b2.v(1009736592);
            b2.v(1009726258);
            boolean D3 = b2.D(hhoVar2);
            Object R3 = hfmVar.R();
            if (D3 || R3 == hfc.a) {
                R3 = new ffji() { // from class: dltz
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ioc iocVar = (ioc) obj;
                        int i5 = dlur.a;
                        iocVar.getClass();
                        hho.this.b(iocVar);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            hvi a2 = iqa.a(hviVar, (ffji) R3);
            Object[] objArr = {jlmVar, list2, b(hhoVar)};
            b2.v(1009730031);
            boolean D4 = b2.D(hhoVar) | b2.D(hhoVar2) | b2.F(list2);
            Object R4 = hfmVar.R();
            if (D4 || R4 == hfc.a) {
                R4 = new dluq(list2, hhoVar, hhoVar2);
                hfmVar.ad(R4);
            }
            hfmVar.Z();
            hvi c3 = ilv.c(a2, objArr, (PointerInputEventHandler) R4);
            b2.v(1009733872);
            int i5 = i4 & 896;
            Object R5 = hfmVar.R();
            if (i5 == 256 || R5 == hfc.a) {
                R5 = new ffji() { // from class: dlua
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        int i6 = dlur.a;
                        jkvVar.getClass();
                        String str4 = str2;
                        if (str4 != null) {
                            jkr.k(jkvVar, str4);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R5);
            }
            hfmVar.Z();
            c = jjs.c(c3, false, (ffji) R5);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((dltq) it.next()) instanceof dlto) {
                        hve hveVar = hvi.e;
                        b2.v(-1527834448);
                        boolean F = b2.F(context) | b2.F(list) | b2.D(hhoVar2);
                        Object R6 = hfmVar.R();
                        if (F || R6 == hfc.a) {
                            R6 = new ffji() { // from class: dlub
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj) {
                                    jkv jkvVar = (jkv) obj;
                                    int i6 = dlur.a;
                                    jkvVar.getClass();
                                    final ioc a3 = dlur.a(hhoVar2);
                                    fffs fffsVar = new fffs((byte[]) null);
                                    for (final dltq dltqVar : list) {
                                        if (dltqVar.e() != null) {
                                            String d2 = dltqVar.d();
                                            if (d2 == null) {
                                                d2 = context.getString(R.string.annotation_default_action);
                                                d2.getClass();
                                            }
                                            fffsVar.add(new jjf(d2, new ffix() { // from class: dlty
                                                @Override // defpackage.ffix
                                                public final Object invoke() {
                                                    int i7 = dlur.a;
                                                    ffji e = dltq.this.e();
                                                    if (e != null) {
                                                        ioc iocVar = a3;
                                                    }
                                                    return true;
                                                }
                                            }));
                                        }
                                    }
                                    jkr.l(jkvVar, ffdx.a(fffsVar));
                                    return ffcu.a;
                                }
                            };
                            hfmVar.ad(R6);
                        }
                        hfmVar.Z();
                        c2 = jjs.c(hveVar, false, (ffji) R6);
                        c = c.a(dlsj.b(c2));
                    }
                }
            }
            hfmVar.Z();
            hvi a3 = jfw.a(c, "message_text");
            b2.v(1009748492);
            boolean D5 = b2.D(hhoVar) | ((234881024 & i4) == 67108864);
            Object R7 = hfmVar.R();
            if (D5 || R7 == hfc.a) {
                R7 = new ffji() { // from class: dlud
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jpg jpgVar = (jpg) obj;
                        int i6 = dlur.a;
                        jpgVar.getClass();
                        hhoVar.b(jpgVar);
                        ffji ffjiVar2 = ffji.this;
                        if (ffjiVar2 != null) {
                            ffjiVar2.invoke(jpgVar);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R7);
            }
            hfmVar.Z();
            dwjt.a(jlmVar, a3, j, 0L, 0L, jyjVar, 0L, 0, false, 0, null, (ffji) R7, jpoVar, b2, ((i4 >> 6) & 896) | ((i4 << 9) & 1879048192), (i4 << 3) & 3670016, 32248);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlue
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    hfd hfdVar2 = (hfd) obj;
                    ((Integer) obj2).intValue();
                    String str4 = str;
                    List list3 = list;
                    String str5 = str2;
                    hvi hviVar2 = hviVar;
                    long j3 = j;
                    jpo jpoVar2 = jpoVar;
                    jyj jyjVar2 = jyjVar;
                    int i6 = i;
                    dlur.h(str4, list3, str5, hviVar2, j3, jpoVar2, jyjVar2, j2, ffjiVar, hfdVar2, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final jmk i(ffbz ffbzVar) {
        return (jmk) ffbzVar.a();
    }

    private static final jou j(ffbz ffbzVar) {
        return (jou) ffbzVar.a();
    }

    private static final jou k(ffbz ffbzVar) {
        return (jou) ffbzVar.a();
    }

    private static final List l(List list, int i, int i2) {
        fffs fffsVar = new fffs((byte[]) null);
        int a2 = ((dltq) list.get(i)).a() + i2;
        for (dltq dltqVar : list.subList(i + 1, list.size())) {
            fffsVar.add(dltqVar.c(ffmk.f(0, dltqVar.b() - a2), dltqVar.a() - a2));
        }
        return ffdx.a(fffsVar);
    }

    private static final ffcf m(String str, List list) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i = 0;
        while (i < size) {
            dltq dltqVar = (dltq) list.get(i);
            if ((dltqVar instanceof dltn) || (dltqVar instanceof dltm)) {
                String substring = str.substring(dltqVar.a());
                substring.getClass();
                String obj3 = ffpc.z(substring).toString();
                ffcf m = m(obj3, l(list, i, substring.length() - obj3.length()));
                Object obj4 = m.a;
                Object obj5 = m.b;
                String substring2 = str.substring(0, dltqVar.b());
                substring2.getClass();
                String obj6 = ffpc.y(substring2).toString();
                fffs fffsVar = new fffs((byte[]) null);
                boolean z = dltqVar instanceof dltm;
                if (z) {
                    dltm dltmVar = (dltm) dltqVar;
                    String substring3 = str.substring(0, dltmVar.a);
                    substring3.getClass();
                    fffsVar.add(ffpc.y(substring3).toString());
                    String substring4 = str.substring(dltmVar.a, dltmVar.b - 1);
                    substring4.getClass();
                    fffsVar.add(substring4);
                } else {
                    if (obj6.length() > 0) {
                        fffsVar.add(obj6);
                    }
                    fffsVar.add(null);
                }
                fffsVar.addAll((Collection) obj4);
                List a2 = ffdx.a(fffsVar);
                fffs fffsVar2 = new fffs((byte[]) null);
                if (i != 0) {
                    fffsVar2.add(list.subList(0, i));
                } else if (z || obj6.length() > 0) {
                    fffsVar2.add(ffel.a);
                }
                fffsVar2.add(ffdx.b(dltqVar));
                fffsVar2.addAll((Collection) obj5);
                return new ffcf(a2, ffdx.a(fffsVar2));
            }
            int i2 = i + 1;
            if (q(dltqVar)) {
                dltq dltqVar2 = dltqVar;
                do {
                    dltq dltqVar3 = (dltq) ffdx.N(list, i2);
                    if (dltqVar3 == null) {
                        break;
                    }
                    if (q(dltqVar3)) {
                        dltqVar2 = dltqVar3;
                    } else if (dltqVar3.b() > dltqVar2.a()) {
                        break;
                    }
                    i2++;
                } while (i2 <= list.size());
                if (i2 == list.size()) {
                    obj2 = null;
                    obj = null;
                } else {
                    String substring5 = str.substring(dltqVar2.a());
                    substring5.getClass();
                    String obj7 = ffpc.z(substring5).toString();
                    ffcf m2 = m(obj7, l(list, i2 - 1, substring5.length() - obj7.length()));
                    obj = m2.a;
                    obj2 = m2.b;
                }
                fffs fffsVar3 = new fffs((byte[]) null);
                if (dltqVar.b() > 0) {
                    String substring6 = str.substring(0, dltqVar.b());
                    substring6.getClass();
                    fffsVar3.add(substring6);
                }
                String substring7 = str.substring(dltqVar.b(), dltqVar2.a());
                substring7.getClass();
                fffsVar3.add(substring7);
                List list2 = (List) obj;
                if (list2 != null) {
                    fffsVar3.addAll(list2);
                }
                List a3 = ffdx.a(fffsVar3);
                fffs fffsVar4 = new fffs((byte[]) null);
                if (dltqVar.b() > 0) {
                    fffsVar4.add(list.subList(0, i));
                }
                List<dltq> subList = list.subList(i, i2);
                ArrayList arrayList = new ArrayList(ffdx.n(subList, 10));
                for (dltq dltqVar4 : subList) {
                    arrayList.add(dltqVar4.c(dltqVar4.b() - dltqVar.b(), dltqVar4.a() - dltqVar.b()));
                }
                fffsVar4.add(arrayList);
                List list3 = (List) obj2;
                if (list3 != null) {
                    fffsVar4.addAll(list3);
                }
                return new ffcf(a3, ffdx.a(fffsVar4));
            }
            i = i2;
        }
        if (str.length() == 0) {
            str = null;
        }
        return new ffcf(ffdx.b(str), ffdx.b(list));
    }

    private static final void n(List list, int i, boolean z) {
        dltq dltqVar = (dltq) list.get(i);
    }

    private static final boolean o(dltq dltqVar) {
        return (dltqVar instanceof dlto) && ((dlto) dltqVar).a == dlus.i;
    }

    private static final boolean p(List list) {
        return list.size() == 1 && (list.get(0) instanceof dltn);
    }

    private static final boolean q(dltq dltqVar) {
        return (dltqVar instanceof dlto) && b.contains(((dlto) dltqVar).a);
    }
}
