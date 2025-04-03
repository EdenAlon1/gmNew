package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emxn extends emxc {
    private static final long serialVersionUID = 0;
    public final Object a;

    public emxn(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.emxc
    public final emxc a(emxc emxcVar) {
        emxcVar.getClass();
        return this;
    }

    @Override // defpackage.emxc
    public final emxc b(emwl emwlVar) {
        Object apply = emwlVar.apply(this.a);
        apply.getClass();
        return new emxn(apply);
    }

    @Override // defpackage.emxc
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.emxc
    public final Object d(emyl emylVar) {
        emylVar.getClass();
        return this.a;
    }

    @Override // defpackage.emxc
    public final Object e(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.emxc
    public final boolean equals(Object obj) {
        if (obj instanceof emxn) {
            return this.a.equals(((emxn) obj).a);
        }
        return false;
    }

    @Override // defpackage.emxc
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.emxc
    public final boolean g() {
        return true;
    }

    @Override // defpackage.emxc
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }
}
