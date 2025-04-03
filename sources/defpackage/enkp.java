package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enkp extends enqt {
    final /* synthetic */ enkq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enkp(enkq enkqVar, ListIterator listIterator) {
        super(listIterator);
        this.a = enkqVar;
    }

    @Override // defpackage.enqs
    public final Object a(Object obj) {
        return this.a.b.apply(obj);
    }
}
