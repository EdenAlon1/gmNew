package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrv extends LruCache {
    private final ffjm a;

    public zrv(int i, ffjm ffjmVar) {
        super(i);
        this.a = ffjmVar;
    }

    @Override // android.util.LruCache
    protected final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        this.a.a(obj, obj2);
    }
}
