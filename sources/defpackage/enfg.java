package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enfg extends enfd implements List {
    protected enfg() {
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        c().add(i, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        return c().addAll(i, collection);
    }

    @Override // defpackage.enfd
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract List c();

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return c().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return c().listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return c().remove(i);
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        return c().set(i, obj);
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return c().subList(i, i2);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return c().listIterator(i);
    }
}
