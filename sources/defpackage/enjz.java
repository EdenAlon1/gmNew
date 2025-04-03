package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enjz extends AbstractSequentialList {
    final /* synthetic */ enkf a;

    public enjz(enkf enkfVar) {
        this.a = enkfVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        enkd enkdVar = new enkd(this.a, i);
        return new enjy(enkdVar, enkdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.d;
    }
}
