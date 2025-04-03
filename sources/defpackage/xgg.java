package defpackage;

import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgg {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageCacheAccessor");
    private final ConcurrentMap b;

    public xgg(ConcurrentMap concurrentMap) {
        concurrentMap.getClass();
        this.b = concurrentMap;
    }

    public final enhk a() {
        return engq.e(this.b);
    }

    public final void b() {
        ensk f = a.f();
        f.Y(ente.a, "BugleComposeRow2");
        ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageCacheAccessor", "clearCachedEmojiUsage", 21, "EmojiUsageCacheAccessor.kt")).q("EmojiUsageCacheAccessor clearing cached emoji usage.");
        this.b.clear();
    }
}
