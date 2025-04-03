package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cltl implements cltt {
    private final avkh a;
    private final clkr b;
    private final clks c;
    private final clpt d;

    public cltl(avkh avkhVar, clkr clkrVar, clks clksVar, clpt clptVar) {
        this.b = clkrVar;
        this.c = clksVar;
        this.d = clptVar;
        this.a = avkhVar;
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ awud a(Object obj) {
        clqc clqcVar = ((clnu) obj).d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        return clkk.a(clqcVar);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl b(Object obj) {
        return this.a.b((awuz) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        clpt clptVar = this.d;
        return elfl.g(ffat.a(clptVar.a.a(clpw.b(), clptVar.b), (clny) obj));
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        clnu clnuVar = (clnu) obj;
        clns clnsVar = clnuVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        int a = clnr.a(clnsVar.c);
        if (a == 0 || a != 3) {
            return Optional.empty();
        }
        clns clnsVar2 = clnuVar.e;
        if (clnsVar2 == null) {
            clnsVar2 = clns.a;
        }
        clqs clqsVar = clnsVar2.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        return Optional.of(clqsVar.c);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        return this.c.apply((clnu) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((awuw) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        awuy awuyVar = (awuy) awuz.a.createBuilder();
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.PENDING;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awuyVar.copyOnWrite();
        awuz awuzVar = (awuz) awuyVar.instance;
        awud awudVar2 = (awud) awtyVar.build();
        awudVar2.getClass();
        awuzVar.c = awudVar2;
        awuzVar.b |= 1;
        eyee eyeeVar = ((awuw) obj).h;
        awuyVar.copyOnWrite();
        awuz awuzVar2 = (awuz) awuyVar.instance;
        eyeeVar.getClass();
        awuzVar2.b |= 4;
        awuzVar2.e = eyeeVar;
        return (awuz) awuyVar.build();
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        return "RcsConversationId: ".concat(String.valueOf(((awuw) obj).c));
    }

    @Override // defpackage.cltt
    public final String i() {
        return "createGroup";
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        awuy awuyVar = (awuy) awuz.a.createBuilder();
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
        awuyVar.copyOnWrite();
        awuz awuzVar = (awuz) awuyVar.instance;
        awud awudVar3 = (awud) awtyVar.build();
        awudVar3.getClass();
        awuzVar.c = awudVar3;
        awuzVar.b |= 1;
        eyee eyeeVar = ((awuw) obj).h;
        awuyVar.copyOnWrite();
        awuz awuzVar2 = (awuz) awuyVar.instance;
        eyeeVar.getClass();
        awuzVar2.b |= 4;
        awuzVar2.e = eyeeVar;
        return (awuz) awuyVar.build();
    }
}
