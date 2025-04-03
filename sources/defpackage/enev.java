package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enev extends enfn implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;
    private final Queue b;

    public enev(int i) {
        emxf.d(i >= 0, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    @Override // defpackage.enfd, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.a == 0) {
            return true;
        }
        if (size() == this.a) {
            this.b.remove();
        }
        this.b.add(obj);
        return true;
    }

    @Override // defpackage.enfd, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.a) {
            return enju.l(this, collection.iterator());
        }
        clear();
        return enjk.o(this, enjk.e(collection, size - this.a));
    }

    @Override // defpackage.enfn, defpackage.enfd
    /* renamed from: b */
    protected final /* synthetic */ Collection hC() {
        return this.b;
    }

    @Override // defpackage.enfn
    protected final Queue c() {
        return this.b;
    }

    @Override // defpackage.enfd, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.b;
    }

    @Override // defpackage.enfn, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
