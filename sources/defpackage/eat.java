package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eat implements ecd {
    private final ecd a;
    private final int b;

    public eat(ecd ecdVar, int i) {
        this.a = ecdVar;
        this.b = i;
    }

    @Override // defpackage.ecd
    public final int a(jzn jznVar) {
        if (ect.b(this.b, 32)) {
            return this.a.a(jznVar);
        }
        return 0;
    }

    @Override // defpackage.ecd
    public final int b(jzn jznVar, kah kahVar) {
        if (ect.b(this.b, kahVar == kah.a ? 8 : 2)) {
            return this.a.b(jznVar, kahVar);
        }
        return 0;
    }

    @Override // defpackage.ecd
    public final int c(jzn jznVar, kah kahVar) {
        if (ect.b(this.b, kahVar == kah.a ? 4 : 1)) {
            return this.a.c(jznVar, kahVar);
        }
        return 0;
    }

    @Override // defpackage.ecd
    public final int d(jzn jznVar) {
        if (ect.b(this.b, 16)) {
            return this.a.d(jznVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eat)) {
            return false;
        }
        eat eatVar = (eat) obj;
        return ffkj.e(this.a, eatVar.a) && this.b == eatVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        if ((i & 9) == 9) {
            ect.a(sb3, "Start");
        }
        if ((i & 10) == 10) {
            ect.a(sb3, "Left");
        }
        if ((i & 16) == 16) {
            ect.a(sb3, "Top");
        }
        if ((i & 6) == 6) {
            ect.a(sb3, "End");
        }
        if ((i & 5) == 5) {
            ect.a(sb3, "Right");
        }
        if ((i & 32) == 32) {
            ect.a(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
