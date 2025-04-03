package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yne implements ffxy {
    final /* synthetic */ you a;

    public yne(you youVar) {
        this.a = youVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dqmn dqmnVar = this.a.n;
        String str = (String) obj;
        if (ffkj.e(str, dqmnVar.a())) {
            ensk e = you.a.e();
            e.Y(ente.a, "BugleComposeRow2");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$6", "emit", 298, "DraftTextUiAdapterImpl.kt")).t("Skipping draft text field response to draft state %s", cskw.b(str));
        } else if (str == null) {
            ensk h = you.a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$6", "emit", 304, "DraftTextUiAdapterImpl.kt")).q("Clearing draft text field in response to draft state");
            dqmnVar.e();
        } else {
            ensk e2 = you.a.e();
            e2.Y(ente.a, "BugleComposeRow2");
            ((enrr) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$6", "emit", 310, "DraftTextUiAdapterImpl.kt")).t("Setting draft text field in response to draft state %s", cskw.b(str));
            dqmnVar.i(str);
        }
        return ffcu.a;
    }
}
