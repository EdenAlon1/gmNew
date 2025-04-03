package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewwa extends exaf {
    public final engw a;

    public ewwa(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.exaf
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exaf) {
            return enkr.h(this.a, ((exaf) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TextLanguage{locales=" + String.valueOf(this.a) + "}";
    }
}
