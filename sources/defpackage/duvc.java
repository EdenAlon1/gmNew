package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvc extends duve {
    private final String a;

    public duvc(String str) {
        this.a = str;
    }

    @Override // defpackage.duvw
    public final int b() {
        return 4;
    }

    @Override // defpackage.duve, defpackage.duvw
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof duvw) {
            duvw duvwVar = (duvw) obj;
            if (duvwVar.b() == 4 && this.a.equals(duvwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Item{emptyCategoryDesc=" + this.a + "}";
    }
}
