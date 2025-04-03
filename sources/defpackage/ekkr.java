package defpackage;

import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekkr {
    private static final ThreadLocal a = new ekkp();

    public static void a(Object obj) {
        ((ekkq) ((Stack) a.get()).pop()).a(obj);
    }

    public static void b(ekkq ekkqVar) {
        emxf.l(((ekkq) ((Stack) a.get()).pop()) == ekkqVar);
    }

    public static void c(ekkq ekkqVar) {
        ((Stack) a.get()).push(ekkqVar);
    }
}
