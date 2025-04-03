package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hjz extends htn implements hso, hho, hkx {
    private hjy a;

    public hjz(int i) {
        hrw b = hsj.b();
        hjy hjyVar = new hjy(b.v(), i);
        if (!(b instanceof hrp)) {
            hjyVar.h = new hjy(1L, i);
        }
        this.a = hjyVar;
    }

    @Override // defpackage.hho
    public final /* synthetic */ void b(Object obj) {
        i(((Number) obj).intValue());
    }

    public final int c() {
        return ((hjy) hsj.j(this.a, this)).a;
    }

    @Override // defpackage.htm
    public final hto d() {
        return this.a;
    }

    @Override // defpackage.htm
    public final void e(hto htoVar) {
        htoVar.getClass();
        this.a = (hjy) htoVar;
    }

    @Override // defpackage.hso
    public final hke f() {
        return hla.a;
    }

    @Override // defpackage.htn, defpackage.htm
    public final hto g(hto htoVar, hto htoVar2, hto htoVar3) {
        if (((hjy) htoVar2).a == ((hjy) htoVar3).a) {
            return htoVar2;
        }
        return null;
    }

    @Override // defpackage.hho, defpackage.hkx
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ Integer a() {
        return Integer.valueOf(c());
    }

    public final void i(int i) {
        hrw b;
        hjy hjyVar = (hjy) hsj.e(this.a);
        if (hjyVar.a != i) {
            hjy hjyVar2 = this.a;
            synchronized (hsj.c) {
                b = hsj.b();
                ((hjy) hsj.i(hjyVar2, this, b, hjyVar)).a = i;
            }
            hsj.t(b, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((hjy) hsj.e(this.a)).a + ")@" + hashCode();
    }
}
