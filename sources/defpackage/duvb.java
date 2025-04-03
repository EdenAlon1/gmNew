package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvb extends duve {
    public final String a;

    public duvb(String str) {
        this.a = str;
    }

    @Override // defpackage.duve, defpackage.duvw
    public final String a() {
        return this.a;
    }

    @Override // defpackage.duvw
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof duvw) {
            duvw duvwVar = (duvw) obj;
            if (duvwVar.b() == 1 && this.a.equals(duvwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Item{emoji=" + this.a + "}";
    }
}
