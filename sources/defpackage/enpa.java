package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enpa extends enje {
    final /* synthetic */ enpc a;

    public enpa(enpc enpcVar) {
        this.a = enpcVar;
    }

    @Override // defpackage.enje
    public final Object a(int i) {
        return this.a.b.i(i);
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.engi
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b.c;
    }

    @Override // defpackage.enje, defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
