package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ynd implements ffxy {
    final /* synthetic */ you a;

    public ynd(you youVar) {
        this.a = youVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        xhu xhuVar = (xhu) obj;
        String str = xhuVar.a;
        dqmn dqmnVar = this.a.n;
        if (ffkj.e(str, dqmnVar.a())) {
            ensk e = you.a.e();
            e.Y(ente.a, "BugleComposeRow2");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$3", "emit", 265, "DraftTextUiAdapterImpl.kt")).t("Skipping draft text field response to draft state %s", cskw.b(str));
        } else if (str == null) {
            ensk h = you.a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$3", "emit", 271, "DraftTextUiAdapterImpl.kt")).q("Clearing draft text field in response to draft state");
            dqmnVar.e();
        } else {
            ensk e2 = you.a.e();
            e2.Y(ente.a, "BugleComposeRow2");
            ((enrr) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$3", "emit", 277, "DraftTextUiAdapterImpl.kt")).D("Setting draft text field in response to draft state %s, source %s", cskw.b(str), xht.a(xhuVar.j));
            dqmnVar.i(str);
        }
        return ffcu.a;
    }
}
