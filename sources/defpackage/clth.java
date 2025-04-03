package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clth implements cltt {
    private final avkh a;
    private final cljf b;
    private final cljg c;
    private final clpt d;

    public clth(avkh avkhVar, cljf cljfVar, cljg cljgVar, clpt clptVar) {
        this.b = cljfVar;
        this.c = cljgVar;
        this.d = clptVar;
        this.a = avkhVar;
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ awud a(Object obj) {
        clqc clqcVar = ((clne) obj).d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        return clkk.a(clqcVar);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl b(Object obj) {
        return this.a.a((awtx) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        clpt clptVar = this.d;
        return elfl.g(ffat.a(clptVar.a.a(clpw.a(), clptVar.b), (clni) obj));
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        clne clneVar = (clne) obj;
        clns clnsVar = clneVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        int a = clnr.a(clnsVar.c);
        if (a == 0 || a != 3) {
            return Optional.empty();
        }
        clns clnsVar2 = clneVar.e;
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
        return this.c.apply((clne) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((awtv) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        awtw awtwVar = (awtw) awtx.a.createBuilder();
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.PENDING;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awtwVar.copyOnWrite();
        awtx awtxVar = (awtx) awtwVar.instance;
        awud awudVar2 = (awud) awtyVar.build();
        awudVar2.getClass();
        awtxVar.c = awudVar2;
        awtxVar.b |= 1;
        eyee eyeeVar = ((awtv) obj).e;
        awtwVar.copyOnWrite();
        awtx awtxVar2 = (awtx) awtwVar.instance;
        eyeeVar.getClass();
        awtxVar2.b |= 2;
        awtxVar2.d = eyeeVar;
        return (awtx) awtwVar.build();
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        awwf awwfVar = ((awtv) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(awwfVar.c));
    }

    @Override // defpackage.cltt
    public final String i() {
        return "addUserToGroup";
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        awtw awtwVar = (awtw) awtx.a.createBuilder();
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
        awtwVar.copyOnWrite();
        awtx awtxVar = (awtx) awtwVar.instance;
        awud awudVar3 = (awud) awtyVar.build();
        awudVar3.getClass();
        awtxVar.c = awudVar3;
        awtxVar.b |= 1;
        eyee eyeeVar = ((awtv) obj).e;
        awtwVar.copyOnWrite();
        awtx awtxVar2 = (awtx) awtwVar.instance;
        eyeeVar.getClass();
        awtxVar2.b |= 2;
        awtxVar2.d = eyeeVar;
        return (awtx) awtwVar.build();
    }
}
