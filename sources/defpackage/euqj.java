package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euqj implements euug {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile euug c;

    public euqj(euug euugVar) {
        this.c = euugVar;
    }

    @Override // defpackage.euug
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = a;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.c.a();
                this.b = obj;
                this.c = null;
            }
        }
        return obj;
    }
}
