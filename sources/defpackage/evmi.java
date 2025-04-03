package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evmi {
    private final Map a;
    private final List b;

    public evmi(Map map, List list) {
        this.a = map;
        this.b = list;
    }

    static /* synthetic */ Object b(Constructor constructor) {
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw evpf.b(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(a.a(evpf.c(constructor), "Failed to invoke constructor '", "' with no args"), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(a.a(evpf.c(constructor), "Failed to invoke constructor '", "' with no args"), e3.getCause());
        }
    }

    static String c(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(String.valueOf(cls.getName()));
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + evnd.a("r8-abstract-class");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.evmw a(defpackage.evpj r12) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evmi.a(evpj):evmw");
    }

    public final String toString() {
        return this.a.toString();
    }
}
