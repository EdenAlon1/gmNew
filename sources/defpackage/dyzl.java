package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzl extends dyyv {
    public final dzpt a;
    public final dzas b;

    public dyzl(dzpt dzptVar, dzas dzasVar) {
        this.a = dzptVar;
        this.b = dzasVar;
    }

    @Override // defpackage.dyyv
    public final dzas a() {
        return this.b;
    }

    @Override // defpackage.dyyv
    public final dzpt b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyyv) {
            dyyv dyyvVar = (dyyv) obj;
            if (this.a.equals(dyyvVar.b()) && this.b.equals(dyyvVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        dzas dzasVar = this.b;
        return "AddKickGroupUsers{conversationId=" + this.a.toString() + ", groupInfoChanges=" + dzasVar.toString() + "}";
    }
}
