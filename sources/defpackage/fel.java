package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fel {
    private final euf a;
    private final long b;
    private final boolean c;
    private final int d;

    public fel(euf eufVar, long j, int i, boolean z) {
        this.a = eufVar;
        this.b = j;
        this.d = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fel)) {
            return false;
        }
        fel felVar = (fel) obj;
        return this.a == felVar.a && iak.i(this.b, felVar.b) && this.d == felVar.d && this.c == felVar.c;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + iaj.a(this.b)) * 31) + this.d) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) iak.h(this.b));
        sb.append(", anchor=");
        int i = this.d;
        sb.append((Object) (i != 1 ? i != 2 ? "Right" : "Middle" : "Left"));
        sb.append(", visible=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
