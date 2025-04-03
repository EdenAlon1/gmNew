package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.BidiFormatter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrl {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiKt");

    public static final void a(final zqy zqyVar, boolean z, cxj cxjVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        boolean z2 = z;
        cxj cxjVar2 = cxjVar;
        zqyVar.getClass();
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-1010612268);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(zqyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.E(z2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0) {
                if ((i & 512) == 0 ? b.D(cxjVar2) : b.F(cxjVar2)) {
                    i6 = 256;
                }
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            int i7 = i2 & 4;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                z2 &= z3;
                if (i7 != 0) {
                    i3 &= -897;
                    cxjVar2 = cxk.a(0.0f);
                }
            } else {
                b.s();
                if (i7 != 0) {
                    i3 &= -897;
                }
            }
            cxj cxjVar3 = cxjVar2;
            b.l();
            if (zqyVar instanceof aaqe) {
                b.v(2102046550);
                aaqh.a((aaqe) zqyVar, z2, d(b), cxjVar3, b, (i3 & 112) | 4096 | ((i3 << 3) & 7168));
                cxjVar2 = cxjVar3;
                ((hfm) b).Z();
            } else {
                cxjVar2 = cxjVar3;
                if (zqyVar instanceof zsn) {
                    b.v(2102289776);
                    zsn zsnVar = (zsn) zqyVar;
                    int i8 = (i3 & 896) | (i3 & 112) | 512;
                    if (zsnVar.e.a && (zsnVar.b instanceof doml)) {
                        b.v(2102367741);
                        c(zsnVar, z2, cxjVar2, b, i8);
                        ((hfm) b).Z();
                    } else {
                        b.v(2102446233);
                        b(zsnVar, z2, cxjVar2, b, i8);
                        ((hfm) b).Z();
                    }
                    ((hfm) b).Z();
                } else if (zqyVar instanceof aaqu) {
                    b.v(-1179101516);
                    aaqx.a((aaqu) zqyVar, b, 0);
                    ((hfm) b).Z();
                } else if (zqyVar instanceof aasd) {
                    b.v(2102640324);
                    ((hfm) b).Z();
                } else if (zqyVar instanceof aase) {
                    b.v(2102737447);
                    aase aaseVar = (aase) zqyVar;
                    czxn czxnVar = aaseVar.a;
                    if (czxnVar != null) {
                        czyb.c(czxnVar, aaseVar.b, aaseVar.c, null, b, 0);
                    }
                    ((hfm) b).Z();
                } else if (zqyVar instanceof aapu) {
                    b.v(-1179089937);
                    aapw.a((aapu) zqyVar, b, 0);
                    ((hfm) b).Z();
                } else if (zqyVar instanceof aaqb) {
                    b.v(-1179088333);
                    aaqd.a((aaqb) zqyVar, b, 0);
                    ((hfm) b).Z();
                } else {
                    b.v(-1179087142);
                    Class<?> cls = zqyVar.getClass();
                    int i9 = fflc.a;
                    dwjt.b("<message type not handled yet " + new ffkb(cls) + ">", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, b, 0, 0, 131070);
                    b = b;
                    ((hfm) b).Z();
                }
            }
        }
        final cxj cxjVar4 = cxjVar2;
        final boolean z4 = z2;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zre
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zqy zqyVar2 = zqy.this;
                    boolean z5 = z4;
                    zrl.a(zqyVar2, z5, cxjVar4, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final zsn zsnVar, final boolean z, final cxj cxjVar, hfd hfdVar, final int i) {
        int i2;
        hvi a2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1676248823);
        if (i3 == 0) {
            i2 = (true != b.D(zsnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b.D(cxjVar) : b.F(cxjVar)) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            int i4 = i2;
            dnsh dnshVar = zsnVar.a;
            dntj d = d(b);
            hvi hviVar = hvi.e;
            if (csjc.d()) {
                hviVar = iop.a(hviVar, new zrh());
            }
            zsl zslVar = zsnVar.d;
            if (zslVar != null) {
                String str = zsnVar.f;
                hve hveVar = hvi.e;
                hveVar.getClass();
                ffix ffixVar = zslVar.e;
                a2 = hveVar.a(new hva("com.google.android.libraries.communications.ux.components.message.animation.sendingAnimation", str, new dnng(str, zslVar.c, zslVar.d, ffixVar, zslVar.a, zslVar.b)));
                hviVar = hviVar.a(a2);
            }
            int i5 = i4 << 3;
            dnrv.c(dnshVar, hviVar, z, cxjVar, d, hpx.d(641294063, new zri(zsnVar), b), b, (i5 & 7168) | (i5 & 896) | 200704, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zra
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zsn zsnVar2 = zsn.this;
                    boolean z2 = z;
                    int i6 = i;
                    zrl.b(zsnVar2, z2, cxjVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final zsn zsnVar, final boolean z, final cxj cxjVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-713207599);
        if (i3 == 0) {
            i2 = (true != b.D(zsnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b.D(cxjVar) : b.F(cxjVar)) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            doml domlVar = (doml) zsnVar.b;
            String str = domlVar.a;
            b.v(1633517276);
            if (str.length() <= zsnVar.e.b) {
                b(zsnVar, z, cxjVar, b, (i2 & 126) | 512 | (i2 & 896));
                ((hfm) b).Z();
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: zrb
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            zsn zsnVar2 = zsn.this;
                            boolean z2 = z;
                            int i4 = i;
                            zrl.c(zsnVar2, z2, cxjVar, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            long j = jpi.a(jpj.a(b), str, done.g(domlVar, b), 0, 0, 0L, 1020).c;
            jzn jznVar = (jzn) b.e(jdr.e);
            int eo = jznVar.eo(dnsi.c(zsnVar.a)) + jznVar.eo(dnsi.a(zsnVar.a, false));
            b.v(1633532665);
            int i4 = ((int) (j & 4294967295L)) + eo;
            if (i4 < 262143) {
                b(zsnVar, z, cxjVar, b, (i2 & 126) | 512 | (i2 & 896));
                hfmVar.Z();
                hio L2 = b.L();
                if (L2 != null) {
                    L2.d = new ffjm() { // from class: zrc
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            zsn zsnVar2 = zsn.this;
                            boolean z2 = z;
                            int i5 = i;
                            zrl.c(zsnVar2, z2, cxjVar, (hfd) obj, hip.a(i5 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            hfmVar.Z();
            int i5 = i4 / 262143;
            int i6 = i5 + 1;
            int length = str.length() / i6;
            ((enrr) a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiKt", "SplitTextBubble", 132, "BugleMessageUi.kt")).J("Splitting text bubble with height %s into %d bubbles. textLength is %d", Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(length));
            int i7 = i5;
            while (i7 >= 0) {
                String substring = str.substring(i7 * length, Math.min((i7 + 1) * length, str.length()));
                substring.getClass();
                b(zsn.c(zsnVar, null, doml.l(domlVar, substring, null, null, null, null, false, false, 4194302), 61), z, cxjVar, b, (i2 & 112) | 512 | (i2 & 896));
                i7--;
                str = str;
                i2 = i2;
            }
        }
        hio L3 = b.L();
        if (L3 != null) {
            L3.d = new ffjm() { // from class: zrd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zsn zsnVar2 = zsn.this;
                    boolean z2 = z;
                    int i8 = i;
                    zrl.c(zsnVar2, z2, cxjVar, (hfd) obj, hip.a(i8 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final dntj d(hfd hfdVar) {
        hfdVar.v(505373486);
        final Context context = (Context) hfdVar.e(AndroidCompositionLocals_androidKt.b);
        final jpi a2 = jpj.a(hfdVar);
        hfdVar.v(371911955);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (R == hfc.a) {
            R = new dntj(zrj.a, zrk.a, new ffjn() { // from class: zrf
                @Override // defpackage.ffjn
                public final Object a(Object obj, Object obj2, Object obj3) {
                    LocaleList locales;
                    Locale locale;
                    String str = (String) obj;
                    int intValue = ((Integer) obj2).intValue();
                    jpo jpoVar = (jpo) obj3;
                    str.getClass();
                    jpoVar.getClass();
                    boolean a3 = aswb.a();
                    jpi jpiVar = jpi.this;
                    jpiVar.getClass();
                    Context context2 = context;
                    context2.getClass();
                    if (str.length() == 0 || aaef.a(str, jpiVar, jpoVar, intValue)) {
                        return str;
                    }
                    List<String> V = ffpc.V(str, new String[]{", "}, 0, 6);
                    StringBuilder sb = new StringBuilder();
                    ArrayList arrayList = new ArrayList();
                    Resources resources = context2.getResources();
                    locales = resources.getConfiguration().getLocales();
                    locale = locales.get(0);
                    BidiFormatter bidiFormatter = BidiFormatter.getInstance(locale);
                    int i = 0;
                    for (String str2 : V) {
                        int i2 = i + 1;
                        if (a3) {
                            sb.append(str2);
                        } else {
                            sb.append(bidiFormatter.unicodeWrap(str2));
                        }
                        if (i != ffdx.e(V)) {
                            sb.append(", ");
                        }
                        arrayList.add(Integer.valueOf(sb.length()));
                        i = i2;
                    }
                    for (int e = ffdx.e(V); e >= 0; e--) {
                        sb.delete(((Number) arrayList.get(e)).intValue(), sb.length());
                        int size = (V.size() - e) - 1;
                        if (size > 0) {
                            String quantityString = resources.getQuantityString(R.plurals.plus_n_plural, size, Integer.valueOf(size));
                            quantityString.getClass();
                            sb.append(bidiFormatter.unicodeWrap(quantityString));
                        }
                        String sb2 = sb.toString();
                        if (aaef.a(sb2, jpiVar, jpoVar, intValue)) {
                            return sb2;
                        }
                    }
                    return "";
                }
            });
            hfmVar.ad(R);
        }
        dntj dntjVar = (dntj) R;
        hfmVar.Z();
        hfmVar.Z();
        return dntjVar;
    }
}
