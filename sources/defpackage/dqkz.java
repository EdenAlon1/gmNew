package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqkz implements ffjm {
    private final ffjm a;
    private Object b;
    private Object c;
    private Object d;

    public dqkz(ffjm ffjmVar) {
        this.a = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final Object a(Object obj, Object obj2) {
        if (!ffkj.e(this.b, obj) || !ffkj.e(this.c, obj2)) {
            this.b = obj;
            this.c = obj2;
            this.d = null;
        }
        Object obj3 = this.d;
        if (obj3 != null) {
            return obj3;
        }
        Object a = this.a.a(obj, obj2);
        this.d = a;
        return a;
    }
}
