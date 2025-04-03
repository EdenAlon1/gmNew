package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbcd {
    private final Class a;
    private final String b = null;

    public fbcd(Class cls) {
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fbcd) {
            fbcd fbcdVar = (fbcd) obj;
            if (Objects.equals(this.a, fbcdVar.a)) {
                String str = fbcdVar.b;
                if (Objects.equals(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Objects.hashCode(this.a) ^ 1000003) * 1000003) ^ Objects.hashCode(null);
    }

    public final String toString() {
        return this.a.getCanonicalName();
    }
}
