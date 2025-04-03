package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eygk extends AbstractList {
    private final eygi a;
    private final eygj b;

    public eygk(eygi eygiVar, eygj eygjVar) {
        this.a = eygiVar;
        this.b = eygjVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.d(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
