package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djih implements erqj {
    public static final dktn a = new dktn("SendFileOverMsrpOperationResultProcessor");
    private final eicl b;
    private final ffbr c;
    private final errl d;
    private final dikx e;
    private final eima f;
    private final eing g;
    private final djfx h;

    public djih(eicl eiclVar, eima eimaVar, eing eingVar, ffbr ffbrVar, errl errlVar, dikx dikxVar, djfx djfxVar) {
        this.b = eiclVar;
        this.f = eimaVar;
        this.g = eingVar;
        this.c = ffbrVar;
        this.d = errlVar;
        this.e = dikxVar;
        this.h = djfxVar;
    }

    private final void c(MessagingOperationResult messagingOperationResult) {
        if (((ehzl) this.b).d.H()) {
            throw new IllegalStateException("opaqueData is not present");
        }
        clru clruVar = (clru) clrv.a.createBuilder();
        clns clnsVar = (clns) this.f.m().fP(((ehzl) this.b).a);
        clruVar.copyOnWrite();
        clrv clrvVar = (clrv) clruVar.instance;
        clnsVar.getClass();
        clrvVar.g = clnsVar;
        clrvVar.b |= 16;
        clqc a2 = this.g.apply(messagingOperationResult.a());
        clruVar.copyOnWrite();
        clrv clrvVar2 = (clrv) clruVar.instance;
        a2.getClass();
        clrvVar2.e = a2;
        clrvVar2.b |= 4;
        clqw clqwVar = (clqw) clqx.a.createBuilder();
        String f = ((ehzl) this.b).b.f();
        clqwVar.copyOnWrite();
        clqx clqxVar = (clqx) clqwVar.instance;
        clqxVar.b |= 1;
        clqxVar.c = f;
        clruVar.copyOnWrite();
        clrv clrvVar3 = (clrv) clruVar.instance;
        clqx clqxVar2 = (clqx) clqwVar.build();
        clqxVar2.getClass();
        clrvVar3.f = clqxVar2;
        clrvVar3.b |= 8;
        clsm clsmVar = (clsm) clsn.a.createBuilder();
        String a3 = ((ehzl) this.b).c.a();
        clsmVar.copyOnWrite();
        clsn clsnVar = (clsn) clsmVar.instance;
        clsnVar.b |= 1;
        clsnVar.c = a3;
        clruVar.copyOnWrite();
        clrv clrvVar4 = (clrv) clruVar.instance;
        clsn clsnVar2 = (clsn) clsmVar.build();
        clsnVar2.getClass();
        clrvVar4.d = clsnVar2;
        clrvVar4.b |= 2;
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eicl eiclVar = this.b;
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = ((ehzl) eiclVar).d;
        clruVar.copyOnWrite();
        clrv clrvVar5 = (clrv) clruVar.instance;
        eydq eydqVar = (eydq) eydpVar.build();
        eydqVar.getClass();
        clrvVar5.c = eydqVar;
        clrvVar5.b |= 1;
        clrv clrvVar6 = (clrv) clruVar.build();
        clpn clpnVar = (clpn) this.c.b();
        erqt.r(ffat.a(clpnVar.a.a(clpq.g(), clpnVar.b), clrvVar6), new djig(clrvVar6), this.d);
    }

    @Override // defpackage.erqj
    public final /* synthetic */ void b(Object obj) {
        MessagingOperationResult messagingOperationResult = (MessagingOperationResult) obj;
        messagingOperationResult.getClass();
        String c = messagingOperationResult.c();
        dkty.l(a, "[%s] Messaging operation completed, %s", c, messagingOperationResult.a().e());
        c(messagingOperationResult);
        if (((Boolean) dikx.b.a()).booleanValue()) {
            this.e.e((fjay) this.h.fP(((ehzl) this.b).c), c);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dkty.j(th, a, "[%s] Messaging operation failed: %s", ((ehzl) this.b).b.f(), th.getMessage());
        eibw d = MessagingResult.d();
        d.c(16);
        d.b(7);
        MessagingResult e = d.e();
        eicl eiclVar = this.b;
        eibu e2 = MessagingOperationResult.e();
        e2.b(((ehzl) eiclVar).a);
        e2.d(((ehzl) this.b).b.f());
        e2.e(e);
        e2.c(false);
        c(e2.a());
        if (((Boolean) dikx.b.a()).booleanValue()) {
            this.e.d((fjay) this.h.fP(((ehzl) this.b).c), ((ehzl) this.b).b.f());
        }
    }
}
