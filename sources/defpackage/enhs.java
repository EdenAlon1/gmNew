package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enhs extends engi {
    public final enhk a;

    public enhs(enhk enhkVar) {
        this.a = enhkVar;
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return obj != null && enju.m(new enhp(this), obj);
    }

    @Override // defpackage.engi
    public final engw g() {
        return new enhq(this.a.entrySet().g());
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator listIterator() {
        return new enhp(this);
    }

    @Override // defpackage.engi
    /* renamed from: k */
    public final enqu listIterator() {
        return new enhp(this);
    }

    @Override // defpackage.engi
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.engi
    public Object writeReplace() {
        return new enhr(this.a);
    }
}
