package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyty extends dyua {
    private final dzhm a;

    public dyty(dzhm dzhmVar) {
        this.a = dzhmVar;
    }

    @Override // defpackage.dyua, defpackage.dyuj
    public final dzhm a() {
        return this.a;
    }

    @Override // defpackage.dyuj
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dyuj) {
            dyuj dyujVar = (dyuj) obj;
            if (dyujVar.b() == 1 && this.a.equals(dyujVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Either{error=" + this.a.toString() + "}";
    }
}
