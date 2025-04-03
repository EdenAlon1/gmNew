package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egik extends egiy {
    private final boolean a;
    private final emxc b;
    private final boolean c;
    private final boolean d;
    private final ewke e;
    private final int f;

    public egik(boolean z, emxc emxcVar, boolean z2, boolean z3, int i, ewke ewkeVar) {
        this.a = z;
        this.b = emxcVar;
        this.c = z2;
        this.d = z3;
        this.f = i;
        this.e = ewkeVar;
    }

    @Override // defpackage.egiy
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.egiy
    public final ewke b() {
        return this.e;
    }

    @Override // defpackage.egiy
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.egiy
    public final boolean d() {
        return this.c;
    }

    @Override // defpackage.egiy
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egiy) {
            egiy egiyVar = (egiy) obj;
            if (this.a == egiyVar.e() && this.b.equals(egiyVar.a()) && this.c == egiyVar.d() && this.d == egiyVar.c() && this.f == egiyVar.f() && this.e.equals(egiyVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.egiy
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((((i ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.f;
        ewke ewkeVar = this.e;
        return "ProfileState{locked=" + this.a + ", currentPhotoUrl=Optional.absent(), isDefault=" + this.c + ", hasAnyGooglePhotos=" + this.d + ", visibilityMessage=" + Integer.toString(i - 1) + ", infoMessage=" + ewkeVar.toString() + "}";
    }
}
