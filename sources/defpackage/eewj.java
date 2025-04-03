package defpackage;

import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eewj implements eewo {
    private final String a;
    private final eewi b;
    private eewm c;
    private Object d;

    public eewj(String str, eewi eewiVar) {
        this.a = str;
        this.b = eewiVar;
    }

    private final synchronized eewm f() {
        int i;
        Object a = this.b.a();
        if (this.d != a) {
            this.d = a;
            if (a instanceof eewm) {
                eewm eewmVar = (eewm) a;
                this.c = eewmVar;
                return eewmVar;
            }
            eewn eewnVar = new eewn("AutoTarget");
            this.c = eewnVar;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Class<?> cls = a.getClass();
            while (true) {
                i = 0;
                if (cls == Object.class) {
                    break;
                }
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                while (i < length) {
                    Method method = declaredMethods[i];
                    if (method.isAnnotationPresent(eewx.class)) {
                        arrayList.add(method);
                    } else if (method.isAnnotationPresent(eewz.class)) {
                        arrayList2.add(method);
                    }
                    i++;
                }
                cls = cls.getSuperclass();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Method method2 = (Method) arrayList.get(i2);
                eewx eewxVar = (eewx) method2.getAnnotation(eewx.class);
                eewnVar.g(new eewe((eewxVar == null || TextUtils.isEmpty(eewxVar.a())) ? method2.getName() : eewxVar.a(), a, method2));
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Method method3 = (Method) arrayList2.get(i);
                if (method3.getParameterTypes().length != 0) {
                    throw new IllegalArgumentException("Invalid @PokeTarget method: ".concat(String.valueOf(String.valueOf(method3))));
                }
                method3.setAccessible(true);
                eewz eewzVar = (eewz) method3.getAnnotation(eewz.class);
                eewnVar.i(new eewj((eewzVar == null || TextUtils.isEmpty(eewzVar.a())) ? method3.getName() : eewzVar.a(), new eewh(a, method3)));
                i++;
            }
        }
        return this.c;
    }

    @Override // defpackage.eewo
    public final eewl a(String str) {
        return eeww.a(f(), str);
    }

    @Override // defpackage.eewo
    public final eewm b(String str) {
        return eeww.b(f(), str);
    }

    @Override // defpackage.eewm
    public final String c() {
        return this.a;
    }

    @Override // defpackage.eewm
    public final List d() {
        return f().d();
    }

    @Override // defpackage.eewm
    public final List e() {
        return f().e();
    }
}
