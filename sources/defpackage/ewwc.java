package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewwc extends exae {
    private final CharSequence a;

    public ewwc(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null text");
        }
        this.a = charSequence;
    }

    @Override // defpackage.exae
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exae) {
            return this.a.equals(((exae) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Request{text=" + this.a.toString() + "}";
    }
}
