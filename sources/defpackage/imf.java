package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imf extends hvh implements ilx, ild, jzn {
    public Object a;
    public Object b;
    public Object[] c;
    public ffjm d;
    public PointerInputEventHandler e;
    public iki f;
    public final hne g;
    public final Object h;
    public long i;
    private ffud j;
    private final hne k;
    private iki l;

    public imf(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
        this.e = pointerInputEventHandler;
        this.f = ilv.a;
        hne hneVar = new hne(new imc[16]);
        this.g = hneVar;
        this.h = hneVar;
        this.k = new hne(new imc[16]);
        this.i = 0L;
    }

    private final void r(iki ikiVar, ikk ikkVar) {
        synchronized (this.h) {
            hne hneVar = this.k;
            hneVar.o(hneVar.b, this.g);
        }
        try {
            int ordinal = ikkVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    hne hneVar2 = this.k;
                    int i = hneVar2.b - 1;
                    Object[] objArr = hneVar2.a;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            ((imc) objArr[i]).v(ikiVar, ikkVar);
                            i--;
                        }
                    }
                } else if (ordinal != 2) {
                }
            }
            hne hneVar3 = this.k;
            Object[] objArr2 = hneVar3.a;
            int i2 = hneVar3.b;
            for (int i3 = 0; i3 < i2; i3++) {
                ((imc) objArr2[i3]).v(ikiVar, ikkVar);
            }
        } finally {
            this.k.g();
        }
    }

    @Override // defpackage.ixl
    public final /* synthetic */ long a() {
        return ixt.a;
    }

    @Override // defpackage.ild
    public final jgi b() {
        return isx.d(this).u;
    }

    @Override // defpackage.hvh
    public final void dL() {
        q();
    }

    @Override // defpackage.ixl
    public final void dU() {
        iki ikiVar = this.l;
        if (ikiVar == null) {
            return;
        }
        List list = ikiVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((iku) list.get(i)).d) {
                List list2 = ikiVar.a;
                ArrayList arrayList = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    iku ikuVar = (iku) list2.get(i2);
                    long j = ikuVar.a;
                    long j2 = ikuVar.c;
                    long j3 = ikuVar.b;
                    float f = ikuVar.e;
                    boolean z = ikuVar.d;
                    arrayList.add(new iku(j, j3, j2, false, f, j3, j2, z, z, ikuVar.i, 0L));
                }
                iki ikiVar2 = new iki(arrayList);
                this.f = ikiVar2;
                r(ikiVar2, ikk.a);
                r(ikiVar2, ikk.b);
                r(ikiVar2, ikk.c);
                this.l = null;
                return;
            }
        }
    }

    @Override // defpackage.ixl
    public final void dV(iki ikiVar, ikk ikkVar, long j) {
        this.i = j;
        if (ikkVar == ikk.a) {
            this.f = ikiVar;
        }
        if (this.j == null) {
            this.j = ffqy.d(D(), null, ffsm.d, new ime(this, null), 1);
        }
        r(ikiVar, ikkVar);
        List list = ikiVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ikiVar = null;
                break;
            } else if (!ikj.f((iku) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.l = ikiVar;
    }

    @Override // defpackage.ixl
    public final void dW() {
        q();
    }

    @Override // defpackage.jzn
    public final float ec() {
        return isx.d(this).s.ec();
    }

    @Override // defpackage.jzx
    public final float ed() {
        return isx.d(this).s.ed();
    }

    @Override // defpackage.jzx
    public final /* synthetic */ float ef(long j) {
        return jzw.a(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float eg(float f) {
        return jzm.a(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float ek(int i) {
        return jzm.b(this, i);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float el(long j) {
        return jzm.c(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float em(float f) {
        return jzm.d(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int en(long j) {
        return jzm.e(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int eo(float f) {
        return jzm.f(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long ep(long j) {
        return jzm.g(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long eq(long j) {
        return jzm.h(this, j);
    }

    @Override // defpackage.jzx
    public final /* synthetic */ long er(float f) {
        return jzw.b(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long es(float f) {
        return jzm.i(this, f);
    }

    @Override // defpackage.ild
    public final Object p(ffjm ffjmVar, ffgu ffguVar) {
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        imc imcVar = new imc(this, ffrhVar);
        synchronized (this.h) {
            this.g.n(imcVar);
            new ffhg(ffhi.c(ffhi.b(ffjmVar, imcVar, imcVar)), ffhh.a).w(ffcu.a);
        }
        ffrhVar.d(new imd(imcVar));
        return ffrhVar.m();
    }

    @Override // defpackage.ilx
    public final void q() {
        ffud ffudVar = this.j;
        if (ffudVar != null) {
            ffudVar.t(new ilc());
            this.j = null;
        }
    }

    @Override // defpackage.hvh
    public final void t() {
        q();
    }

    @Override // defpackage.ixl
    public final /* synthetic */ boolean w() {
        return false;
    }

    @ffbs
    public imf(ffjm ffjmVar) {
        this(null, null, null, ily.a);
        this.d = ffjmVar;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void y() {
    }
}
