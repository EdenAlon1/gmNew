package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucc implements bcvn {
    final /* synthetic */ ucd a;

    public ucc(ucd ucdVar) {
        this.a = ucdVar;
    }

    @Override // defpackage.bcvn
    public final int a() {
        ucd ucdVar = this.a;
        return ucdVar.s(ucdVar.I.t());
    }

    @Override // defpackage.bcvn
    public final boolean fu() {
        ucj ucjVar = this.a.N;
        tys tysVar = ucjVar.d;
        if (tysVar == null) {
            return false;
        }
        if (tysVar.A() || ucjVar.b()) {
            return true;
        }
        eoxn a = aqgi.a(((typ) ucjVar.d).m);
        return aqgi.g(a) && ucjVar.h && ucjVar.f;
    }
}
