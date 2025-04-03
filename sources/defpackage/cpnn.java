package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpnn implements cpna {
    private final cpsu a;
    private final ffbr b;
    private final ffbr c;
    private final errl d;

    public cpnn(cpsu cpsuVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.a = cpsuVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = errlVar;
    }

    @Override // defpackage.cpna
    public final /* synthetic */ awui a(Object obj) {
        awui awuiVar = ((awyr) obj).c;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui b(Object obj) {
        awyr awyrVar = (awyr) obj;
        emxf.b((awyrVar.b & 16) != 0, "Self identity is missing in RevokeChatMessageRequest");
        awui awuiVar = awyrVar.g;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        final awyr awyrVar = (awyr) obj;
        emxf.b((awyrVar.b & 16) != 0, "sender is missing");
        emxf.b(1 == (awyrVar.b & 1), "recipient is missing");
        awui awuiVar = awyrVar.g;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awui awuiVar2 = awyrVar.c;
        cpow cpowVar = (cpow) this.c.b();
        awui awuiVar3 = awyrVar.c;
        if (awuiVar3 == null) {
            awuiVar3 = awui.a;
        }
        final elfl h = cpowVar.a(awuiVar3, awyrVar.e).h(new emwl() { // from class: cpnm
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                esrl a = esrm.a();
                awyr awyrVar2 = awyr.this;
                a.d(awyrVar2.d);
                a.e((fcek) obj2);
                awui awuiVar4 = awyrVar2.g;
                if (awuiVar4 == null) {
                    awuiVar4 = awui.a;
                }
                a.f(cpta.b(awuiVar4));
                return a.b();
            }
        }, this.d);
        cpsu cpsuVar = this.a;
        awuiVar.getClass();
        final elfl e = cpsuVar.e(awuiVar, null);
        return elfo.k(h, e).b(eldl.c(new erog() { // from class: cpnl
            @Override // defpackage.erog
            public final ListenableFuture a() {
                esro esroVar = (esro) erqt.q(elfl.this);
                cpry cpryVar = (cpry) erqt.q(e);
                esroVar.getClass();
                return axol.i(cpryVar.b, new cprw(cpryVar, esroVar, null));
            }
        }), this.d);
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl d(Object obj, awud awudVar) {
        awyr awyrVar = (awyr) obj;
        ensz enszVar = (ensz) cpno.a.j();
        enszVar.Y(csux.o, awyrVar.e);
        enszVar.Y(csux.a, awyrVar.d);
        ensn ensnVar = awgo.b;
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        enszVar.Y(ensnVar, b);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramRevokeMessageWorkHandler$TachygramRevokeMessageOperation", "onFailure", 168, "TachygramRevokeMessageWorkHandler.java")).q("TachygramTransport has failed to revoke the message.");
        avkh avkhVar = (avkh) this.b.b();
        eyee eyeeVar = awyrVar.f;
        awys awysVar = (awys) awyt.a.createBuilder();
        awysVar.copyOnWrite();
        awyt awytVar = (awyt) awysVar.instance;
        eyeeVar.getClass();
        awytVar.b |= 2;
        awytVar.d = eyeeVar;
        awysVar.copyOnWrite();
        awyt awytVar2 = (awyt) awysVar.instance;
        awudVar.getClass();
        awytVar2.c = awudVar;
        awytVar2.b |= 1;
        return avkhVar.g((awyt) awysVar.build());
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl e(Object obj, Object obj2) {
        awyr awyrVar = (awyr) obj;
        ensz enszVar = (ensz) cpno.a.h();
        enszVar.Y(csux.a, awyrVar.d);
        enszVar.Y(csux.o, awyrVar.e);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramRevokeMessageWorkHandler$TachygramRevokeMessageOperation", "onSuccess", 153, "TachygramRevokeMessageWorkHandler.java")).q("TachygramTransport has successfully processed message revoking.");
        avkh avkhVar = (avkh) this.b.b();
        eyee eyeeVar = awyrVar.f;
        awuc awucVar = awuc.OK;
        awys awysVar = (awys) awyt.a.createBuilder();
        awysVar.copyOnWrite();
        awyt awytVar = (awyt) awysVar.instance;
        eyeeVar.getClass();
        awytVar.b |= 2;
        awytVar.d = eyeeVar;
        awty awtyVar = (awty) awud.a.createBuilder();
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awud awudVar2 = (awud) awtyVar.build();
        awysVar.copyOnWrite();
        awyt awytVar2 = (awyt) awysVar.instance;
        awudVar2.getClass();
        awytVar2.c = awudVar2;
        awytVar2.b |= 1;
        return avkhVar.g((awyt) awysVar.build());
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ String f(Object obj) {
        awyr awyrVar = (awyr) obj;
        awui awuiVar = awyrVar.c;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        emxf.m(b.equals(awuh.GROUP), "getRcsGroupId called on a non-group operation.");
        return awyrVar.e;
    }

    @Override // defpackage.cpna
    public final String g() {
        return "TachygramRevokeMessageOperation";
    }

    @Override // defpackage.cpna
    public final boolean h() {
        return false;
    }
}
