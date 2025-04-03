package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjs extends cmh {
    private int e;

    @Override // defpackage.cpn, java.util.Map
    public final void clear() {
        this.e = 0;
        super.clear();
    }

    @Override // defpackage.cpn
    public final Object e(int i) {
        this.e = 0;
        return super.e(i);
    }

    @Override // defpackage.cpn
    public final Object f(int i, Object obj) {
        this.e = 0;
        return super.f(i, obj);
    }

    @Override // defpackage.cpn, java.util.Map
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = super.hashCode();
        this.e = hashCode;
        return hashCode;
    }

    @Override // defpackage.cpn
    public final void i(cpn cpnVar) {
        this.e = 0;
        super.i(cpnVar);
    }

    @Override // defpackage.cpn, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.e = 0;
        return super.put(obj, obj2);
    }
}
