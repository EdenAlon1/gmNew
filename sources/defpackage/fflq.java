package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflq implements ffls {
    private Object a;

    @Override // defpackage.ffls
    public final Object c(ffmx ffmxVar) {
        ffmxVar.getClass();
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Property " + ffmxVar.b() + " should be initialized before get.");
    }

    @Override // defpackage.ffls
    public final void d(ffmx ffmxVar, Object obj) {
        ffmxVar.getClass();
        obj.getClass();
        this.a = obj;
    }

    public final String toString() {
        String str;
        Object obj = this.a;
        if (obj != null) {
            Objects.toString(obj);
            str = "value=".concat(obj.toString());
        } else {
            str = "value not initialized yet";
        }
        return a.a(str, "NotNullProperty(", ")");
    }
}
