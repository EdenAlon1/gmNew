package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjdh extends fjdm {
    private final Method a;
    private final int b;
    private final fjbu c;
    private final boolean d;

    public fjdh(Method method, int i, fjbu fjbuVar, boolean z) {
        this.a = method;
        this.b = i;
        this.c = fjbuVar;
        this.d = z;
    }

    @Override // defpackage.fjdm
    public final /* bridge */ /* synthetic */ void a(fjdr fjdrVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            throw fjee.d(this.a, this.b, "Query map was null", new Object[0]);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw fjee.d(this.a, this.b, "Query map contained null key.", new Object[0]);
            }
            Object value = entry.getValue();
            if (value == null) {
                throw fjee.d(this.a, this.b, a.a(str, "Query map contained null value for key '", "'."), new Object[0]);
            }
            String obj2 = value.toString();
            if (obj2 == null) {
                throw fjee.d(this.a, this.b, "Query map value '" + value.toString() + "' converted to null by " + this.c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
            }
            fjdrVar.d(str, obj2, this.d);
        }
    }
}
