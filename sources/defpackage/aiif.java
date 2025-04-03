package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiif extends IllegalStateException {
    public final String a;
    private final aihr b;
    private final aihv c;
    private final int d;

    public aiif(aihr aihrVar, String str, aihv aihvVar, int i) {
        aihrVar.getClass();
        this.b = aihrVar;
        this.a = str;
        this.c = aihvVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiif)) {
            return false;
        }
        aiif aiifVar = (aiif) obj;
        return ffkj.e(this.b, aiifVar.b) && ffkj.e(this.a, aiifVar.a) && ffkj.e(this.c, aiifVar.c) && this.d == aiifVar.d;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "IllegalNavigationStateTransitionException(from=" + this.b + ", to=" + this.a + ", target=" + this.c + ", requestId=" + this.d + ")";
    }
}
