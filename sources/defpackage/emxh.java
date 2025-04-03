package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emxh implements Serializable, emxg {
    private static final long serialVersionUID = 0;
    private final List a;

    public emxh(List list) {
        this.a = list;
    }

    @Override // defpackage.emxg
    public final boolean a(Object obj) {
        for (int i = 0; i < this.a.size(); i++) {
            if (!((emxg) this.a.get(i)).a(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.emxg
    public final boolean equals(Object obj) {
        if (obj instanceof emxh) {
            return this.a.equals(((emxh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
