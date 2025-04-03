package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkm implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        exzj exzjVar = (exzj) obj;
        ewam ewamVar = (ewam) ewan.a.createBuilder();
        ewamVar.a(exzjVar.c);
        if ((exzjVar.b & 1) != 0) {
            emwd emwdVar = dvmn.a;
            exzh b = exzh.b(exzjVar.d);
            if (b == null) {
                b = exzh.ACTION_UNSPECIFIED;
            }
            ewal ewalVar = (ewal) emwdVar.fP(b);
            ewamVar.copyOnWrite();
            ewan ewanVar = (ewan) ewamVar.instance;
            ewanVar.d = ewalVar.e;
            ewanVar.b |= 1;
        }
        return (ewan) ewamVar.build();
    }
}
