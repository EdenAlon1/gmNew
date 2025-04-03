package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feec {
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final List e;

    public feec(Class cls, ClassLoader classLoader) {
        Class asSubclass = cls.asSubclass(embk.class);
        this.a = asSubclass;
        this.d = asSubclass.getMethod("getScopes", new Class[0]);
        Method declaredMethod = Class.forName("emca", false, classLoader).asSubclass(embk.class).getDeclaredMethod("newBuilder", new Class[0]);
        this.b = declaredMethod;
        Class<?> returnType = declaredMethod.getReturnType();
        this.c = returnType.getMethod("build", new Class[0]);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        Method method = asSubclass.getMethod("getClientId", new Class[0]);
        arrayList.add(new feed(method, returnType.getMethod("setClientId", method.getReturnType())));
        Method method2 = asSubclass.getMethod("getClientEmail", new Class[0]);
        arrayList.add(new feed(method2, returnType.getMethod("setClientEmail", method2.getReturnType())));
        Method method3 = asSubclass.getMethod("getPrivateKey", new Class[0]);
        arrayList.add(new feed(method3, returnType.getMethod("setPrivateKey", method3.getReturnType())));
        Method method4 = asSubclass.getMethod("getPrivateKeyId", new Class[0]);
        arrayList.add(new feed(method4, returnType.getMethod("setPrivateKeyId", method4.getReturnType())));
        Method method5 = asSubclass.getMethod("getQuotaProjectId", new Class[0]);
        arrayList.add(new feed(method5, returnType.getMethod("setQuotaProjectId", method5.getReturnType())));
    }
}
