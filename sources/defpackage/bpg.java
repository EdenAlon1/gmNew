package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpg extends axv {
    public final bpl a;
    public boc b;
    bgc c;
    private final bpi d;
    private boc e;
    private bnr f;
    private bnr g;
    private bgd h;

    public bpg(bct bctVar, Set set, bhl bhlVar) {
        super(m(set));
        this.d = m(set);
        this.a = new bpl(bctVar, set, bhlVar, new bpf(this));
    }

    public static List b(axv axvVar) {
        ArrayList arrayList = new ArrayList();
        if (!(axvVar instanceof bpg)) {
            arrayList.add(axvVar.k.k());
            return arrayList;
        }
        Iterator it = ((bpg) axvVar).c().iterator();
        while (it.hasNext()) {
            arrayList.add(((axv) it.next()).k.k());
        }
        return arrayList;
    }

    private static bpi m(Set set) {
        bfh bfhVar = new bph(bfh.a()).a;
        bfhVar.c(beq.C, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            axv axvVar = (axv) it.next();
            if (axvVar.k.s(bhh.x)) {
                arrayList.add(axvVar.k.k());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        bfhVar.c(bpi.a, arrayList);
        bfhVar.c(bet.H, 2);
        return new bpi(bfn.f(bfhVar));
    }

    private final void r(final String str, String str2, final bhh bhhVar, final bgr bgrVar, bgr bgrVar2) {
        Matrix matrix = this.n;
        bct F = F();
        F.getClass();
        boolean H = F.H();
        Size c = bgrVar.c();
        Rect rect = this.m;
        boolean z = false;
        if (rect == null) {
            rect = new Rect(0, 0, c.getWidth(), c.getHeight());
        }
        bct F2 = F();
        F2.getClass();
        int A = A(F2);
        bct F3 = F();
        F3.getClass();
        bnr bnrVar = new bnr(3, 34, bgrVar, matrix, H, rect, A, -1, T(F3));
        this.f = bnrVar;
        bct F4 = F();
        F4.getClass();
        atd atdVar = this.o;
        if (atdVar != null) {
            this.e = new boc(F4, new bof(atdVar));
            ksw.h(this.o);
            bct F5 = F();
            ksw.h(F5);
            int A2 = A(F5);
            ksw.h(this.o);
            Rect f = bix.f(bnrVar.g.c());
            int i = bnrVar.f;
            int i2 = bnrVar.a;
            Size h = bix.h(f, A2);
            ksw.h(this.o);
            bct F6 = F();
            ksw.h(F6);
            if (F6.I() && F6.H()) {
                z = true;
            }
            bou k = bou.k(i, i2, f, h, A2, z, true);
            bnrVar = (bnr) this.e.a(new bmd(bnrVar, Collections.singletonList(k))).get(k);
            bnrVar.getClass();
        }
        this.g = bnrVar;
        bnr bnrVar2 = this.f;
        bgc a = bgc.a(bhhVar, bgrVar.c());
        Iterator it = c().iterator();
        int i3 = -1;
        while (it.hasNext()) {
            i3 = bgk.a(i3, ((axv) it.next()).k.j().b());
        }
        if (i3 != -1) {
            a.t(i3);
        }
        Size c2 = bgrVar.c();
        Iterator it2 = c().iterator();
        while (it2.hasNext()) {
            bgk b = bgc.a(((axv) it2.next()).k, c2).b();
            a.d(b.e());
            for (bbt bbtVar : b.e) {
                a.b.d(bbtVar);
                if (!a.e.contains(bbtVar)) {
                    a.e.add(bbtVar);
                }
            }
            a.e(b.d);
            a.c(b.c);
            a.h(b.c());
        }
        a.n(bnrVar2.c(), bgrVar.d(), -1);
        a.k(this.a.g);
        if (bgrVar.e() != null) {
            a.h(bgrVar.e());
        }
        J(a, bgrVar);
        this.c = a;
        bgd bgdVar = this.h;
        if (bgdVar != null) {
            bgdVar.b();
        }
        final String str3 = null;
        final bgr bgrVar3 = null;
        bgd bgdVar2 = new bgd(new bge(str, str3, bhhVar, bgrVar, bgrVar3) { // from class: bpe
            public final /* synthetic */ String b;
            public final /* synthetic */ bhh d;
            public final /* synthetic */ bgr e;
            public final /* synthetic */ String c = null;
            public final /* synthetic */ bgr f = null;

            {
                this.d = bhhVar;
                this.e = bgrVar;
            }

            @Override // defpackage.bge
            public final void a(bgk bgkVar) {
                bpg bpgVar = bpg.this;
                if (bpgVar.F() == null) {
                    return;
                }
                bgr bgrVar4 = this.e;
                bhh bhhVar2 = this.d;
                String str4 = this.b;
                bpgVar.h();
                bpgVar.Q(bpgVar.a(str4, null, bhhVar2, bgrVar4, null));
                bpgVar.L();
                bpl bplVar = bpgVar.a;
                biw.b();
                Iterator it3 = bplVar.a.iterator();
                while (it3.hasNext()) {
                    bplVar.w((axv) it3.next());
                }
            }
        });
        this.h = bgdVar2;
        a.f = bgdVar2;
    }

    @Override // defpackage.axv
    public final void N() {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((axv) it.next()).N();
        }
    }

    public final List a(String str, String str2, bhh bhhVar, bgr bgrVar, bgr bgrVar2) {
        boolean z;
        biw.b();
        r(str, null, bhhVar, bgrVar, null);
        bct F = F();
        F.getClass();
        this.b = new boc(F, bmu.a(bgrVar.d()));
        Rect rect = this.m;
        bnr bnrVar = this.g;
        int C = C();
        HashMap hashMap = new HashMap();
        bpl bplVar = this.a;
        Iterator it = bplVar.a.iterator();
        while (true) {
            z = rect != null;
            if (!it.hasNext()) {
                break;
            }
            axv axvVar = (axv) it.next();
            bpc bpcVar = bplVar.j;
            bct bctVar = bplVar.f;
            int c = ((bbb) bctVar).a.c(C);
            RectF rectF = bix.a;
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            bnrVar.b.mapVectors(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = f * f3;
            float f6 = f2 * f4;
            float f7 = f * f4;
            float f8 = f2 * f3;
            double sqrt = Math.sqrt((f * f) + (f2 * f2)) * Math.sqrt((f3 * f3) + (f4 * f4));
            Rect rect2 = rect;
            float degrees = (float) Math.toDegrees(Math.atan2((f7 - f8) / sqrt, (f5 + f6) / sqrt));
            bhh bhhVar2 = (bhh) bplVar.i.get(axvVar);
            bhhVar2.getClass();
            bpa d = bpcVar.d(bhhVar2, bnrVar.d, bix.a(bnrVar.b), z);
            Rect rect3 = d.a;
            Size size = d.b;
            int c2 = ((bbb) bplVar.f).a.c(((bet) axvVar.k).B(0));
            bpj bpjVar = (bpj) bplVar.c.get(axvVar);
            bpjVar.getClass();
            bpjVar.a.a = c2;
            int i = (bnrVar.i + c2) - c;
            int i2 = axvVar instanceof awl ? 1 : axvVar instanceof avk ? 4 : 2;
            boolean z2 = degrees > 0.0f;
            boolean z3 = axvVar instanceof avk;
            int b = bix.b(i);
            hashMap.put(axvVar, bou.j(i2, true != z3 ? 34 : 256, rect3, bix.k(size, b), b, axvVar.T(bctVar) ^ z2));
            rect = rect2;
        }
        bob a = this.b.a(new bmd(this.g, new ArrayList(hashMap.values())));
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            hashMap2.put((axv) entry.getKey(), (bnr) a.get(entry.getValue()));
        }
        bpl bplVar2 = this.a;
        bnr bnrVar2 = this.g;
        HashMap hashMap3 = new HashMap();
        for (axv axvVar2 : bplVar2.a) {
            bpc bpcVar2 = bplVar2.j;
            bhh bhhVar3 = (bhh) bplVar2.i.get(axvVar2);
            bhhVar3.getClass();
            hashMap3.put(axvVar2, bpcVar2.d(bhhVar3, bnrVar2.d, bix.a(bnrVar2.b), z).c);
        }
        bpl bplVar3 = this.a;
        bplVar3.b.clear();
        bplVar3.b.putAll(hashMap2);
        for (Map.Entry entry2 : bplVar3.b.entrySet()) {
            axv axvVar3 = (axv) entry2.getKey();
            bnr bnrVar3 = (bnr) entry2.getValue();
            axvVar3.l(bnrVar3.d);
            axvVar3.k(bnrVar3.b);
            bgq f9 = bnrVar3.g.f();
            Size size2 = (Size) hashMap3.get(axvVar3);
            if (size2 != null) {
                f9.c(size2);
            }
            axvVar3.R(f9.a(), null);
            axvVar3.M();
        }
        return bpd.a(new Object[]{this.c.b()});
    }

    @Override // defpackage.axv
    public final Set af() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.axv
    public final void ag() {
        bpl bplVar = this.a;
        for (axv axvVar : bplVar.a) {
            bpj bpjVar = (bpj) bplVar.c.get(axvVar);
            bpjVar.getClass();
            axvVar.V(bpjVar, null, axvVar.f(true, bplVar.e));
        }
    }

    @Override // defpackage.axv
    public final void ah() {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((axv) it.next()).ah();
        }
    }

    public final Set c() {
        return this.a.a;
    }

    @Override // defpackage.axv
    public final bgr d(bdp bdpVar) {
        this.c.h(bdpVar);
        Q(bpd.a(new Object[]{this.c.b()}));
        bgq f = this.l.f();
        ((bbp) f).b = bdpVar;
        return f.a();
    }

    @Override // defpackage.axv
    public final bhg e(bdp bdpVar) {
        return new bph(bfh.b(bdpVar));
    }

    @Override // defpackage.axv
    public final bhh f(boolean z, bhl bhlVar) {
        bdp a = bhlVar.a(bhe.f(this.d), 1);
        if (z) {
            a = bdm.a(a, this.d.b);
        }
        if (a == null) {
            return null;
        }
        return e(a).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    @Override // defpackage.axv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.bhh g(defpackage.bcq r14, defpackage.bhg r15) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpg.g(bcq, bhg):bhh");
    }

    public final void h() {
        bgd bgdVar = this.h;
        if (bgdVar != null) {
            bgdVar.b();
            this.h = null;
        }
        bnr bnrVar = this.f;
        if (bnrVar != null) {
            bnrVar.g();
            this.f = null;
        }
        bnr bnrVar2 = this.g;
        if (bnrVar2 != null) {
            bnrVar2.g();
            this.g = null;
        }
        boc bocVar = this.b;
        if (bocVar != null) {
            bocVar.c();
            this.b = null;
        }
        boc bocVar2 = this.e;
        if (bocVar2 != null) {
            bocVar2.c();
            this.e = null;
        }
    }

    @Override // defpackage.axv
    public final void j() {
        h();
        bpl bplVar = this.a;
        for (axv axvVar : bplVar.a) {
            bpj bpjVar = (bpj) bplVar.c.get(axvVar);
            bpjVar.getClass();
            axvVar.P(bpjVar);
        }
    }

    @Override // defpackage.axv
    protected final void p(bgr bgrVar, bgr bgrVar2) {
        String H = H();
        W();
        Q(a(H, null, this.k, bgrVar, null));
        K();
    }

    @Override // defpackage.axv
    public final void q() {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((axv) it.next()).q();
        }
    }
}
