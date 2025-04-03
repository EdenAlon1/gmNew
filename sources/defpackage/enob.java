package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class enob extends enpu {
    public abstract enny a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof ennx) {
            ennx ennxVar = (ennx) obj;
            if (ennxVar.a() > 0 && a().b(ennxVar.b()) == ennxVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof ennx)) {
            return false;
        }
        ennx ennxVar = (ennx) obj;
        Object b = ennxVar.b();
        int a = ennxVar.a();
        if (a != 0) {
            return a().h(b, a);
        }
        return false;
    }
}
