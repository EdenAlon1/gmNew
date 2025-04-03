package defpackage;

import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enaf<K, V> extends enaj<K, V> implements emzl<K, V> {
    private static final long serialVersionUID = 1;
    transient emzl a;

    public enaf(enbf enbfVar) {
        super(enbfVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = e().b(this.k);
    }

    private Object readResolve() {
        return this.a;
    }

    @Override // defpackage.emzl
    public final Object a(Object obj) {
        throw null;
    }

    @Override // defpackage.emwl
    public final V apply(K k) {
        return (V) ((enah) this.a).e(k);
    }
}
