package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enfu extends enfx {
    final /* synthetic */ enfy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enfu(enfy enfyVar) {
        super(enfyVar);
        this.a = enfyVar;
    }

    @Override // defpackage.enfx
    public final Object a(int i) {
        return this.a.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        enfy enfyVar = this.a;
        int b = engc.b(obj);
        int d = enfyVar.d(obj, b);
        if (d == -1) {
            return false;
        }
        this.a.h(d, b);
        return true;
    }
}
