package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajqe implements ajqq {
    public final emyg a;
    public final int b;

    public ajqe(int i, emyg emygVar) {
        this.b = i;
        this.a = emygVar;
    }

    @Override // defpackage.ajqq
    public final emyg a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajqe)) {
            return false;
        }
        ajqe ajqeVar = (ajqe) obj;
        return this.b == ajqeVar.b && ffkj.e(this.a, ajqeVar.a);
    }

    public final int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "LoadingDraftToken(invocationSource=" + ((Object) ajug.a(this.b)) + ", stopwatch=" + this.a + ")";
    }
}
