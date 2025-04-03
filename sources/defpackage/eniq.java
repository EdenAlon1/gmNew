package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eniq extends enhv {
    public final enit a() {
        Map map = this.a;
        if (map == null) {
            return eneu.a;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return eneu.a;
        }
        enhd enhdVar = new enhd(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            enip o = enip.o(((enin) entry.getValue()).g());
            if (!o.isEmpty()) {
                enhdVar.k(key, o);
                i += o.size();
            }
        }
        return new enit(enhdVar.c(), i);
    }

    public final void b(Object obj, Object obj2) {
        super.h(obj, obj2);
    }

    public final void c(Map.Entry entry) {
        super.i(entry);
    }

    public final void d(ennd enndVar) {
        for (Map.Entry entry : enndVar.w().entrySet()) {
            super.k(entry.getKey(), (Iterable) entry.getValue());
        }
    }

    @Override // defpackage.enhv
    public final engh e(int i) {
        return enip.i(i);
    }

    @Override // defpackage.enhv
    public final int l(Iterable iterable) {
        if (iterable instanceof Set) {
            return Math.max(4, ((Set) iterable).size());
        }
        return 4;
    }

    public final void m(Object obj, Iterable iterable) {
        super.k(obj, iterable);
    }

    public final void n(Object obj, Object... objArr) {
        super.k(obj, Arrays.asList(objArr));
    }
}
