package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class em {
    public static final /* synthetic */ int a = 0;
    private static final cpn b = new cpn();

    public static Class a(ClassLoader classLoader, String str) {
        cpn cpnVar = b;
        cpn cpnVar2 = (cpn) cpnVar.get(classLoader);
        if (cpnVar2 == null) {
            cpnVar2 = new cpn();
            cpnVar.put(classLoader, cpnVar2);
        }
        Class cls = (Class) cpnVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        cpnVar2.put(str, cls2);
        return cls2;
    }

    public ea b(String str) {
        throw null;
    }
}
