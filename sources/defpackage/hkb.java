package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hkb extends htn implements hso, hho, hkx {
    private hka a;

    public hkb(long j) {
        hrw b = hsj.b();
        hka hkaVar = new hka(b.v(), j);
        if (!(b instanceof hrp)) {
            hkaVar.h = new hka(1L, j);
        }
        this.a = hkaVar;
    }

    @Override // defpackage.hho, defpackage.hkx
    public final /* bridge */ /* synthetic */ Object a() {
        return Long.valueOf(c());
    }

    @Override // defpackage.hho
    public final /* synthetic */ void b(Object obj) {
        h(((Number) obj).longValue());
    }

    public final long c() {
        return ((hka) hsj.j(this.a, this)).a;
    }

    @Override // defpackage.htm
    public final hto d() {
        return this.a;
    }

    @Override // defpackage.htm
    public final void e(hto htoVar) {
        htoVar.getClass();
        this.a = (hka) htoVar;
    }

    @Override // defpackage.hso
    public final hke f() {
        return hla.a;
    }

    @Override // defpackage.htn, defpackage.htm
    public final hto g(hto htoVar, hto htoVar2, hto htoVar3) {
        if (((hka) htoVar2).a == ((hka) htoVar3).a) {
            return htoVar2;
        }
        return null;
    }

    public final void h(long j) {
        hrw b;
        hka hkaVar = (hka) hsj.e(this.a);
        if (hkaVar.a != j) {
            hka hkaVar2 = this.a;
            synchronized (hsj.c) {
                b = hsj.b();
                ((hka) hsj.i(hkaVar2, this, b, hkaVar)).a = j;
            }
            hsj.t(b, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((hka) hsj.e(this.a)).a + ")@" + hashCode();
    }
}
