package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqku {
    private final ffix a;
    private final ffji b;
    private Object c;
    private Object d;

    public dqku(ffix ffixVar, ffji ffjiVar) {
        this.a = ffixVar;
        this.b = ffjiVar;
    }

    public final Object a() {
        Object invoke = this.a.invoke();
        if (!ffkj.e(this.c, invoke)) {
            this.c = invoke;
            this.d = null;
        }
        Object obj = this.d;
        if (obj != null) {
            return obj;
        }
        Object invoke2 = this.b.invoke(invoke);
        this.d = invoke2;
        return invoke2;
    }
}
