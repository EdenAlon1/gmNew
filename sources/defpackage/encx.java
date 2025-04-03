package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class encx extends enom implements Serializable {
    private static final long serialVersionUID = 0;
    final emwl a;
    final enom b;

    public encx(emwl emwlVar, enom enomVar) {
        emwlVar.getClass();
        this.a = emwlVar;
        this.b = enomVar;
    }

    @Override // defpackage.enom, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        emwl emwlVar = this.a;
        return this.b.compare(emwlVar.apply(obj), emwlVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof encx) {
            encx encxVar = (encx) obj;
            if (this.a.equals(encxVar.a) && this.b.equals(encxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        emwl emwlVar = this.a;
        return this.b.toString() + ".onResultOf(" + emwlVar.toString() + ")";
    }
}
