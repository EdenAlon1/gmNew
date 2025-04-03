package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hud extends RuntimeException {
    private final List a;

    public hud(List list) {
        this.a = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        fffs fffsVar = new fffs((byte[]) null);
        List B = ffdx.B(this.a);
        if (((ffcy) B).a() > 0) {
            throw null;
        }
        List B2 = ffdx.B(ffdx.a(fffsVar));
        int a = ((ffcy) B2).a();
        for (int i = 0; i < a; i++) {
            sb.append("\tat ".concat(String.valueOf((String) B2.get(i))));
            sb.append('\n');
        }
        return sb.toString();
    }
}
