package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sno implements aqgd {
    final /* synthetic */ snp a;

    public sno(snp snpVar) {
        this.a = snpVar;
    }

    @Override // defpackage.aqgd
    public final elfl a() {
        if (this.a.g != null) {
            ensk e = snp.d.e();
            e.Y(ente.a, "BugleAppOnAuto");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen$TopConversationsDataChangedHandler", "onChanged", 585, "MessagingTemplateScreen.java")).q("Conversations changed, refreshing auto UI");
            this.a.o.set(true);
            this.a.c();
        }
        return elfo.e(null);
    }
}
