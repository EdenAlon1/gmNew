package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emxi implements Serializable, emxg {
    private static final long serialVersionUID = 0;
    private final Class a;

    public emxi(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.emxg
    public final boolean a(Object obj) {
        return this.a.isInstance(obj);
    }

    @Override // defpackage.emxg
    public final boolean equals(Object obj) {
        if (!(obj instanceof emxi)) {
            return false;
        }
        Class cls = ((emxi) obj).a;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.instanceOf(" + this.a.getName() + ")";
    }
}
