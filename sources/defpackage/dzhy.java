package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzhy extends dzic {
    private final emxc a;
    private final emxc b;
    private final emxc c;

    public dzhy(emxc emxcVar, emxc emxcVar2, emxc emxcVar3) {
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = emxcVar3;
    }

    @Override // defpackage.dzic
    public final emxc a() {
        return this.c;
    }

    @Override // defpackage.dzic
    public final emxc b() {
        return this.b;
    }

    @Override // defpackage.dzic
    public final emxc c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzic) {
            dzic dzicVar = (dzic) obj;
            if (this.a.equals(dzicVar.c()) && this.b.equals(dzicVar.b()) && this.c.equals(dzicVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        emxc emxcVar2 = this.b;
        return "BootstrapDetail{numberOfMessagesDeleted=" + String.valueOf(this.a) + ", numberOfConversationDownloaded=" + String.valueOf(emxcVar2) + ", bootstrapDuration=" + String.valueOf(emxcVar) + "}";
    }
}
