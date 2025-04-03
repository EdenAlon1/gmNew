package defpackage;

import android.util.LruCache;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayfv implements ayfi, cskg {
    public static final /* synthetic */ int b = 0;
    private final ayfi d;
    private final cqoh e;
    private final emyl f = emys.a(new emyl() { // from class: ayft
        @Override // defpackage.emyl
        public final Object get() {
            int i = ayfv.b;
            return new LruCache(1000);
        }
    });
    static final cfup a = cfvl.f(cfvl.b, "conversation_thread_id_cache_expiry_ms", TimeUnit.SECONDS.toNanos(10));
    private static final Object c = new Object();

    public ayfv(ayfi ayfiVar, cqoh cqohVar) {
        this.d = ayfiVar;
        this.e = cqohVar;
    }

    private final cpxu c(ConversationIdType conversationIdType) {
        synchronized (c) {
            ayfu ayfuVar = (ayfu) ((LruCache) this.f.get()).get(conversationIdType);
            if (ayfuVar != null && this.e.b() <= ayfuVar.a) {
                return (cpxu) ayfuVar.b;
            }
            return null;
        }
    }

    private final void d(ConversationIdType conversationIdType, cpxu cpxuVar) {
        if (cpxuVar.c()) {
            synchronized (c) {
                ((LruCache) this.f.get()).put(conversationIdType, new ayfu(this.e.b() + ((Long) a.e()).longValue(), cpxuVar));
            }
        }
    }

    @Override // defpackage.ayfi
    public final cpxu a(ConversationIdType conversationIdType) {
        cpxu c2 = c(conversationIdType);
        if (c2 != null) {
            return c2;
        }
        cpxu a2 = this.d.a(conversationIdType);
        d(conversationIdType, a2);
        return a2;
    }

    @Override // defpackage.ayfi
    public final cpxu b(bseh bsehVar) {
        cpxu c2 = c(bsehVar.C());
        if (c2 != null) {
            return c2;
        }
        cpxu b2 = this.d.b(bsehVar);
        d(bsehVar.C(), b2);
        return b2;
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        synchronized (c) {
            ((LruCache) this.f.get()).evictAll();
        }
    }
}
