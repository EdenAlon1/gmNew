package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class engt extends engw {
    private final transient engw a;

    public engt(engw engwVar) {
        this.a = engwVar;
    }

    private final int H(int i) {
        return (size() - 1) - i;
    }

    private final int I(int i) {
        return size() - i;
    }

    @Override // defpackage.engw
    public final engw a() {
        return this.a;
    }

    @Override // defpackage.engw
    /* renamed from: b */
    public final engw subList(int i, int i2) {
        emxf.k(i, i2, size());
        return this.a.subList(I(i2), I(i)).a();
    }

    @Override // defpackage.engw, defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        emxf.v(i, size());
        return this.a.get(H(i));
    }

    @Override // defpackage.engw, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return H(lastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.engi
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.engw, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            return H(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.engw, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.engw, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
