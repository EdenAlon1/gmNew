package defpackage;

import android.provider.Telephony;
import android.util.LruCache;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eflo extends LruCache {
    final /* synthetic */ eflp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eflo(eflp eflpVar) {
        super(1024);
        this.a = eflpVar;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        long j;
        Set set = (Set) obj;
        boolean isEmpty = set.isEmpty();
        efmd efmdVar = this.a.a;
        if (isEmpty) {
            set = Collections.singleton("ʼUNKNOWN_SENDER!ʼ");
        }
        try {
            j = Telephony.Threads.getOrCreateThreadId(((efmb) efmdVar).a, (Set<String>) set);
        } catch (RuntimeException unused) {
            j = ((efmb) efmdVar).b;
        }
        return Long.valueOf(j);
    }
}
