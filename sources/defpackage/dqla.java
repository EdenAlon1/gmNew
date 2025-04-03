package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqla implements ffjn {
    private final ffjn a;
    private Object b;
    private Object c;
    private Object d;
    private Object e;

    public dqla(ffjn ffjnVar) {
        this.a = ffjnVar;
    }

    @Override // defpackage.ffjn
    public final Object a(Object obj, Object obj2, Object obj3) {
        if (!ffkj.e(this.b, obj) || !ffkj.e(this.c, obj2) || !ffkj.e(this.d, obj3)) {
            this.b = obj;
            this.c = obj2;
            this.d = obj3;
            this.e = null;
        }
        Object obj4 = this.e;
        if (obj4 != null) {
            return obj4;
        }
        Object a = this.a.a(obj, obj2, obj3);
        this.e = a;
        return a;
    }
}
