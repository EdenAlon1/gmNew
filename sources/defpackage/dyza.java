package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyza extends dyzd {
    private final dzak a;

    public dyza(dzak dzakVar) {
        this.a = dzakVar;
    }

    @Override // defpackage.dzay
    public final int b() {
        return 1;
    }

    @Override // defpackage.dyzd, defpackage.dzay
    public final dzak d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzay) {
            dzay dzayVar = (dzay) obj;
            if (dzayVar.b() == 1 && this.a.equals(dzayVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{changeGroupProfile=" + this.a.toString() + "}";
    }
}
