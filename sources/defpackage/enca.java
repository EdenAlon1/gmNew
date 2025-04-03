package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enca extends enby implements ListIterator {
    final /* synthetic */ encb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enca(encb encbVar) {
        super(encbVar);
        this.d = encbVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.d.isEmpty();
        b().add(obj);
        encb encbVar = this.d;
        encbVar.f.b++;
        if (isEmpty) {
            encbVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enca(encb encbVar, int i) {
        super(encbVar, encbVar.d().listIterator(i));
        this.d = encbVar;
    }
}
