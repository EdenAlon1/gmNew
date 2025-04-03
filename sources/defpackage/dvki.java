package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dvki implements emwl {
    public abstract void a(eybm eybmVar, evzx evzxVar);

    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eybm eybmVar = (eybm) obj;
        evzx evzxVar = (evzx) ewab.a.createBuilder();
        d(eybmVar, evzxVar);
        e(eybmVar, evzxVar);
        j(eybmVar, evzxVar);
        b(eybmVar, evzxVar);
        i(eybmVar, evzxVar);
        f(eybmVar, evzxVar);
        c(eybmVar, evzxVar);
        g(eybmVar, evzxVar);
        a(eybmVar, evzxVar);
        if ((eybmVar.b & 2) != 0) {
            emwd emwdVar = dvmh.b;
            eybl b = eybl.b(eybmVar.d);
            if (b == null) {
                b = eybl.PLACEMENT_UNSPECIFIED;
            }
            evzz evzzVar = (evzz) emwdVar.fP(b);
            evzxVar.copyOnWrite();
            ewab ewabVar = (ewab) evzxVar.instance;
            ewabVar.k = evzzVar.d;
            ewabVar.b |= 32;
        }
        h(eybmVar, evzxVar);
        return (ewab) evzxVar.build();
    }

    public abstract void b(eybm eybmVar, evzx evzxVar);

    public abstract void c(eybm eybmVar, evzx evzxVar);

    public abstract void d(eybm eybmVar, evzx evzxVar);

    public abstract void e(eybm eybmVar, evzx evzxVar);

    public abstract void f(eybm eybmVar, evzx evzxVar);

    public abstract void g(eybm eybmVar, evzx evzxVar);

    public abstract void h(eybm eybmVar, evzx evzxVar);

    public abstract void i(eybm eybmVar, evzx evzxVar);

    public abstract void j(eybm eybmVar, evzx evzxVar);
}
