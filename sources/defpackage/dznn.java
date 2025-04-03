package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznn extends dzqx {
    private final dzqw a;
    private final String b;
    private final dzqu c;

    public dznn(dzqw dzqwVar, String str, dzqu dzquVar) {
        this.a = dzqwVar;
        this.b = str;
        this.c = dzquVar;
    }

    @Override // defpackage.dzqx
    public final dzqu a() {
        return this.c;
    }

    @Override // defpackage.dzqx
    public final dzqw b() {
        return this.a;
    }

    @Override // defpackage.dzqx
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzqx) {
            dzqx dzqxVar = (dzqx) obj;
            if (this.a.equals(dzqxVar.b()) && this.b.equals(dzqxVar.c()) && this.c.equals(dzqxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        dzqu dzquVar = this.c;
        return "MessageDecoration{renderCriteria=" + this.a.toString() + ", decorationId=" + this.b + ", content=" + dzquVar.toString() + "}";
    }
}
