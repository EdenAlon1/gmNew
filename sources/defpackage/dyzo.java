package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzo extends dzak {
    public final emxc a;
    public final boolean b;
    public final emxc c;

    public dyzo(emxc emxcVar, boolean z, emxc emxcVar2) {
        this.a = emxcVar;
        this.b = z;
        this.c = emxcVar2;
    }

    @Override // defpackage.dzak
    public final emxc a() {
        return this.a;
    }

    @Override // defpackage.dzak
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.dzak
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzak) {
            dzak dzakVar = (dzak) obj;
            if (this.a.equals(dzakVar.a()) && this.b == dzakVar.c() && this.c.equals(dzakVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        return "ChangeGroupProfile{conversationId=" + String.valueOf(this.a) + ", syncBlockStatus=" + this.b + ", profileInfo=" + String.valueOf(emxcVar) + "}";
    }
}
