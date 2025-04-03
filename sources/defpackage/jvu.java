package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvu {
    public static final hrh a = new hrk(jvs.a, jvt.a);
    public final jlm b;
    public final long c;
    public final jpm d;

    public jvu(jlm jlmVar, long j, jpm jpmVar) {
        this.b = jlmVar;
        this.c = jpn.b(j, a().length());
        this.d = jpmVar != null ? new jpm(jpn.b(jpmVar.b, a().length())) : null;
    }

    public static /* synthetic */ jvu b(jvu jvuVar, jlm jlmVar, long j, int i) {
        if ((i & 1) != 0) {
            jlmVar = jvuVar.b;
        }
        if ((i & 2) != 0) {
            j = jvuVar.c;
        }
        return new jvu(jlmVar, j, (i & 4) != 0 ? jvuVar.d : null);
    }

    public static /* synthetic */ jvu c(jvu jvuVar, String str) {
        return new jvu(new jlm(str), jvuVar.c, jvuVar.d);
    }

    public final String a() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvu)) {
            return false;
        }
        jvu jvuVar = (jvu) obj;
        return jpm.h(this.c, jvuVar.c) && ffkj.e(this.d, jvuVar.d) && ffkj.e(this.b, jvuVar.b);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        long j = jpm.a;
        jpm jpmVar = this.d;
        return ((hashCode + jpl.a(this.c)) * 31) + (jpmVar != null ? jpl.a(jpmVar.b) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.b) + "', selection=" + ((Object) jpm.f(this.c)) + ", composition=" + this.d + ')';
    }

    public /* synthetic */ jvu(jlm jlmVar, long j) {
        this(jlmVar, j, (jpm) null);
    }

    public /* synthetic */ jvu(String str, long j, int i) {
        this(new jlm(1 == (i & 1) ? "" : str), (i & 2) != 0 ? jpm.a : j, (jpm) null);
    }
}
