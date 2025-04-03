package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cluj implements cltt {
    private final avkh a;
    private final cllx b;
    private final clly c;
    private final clpt d;

    public cluj(avkh avkhVar, cllx cllxVar, clly cllyVar, clpt clptVar) {
        this.b = cllxVar;
        this.c = cllyVar;
        this.d = clptVar;
        this.a = avkhVar;
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ awud a(Object obj) {
        clqc clqcVar = ((clsp) obj).d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        return clkk.a(clqcVar);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl b(Object obj) {
        return this.a.i((axal) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        clpt clptVar = this.d;
        return elfl.g(ffat.a(clptVar.a.a(clpw.g(), clptVar.b), (clst) obj));
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        clsp clspVar = (clsp) obj;
        clns clnsVar = clspVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        int a = clnr.a(clnsVar.c);
        if (a == 0 || a != 3) {
            return Optional.empty();
        }
        clns clnsVar2 = clspVar.e;
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
        return this.c.apply((clsp) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((axaj) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        axak axakVar = (axak) axal.a.createBuilder();
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.PENDING;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        axakVar.copyOnWrite();
        axal axalVar = (axal) axakVar.instance;
        awud awudVar2 = (awud) awtyVar.build();
        awudVar2.getClass();
        axalVar.c = awudVar2;
        axalVar.b |= 1;
        eyee eyeeVar = ((axaj) obj).d;
        axakVar.copyOnWrite();
        axal axalVar2 = (axal) axakVar.instance;
        eyeeVar.getClass();
        axalVar2.b |= 2;
        axalVar2.d = eyeeVar;
        return (axal) axakVar.build();
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        awwf awwfVar = ((axaj) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(awwfVar.c));
    }

    @Override // defpackage.cltt
    public final String i() {
        return "triggerGroupNotification";
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        axak axakVar = (axak) axal.a.createBuilder();
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
        axakVar.copyOnWrite();
        axal axalVar = (axal) axakVar.instance;
        awud awudVar3 = (awud) awtyVar.build();
        awudVar3.getClass();
        axalVar.c = awudVar3;
        axalVar.b |= 1;
        eyee eyeeVar = ((axaj) obj).d;
        axakVar.copyOnWrite();
        axal axalVar2 = (axal) axakVar.instance;
        eyeeVar.getClass();
        axalVar2.b |= 2;
        axalVar2.d = eyeeVar;
        return (axal) axakVar.build();
    }
}
