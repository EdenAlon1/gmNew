package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clud implements cltt {
    private final avkh a;
    private final cllq b;
    private final cllt c;
    private final clpt d;

    public clud(avkh avkhVar, cllq cllqVar, cllt clltVar, clpt clptVar) {
        this.a = avkhVar;
        this.b = cllqVar;
        this.c = clltVar;
        this.d = clptVar;
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ awud a(Object obj) {
        clqc clqcVar = ((clsd) obj).e;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        return clkk.a(clqcVar);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl b(Object obj) {
        return this.a.h((awzd) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        clpt clptVar = this.d;
        return elfl.g(ffat.a(clptVar.a.a(clpw.f(), clptVar.b), (clsh) obj));
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        clns clnsVar = ((clsd) obj).g;
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
        return this.c.apply((clsd) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((awyz) obj);
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        awzc awzcVar = (awzc) awzd.a.createBuilder();
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.PENDING;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awzcVar.copyOnWrite();
        awzd awzdVar = (awzd) awzcVar.instance;
        awud awudVar2 = (awud) awtyVar.build();
        awudVar2.getClass();
        awzdVar.c = awudVar2;
        awzdVar.b |= 1;
        eyee eyeeVar = ((awyz) obj).l;
        awzcVar.copyOnWrite();
        awzd awzdVar2 = (awzd) awzcVar.instance;
        eyeeVar.getClass();
        awzdVar2.b |= 2;
        awzdVar2.d = eyeeVar;
        return (awzd) awzcVar.build();
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        return "RcsMessageId: ".concat(String.valueOf(((awyz) obj).h));
    }

    @Override // defpackage.cltt
    public final String i() {
        return "sendMessage";
    }

    @Override // defpackage.cltt
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        awzc awzcVar = (awzc) awzd.a.createBuilder();
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
        awzcVar.copyOnWrite();
        awzd awzdVar = (awzd) awzcVar.instance;
        awud awudVar3 = (awud) awtyVar.build();
        awudVar3.getClass();
        awzdVar.c = awudVar3;
        awzdVar.b |= 1;
        eyee eyeeVar = ((awyz) obj).l;
        awzcVar.copyOnWrite();
        awzd awzdVar2 = (awzd) awzcVar.instance;
        eyeeVar.getClass();
        awzdVar2.b |= 2;
        awzdVar2.d = eyeeVar;
        return (awzd) awzcVar.build();
    }
}
