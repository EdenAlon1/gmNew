package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ygx implements ffji {
    final /* synthetic */ xhu a;
    final /* synthetic */ xhu b;

    public ygx(xhu xhuVar, xhu xhuVar2) {
        this.a = xhuVar;
        this.b = xhuVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        xhu xhuVar = (xhu) obj;
        xhuVar.getClass();
        if (!ffkj.e(this.a, xhuVar)) {
            ensk j = ygy.a.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replacer/DraftReplacerImpl$replaceDraft$2$1", "invoke", 64, "DraftReplacerImpl.kt")).D("Replacer encountered different existing drafts between emptiness check and update: %s, %s", this.a, xhuVar);
        }
        return this.b;
    }
}
