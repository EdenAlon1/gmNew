package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elho {
    private static final emww a = emww.d('.');
    private static final enru b = enru.c("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer");
    private final elbx c;

    public elho(elbx elbxVar) {
        this.c = elbxVar;
    }

    public static final ekzm c() {
        if (!(ekyf.c() instanceof ekxr)) {
            return null;
        }
        ((enrr) ((enrr) b.j()).h("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer", "maybeCleanUpErrorTrace", 68, "TikTokXUiKitTracer.java")).q("Temporarily overriding an ErrorTrace");
        return ekyf.a(null);
    }

    private static String d(String str, String[] strArr) {
        if (strArr.length == 0) {
            return str;
        }
        return str + "." + a.f(strArr);
    }

    public final Object a(emyl emylVar, String str, String... strArr) {
        if (ekyf.v()) {
            return emylVar.get();
        }
        ekzm d = this.c.d(d(str, strArr));
        try {
            Object obj = emylVar.get();
            d.close();
            return obj;
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(Runnable runnable, String... strArr) {
        if (ekyf.v()) {
            runnable.run();
            return;
        }
        ekzm d = this.c.d(d("ProfileSuggestionsAdapterImpl#toSuggestionUiData", strArr));
        try {
            runnable.run();
            d.close();
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
