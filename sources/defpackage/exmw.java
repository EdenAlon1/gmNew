package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class exmw {
    public abstract float a();

    public abstract int b();

    public abstract String c();

    public abstract String d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof exmw)) {
            return false;
        }
        exmw exmwVar = (exmw) obj;
        return Math.abs(exmwVar.a() - a()) < 1.0E-6f && exmwVar.b() == b() && exmwVar.c().equals(c()) && exmwVar.d().equals(d());
    }

    public final int hashCode() {
        return Objects.hash(c(), d(), Float.valueOf(a()), Integer.valueOf(b()));
    }

    public final String toString() {
        return "<Category \"" + c() + "\" (displayName=" + d() + " score=" + a() + " index=" + b() + ")>";
    }
}
