package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qxj {
    private final qxi a = new qxi(null);
    private final Map b = new HashMap();

    private static void d(qxi qxiVar) {
        qxi qxiVar2 = qxiVar.d;
        qxiVar2.c = qxiVar.c;
        qxiVar.c.d = qxiVar2;
    }

    private static void e(qxi qxiVar) {
        qxiVar.c.d = qxiVar;
        qxiVar.d.c = qxiVar;
    }

    public final Object a(qxq qxqVar) {
        qxi qxiVar = (qxi) this.b.get(qxqVar);
        if (qxiVar == null) {
            qxiVar = new qxi(qxqVar);
            this.b.put(qxqVar, qxiVar);
        } else {
            qxqVar.a();
        }
        d(qxiVar);
        qxi qxiVar2 = this.a;
        qxiVar.d = qxiVar2;
        qxiVar.c = qxiVar2.c;
        e(qxiVar);
        return qxiVar.b();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, qxq] */
    public final Object b() {
        for (qxi qxiVar = this.a.d; !qxiVar.equals(this.a); qxiVar = qxiVar.d) {
            Object b = qxiVar.b();
            if (b != null) {
                return b;
            }
            d(qxiVar);
            this.b.remove(qxiVar.a);
            qxiVar.a.a();
        }
        return null;
    }

    public final void c(qxq qxqVar, Object obj) {
        qxi qxiVar = (qxi) this.b.get(qxqVar);
        if (qxiVar == null) {
            qxiVar = new qxi(qxqVar);
            d(qxiVar);
            qxi qxiVar2 = this.a;
            qxiVar.d = qxiVar2.d;
            qxiVar.c = qxiVar2;
            e(qxiVar);
            this.b.put(qxqVar, qxiVar);
        } else {
            qxqVar.a();
        }
        if (qxiVar.b == null) {
            qxiVar.b = new ArrayList();
        }
        qxiVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        qxi qxiVar = this.a.c;
        boolean z = false;
        while (!qxiVar.equals(this.a)) {
            sb.append('{');
            sb.append(qxiVar.a);
            sb.append(':');
            sb.append(qxiVar.a());
            sb.append("}, ");
            qxiVar = qxiVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
