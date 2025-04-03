package defpackage;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enuu extends Cenum {
    private static final boolean a = a.a();
    private static final boolean b;
    private static final enul c;

    /* compiled from: PG */
    final class a {
        a() {
        }

        static boolean a() {
            return enuu.t();
        }
    }

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new enul() { // from class: enuu.1
            @Override // defpackage.enul
            public ense a(Class<?> cls, int i) {
                return ense.a;
            }

            @Override // defpackage.enul
            public String b(Class<? extends enrg<?>> cls) {
                StackTraceElement a2;
                if (enuu.a) {
                    try {
                        if (cls.equals(enuu.p())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!enuu.b || (a2 = enxa.a(cls, 1)) == null) {
                    return null;
                }
                return a2.getClassName();
            }
        };
    }

    static Class<?> p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return a.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.Cenum
    protected ento e(String str) {
        if (enuz.d.get() != null) {
            return ((enus) enuz.d.get()).a(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char charAt = str.charAt(length);
                if (charAt != '$') {
                    if (charAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        enuz enuzVar = new enuz(str);
        enux.a.offer(enuzVar);
        if (enuz.d.get() == null) {
            return enuzVar;
        }
        enuz.e();
        return enuzVar;
    }

    @Override // defpackage.Cenum
    protected enul h() {
        return c;
    }

    @Override // defpackage.Cenum
    protected envp j() {
        return enva.a;
    }

    @Override // defpackage.Cenum
    protected String m() {
        return "platform: Android";
    }
}
