package defpackage;

import androidx.compose.foundation.HoverableElement;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyh {
    public final hho a = new hic(null, hla.a);
    public jlm b;
    public final hss c;
    private final jlm d;

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public eyh(jlm jlmVar) {
        jlk a;
        this.d = jlmVar;
        exs exsVar = exs.a;
        jlj jljVar = new jlj(jlmVar);
        List list = jljVar.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a = ((jli) list.get(i)).a(Integer.MIN_VALUE);
            ?? invoke = exsVar.invoke(a);
            ArrayList arrayList2 = new ArrayList(invoke.size());
            int size2 = invoke.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(jlh.a((jlk) invoke.get(i2)));
            }
            ffdx.w(arrayList, arrayList2);
        }
        jljVar.a.clear();
        jljVar.a.addAll(arrayList);
        this.b = jljVar.b();
        this.c = new hss();
    }

    public static final jlk d(jlk jlkVar, jpg jpgVar) {
        int g;
        int f = jpgVar.f() - 1;
        int i = jlkVar.b;
        g = jpgVar.g(f, false);
        if (i < g) {
            return jlk.a(jlkVar, null, Math.min(jlkVar.c, g), 11);
        }
        return null;
    }

    public static final jou e(jou jouVar, jou jouVar2) {
        return jouVar != null ? jouVar.d(jouVar2) : jouVar2;
    }

    public final jpg a() {
        return (jpg) this.a.a();
    }

    public final void b(hfd hfdVar, int i) {
        int i2;
        int i3;
        char c;
        boolean z;
        int i4;
        hvi c2;
        hvi a;
        hvi a2;
        int i5 = i & 6;
        hfd b = hfdVar.b(1154651354);
        char c3 = 2;
        boolean z2 = true;
        if (i5 == 0) {
            i2 = (true != b.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i6 = 0;
        if (b.J((i2 & 3) != 2, i2 & 1)) {
            jci jciVar = (jci) b.e(jdr.m);
            jlm jlmVar = this.b;
            List f = jlmVar.f(jlmVar.a());
            int size = f.size();
            int i7 = 0;
            while (i7 < size) {
                jlk jlkVar = (jlk) f.get(i7);
                if (jlkVar.b != jlkVar.c) {
                    b.v(1386075176);
                    hfm hfmVar = (hfm) b;
                    Object R = hfmVar.R();
                    if (R == hfc.a) {
                        R = new dwn();
                        hfmVar.ad(R);
                    }
                    dwn dwnVar = (dwn) R;
                    c2 = jjs.c(icf.a(hvi.e, new eyb(this, jlkVar)), false, ext.a);
                    c = c3;
                    a = c2.a(new eym(new exr(this, jlkVar))).a(new HoverableElement(dwnVar));
                    int i8 = ikq.b;
                    a2 = a.a(new PointerHoverIconModifierElement(ikp.c));
                    boolean F = b.F(this) | b.D(jlkVar) | b.F(jciVar);
                    Object R2 = hfmVar.R();
                    if (F || R2 == hfc.a) {
                        R2 = new exu(jlkVar, jciVar);
                        hfmVar.ad(R2);
                    }
                    dyc.b(dfb.f(a2, dwnVar, null, false, null, null, null, (ffix) R2, 508), b, i6);
                    if (eyi.a(((jlw) jlkVar.a).a())) {
                        i3 = i2;
                        z = z2;
                        i4 = i6;
                        b.v(1388926990);
                        hfmVar.Z();
                    } else {
                        b.v(1386898319);
                        Object R3 = hfmVar.R();
                        if (R3 == hfc.a) {
                            R3 = new evc(dwnVar);
                            hfmVar.ad(R3);
                        }
                        evc evcVar = (evc) R3;
                        ffcu ffcuVar = ffcu.a;
                        Object R4 = hfmVar.R();
                        z = z2;
                        if (R4 == hfc.a) {
                            R4 = new exv(evcVar, null);
                            hfmVar.ad(R4);
                        }
                        hgs.g(ffcuVar, (ffjm) R4, b);
                        Object valueOf = Boolean.valueOf(evcVar.b());
                        Object valueOf2 = Boolean.valueOf(evcVar.a());
                        Object valueOf3 = Boolean.valueOf(evcVar.c());
                        jph a3 = ((jlw) jlkVar.a).a();
                        Object obj = a3 != null ? a3.a : null;
                        i4 = i6;
                        jph a4 = ((jlw) jlkVar.a).a();
                        Object obj2 = a4 != null ? a4.b : null;
                        i3 = i2;
                        jph a5 = ((jlw) jlkVar.a).a();
                        Object obj3 = a5 != null ? a5.c : null;
                        jph a6 = ((jlw) jlkVar.a).a();
                        Object obj4 = a6 != null ? a6.d : null;
                        Object[] objArr = new Object[7];
                        objArr[i4] = valueOf;
                        objArr[z ? 1 : 0] = valueOf2;
                        objArr[c] = valueOf3;
                        objArr[3] = obj;
                        objArr[4] = obj2;
                        objArr[5] = obj3;
                        objArr[6] = obj4;
                        boolean F2 = b.F(this) | b.D(jlkVar);
                        Object R5 = hfmVar.R();
                        if (F2 || R5 == hfc.a) {
                            R5 = new exw(jlkVar, evcVar);
                            hfmVar.ad(R5);
                        }
                        c(objArr, (ffji) R5, b, (i3 << 6) & 896);
                        hfmVar.Z();
                    }
                    hfmVar.Z();
                } else {
                    i3 = i2;
                    c = c3;
                    z = z2;
                    i4 = i6;
                    b.v(1388940878);
                    ((hfm) b).Z();
                }
                i7++;
                z2 = z;
                i6 = i4;
                i2 = i3;
                c3 = c;
            }
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new exx(this, i);
        }
    }

    public final void c(Object[] objArr, ffji ffjiVar, hfd hfdVar, int i) {
        int i2 = i & 48;
        hfd b = hfdVar.b(-2083052099);
        int i3 = i2 == 0 ? (true != b.F(ffjiVar) ? 16 : 32) | i : i;
        if ((i & 384) == 0) {
            i3 |= true != b.F(this) ? 128 : 256;
        }
        b.u(-416604407, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i3 |= true != b.F(obj) ? 0 : 4;
        }
        hfm hfmVar = (hfm) b;
        hfmVar.Z();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (b.J((i3 & 147) != 146, i3 & 1)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(ffjiVar);
            ffle.a(objArr, arrayList);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean F = b.F(this) | ((i3 & 112) == 32);
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new exz(this, ffjiVar);
                hfmVar.ad(R);
            }
            hgs.d(array, (ffji) R, b);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new eya(this, objArr, ffjiVar, i);
        }
    }
}
