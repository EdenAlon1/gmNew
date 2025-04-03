package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enox extends enip {
    private final transient enhk a;
    private final transient engw b;

    public enox(enhk enhkVar, engw engwVar) {
        this.a = enhkVar;
        this.b = engwVar;
    }

    @Override // defpackage.engi
    public final int c(Object[] objArr, int i) {
        return this.b.c(objArr, i);
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.enip, defpackage.engi
    public final engw g() {
        return this.b;
    }

    @Override // defpackage.enip, defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final enqu listIterator() {
        return this.b.iterator();
    }

    @Override // defpackage.engi
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
