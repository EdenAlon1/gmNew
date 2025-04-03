package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enho extends enje {
    private final enhk a;

    public enho(enhk enhkVar) {
        this.a = enhkVar;
    }

    @Override // defpackage.enje
    public final Object a(int i) {
        return ((Map.Entry) this.a.entrySet().g().get(i)).getKey();
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.enje, defpackage.enip, defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* bridge */ /* synthetic */ Iterator listIterator() {
        return listIterator();
    }

    @Override // defpackage.enje, defpackage.enip, defpackage.engi
    /* renamed from: k */
    public final enqu listIterator() {
        return this.a.hG();
    }

    @Override // defpackage.engi
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.enje, defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return new enhn(this.a);
    }
}
