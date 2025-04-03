package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwn<E> implements Serializable, emwl {
    private static final long serialVersionUID = 0;
    public final Object a;

    public emwn(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.emwl
    public final E apply(Object obj) {
        return (E) this.a;
    }

    @Override // defpackage.emwl
    public final boolean equals(Object obj) {
        if (obj instanceof emwn) {
            return emxb.a(this.a, ((emwn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Functions.constant(" + String.valueOf(this.a) + ")";
    }
}
