package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fflr implements ffls {
    private Object a;

    public fflr(Object obj) {
        this.a = obj;
    }

    protected void a(ffmx ffmxVar, Object obj, Object obj2) {
        throw null;
    }

    protected boolean b(Object obj, Object obj2) {
        return true;
    }

    @Override // defpackage.ffls
    public final Object c(ffmx ffmxVar) {
        ffmxVar.getClass();
        return this.a;
    }

    @Override // defpackage.ffls
    public final void d(ffmx ffmxVar, Object obj) {
        ffmxVar.getClass();
        Object obj2 = this.a;
        if (b(obj2, obj)) {
            this.a = obj;
            a(ffmxVar, obj2, obj);
        }
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.a + ")";
    }
}
