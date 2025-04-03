package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avom extends avoo {
    private final String a;
    private final String b;

    public avom(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.avoo
    public final String a() {
        return this.a;
    }

    @Override // defpackage.avoo
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avoo) {
            avoo avooVar = (avoo) obj;
            if (this.a.equals(avooVar.a()) && this.b.equals(avooVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PresenceCapability{serviceId=" + this.a + ", version=" + this.b + "}";
    }
}
