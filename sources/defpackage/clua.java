package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clua implements cltt {
    private final avkh a;
    private final cllo b;
    private final cllp c;
    private final clpt d;

    public clua(avkh avkhVar, cllo clloVar, cllp cllpVar, clpt clptVar) {
        this.a = avkhVar;
        this.b = clloVar;
        this.c = cllpVar;
        this.d = clptVar;
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ awud a(Object obj) {
        clqc clqcVar = ((clrn) obj).d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        return clkk.a(clqcVar);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl b(Object obj) {
        return this.a.g((awyt) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        clpt clptVar = this.d;
        return elfl.g(ffat.a(clptVar.a.a(clpw.d(), clptVar.b), (clrr) obj));
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        clns clnsVar = ((clrn) obj).e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        int a = clnr.a(clnsVar.c);
        if (a == 0 || a != 3) {
            return Optional.empty();
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        return Optional.of(clqsVar.c);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        return this.c.apply((clrn) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((awyr) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        awys awysVar = (awys) awyt.a.createBuilder();
        eyee eyeeVar = ((awyr) obj).f;
        awysVar.copyOnWrite();
        awyt awytVar = (awyt) awysVar.instance;
        eyeeVar.getClass();
        awytVar.b |= 2;
        awytVar.d = eyeeVar;
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.PENDING;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awysVar.copyOnWrite();
        awyt awytVar2 = (awyt) awysVar.instance;
        awud awudVar2 = (awud) awtyVar.build();
        awudVar2.getClass();
        awytVar2.c = awudVar2;
        awytVar2.b |= 1;
        return (awyt) awysVar.build();
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        return "RcsMessageId: ".concat(String.valueOf(((awyr) obj).d));
    }

    @Override // defpackage.cltt
    public final String i() {
        return "revokeMessage";
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        awys awysVar = (awys) awyt.a.createBuilder();
        eyee eyeeVar = ((awyr) obj).f;
        awysVar.copyOnWrite();
        awyt awytVar = (awyt) awysVar.instance;
        eyeeVar.getClass();
        awytVar.b |= 2;
        awytVar.d = eyeeVar;
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.FAILED_PERMANENTLY;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awua awuaVar = awua.TRANSPORT_INTERNAL_ERROR;
        awtyVar.copyOnWrite();
        awud awudVar2 = (awud) awtyVar.instance;
        awudVar2.d = awuaVar.v;
        awudVar2.b |= 2;
        awysVar.copyOnWrite();
        awyt awytVar2 = (awyt) awysVar.instance;
        awud awudVar3 = (awud) awtyVar.build();
        awudVar3.getClass();
        awytVar2.c = awudVar3;
        awytVar2.b |= 1;
        return (awyt) awysVar.build();
    }
}
