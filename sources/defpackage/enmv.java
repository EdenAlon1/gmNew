package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enmv extends enmt {
    final /* synthetic */ enmw a;

    public enmv(enmw enmwVar) {
        this.a = enmwVar;
    }

    @Override // defpackage.enmt
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.a.a();
    }
}
