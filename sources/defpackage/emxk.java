package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emxk implements Serializable, emxg {
    private static final long serialVersionUID = 0;
    final emxg a;

    public emxk(emxg emxgVar) {
        this.a = emxgVar;
    }

    @Override // defpackage.emxg
    public final boolean a(Object obj) {
        return !this.a.a(obj);
    }

    @Override // defpackage.emxg
    public final boolean equals(Object obj) {
        if (obj instanceof emxk) {
            return this.a.equals(((emxk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.not(" + this.a.toString() + ")";
    }
}
