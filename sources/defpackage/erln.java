package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erln extends enfg {
    final List a;

    public erln(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.enfg, java.util.List
    public final void add(int i, Object obj) {
        obj.getClass();
        this.a.add(i, obj);
    }

    @Override // defpackage.enfg, java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.a.addAll(i, erlr.a(collection));
    }

    @Override // defpackage.enfg, defpackage.enfd
    /* renamed from: b */
    protected final /* synthetic */ Collection hC() {
        return this.a;
    }

    @Override // defpackage.enfg
    protected final List c() {
        return this.a;
    }

    @Override // defpackage.enfd, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.a;
    }

    @Override // defpackage.enfg, java.util.List
    public final ListIterator listIterator() {
        return new erlo(this.a.listIterator());
    }

    @Override // defpackage.enfg, java.util.List
    public final Object set(int i, Object obj) {
        obj.getClass();
        return this.a.set(i, obj);
    }

    @Override // defpackage.enfg, java.util.List
    public final List subList(int i, int i2) {
        return new erln(this.a.subList(i, i2));
    }

    @Override // defpackage.enfg, java.util.List
    public final ListIterator listIterator(int i) {
        return new erlo(this.a.listIterator(i));
    }

    @Override // defpackage.enfd, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        return this.a.add(obj);
    }

    @Override // defpackage.enfd, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.a.addAll(erlr.a(collection));
    }
}
