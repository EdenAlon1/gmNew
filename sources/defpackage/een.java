package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class een implements ekn, drd {
    public final /* synthetic */ eey a;
    private final /* synthetic */ drd b;

    public een(drd drdVar, eey eeyVar) {
        this.a = eeyVar;
        this.b = drdVar;
    }

    @Override // defpackage.drd
    public final float a(float f) {
        return this.b.a(f);
    }

    @Override // defpackage.ekn
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.ekn
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.ekn
    public final int d() {
        eei eeiVar = (eei) ffdx.Q(this.a.d().i());
        if (eeiVar != null) {
            return eeiVar.a;
        }
        return 0;
    }

    @Override // defpackage.ekn
    public final void e(int i, int i2) {
        this.a.o(i, i2);
    }

    @Override // defpackage.ekn
    public final int f(int i) {
        Object obj;
        eea d = this.a.d();
        if (d.i().isEmpty()) {
            return 0;
        }
        int b = b();
        if (i > d() || b > i) {
            return (eeb.a(d) * (i - b())) - c();
        }
        List i2 = d.i();
        int size = i2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = i2.get(i3);
            if (((eei) obj).a == i) {
                break;
            }
            i3++;
        }
        eei eeiVar = (eei) obj;
        if (eeiVar == null) {
            return 0;
        }
        return eeiVar.g;
    }
}
