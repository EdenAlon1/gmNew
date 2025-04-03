package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elnq extends elnu {
    private final String f = "";
    private final int g;

    public elnq(int i) {
        this.g = i;
    }

    @Override // defpackage.elnu
    public final String a() {
        return this.f;
    }

    @Override // defpackage.elnu
    public final int b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elnu) {
            elnu elnuVar = (elnu) obj;
            if (this.g == elnuVar.b() && this.f.equals(elnuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.g ^ 1000003) * 1000003) ^ this.f.hashCode();
    }
}
