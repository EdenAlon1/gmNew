package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enmq extends enmt {
    final /* synthetic */ enmr a;

    public enmq(enmr enmrVar) {
        this.a = enmrVar;
    }

    @Override // defpackage.enmt
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        enmr enmrVar = this.a;
        return ennc.i(enmrVar.a, enmrVar.b);
    }
}
