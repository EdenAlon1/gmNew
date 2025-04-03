package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqrv extends aqrw {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public aqrv(boolean z, boolean z2, boolean z3, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }

    @Override // defpackage.aqry
    public final int a() {
        return this.d;
    }

    @Override // defpackage.aqry
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.aqry
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.aqry
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqrw) {
            aqrw aqrwVar = (aqrw) obj;
            if (this.a == aqrwVar.b() && this.b == aqrwVar.c() && this.c == aqrwVar.d() && this.d == aqrwVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "BugleVideoCallingOptions{duoEnabled=" + this.a + ", duoSetupRequired=" + this.b + ", reachable=" + this.c + ", rawDuoStatus=" + this.d + "}";
    }
}
