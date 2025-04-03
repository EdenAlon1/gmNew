package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecda {
    public final String a;

    public ecda(String str) {
        this.a = str;
    }

    public static ecda a(ecda ecdaVar, ecda ecdaVar2) {
        return new ecda(String.valueOf(ecdaVar.a).concat(String.valueOf(ecdaVar2.a)));
    }

    public static ecda b(Class cls) {
        return !emxe.c(null) ? new ecda("null".concat(String.valueOf(cls.getSimpleName()))) : new ecda(cls.getSimpleName());
    }

    public static ecda c(String str, Enum r2) {
        return !emxe.c(str) ? new ecda(str.concat(String.valueOf(r2.name()))) : new ecda(r2.name());
    }

    public static String d(ecda ecdaVar) {
        if (ecdaVar == null) {
            return null;
        }
        return ecdaVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ecda) {
            return this.a.equals(((ecda) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
