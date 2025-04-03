package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emwc extends emwd implements Serializable {
    private static final long serialVersionUID = 0;
    final emwd a;

    public emwc(emwd emwdVar) {
        this.a = emwdVar;
    }

    @Override // defpackage.emwd
    protected final Object a(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.emwd
    protected final Object b(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.emwl
    public final boolean equals(Object obj) {
        if (obj instanceof emwc) {
            return this.a.equals(((emwc) obj).a);
        }
        return false;
    }

    @Override // defpackage.emwd
    public final Object fL(Object obj) {
        return this.a.fP(obj);
    }

    @Override // defpackage.emwd
    public final Object fP(Object obj) {
        return this.a.fL(obj);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
