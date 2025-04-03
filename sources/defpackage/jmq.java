package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmq {
    public final jmp a;
    public final jmo b;

    public jmq(jmp jmpVar, jmo jmoVar) {
        this.a = jmpVar;
        this.b = jmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmq)) {
            return false;
        }
        jmq jmqVar = (jmq) obj;
        return ffkj.e(this.b, jmqVar.b) && ffkj.e(this.a, jmqVar.a);
    }

    public final int hashCode() {
        jmp jmpVar = this.a;
        int hashCode = jmpVar != null ? jmpVar.hashCode() : 0;
        jmo jmoVar = this.b;
        return (hashCode * 31) + (jmoVar != null ? jmoVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public jmq() {
        this(null, new jmo((byte[]) null));
    }
}
