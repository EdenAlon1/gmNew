package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqky<K, V> implements ffji<K, V> {
    private final ffji a;
    private Object b;
    private Object c;

    public dqky(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ffji
    public final V invoke(K k) {
        if (!ffkj.e(this.b, k)) {
            this.b = k;
            this.c = null;
        }
        V v = (V) this.c;
        if (v != null) {
            return v;
        }
        V v2 = (V) this.a.invoke(k);
        this.c = v2;
        return v2;
    }
}
