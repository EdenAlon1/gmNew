package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuwx extends cuxr {
    private final Matcher a;
    private final String b;
    private final boolean c;

    public cuwx(Matcher matcher, String str, boolean z) {
        if (matcher == null) {
            throw new NullPointerException("Null matcher");
        }
        this.a = matcher;
        if (str == null) {
            throw new NullPointerException("Null replacement");
        }
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.cuxr
    public final String a() {
        return this.b;
    }

    @Override // defpackage.cuxr
    public final Matcher b() {
        return this.a;
    }

    @Override // defpackage.cuxr
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuxr) {
            cuxr cuxrVar = (cuxr) obj;
            if (this.a.equals(cuxrVar.b()) && this.b.equals(cuxrVar.a()) && this.c == cuxrVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "SanitizationRule{matcher=" + this.a.toString() + ", replacement=" + this.b + ", isLoggingEnabled=" + this.c + "}";
    }
}
