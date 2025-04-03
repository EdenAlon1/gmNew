package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axaw {
    public final awul a;
    public final fayv b;

    public axaw(awul awulVar, fayv fayvVar) {
        fayvVar.getClass();
        this.a = awulVar;
        this.b = fayvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axaw)) {
            return false;
        }
        axaw axawVar = (axaw) obj;
        return ffkj.e(this.a, axawVar.a) && ffkj.e(this.b, axawVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConvertResult(chatMessageContent=" + this.a + ", customCpimHeaders=" + this.b + ")";
    }
}
