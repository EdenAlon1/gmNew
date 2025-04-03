package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enjv extends AbstractSequentialList {
    final /* synthetic */ Object a;
    final /* synthetic */ enkf b;

    public enjv(enkf enkfVar, Object obj) {
        this.a = obj;
        this.b = enkfVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new enke(this.b, this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        enkb enkbVar = (enkb) this.b.c.get(this.a);
        if (enkbVar == null) {
            return 0;
        }
        return enkbVar.c;
    }
}
