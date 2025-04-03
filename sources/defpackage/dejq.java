package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dejq {
    public final dejp a;
    public final cvjl b;
    public final boolean c;

    public dejq(dejp dejpVar, cvjl cvjlVar, boolean z) {
        dejpVar.getClass();
        cvjlVar.getClass();
        this.a = dejpVar;
        this.b = cvjlVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dejq)) {
            return false;
        }
        dejq dejqVar = (dejq) obj;
        return this.a == dejqVar.a && this.b == dejqVar.b && this.c == dejqVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "LaunchPathData(launchPath=" + this.a + ", triggerSource=" + this.b + ", hasAccountOnDevice=" + this.c + ")";
    }
}
