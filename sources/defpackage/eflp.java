package defpackage;

import android.util.LruCache;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eflp implements efmd {
    public final efmd a;
    private final LruCache b = new eflo(this);

    public eflp(efmd efmdVar) {
        this.a = efmdVar;
    }

    @Override // defpackage.efmd
    public final long a(Set set) {
        Long l = (Long) this.b.get(set);
        l.getClass();
        return l.longValue();
    }
}
