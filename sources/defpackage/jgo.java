package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgo {
    public final hne a = new hne(new Reference[16]);
    public final ReferenceQueue b = new ReferenceQueue();

    public final void a() {
        Reference poll;
        do {
            poll = this.b.poll();
            if (poll != null) {
                this.a.m(poll);
            }
        } while (poll != null);
    }
}
