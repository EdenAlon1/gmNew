package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feah extends feao {
    private final feak a;

    public feah(feak feakVar) {
        feakVar.getClass();
        this.a = feakVar;
    }

    @Override // defpackage.feao
    public final feak a(feal fealVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof feah) {
            return this.a.equals(((feah) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FixedResultPicker(" + this.a.toString() + ")";
    }
}
