package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cytr {
    public final dnwn a;
    public final ffix b;
    private final cytq c;

    public cytr(dnwn dnwnVar, ffix ffixVar, cytq cytqVar) {
        this.a = dnwnVar;
        this.b = ffixVar;
        this.c = cytqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cytr)) {
            return false;
        }
        cytr cytrVar = (cytr) obj;
        return ffkj.e(this.a, cytrVar.a) && ffkj.e(this.b, cytrVar.b) && ffkj.e(this.c, cytrVar.c);
    }

    public final int hashCode() {
        dnwn dnwnVar = this.a;
        return ((((dnwnVar == null ? 0 : dnwnVar.hashCode()) * 31) + this.b.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "AvatarUiData(avatar=" + this.a + ", onAvatarClick=" + this.b + ", flags=" + this.c + ")";
    }
}
