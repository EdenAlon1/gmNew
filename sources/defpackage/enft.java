package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enft extends enfx {
    public enft(enfy enfyVar) {
        super(enfyVar);
    }

    @Override // defpackage.enfx
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new enfq(this.b, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int e = this.b.e(key);
            if (e != -1 && emxb.a(this.b.a[e], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int b = engc.b(key);
        int f = this.b.f(key, b);
        if (f == -1 || !emxb.a(this.b.a[f], value)) {
            return false;
        }
        this.b.i(f, b);
        return true;
    }
}
