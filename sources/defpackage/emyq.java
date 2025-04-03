package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emyq<F, T> implements Serializable, emyl {
    private static final long serialVersionUID = 0;
    final emwl a;
    final emyl b;

    public emyq(emwl emwlVar, emyl emylVar) {
        this.a = emwlVar;
        emylVar.getClass();
        this.b = emylVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof emyq) {
            emyq emyqVar = (emyq) obj;
            if (this.a.equals(emyqVar.a) && this.b.equals(emyqVar.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.emyl
    public final T get() {
        return (T) this.a.apply(this.b.get());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        emyl emylVar = this.b;
        return "Suppliers.compose(" + this.a.toString() + ", " + emylVar.toString() + ")";
    }
}
