package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class engd extends enhd {
    public engd() {
    }

    @Override // defpackage.enhd
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final engf c() {
        int i = this.b;
        return i == 0 ? enot.a : new enot(this.a, i);
    }

    @Override // defpackage.enhd
    @Deprecated
    public final /* bridge */ /* synthetic */ enhk b() {
        throw new UnsupportedOperationException("Not supported for bimaps");
    }

    public final void d(Object obj, Object obj2) {
        super.k(obj, obj2);
    }

    public final void e(Iterable iterable) {
        super.l(iterable);
    }

    public final void f(Map map) {
        super.g(map);
    }

    @Override // defpackage.enhd
    public final /* synthetic */ void g(Map map) {
        super.g(map);
    }

    public engd(int i) {
        super(i);
    }
}
