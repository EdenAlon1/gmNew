package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fisy implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    protected abstract long a();

    protected firb b() {
        throw null;
    }

    public abstract fird c();

    public final int d() {
        return c().a(a());
    }

    public final String e(Locale locale) {
        return c().l(a(), locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fisy)) {
            return false;
        }
        fisy fisyVar = (fisy) obj;
        return d() == fisyVar.d() && g().equals(fisyVar.g()) && fite.d(b(), fisyVar.b());
    }

    public final String f(Locale locale) {
        return c().n(a(), locale);
    }

    public final firf g() {
        return c().p();
    }

    public final int hashCode() {
        return (d() * 17) + g().hashCode() + b().hashCode();
    }

    public final String toString() {
        return "Property[" + c().o() + "]";
    }
}
