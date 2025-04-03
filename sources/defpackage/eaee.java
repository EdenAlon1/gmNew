package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eaee {
    public final String a;

    protected eaee(String str) {
        this.a = str;
    }

    public abstract void a(Level level, String str, Throwable th, String str2, Object... objArr);

    public final void b(String str) {
        a(Level.FINE, this.a, null, str, new Object[0]);
    }

    public final void c(String str, Object... objArr) {
        a(Level.FINE, this.a, null, str, objArr);
    }
}
