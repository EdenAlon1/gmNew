package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzke extends dzkg {
    private final dzpn a;

    public dzke(dzpn dzpnVar) {
        this.a = dzpnVar;
    }

    @Override // defpackage.dzkg, defpackage.dzjh
    public final dzpn b() {
        return this.a;
    }

    @Override // defpackage.dzjh
    public final int c() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzjh) {
            dzjh dzjhVar = (dzjh) obj;
            if (dzjhVar.c() == 3 && this.a.equals(dzjhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventCallbackDestination{groupId=" + this.a.toString() + "}";
    }
}
