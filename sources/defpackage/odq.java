package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class odq extends oiv implements oiy, ofg {
    private final okl g;
    private final Object h;
    private int i;
    private int j;
    private int k;
    private int l;
    private final ofk m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odq(okl oklVar, ffsk ffskVar, ffsd ffsdVar, ffsd ffsdVar2, oin oinVar, oki okiVar, Object obj) {
        super(oklVar, ffskVar, ffsdVar, new oiz(), oinVar);
        okiVar.getClass();
        this.g = oklVar;
        this.h = obj;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.l = Integer.MIN_VALUE;
        oiz oizVar = this.c;
        oizVar.getClass();
        this.m = new ofk(ffskVar, oinVar, oklVar, ffsdVar, ffsdVar2, this, oizVar);
        oiz oizVar2 = this.c;
        int i = okiVar.e;
        int i2 = i != Integer.MIN_VALUE ? i : 0;
        int i3 = okiVar.f;
        int i4 = i3 != Integer.MIN_VALUE ? i3 : 0;
        boolean z = (i == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE) ? false : true;
        oizVar2.b = i2;
        oizVar2.a.clear();
        oizVar2.a.add(okiVar);
        oizVar2.c = i4;
        oizVar2.d = 0;
        oizVar2.f = okiVar.b.size();
        oizVar2.e = z;
        oizVar2.g = okiVar.b.size() / 2;
        e(oizVar2.f());
    }

    @Override // defpackage.oiv
    public final okl a() {
        return this.g;
    }

    @Override // defpackage.oiv
    public final Object b() {
        Object b;
        oin oinVar = this.d;
        oinVar.getClass();
        oiz oizVar = this.c;
        okm okmVar = oizVar.a.isEmpty() ? null : new okm(ffdx.ak(oizVar.a), Integer.valueOf(oizVar.b()), new ojd(oinVar.a, oinVar.b, true, oinVar.c, Alert.DURATION_SHOW_INDEFINITELY, 0, 32), oizVar.b);
        return (okmVar == null || (b = this.g.b(okmVar)) == null) ? this.h : b;
    }

    @Override // defpackage.oiv
    public final void c(ffjm ffjmVar) {
        oio oioVar = this.m.d;
        ffjmVar.a(ofz.a, oioVar.b);
        ffjmVar.a(ofz.b, oioVar.c);
        ffjmVar.a(ofz.c, oioVar.d);
    }

    @Override // defpackage.oiv
    public final void d(int i) {
        oiz oizVar = this.c;
        int i2 = this.d.b;
        int i3 = oizVar.b;
        int i4 = i2 - (i - i3);
        int i5 = i3 + oizVar.f;
        int i6 = i2 + i;
        int max = Math.max(i4, this.i);
        this.i = max;
        if (max > 0) {
            ofk ofkVar = this.m;
            ofx ofxVar = ofkVar.d.c;
            if ((ofxVar instanceof ofw) && !ofxVar.c) {
                ofkVar.d();
            }
        }
        int max2 = Math.max((i6 + 1) - i5, this.j);
        this.j = max2;
        if (max2 > 0) {
            ofk ofkVar2 = this.m;
            ofx ofxVar2 = ofkVar2.d.d;
            if ((ofxVar2 instanceof ofw) && !ofxVar2.c) {
                ofkVar2.c();
            }
        }
        this.k = Math.min(this.k, i);
        this.l = Math.max(this.l, i);
    }

    @Override // defpackage.oiy
    public final void e(int i) {
        s(0, i);
        oiz oizVar = this.c;
        if (oizVar.b <= 0) {
            int i2 = oizVar.c;
        }
    }

    @Override // defpackage.oiy
    public final void f(int i, int i2, int i3) {
        r(i, i2);
        s(i + i2, i3);
    }

    @Override // defpackage.oiy
    public final void g(int i, int i2, int i3) {
        r(i, i2);
        s(0, i3);
        this.k += i3;
        this.l += i3;
    }

    @Override // defpackage.ofg
    public final void h(ofz ofzVar, ofx ofxVar) {
        ffqy.d(this.a, this.b, null, new ois(this, ofzVar, ofxVar, null), 2);
    }

    @Override // defpackage.oiv
    public final void i(ofz ofzVar, ofx ofxVar) {
        ofzVar.getClass();
        this.m.d.b(ofzVar, ofxVar);
    }

    @Override // defpackage.oiv
    public final boolean j() {
        return this.m.e();
    }

    @Override // defpackage.ofg
    public final boolean k(ofz ofzVar, oki okiVar) {
        ofzVar.getClass();
        okiVar.getClass();
        m();
        oiz oizVar = this.c;
        int i = oizVar.b;
        int i2 = oizVar.f;
        List list = okiVar.b;
        if (ofzVar == ofz.c) {
            int size = list.size();
            if (size != 0) {
                oizVar.a.add(okiVar);
                oizVar.f += size;
                int min = Math.min(oizVar.c, size);
                int i3 = size - min;
                if (min != 0) {
                    oizVar.c -= min;
                } else {
                    min = 0;
                }
                f((oizVar.b + oizVar.f) - size, min, i3);
            }
            int size2 = this.j - list.size();
            this.j = size2;
            return size2 > 0 && !list.isEmpty();
        }
        if (ofzVar != ofz.b) {
            Objects.toString(ofzVar);
            throw new IllegalArgumentException("unexpected result type ".concat(ofzVar.toString()));
        }
        int size3 = list.size();
        if (size3 != 0) {
            oizVar.a.add(0, okiVar);
            oizVar.f += size3;
            int min2 = Math.min(oizVar.b, size3);
            int i4 = size3 - min2;
            if (min2 != 0) {
                oizVar.b -= min2;
            } else {
                min2 = 0;
            }
            oizVar.d -= i4;
            g(oizVar.b, min2, i4);
        }
        int size4 = this.i - list.size();
        this.i = size4;
        return size4 > 0 && !list.isEmpty();
    }
}
