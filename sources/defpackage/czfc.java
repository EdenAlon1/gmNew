package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czfc implements erqj {
    final /* synthetic */ czfd a;

    public czfc(czfd czfdVar) {
        this.a = czfdVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        czek czekVar = (czek) obj;
        if (czekVar == null) {
            ensk i = czfd.a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) i).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService$2", "onSuccess", 230, "ResourceBasedEmojiVariantService.java")).q("Failed to cache emoji variant preferences. Preferences are null.");
            return;
        }
        czfd czfdVar = this.a;
        czfdVar.g.putAll(DesugarCollections.unmodifiableMap(czekVar.b));
        ensk e = czfd.a.e();
        e.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService$2", "onSuccess", 238, "ResourceBasedEmojiVariantService.java")).q("Finished caching emoji variant preferences.");
        this.a.i = 3;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ensk i = czfd.a.i();
        i.Y(ente.a, "Bugle");
        ((enrr) ((enrr) ((enrr) i).g(th)).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService$2", "onFailure", (char) 245, "ResourceBasedEmojiVariantService.java")).q("Failed to cache emoji variant preferences.");
        this.a.i = 4;
    }
}
