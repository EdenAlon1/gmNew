package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzob extends dzry {
    private final dzrw a;

    public dzob(dzrw dzrwVar) {
        this.a = dzrwVar;
    }

    @Override // defpackage.dzry
    public final dzrw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzry) {
            return this.a.equals(((dzry) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RichTextContentModel{content=" + this.a.toString() + "}";
    }
}
