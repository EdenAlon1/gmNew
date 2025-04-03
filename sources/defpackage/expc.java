package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class expc extends exoa {
    public abstract exnp a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract String d();

    public abstract boolean e();

    public abstract void f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.exoa
    public final eula g() {
        exph exphVar = (exph) expi.a.createBuilder();
        exog exogVar = (exog) exoh.a.createBuilder();
        exogVar.copyOnWrite();
        exoh exohVar = (exoh) exogVar.instance;
        exohVar.b |= 2;
        exohVar.d = false;
        exogVar.mergeFrom((exog) h(a()));
        exoh exohVar2 = (exoh) exogVar.build();
        exphVar.copyOnWrite();
        expi expiVar = (expi) exphVar.instance;
        exohVar2.getClass();
        expiVar.d = exohVar2;
        expiVar.c |= 1;
        String d = d();
        exphVar.copyOnWrite();
        expi expiVar2 = (expi) exphVar.instance;
        expiVar2.c |= 2;
        expiVar2.e = d;
        expj expjVar = (expj) expk.a.createBuilder();
        exphVar.copyOnWrite();
        expi expiVar3 = (expi) exphVar.instance;
        expk expkVar = (expk) expjVar.build();
        expkVar.getClass();
        expiVar3.f = expkVar;
        expiVar3.c |= 4;
        eukz eukzVar = (eukz) eula.a.createBuilder();
        eukzVar.e(expi.b, (expi) exphVar.build());
        return (eula) eukzVar.build();
    }

    public abstract void i();
}
