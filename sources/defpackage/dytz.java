package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dytz extends dyua {
    private final Object a;

    public dytz(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.dyuj
    public final int b() {
        return 2;
    }

    @Override // defpackage.dyua, defpackage.dyuj
    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dyuj) {
            dyuj dyujVar = (dyuj) obj;
            if (dyujVar.b() == 2 && this.a.equals(dyujVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Either{result=" + this.a.toString() + "}";
    }
}
