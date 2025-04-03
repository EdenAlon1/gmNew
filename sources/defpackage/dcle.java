package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcle {
    public static final dcle a = new dcld();

    public static dcle b(epts eptsVar, eptu eptuVar) {
        eptq eptqVar = (eptq) eptv.a.createBuilder();
        eptqVar.copyOnWrite();
        eptv eptvVar = (eptv) eptqVar.instance;
        eptvVar.c = eptsVar.v;
        eptvVar.b |= 1;
        eptqVar.copyOnWrite();
        eptv eptvVar2 = (eptv) eptqVar.instance;
        eptvVar2.d = eptuVar.e;
        eptvVar2.b |= 2;
        eptv eptvVar3 = (eptv) eptqVar.build();
        int i = dclf.b;
        return new dclg(eptvVar3);
    }

    public abstract void a(eppq eppqVar);
}
