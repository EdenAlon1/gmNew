package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjdb extends fjdm {
    private final Method a;
    private final int b;

    public fjdb(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.fjdm
    public final /* bridge */ /* synthetic */ void a(fjdr fjdrVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            throw fjee.d(this.a, this.b, "Header map was null.", new Object[0]);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw fjee.d(this.a, this.b, "Header map contained null key.", new Object[0]);
            }
            Object value = entry.getValue();
            if (value == null) {
                throw fjee.d(this.a, this.b, a.a(str, "Header map contained null value for key '", "'."), new Object[0]);
            }
            fjdrVar.b(str, value.toString());
        }
    }
}
