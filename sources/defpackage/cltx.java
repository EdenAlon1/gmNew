package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cltx implements cltt {
    private final avkh a;
    private final cllm b;
    private final clln c;
    private final clpt d;

    public cltx(avkh avkhVar, cllm cllmVar, clln cllnVar, clpt clptVar) {
        this.b = cllmVar;
        this.c = cllnVar;
        this.d = clptVar;
        this.a = avkhVar;
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ awud a(Object obj) {
        clqc clqcVar = ((clqz) obj).d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        return clkk.a(clqcVar);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl b(Object obj) {
        return this.a.f((awyn) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        clpt clptVar = this.d;
        return elfl.g(ffat.a(clptVar.a.a(clpw.c(), clptVar.b), (clrd) obj));
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        clqz clqzVar = (clqz) obj;
        clns clnsVar = clqzVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        int a = clnr.a(clnsVar.c);
        if (a == 0 || a != 3) {
            return Optional.empty();
        }
        clns clnsVar2 = clqzVar.e;
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
        return this.c.apply((clqz) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((awyl) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        awym awymVar = (awym) awyn.a.createBuilder();
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.PENDING;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awymVar.copyOnWrite();
        awyn awynVar = (awyn) awymVar.instance;
        awud awudVar2 = (awud) awtyVar.build();
        awudVar2.getClass();
        awynVar.c = awudVar2;
        awynVar.b |= 1;
        eyee eyeeVar = ((awyl) obj).e;
        awymVar.copyOnWrite();
        awyn awynVar2 = (awyn) awymVar.instance;
        eyeeVar.getClass();
        awynVar2.b |= 2;
        awynVar2.d = eyeeVar;
        return (awyn) awymVar.build();
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        awwf awwfVar = ((awyl) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(awwfVar.c));
    }

    @Override // defpackage.cltt
    public final String i() {
        return "removeUserFromGroup";
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        awym awymVar = (awym) awyn.a.createBuilder();
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
        awymVar.copyOnWrite();
        awyn awynVar = (awyn) awymVar.instance;
        awud awudVar3 = (awud) awtyVar.build();
        awudVar3.getClass();
        awynVar.c = awudVar3;
        awynVar.b |= 1;
        eyee eyeeVar = ((awyl) obj).e;
        awymVar.copyOnWrite();
        awyn awynVar2 = (awyn) awymVar.instance;
        eyeeVar.getClass();
        awynVar2.b |= 2;
        awynVar2.d = eyeeVar;
        return (awyn) awymVar.build();
    }
}
