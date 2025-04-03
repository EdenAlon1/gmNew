package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ennm extends enmt {
    final /* synthetic */ ennn a;

    public ennm(ennn ennnVar) {
        this.a = ennnVar;
    }

    @Override // defpackage.enmt
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        final ennd enndVar = this.a.a;
        Set x = enndVar.x();
        enndVar.getClass();
        return ennc.i(x, new emwl() { // from class: ennl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new enjv((enkf) ennd.this, obj);
            }
        });
    }

    @Override // defpackage.enmt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        ennn ennnVar = this.a;
        ennnVar.a.x().remove(entry.getKey());
        return true;
    }
}
