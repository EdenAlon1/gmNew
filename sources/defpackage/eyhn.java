package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyhn {
    public static final eyhk a(Object obj) {
        return ((eyhl) obj).a;
    }

    public static final boolean b(Object obj) {
        return !((eyhm) obj).b;
    }

    public static final Object c(Object obj, Object obj2) {
        eyhm eyhmVar = (eyhm) obj;
        eyhm eyhmVar2 = (eyhm) obj2;
        if (!eyhmVar2.isEmpty()) {
            if (!eyhmVar.b) {
                eyhmVar = eyhmVar.a();
            }
            eyhmVar.b();
            if (!eyhmVar2.isEmpty()) {
                eyhmVar.putAll(eyhmVar2);
            }
        }
        return eyhmVar;
    }

    public static final Object d() {
        return eyhm.a.a();
    }
}
