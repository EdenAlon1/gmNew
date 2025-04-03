package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izw extends kxx {
    final /* synthetic */ jae a;

    public izw(jae jaeVar) {
        this.a = jaeVar;
    }

    @Override // defpackage.kxx
    public final kxu a(int i) {
        int i2;
        kxu kxuVar;
        View a;
        cog cogVar;
        int i3;
        jjc jjcVar;
        jjb jjbVar;
        iui a2;
        jjn B;
        ClipDescription primaryClipDescription;
        lkk P;
        jae jaeVar = this.a;
        iyq E = jaeVar.b.E();
        if (((E == null || (P = E.a.P()) == null) ? null : P.a()) == lkj.DESTROYED) {
            kxuVar = jaeVar.r();
        } else {
            jft jftVar = (jft) jaeVar.q().a(i);
            if (jftVar == null) {
                kxuVar = jaeVar.r();
            } else {
                jjw jjwVar = jftVar.a;
                kxu b = kxu.b();
                if (i == -1) {
                    Object parentForAccessibility = jaeVar.b.getParentForAccessibility();
                    b.J(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
                } else {
                    jjw g = jjwVar.g();
                    Integer valueOf = g != null ? Integer.valueOf(g.e) : null;
                    if (valueOf == null) {
                        imn.a(a.f(i, "semanticsNode ", " has null parent"));
                        throw new ffbx();
                    }
                    AndroidComposeView androidComposeView = jaeVar.b;
                    int intValue = valueOf.intValue();
                    if (intValue == androidComposeView.l.a().e) {
                        intValue = -1;
                    }
                    b.K(jaeVar.b, intValue);
                }
                b.P(jaeVar.b, i);
                b.o(jaeVar.n(jftVar));
                Resources resources = jaeVar.b.getContext().getResources();
                b.r("android.view.View");
                jjn jjnVar = jjwVar.c;
                jku jkuVar = jkm.a;
                if (jjnVar.f(jkm.C)) {
                    b.r("android.widget.EditText");
                }
                if (jjwVar.c.f(jkm.z)) {
                    b.r("android.widget.TextView");
                }
                jjj jjjVar = (jjj) jjo.a(jjwVar.c, jkm.w);
                if (jjjVar != null && (jjwVar.d || jjwVar.i().isEmpty())) {
                    int i4 = jjjVar.a;
                    if (jjj.a(i4, 4)) {
                        b.L(resources.getString(R.string.tab));
                    } else if (jjj.a(i4, 2)) {
                        b.L(resources.getString(R.string.switch_role));
                    } else {
                        boolean a3 = jjj.a(i4, 5);
                        String e = jfu.e(i4);
                        if (!a3 || jjwVar.j() || jjwVar.c.b) {
                            b.r(e);
                        }
                    }
                }
                b.H(jaeVar.b.getContext().getPackageName());
                b.a.setImportantForAccessibility(jfu.g(jjwVar));
                List i5 = jjwVar.i();
                int size = i5.size();
                for (int i6 = 0; i6 < size; i6++) {
                    jjw jjwVar2 = (jjw) i5.get(i6);
                    if (jaeVar.q().b(jjwVar2.e)) {
                        kbs kbsVar = (kbs) jaeVar.b.F().b.get(jjwVar2.b);
                        int i7 = jjwVar2.e;
                        if (i7 != -1) {
                            if (kbsVar != null) {
                                b.a.addChild(kbsVar);
                            } else {
                                b.j(jaeVar.b, i7);
                            }
                        }
                    }
                }
                if (i == jaeVar.i) {
                    b.m(true);
                    b.i(kxr.c);
                } else {
                    b.m(false);
                    b.i(kxr.b);
                }
                jaeVar.z(jjwVar, b);
                if (jjwVar.c.f(jkm.I)) {
                    b.a.setContentInvalid(true);
                    b.y((CharSequence) jjo.a(jjwVar.c, jkm.I));
                }
                b.Q(jan.c(jjwVar, resources));
                b.p(jan.f(jjwVar));
                jlc jlcVar = (jlc) jjo.a(jjwVar.c, jkm.G);
                if (jlcVar != null) {
                    if (jlcVar == jlc.a) {
                        b.q(true);
                    } else if (jlcVar == jlc.b) {
                        b.q(false);
                    }
                }
                Boolean bool = (Boolean) jjo.a(jjwVar.c, jkm.F);
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (jjjVar != null && jjj.a(jjjVar.a, 4)) {
                        b.a.setSelected(booleanValue);
                    } else {
                        b.q(booleanValue);
                    }
                }
                if (!jjwVar.c.b || jjwVar.i().isEmpty()) {
                    List list = (List) jjo.a(jjwVar.c, jkm.a);
                    b.v(list != null ? (String) ffdx.M(list) : null);
                }
                String str = (String) jjo.a(jjwVar.c, jkm.x);
                if (str != null) {
                    jjw jjwVar3 = jjwVar;
                    while (true) {
                        if (jjwVar3 == null) {
                            break;
                        }
                        if (!jjwVar3.c.f(jko.a)) {
                            jjwVar3 = jjwVar3.g();
                        } else if (((Boolean) jjwVar3.c.b(jko.a)).booleanValue()) {
                            b.a.setViewIdResourceName(str);
                        }
                    }
                }
                if (((ffcu) jjo.a(jjwVar.c, jkm.h)) != null) {
                    b.B(true);
                }
                b.a.setPassword(jjwVar.c.f(jkm.H));
                b.a.setEditable(jjwVar.c.f(jkm.K));
                Integer num = (Integer) jjo.a(jjwVar.c, jkm.L);
                b.F(num != null ? num.intValue() : -1);
                b.x(jan.e(jjwVar));
                b.z(jjwVar.c.f(jkm.k));
                if (b.aa()) {
                    b.A(((Boolean) jjwVar.c.b(jkm.k)).booleanValue());
                    if (b.ab()) {
                        i2 = 2;
                        b.h(2);
                        jaeVar.j = i;
                    } else {
                        i2 = 2;
                        b.h(1);
                    }
                } else {
                    i2 = 2;
                }
                b.W(!jfu.f(jjwVar));
                jjh jjhVar = (jjh) jjo.a(jjwVar.c, jkm.j);
                if (jjhVar != null) {
                    int i8 = jjhVar.a;
                    if (jjh.a(i8, 0) || !jjh.a(i8, 1)) {
                        i2 = 1;
                    }
                    b.a.setLiveRegion(i2);
                }
                b.s(false);
                jjn jjnVar2 = jjwVar.c;
                jku jkuVar2 = jjl.a;
                jjb jjbVar2 = (jjb) jjo.a(jjnVar2, jjl.b);
                if (jjbVar2 != null) {
                    b.s(((jjjVar == null || !jjj.a(jjjVar.a, 4)) && (jjjVar == null || !jjj.a(jjjVar.a, 3))) || !ffkj.e(jjo.a(jjwVar.c, jkm.F), true));
                    if (jan.e(jjwVar) && b.Y()) {
                        b.i(new kxr(16, jjbVar2.a));
                    }
                }
                b.E(false);
                jjb jjbVar3 = (jjb) jjo.a(jjwVar.c, jjl.c);
                if (jjbVar3 != null) {
                    b.E(true);
                    if (jan.e(jjwVar)) {
                        b.i(new kxr(32, jjbVar3.a));
                    }
                }
                jjb jjbVar4 = (jjb) jjo.a(jjwVar.c, jjl.p);
                if (jjbVar4 != null) {
                    b.i(new kxr(16384, jjbVar4.a));
                }
                if (jan.e(jjwVar)) {
                    jjb jjbVar5 = (jjb) jjo.a(jjwVar.c, jjl.j);
                    if (jjbVar5 != null) {
                        b.i(new kxr(2097152, jjbVar5.a));
                    }
                    jjb jjbVar6 = (jjb) jjo.a(jjwVar.c, jjl.o);
                    if (jjbVar6 != null) {
                        b.i(new kxr(android.R.id.accessibilityActionImeEnter, jjbVar6.a));
                    }
                    jjb jjbVar7 = (jjb) jjo.a(jjwVar.c, jjl.q);
                    if (jjbVar7 != null) {
                        b.i(new kxr(65536, jjbVar7.a));
                    }
                    jjb jjbVar8 = (jjb) jjo.a(jjwVar.c, jjl.r);
                    if (jjbVar8 != null && b.ab() && (primaryClipDescription = jaeVar.b.t.a.getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
                        b.i(new kxr(32768, jjbVar8.a));
                    }
                }
                String N = jae.N(jjwVar);
                if (N != null && N.length() != 0) {
                    b.a.setTextSelection(jaeVar.l(jjwVar), jaeVar.k(jjwVar));
                    jjb jjbVar9 = (jjb) jjo.a(jjwVar.c, jjl.i);
                    b.i(new kxr(131072, jjbVar9 != null ? jjbVar9.a : null));
                    b.h(256);
                    b.h(512);
                    b.G(11);
                    List list2 = (List) jjo.a(jjwVar.c, jkm.a);
                    if ((list2 == null || list2.isEmpty()) && jjwVar.c.f(jjl.a) && ((!jjwVar.c.f(jkm.C) || ffkj.e(jjo.a(jjwVar.c, jkm.k), true)) && ((a2 = jan.a(jjwVar.b, jaj.a)) == null || ((B = a2.B()) != null && ffkj.e(jjo.a(B, jkm.k), true))))) {
                        b.G(b.a.getMovementGranularities() | 20);
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add("androidx.compose.ui.semantics.id");
                CharSequence e2 = b.e();
                if (e2 != null && e2.length() != 0 && jjwVar.c.f(jjl.a)) {
                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                }
                if (jjwVar.c.f(jkm.x)) {
                    arrayList.add("androidx.compose.ui.semantics.testTag");
                }
                b.a.setAvailableExtraData(arrayList);
                jji jjiVar = (jji) jjo.a(jjwVar.c, jkm.c);
                if (jjiVar != null) {
                    if (jjwVar.c.f(jjl.h)) {
                        b.r("android.widget.SeekBar");
                    } else {
                        b.r("android.widget.ProgressBar");
                    }
                    if (jjiVar != jji.a) {
                        b.a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) jjiVar.c.c()).floatValue(), ((Number) jjiVar.c.b()).floatValue(), jjiVar.b));
                    }
                    if (jjwVar.c.f(jjl.h) && jan.e(jjwVar)) {
                        if (jjiVar.b < ffmk.c(((Number) jjiVar.c.b()).floatValue(), ((Number) jjiVar.c.c()).floatValue())) {
                            b.i(kxr.d);
                        }
                        if (jjiVar.b > ffmk.d(((Number) jjiVar.c.c()).floatValue(), ((Number) jjiVar.c.b()).floatValue())) {
                            b.i(kxr.e);
                        }
                    }
                }
                if (jan.e(jjwVar) && (jjbVar = (jjb) jjo.a(jjwVar.c, jjl.h)) != null) {
                    b.i(new kxr(android.R.id.accessibilityActionSetProgress, jjbVar.a));
                }
                jjc jjcVar2 = (jjc) jjo.a(jjwVar.e(), jkm.f);
                if (jjcVar2 != null) {
                    b.t(kxs.a(jjcVar2.a, jjcVar2.b, 0));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    if (jjo.a(jjwVar.e(), jkm.e) != null) {
                        List i9 = jjwVar.i();
                        int size2 = i9.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            jjw jjwVar4 = (jjw) i9.get(i10);
                            if (jjwVar4.e().f(jkm.F)) {
                                arrayList2.add(jjwVar4);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        boolean a4 = jho.a(arrayList2);
                        b.t(kxs.a(a4 ? 1 : arrayList2.size(), a4 ? arrayList2.size() : 1, 0));
                    }
                }
                if (((jjd) jjo.a(jjwVar.e(), jkm.g)) != null) {
                    throw null;
                }
                jjw g2 = jjwVar.g();
                if (g2 != null && jjo.a(g2.e(), jkm.e) != null && (((jjcVar = (jjc) jjo.a(g2.e(), jkm.f)) == null || (jjcVar.a >= 0 && jjcVar.b >= 0)) && jjwVar.e().f(jkm.F))) {
                    ArrayList arrayList3 = new ArrayList();
                    List i11 = g2.i();
                    int size3 = i11.size();
                    int i12 = 0;
                    for (int i13 = 0; i13 < size3; i13++) {
                        jjw jjwVar5 = (jjw) i11.get(i13);
                        if (jjwVar5.e().f(jkm.F)) {
                            arrayList3.add(jjwVar5);
                            if (jjwVar5.b.o() < jjwVar.b.o()) {
                                i12++;
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        boolean a5 = jho.a(arrayList3);
                        int i14 = true != a5 ? i12 : 0;
                        if (true != a5) {
                            i12 = 0;
                        }
                        b.u(kxt.a(i14, 1, i12, 1, ((Boolean) jjwVar.e().c(jkm.F, jhn.a)).booleanValue()));
                    }
                }
                jjk jjkVar = (jjk) jjo.a(jjwVar.c, jkm.s);
                jjb jjbVar10 = (jjb) jjo.a(jjwVar.c, jjl.d);
                if (jjkVar != null && jjbVar10 != null) {
                    if (!jho.b(jjwVar)) {
                        b.r("android.widget.HorizontalScrollView");
                    }
                    if (((Number) jjkVar.b.invoke()).floatValue() > 0.0f) {
                        b.N(true);
                    }
                    if (jan.e(jjwVar)) {
                        if (jae.H(jjkVar)) {
                            b.i(kxr.d);
                            b.i(!jan.g(jjwVar) ? kxr.m : kxr.k);
                        }
                        if (jae.G(jjkVar)) {
                            b.i(kxr.e);
                            b.i(!jan.g(jjwVar) ? kxr.k : kxr.m);
                        }
                    }
                }
                jjk jjkVar2 = (jjk) jjo.a(jjwVar.c, jkm.t);
                if (jjkVar2 != null && jjbVar10 != null) {
                    if (!jho.b(jjwVar)) {
                        b.r("android.widget.ScrollView");
                    }
                    if (((Number) jjkVar2.b.invoke()).floatValue() > 0.0f) {
                        b.N(true);
                    }
                    if (jan.e(jjwVar)) {
                        if (jae.H(jjkVar2)) {
                            b.i(kxr.d);
                            b.i(kxr.l);
                        }
                        if (jae.G(jjkVar2)) {
                            b.i(kxr.e);
                            b.i(kxr.j);
                        }
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    jjj jjjVar2 = (jjj) jjo.a(jjwVar.c, jkm.w);
                    if (jan.e(jjwVar) && (jjjVar2 == null || !jjj.a(jjjVar2.a, 8))) {
                        jjb jjbVar11 = (jjb) jjo.a(jjwVar.c, jjl.x);
                        if (jjbVar11 != null) {
                            b.i(new kxr(android.R.id.accessibilityActionPageUp, jjbVar11.a));
                        }
                        jjb jjbVar12 = (jjb) jjo.a(jjwVar.c, jjl.z);
                        if (jjbVar12 != null) {
                            b.i(new kxr(android.R.id.accessibilityActionPageDown, jjbVar12.a));
                        }
                        jjb jjbVar13 = (jjb) jjo.a(jjwVar.c, jjl.y);
                        if (jjbVar13 != null) {
                            b.i(new kxr(android.R.id.accessibilityActionPageLeft, jjbVar13.a));
                        }
                        jjb jjbVar14 = (jjb) jjo.a(jjwVar.c, jjl.A);
                        if (jjbVar14 != null) {
                            b.i(new kxr(android.R.id.accessibilityActionPageRight, jjbVar14.a));
                        }
                    }
                }
                b.I((CharSequence) jjo.a(jjwVar.c, jkm.d));
                if (jan.e(jjwVar)) {
                    jjb jjbVar15 = (jjb) jjo.a(jjwVar.c, jjl.s);
                    if (jjbVar15 != null) {
                        b.i(new kxr(262144, jjbVar15.a));
                    }
                    jjb jjbVar16 = (jjb) jjo.a(jjwVar.c, jjl.t);
                    if (jjbVar16 != null) {
                        b.i(new kxr(524288, jjbVar16.a));
                    }
                    jjb jjbVar17 = (jjb) jjo.a(jjwVar.c, jjl.u);
                    if (jjbVar17 != null) {
                        b.i(new kxr(1048576, jjbVar17.a));
                    }
                    if (jjwVar.c.f(jjl.w)) {
                        List list3 = (List) jjwVar.c.b(jjl.w);
                        if (list3.size() >= jae.a.b) {
                            throw new IllegalStateException("Can't have more than " + jae.a.b + " custom actions for one widget");
                        }
                        cpo cpoVar = new cpo(null);
                        int i15 = cow.a;
                        cog cogVar2 = new cog((byte[]) null);
                        if (jaeVar.q.a(i) >= 0) {
                            cog cogVar3 = (cog) cpp.a(jaeVar.q, i);
                            cnv cnvVar = new cnv((byte[]) null);
                            cmw cmwVar = jae.a;
                            int[] iArr = cmwVar.a;
                            int i16 = cmwVar.b;
                            for (int i17 = 0; i17 < i16; i17++) {
                                cnvVar.e(iArr[i17]);
                            }
                            ArrayList arrayList4 = new ArrayList();
                            int size4 = list3.size();
                            int i18 = 0;
                            while (i18 < size4) {
                                jjf jjfVar = (jjf) list3.get(i18);
                                cogVar3.getClass();
                                if (cogVar3.h(jjfVar.a)) {
                                    int f = cogVar3.f(jjfVar.a);
                                    cogVar = cogVar3;
                                    cpoVar.f(f, jjfVar.a);
                                    cogVar2.c(jjfVar.a, f);
                                    int[] iArr2 = cnvVar.a;
                                    int i19 = cnvVar.b;
                                    i3 = size4;
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 >= i19) {
                                            i20 = -1;
                                            break;
                                        }
                                        int i21 = i19;
                                        if (f == iArr2[i20]) {
                                            break;
                                        }
                                        i20++;
                                        i19 = i21;
                                    }
                                    if (i20 >= 0) {
                                        cnvVar.c(i20);
                                    }
                                    b.i(new kxr(f, jjfVar.a));
                                } else {
                                    cogVar = cogVar3;
                                    i3 = size4;
                                    arrayList4.add(jjfVar);
                                }
                                i18++;
                                cogVar3 = cogVar;
                                size4 = i3;
                            }
                            int size5 = arrayList4.size();
                            for (int i22 = 0; i22 < size5; i22++) {
                                jjf jjfVar2 = (jjf) arrayList4.get(i22);
                                int a6 = cnvVar.a(i22);
                                cpoVar.f(a6, jjfVar2.a);
                                cogVar2.c(jjfVar2.a, a6);
                                b.i(new kxr(a6, jjfVar2.a));
                            }
                        } else {
                            int size6 = list3.size();
                            for (int i23 = 0; i23 < size6; i23++) {
                                jjf jjfVar3 = (jjf) list3.get(i23);
                                int a7 = jae.a.a(i23);
                                cpoVar.f(a7, jjfVar3.a);
                                cogVar2.c(jjfVar3.a, a7);
                                b.i(new kxr(a7, jjfVar3.a));
                            }
                        }
                        jaeVar.p.f(i, cpoVar);
                        jaeVar.q.f(i, cogVar2);
                    }
                }
                b.M(jan.h(jjwVar, resources));
                int b2 = jaeVar.w.b(i);
                if (b2 != -1) {
                    View a8 = jfu.a(jaeVar.b.F(), b2);
                    if (a8 != null) {
                        b.U(a8);
                    } else {
                        b.V(jaeVar.b, b2);
                    }
                    jaeVar.t(i, b, jaeVar.y, null);
                }
                int b3 = jaeVar.x.b(i);
                if (b3 != -1 && (a = jfu.a(jaeVar.b.F(), b3)) != null) {
                    b.T(a);
                    jaeVar.t(i, b, jaeVar.z, null);
                }
                kxuVar = b;
            }
        }
        jae jaeVar2 = this.a;
        if (jaeVar2.m) {
            if (i == jaeVar2.i) {
                jaeVar2.k = kxuVar;
            }
            if (i == jaeVar2.j) {
                jaeVar2.l = kxuVar;
            }
        }
        return kxuVar;
    }

    @Override // defpackage.kxx
    public final kxu b(int i) {
        if (i != 1) {
            if (i == 2) {
                return a(this.a.i);
            }
            throw new IllegalArgumentException(a.h(i, "Unknown focus type: "));
        }
        int i2 = this.a.j;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.kxx
    public final void c(int i, kxu kxuVar, String str, Bundle bundle) {
        this.a.t(i, kxuVar, str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0187, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0659, code lost:
    
        if (r10 != 16) goto L431;
     */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0721 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0770  */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [boolean] */
    @Override // defpackage.kxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(int r19, int r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 2068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izw.d(int, int, android.os.Bundle):boolean");
    }
}
