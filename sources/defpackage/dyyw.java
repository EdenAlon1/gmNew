package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyyw extends dyyx {
    public final dzaq a;

    public dyyw(dzaq dzaqVar) {
        this.a = dzaqVar;
    }

    @Override // defpackage.dyyx, defpackage.dzan
    public final dzaq a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzan) {
            dzan dzanVar = (dzan) obj;
            dzanVar.b();
            if (this.a.equals(dzanVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{deleteConversation=" + this.a.toString() + "}";
    }

    @Override // defpackage.dzan
    public final void b() {
    }
}
