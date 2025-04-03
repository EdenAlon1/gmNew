package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envn extends enul {
    public static final enul a = new envn();

    private envn() {
    }

    @Override // defpackage.enul
    public final ense a(Class<?> cls, int i) {
        StackTraceElement a2 = enxa.a(cls, i + 1);
        return a2 != null ? new ensx(a2) : ense.a;
    }

    @Override // defpackage.enul
    public final String b(Class<? extends enrg<?>> cls) {
        StackTraceElement a2 = enxa.a(cls, 1);
        if (a2 != null) {
            return a2.getClassName();
        }
        throw new IllegalStateException("no caller found on the stack for: ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}
