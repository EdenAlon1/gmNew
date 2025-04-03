package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enir extends enip {
    private final transient enit a;

    public enir(enit enitVar) {
        this.a = enitVar;
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.y(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.enip, defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final enqu listIterator() {
        return new enht(this.a);
    }

    @Override // defpackage.engi
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
