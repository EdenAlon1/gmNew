package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egae extends egam {
    private final duhq a;

    public egae(duhq duhqVar) {
        this.a = duhqVar;
    }

    @Override // defpackage.egam
    public final duhq a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egam) {
            return this.a.equals(((egam) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "PhotoPickerFifeModel{fifeModel=" + this.a.toString() + "}";
    }
}
