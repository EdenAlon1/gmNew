package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itn extends iuw {
    public itn(ito itoVar) {
        super(itoVar);
    }

    @Override // defpackage.iuw, defpackage.inx
    public final int a(int i) {
        itq t = L().t();
        ipn a = t.a();
        iui iuiVar = t.a;
        return a.a(iuiVar.z(), iuiVar.E(), i);
    }

    @Override // defpackage.iuw, defpackage.inx
    public final int b(int i) {
        itq t = L().t();
        ipn a = t.a();
        iui iuiVar = t.a;
        return a.b(iuiVar.z(), iuiVar.E(), i);
    }

    @Override // defpackage.iuw, defpackage.inx
    public final int c(int i) {
        itq t = L().t();
        ipn a = t.a();
        iui iuiVar = t.a;
        return a.c(iuiVar.z(), iuiVar.E(), i);
    }

    @Override // defpackage.iuw, defpackage.inx
    public final int d(int i) {
        itq t = L().t();
        ipn a = t.a();
        iui iuiVar = t.a;
        return a.d(iuiVar.z(), iuiVar.E(), i);
    }

    @Override // defpackage.ipl
    public final iqk e(long j) {
        z(j);
        hne s = L().s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            ivd w = ((iui) objArr[i2]).w();
            w.getClass();
            w.w = 3;
        }
        super.C(L().r.e(this, L().E(), j));
        return this;
    }

    @Override // defpackage.iuv
    public final int s(imq imqVar) {
        ivd ivdVar = (ivd) A();
        if (!ivdVar.j) {
            if (ivdVar.E() == 2) {
                isa isaVar = ivdVar.p;
                isaVar.f = true;
                if (isaVar.b) {
                    ivdVar.f.e();
                }
            } else {
                ivdVar.p.g = true;
            }
        }
        iuw iuwVar = ((ito) ivdVar.i()).g;
        if (iuwVar != null) {
            iuwVar.k = true;
        }
        ivdVar.k();
        iuw iuwVar2 = ((ito) ivdVar.i()).g;
        if (iuwVar2 != null) {
            iuwVar2.k = false;
        }
        Integer num = (Integer) ivdVar.p.h.get(imqVar);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.o.c(imqVar, intValue);
        return intValue;
    }

    @Override // defpackage.iuw
    protected final void t() {
        ivd w = L().w();
        w.getClass();
        w.t();
    }
}
