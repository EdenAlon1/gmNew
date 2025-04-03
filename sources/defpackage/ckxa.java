package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckxa extends ckxn {
    public final engw a;
    public final engw b;

    public ckxa(engw engwVar, engw engwVar2) {
        if (engwVar == null) {
            throw new NullPointerException("Null usersWhoLeft");
        }
        this.a = engwVar;
        if (engwVar2 == null) {
            throw new NullPointerException("Null usersWhoJoined");
        }
        this.b = engwVar2;
    }

    @Override // defpackage.ckxn
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.ckxn
    public final engw b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckxn) {
            ckxn ckxnVar = (ckxn) obj;
            if (enkr.h(this.a, ckxnVar.b()) && enkr.h(this.b, ckxnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        engw engwVar = this.b;
        return "UsersToUpdate{usersWhoLeft=" + this.a.toString() + ", usersWhoJoined=" + engwVar.toString() + "}";
    }
}
