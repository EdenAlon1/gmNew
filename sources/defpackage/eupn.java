package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eupn {
    public static euug a(eupo eupoVar, Class cls) {
        return eupoVar.a(new euqq(euqp.class, cls));
    }

    public static Object b(eupo eupoVar, euqq euqqVar) {
        euug a = eupoVar.a(euqqVar);
        if (a == null) {
            return null;
        }
        return a.a();
    }

    public static Object c(eupo eupoVar, Class cls) {
        return b(eupoVar, new euqq(euqp.class, cls));
    }

    public static Set d(eupo eupoVar, Class cls) {
        euqq euqqVar = new euqq(euqp.class, cls);
        euqs euqsVar = (euqs) eupoVar;
        if (euqsVar.a.contains(euqqVar)) {
            return (Set) euqsVar.b.c(euqqVar).a();
        }
        throw new euqf(String.format("Attempting to request an undeclared dependency Set<%s>.", euqqVar));
    }
}
