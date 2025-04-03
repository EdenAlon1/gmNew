package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enic extends enje {
    private static final long serialVersionUID = 0;
    final /* synthetic */ enie a;

    public enic(enie enieVar) {
        this.a = enieVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // defpackage.enje
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a.p(i);
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof ennx) {
            ennx ennxVar = (ennx) obj;
            if (ennxVar.a() > 0 && this.a.b(ennxVar.b()) == ennxVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.enip, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.engi
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.i().size();
    }

    @Override // defpackage.enje, defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return new enid(this.a);
    }
}
