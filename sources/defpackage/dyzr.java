package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzr extends dzao {
    private final dzan a;

    public dyzr(dzan dzanVar) {
        this.a = dzanVar;
    }

    @Override // defpackage.dzao
    public final dzan a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzao) {
            return this.a.equals(((dzao) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CloudUpdate{oneOfType=" + this.a.toString() + "}";
    }
}
