package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erlo extends enfh {
    private final ListIterator a;

    public erlo(ListIterator listIterator) {
        this.a = listIterator;
    }

    @Override // defpackage.enfh, java.util.ListIterator
    public final void add(Object obj) {
        obj.getClass();
        this.a.add(obj);
    }

    @Override // defpackage.enfh, defpackage.enff
    protected final /* synthetic */ Iterator b() {
        return this.a;
    }

    @Override // defpackage.enfh
    protected final ListIterator c() {
        return this.a;
    }

    @Override // defpackage.enff, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.a;
    }

    @Override // defpackage.enfh, java.util.ListIterator
    public final void set(Object obj) {
        obj.getClass();
        this.a.set(obj);
    }
}
