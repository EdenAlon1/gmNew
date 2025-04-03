package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwi implements Serializable {
    private static final long serialVersionUID = 0;
    private final emwj a;
    private final Object b;

    public emwi(emwj emwjVar, Object obj) {
        this.a = emwjVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof emwi)) {
            return false;
        }
        emwi emwiVar = (emwi) obj;
        if (this.a.equals(emwiVar.a)) {
            return this.a.d(this.b, emwiVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.c(this.b);
    }

    public final String toString() {
        Object obj = this.b;
        return this.a.toString() + ".wrap(" + obj.toString() + ")";
    }
}
