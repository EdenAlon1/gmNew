package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjde extends fjdm {
    private final Method a;
    private final int b;
    private final fjbu c;
    private final String d;

    public fjde(Method method, int i, fjbu fjbuVar, String str) {
        this.a = method;
        this.b = i;
        this.c = fjbuVar;
        this.d = str;
    }

    @Override // defpackage.fjdm
    public final /* synthetic */ void a(fjdr fjdrVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            throw fjee.d(this.a, this.b, "Part map was null.", new Object[0]);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw fjee.d(this.a, this.b, "Part map contained null key.", new Object[0]);
            }
            Object value = entry.getValue();
            if (value == null) {
                throw fjee.d(this.a, this.b, a.a(str, "Part map contained null value for key '", "'."), new Object[0]);
            }
            fjdrVar.c(fhgg.c(fhpi.c, a.a(str, "form-data; name=\"", "\""), fhpi.b, this.d), (fhgz) this.c.a(value));
        }
    }
}
