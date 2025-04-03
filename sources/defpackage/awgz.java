package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgz extends LruCache {
    public awgz() {
        super(32);
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ffrf ffrfVar = (ffrf) obj2;
        if (!z || ffrfVar == null) {
            return;
        }
        ffrfVar.w(ffci.a(new Exception("Too many ongoing requests")));
    }
}
