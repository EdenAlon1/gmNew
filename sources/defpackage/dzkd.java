package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzkd extends dzkg {
    private final dzpg a;

    public dzkd(dzpg dzpgVar) {
        this.a = dzpgVar;
    }

    @Override // defpackage.dzkg, defpackage.dzjh
    public final dzpg a() {
        return this.a;
    }

    @Override // defpackage.dzjh
    public final int c() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzjh) {
            dzjh dzjhVar = (dzjh) obj;
            if (dzjhVar.c() == 2 && this.a.equals(dzjhVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventCallbackDestination{contactId=" + this.a.toString() + "}";
    }
}
