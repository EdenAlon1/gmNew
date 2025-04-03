package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enfr extends enfx {
    final /* synthetic */ enfy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enfr(enfy enfyVar) {
        super(enfyVar);
        this.a = enfyVar;
    }

    @Override // defpackage.enfx
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new enfp(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = this.a.c(key);
            if (c != -1 && emxb.a(value, this.a.b[c])) {
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
        int d = this.a.d(key, b);
        if (d == -1 || !emxb.a(value, this.a.b[d])) {
            return false;
        }
        this.a.h(d, b);
        return true;
    }
}
