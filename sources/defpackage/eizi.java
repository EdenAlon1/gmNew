package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizi extends eixn {
    public final eixz a;
    private final eisx b;
    private final int c;

    public eizi(eisx eisxVar, eixz eixzVar, int i) {
        this.b = eisxVar;
        if (eixzVar == null) {
            throw new NullPointerException("Null info");
        }
        this.a = eixzVar;
        this.c = i;
    }

    @Override // defpackage.eixn
    public final eisx a() {
        return this.b;
    }

    @Override // defpackage.eixn
    public final eixz b() {
        return this.a;
    }

    @Override // defpackage.eixn
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eixn) {
            eixn eixnVar = (eixn) obj;
            if (this.b.equals(eixnVar.a()) && this.a.equals(eixnVar.b()) && this.c == eixnVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.c;
        eixz eixzVar = this.a;
        return "Account{id=" + this.b.toString() + ", info=" + eixzVar.toString() + ", state=" + Integer.toString(i - 1) + "}";
    }
}
