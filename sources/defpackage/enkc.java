package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enkc extends enci {
    final Object a;
    Object b;
    enkc c;
    enkc d;
    enkc e;
    enkc f;

    public enkc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }
}
