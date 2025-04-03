package defpackage;

import j$.util.Objects;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eekc {
    private final InetAddress f() {
        String d = d();
        if (d == null) {
            return null;
        }
        return erlu.a(d);
    }

    public abstract int a();

    public abstract eejk b();

    public abstract String c();

    public abstract String d();

    final boolean e() {
        return f() instanceof Inet6Address;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eekc)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        eekc eekcVar = (eekc) obj;
        return Objects.equals(f(), eekcVar.f()) && Objects.equals(c(), eekcVar.c()) && a() == eekcVar.a() && Objects.equals(b(), eekcVar.b());
    }

    public final int hashCode() {
        return Objects.hash(f(), c(), Integer.valueOf(a()), b());
    }

    public final String toString() {
        String d = d();
        if (d == null) {
            d = "";
        }
        return String.format(Locale.US, "%s %s/%s", c(), erls.a(d, a()), b());
    }
}
