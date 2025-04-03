package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hjx extends htn implements hso, hho, hkx {
    private hjw a;

    public hjx(float f) {
        hrw b = hsj.b();
        hjw hjwVar = new hjw(b.v(), f);
        if (!(b instanceof hrp)) {
            hjwVar.h = new hjw(1L, f);
        }
        this.a = hjwVar;
    }

    @Override // defpackage.hho
    public final /* synthetic */ void b(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final float c() {
        return ((hjw) hsj.j(this.a, this)).a;
    }

    @Override // defpackage.htm
    public final hto d() {
        return this.a;
    }

    @Override // defpackage.htm
    public final void e(hto htoVar) {
        htoVar.getClass();
        this.a = (hjw) htoVar;
    }

    @Override // defpackage.hso
    public final hke f() {
        return hla.a;
    }

    @Override // defpackage.htn, defpackage.htm
    public final hto g(hto htoVar, hto htoVar2, hto htoVar3) {
        if (((hjw) htoVar2).a == ((hjw) htoVar3).a) {
            return htoVar2;
        }
        return null;
    }

    @Override // defpackage.hho, defpackage.hkx
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ Float a() {
        return Float.valueOf(c());
    }

    public final void i(float f) {
        hrw b;
        hjw hjwVar = (hjw) hsj.e(this.a);
        if (hjwVar.a == f) {
            return;
        }
        hjw hjwVar2 = this.a;
        synchronized (hsj.c) {
            b = hsj.b();
            ((hjw) hsj.i(hjwVar2, this, b, hjwVar)).a = f;
        }
        hsj.t(b, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((hjw) hsj.e(this.a)).a + ")@" + hashCode();
    }
}
