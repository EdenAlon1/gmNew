package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettk {
    private final Class a;
    private final eujt b;

    public ettk(Class cls, eujt eujtVar) {
        this.a = cls;
        this.b = eujtVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ettk)) {
            return false;
        }
        ettk ettkVar = (ettk) obj;
        return ettkVar.a.equals(this.a) && ettkVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        eujt eujtVar = this.b;
        return this.a.getSimpleName() + ", object identifier: " + String.valueOf(eujtVar);
    }
}
