package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckba extends ckeu {
    public final String a;

    public ckba(String str) {
        this.a = str;
    }

    @Override // defpackage.ckeu
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckeu) {
            return this.a.equals(((ckeu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LegacyConferenceUri{conferenceUri=" + this.a + "}";
    }
}
