package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djoo implements eein {
    final /* synthetic */ eenk a;
    final /* synthetic */ djqf b;

    public djoo(djqf djqfVar, eenk eenkVar) {
        this.a = eenkVar;
        this.b = djqfVar;
    }

    @Override // defpackage.eein
    public final void a(eeif eeifVar) {
        this.b.p(3);
        dkty.h(this.b.m, "SIP request canceled. method=%s, callId=%s", this.a.z(), this.a.y().h());
        this.b.s(2, new eejg("SIP request canceled."));
    }

    @Override // defpackage.eein
    public final void b(eeif eeifVar) {
        this.b.p(3);
        eenj eenjVar = eeifVar.b;
        if (eenjVar != null) {
            this.b.s(2, eenjVar);
        }
    }

    @Override // defpackage.eein
    public final void c(eeif eeifVar) {
        this.b.p(3);
        dkty.h(this.b.m, "SIP request timeout. method=%s, callId=%s", this.a.z(), this.a.y().h());
        this.b.s(3, eeifVar);
    }
}
