package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpx extends enip {
    final transient Object a;

    public enpx(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.engi
    public final int c(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.enip, defpackage.engi
    public final engw g() {
        return engw.r(this.a);
    }

    @Override // defpackage.enip, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.enip, defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final enqu listIterator() {
        return new enjt(this.a);
    }

    @Override // defpackage.engi
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.a.toString() + "]";
    }

    @Override // defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
