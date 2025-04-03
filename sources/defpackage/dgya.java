package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgya {
    public static Object a(Class cls, String str, dgxz... dgxzVarArr) {
        int length = dgxzVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < dgxzVarArr.length; i++) {
            dgxz dgxzVar = dgxzVarArr[i];
            dgxzVar.getClass();
            clsArr[i] = dgxzVar.a;
            objArr[i] = dgxzVarArr[i].b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public static Object b(String str, dgxz... dgxzVarArr) {
        return a(Class.forName("android.os.SystemProperties"), str, dgxzVarArr);
    }
}
