package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hkd<T> extends htn implements hso<T> {
    public final hke a;
    private hkc b;

    public hkd(Object obj, hke hkeVar) {
        this.a = hkeVar;
        hrw b = hsj.b();
        hkc hkcVar = new hkc(b.v(), obj);
        if (!(b instanceof hrp)) {
            hkcVar.h = new hkc(1L, obj);
        }
        this.b = hkcVar;
    }

    @Override // defpackage.hho, defpackage.hkx
    public final Object a() {
        return ((hkc) hsj.j(this.b, this)).a;
    }

    @Override // defpackage.hho
    public final void b(Object obj) {
        hrw b;
        hkc hkcVar = (hkc) hsj.e(this.b);
        if (this.a.a(hkcVar.a, obj)) {
            return;
        }
        hkc hkcVar2 = this.b;
        synchronized (hsj.c) {
            b = hsj.b();
            ((hkc) hsj.i(hkcVar2, this, b, hkcVar)).a = obj;
        }
        hsj.t(b, this);
    }

    @Override // defpackage.htm
    public final hto d() {
        return this.b;
    }

    @Override // defpackage.htm
    public final void e(hto htoVar) {
        htoVar.getClass();
        this.b = (hkc) htoVar;
    }

    @Override // defpackage.hso
    public final hke f() {
        return this.a;
    }

    @Override // defpackage.htn, defpackage.htm
    public final hto g(hto htoVar, hto htoVar2, hto htoVar3) {
        if (this.a.a(((hkc) htoVar2).a, ((hkc) htoVar3).a)) {
            return htoVar2;
        }
        return null;
    }

    public final String toString() {
        return "MutableState(value=" + ((hkc) hsj.e(this.b)).a + ")@" + hashCode();
    }
}
