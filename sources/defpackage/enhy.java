package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enhy extends engi {
    private static final long serialVersionUID = 0;
    private final transient enhz a;

    public enhy(enhz enhzVar) {
        this.a = enhzVar;
    }

    @Override // defpackage.engi
    public final int c(Object[] objArr, int i) {
        enqu listIterator = this.a.map.values().listIterator();
        while (listIterator.hasNext()) {
            i = ((engi) listIterator.next()).c(objArr, i);
        }
        return i;
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.z(obj);
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final enqu listIterator() {
        return new enhu(this.a);
    }

    @Override // defpackage.engi
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
