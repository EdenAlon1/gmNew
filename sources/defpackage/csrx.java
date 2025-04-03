package defpackage;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrx {
    public final Set b = new CopyOnWriteArraySet();
    public final Set a = new cmj();

    public final void a(Collection collection) {
        this.b.clear();
        this.b.addAll(collection);
    }
}
