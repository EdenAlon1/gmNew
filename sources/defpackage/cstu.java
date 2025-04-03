package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cstu extends les {
    final /* synthetic */ cstx a;

    public cstu(cstx cstxVar) {
        this.a = cstxVar;
    }

    @Override // defpackage.les
    public final void a(Throwable th) {
        if (th != null) {
            ensk j = cstx.a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils$1", "onFailed", 'i', "EmojiUtils.java")).q("EmojiCompat initialization failed");
        } else {
            ensk j2 = cstx.a.j();
            j2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils$1", "onFailed", 107, "EmojiUtils.java")).q("EmojiCompat initialization failed (unknown error)");
        }
    }

    @Override // defpackage.les
    public final void b() {
        ensk e = cstx.a.e();
        e.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils$1", "onInitialized", 98, "EmojiUtils.java")).q("EmojiCompat initialized");
        this.a.b = lew.b();
    }
}
