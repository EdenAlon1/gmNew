package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cbbl extends LruCache {
    private static final entd b = entd.c("BugleImage");
    public final String a;

    public cbbl(int i, String str) {
        super(i);
        this.a = str;
    }

    public synchronized cbcc a(String str, cbcc cbccVar) {
        cbccVar.p();
        return (cbcc) put(str, cbccVar);
    }

    public final synchronized cbcc b(String str) {
        cbcc cbccVar;
        cbccVar = (cbcc) get(str);
        if (cbccVar != null) {
            cbccVar.p();
        }
        ensk o = b.o();
        o.Y(cbci.d, this.a);
        o.Y(cbci.g, str);
        o.Y(cbci.e, Integer.valueOf(hitCount()));
        o.Y(cbci.f, Integer.valueOf(missCount()));
        ((ensz) o.h("com/google/android/apps/messaging/shared/datamodel/media/common/MediaCache", "fetchResourceFromCache", 84, "MediaCache.java")).q("Fetching resource from cache.");
        return cbccVar;
    }

    public final synchronized void c() {
        try {
            evictAll();
        } catch (IllegalStateException e) {
            ((ensz) ((ensz) ((ensz) b.i()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/media/common/MediaCache", "destroy", 56, "MediaCache.java")).o();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.util.LruCache
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized void entryRemoved(boolean z, String str, cbcc cbccVar, cbcc cbccVar2) {
        cbccVar.q();
    }

    public final synchronized void e(String str) {
        for (String str2 : snapshot().keySet()) {
            if (str2.startsWith(str)) {
                remove(str2);
            }
        }
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        int a = ((cbcc) obj2).a() / 1024;
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
