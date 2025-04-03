package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acox implements adf {
    final /* synthetic */ acow a;

    public acox(acow acowVar) {
        this.a = acowVar;
    }

    @Override // defpackage.adf
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ade adeVar = (ade) obj;
        ffbr ffbrVar = this.a.f;
        if (ffbrVar == null) {
            acow.a.r("dittoExtensionsProvider is null.");
            return;
        }
        Optional optional = (Optional) ffbrVar.b();
        if (optional.isEmpty()) {
            acow.a.r("dittoExtensions is empty.");
            return;
        }
        if (adeVar.a != -1) {
            acow.a.p("Show switcher since user denied set as default sms.");
            ((acio) optional.get()).h(true);
            return;
        }
        acow.a.p("successfully set as default sms");
        if (((acio) optional.get()).l()) {
            acow.a.p("Show switcher since there is valid phone number.");
            ((acio) optional.get()).h(true);
            return;
        }
        acow.a.p("Stay in Ditto since there is no valid phone number.");
        ffbr ffbrVar2 = this.a.g;
        if (ffbrVar2 == null) {
            acow.a.r("satelliteDataServiceProvider is null.");
            return;
        }
        Optional optional2 = (Optional) ffbrVar2.b();
        if (optional2.isEmpty()) {
            acow.a.r("satelliteDataService is empty.");
        } else {
            ((acls) optional2.get()).c(acmd.REMOTE).k(axnw.b(), erpp.a);
        }
    }
}
