package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dklx implements djkh, djqs {
    private final eyte a;
    private final djji b;
    private final djjc c;
    private final djqr d;

    public dklx(eyte eyteVar, djji djjiVar, djjc djjcVar, djqr djqrVar) {
        this.a = eyteVar;
        this.b = djjiVar;
        this.c = djjcVar;
        this.d = djqrVar;
    }

    private final void d(int i) {
        this.b.t.remove(this);
        eytb eytbVar = (eytb) this.a.toBuilder();
        eytbVar.copyOnWrite();
        ((eyte) eytbVar.instance).g = eytc.a(i);
        eyte eyteVar = (eyte) eytbVar.build();
        dkty.o("FCM tickle processed. Reporting uptime", new Object[0]);
        djjc djjcVar = this.c;
        djjcVar.d.g(djjcVar.c, eyteVar, (eyti) djjcVar.a().build());
        this.d.g(this);
    }

    @Override // defpackage.djqs
    public final void a() {
        dkty.c("Keep alive response received after processing FCM tickle. Logging client state and cleaning up listeners", new Object[0]);
        d(6);
    }

    @Override // defpackage.djqs
    public final void b() {
        dkty.c("Keep alive response timeout after processing FCM tickle. Cleaning up FcmTickleKeepAliveListener.", new Object[0]);
        this.d.g(this);
    }

    @Override // defpackage.djqs
    public final void c() {
        dkty.c("Failed to send keep alive after processing FCM tickle. Cleaning up FcmTickleKeepAliveListener", new Object[0]);
        this.d.g(this);
    }

    @Override // defpackage.djkh
    public final void g(dilc dilcVar) {
        dkty.c("Registration failed after processing FCM tickle. Logging client state and cleaning up listeners", new Object[0]);
        d(5);
    }

    @Override // defpackage.djkh
    public final void h() {
        dkty.c("Registration successful after processing FCM tickle. Logging client state and cleaning up listeners", new Object[0]);
        d(4);
    }

    @Override // defpackage.djkh
    public final void i(dilc dilcVar) {
        dkty.c("Registration terminated after processing FCM tickle", new Object[0]);
    }
}
