package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clum implements cltt {
    private final avkh a;
    private final cllz b;
    private final clma c;
    private final clpt d;

    public clum(avkh avkhVar, cllz cllzVar, clma clmaVar, clpt clptVar) {
        this.b = cllzVar;
        this.c = clmaVar;
        this.d = clptVar;
        this.a = avkhVar;
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ awud a(Object obj) {
        clqc clqcVar = ((clsx) obj).d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        return clkk.a(clqcVar);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl b(Object obj) {
        return this.a.j((axat) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        clpt clptVar = this.d;
        return elfl.g(ffat.a(clptVar.a.a(clpw.h(), clptVar.b), (cltb) obj));
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        clsx clsxVar = (clsx) obj;
        clns clnsVar = clsxVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        int a = clnr.a(clnsVar.c);
        if (a == 0 || a != 3) {
            return Optional.empty();
        }
        clns clnsVar2 = clsxVar.e;
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
        return this.c.apply((clsx) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((axaq) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        axas axasVar = (axas) axat.a.createBuilder();
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.PENDING;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        axasVar.copyOnWrite();
        axat axatVar = (axat) axasVar.instance;
        awud awudVar2 = (awud) awtyVar.build();
        awudVar2.getClass();
        axatVar.c = awudVar2;
        axatVar.b |= 1;
        eyee eyeeVar = ((axaq) obj).e;
        axasVar.copyOnWrite();
        axat axatVar2 = (axat) axasVar.instance;
        eyeeVar.getClass();
        axatVar2.b |= 2;
        axatVar2.d = eyeeVar;
        return (axat) axasVar.build();
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        awwf awwfVar = ((axaq) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(awwfVar.c));
    }

    @Override // defpackage.cltt
    public final String i() {
        return "updateGroup";
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        axas axasVar = (axas) axat.a.createBuilder();
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
        axasVar.copyOnWrite();
        axat axatVar = (axat) axasVar.instance;
        awud awudVar3 = (awud) awtyVar.build();
        awudVar3.getClass();
        axatVar.c = awudVar3;
        axatVar.b |= 1;
        eyee eyeeVar = ((axaq) obj).e;
        axasVar.copyOnWrite();
        axat axatVar2 = (axat) axasVar.instance;
        eyeeVar.getClass();
        axatVar2.b |= 2;
        axatVar2.d = eyeeVar;
        return (axat) axasVar.build();
    }
}
