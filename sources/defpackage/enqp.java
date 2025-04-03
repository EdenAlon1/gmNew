package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enqp<E> extends enqj<E> implements Set<E> {
    private static final long serialVersionUID = 0;

    public enqp(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.enqj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set a() {
        return (Set) super.a();
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }
}
