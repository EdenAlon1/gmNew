package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emux extends emxc {
    public static final emux a = new emux();
    private static final long serialVersionUID = 0;

    private emux() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.emxc
    public final emxc a(emxc emxcVar) {
        emxcVar.getClass();
        return emxcVar;
    }

    @Override // defpackage.emxc
    public final emxc b(emwl emwlVar) {
        return a;
    }

    @Override // defpackage.emxc
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.emxc
    public final Object d(emyl emylVar) {
        Object obj = emylVar.get();
        obj.getClass();
        return obj;
    }

    @Override // defpackage.emxc
    public final Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.emxc
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.emxc
    public final Object f() {
        return null;
    }

    @Override // defpackage.emxc
    public final boolean g() {
        return false;
    }

    @Override // defpackage.emxc
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
