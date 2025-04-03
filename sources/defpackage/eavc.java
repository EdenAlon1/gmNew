package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eavc implements eafz {
    private static final entd b = entd.c("GnpSdk");
    public final elbx a;

    public eavc(elbx elbxVar) {
        this.a = elbxVar;
    }

    @Override // defpackage.eafz
    public final elav a(String str) {
        return this.a.b(str);
    }

    @Override // defpackage.eafz
    public final void b() {
        try {
            eleg.d();
        } catch (IllegalStateException e) {
            ((ensz) ((ensz) ((ensz) b.i()).g(e)).h("com/google/android/libraries/notifications/platform/tiktok/trace/TikTokTrace", "checkTrace", 'T', "TikTokTrace.java")).q("Missing trace");
        }
    }
}
