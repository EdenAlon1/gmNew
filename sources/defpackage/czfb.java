package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czfb implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public czfb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ensk e = czfd.a.e();
        e.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService$1", "onSuccess", 99, "ResourceBasedEmojiVariantService.java")).D("Finished persisting %1$s as preferred emoji variant for %2$s.", this.a, this.b);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ensk e = czfd.a.e();
        e.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService$1", "onFailure", 106, "ResourceBasedEmojiVariantService.java")).D("Failed to persist %1$s as the preferred emoji variant for %2$s.", this.a, this.b);
    }
}
