package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emxj implements Serializable, emxg {
    private static final long serialVersionUID = 0;
    private final Object a;

    public emxj(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.emxg
    public final boolean a(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.emxg
    public final boolean equals(Object obj) {
        if (obj instanceof emxj) {
            return this.a.equals(((emxj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.equalTo(" + this.a.toString() + ")";
    }
}
