package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebsa extends ebsf {
    private final String a;
    private final emxc b;
    private final emxc c;
    private final emxc d;

    public ebsa(String str, emxc emxcVar, emxc emxcVar2, emxc emxcVar3) {
        this.a = str;
        this.b = emxcVar;
        this.c = emxcVar2;
        this.d = emxcVar3;
    }

    @Override // defpackage.ebsf
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.ebsf
    public final emxc b() {
        return this.d;
    }

    @Override // defpackage.ebsf
    public final emxc c() {
        return this.c;
    }

    @Override // defpackage.ebsf
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebsf) {
            ebsf ebsfVar = (ebsf) obj;
            if (this.a.equals(ebsfVar.d()) && this.b.equals(ebsfVar.a()) && this.c.equals(ebsfVar.c()) && this.d.equals(ebsfVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CustomHeaderContentFeature{title=" + this.a + ", subtitle=Optional.absent(), titleTypeface=Optional.absent(), subtitleTypeface=Optional.absent()}";
    }
}
