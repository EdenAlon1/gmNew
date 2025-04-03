package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class encn extends enoa {
    final /* synthetic */ encp a;

    public encn(encp encpVar) {
        this.a = encpVar;
    }

    @Override // defpackage.enoa
    public final enny a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.e();
    }
}
