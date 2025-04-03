package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtqy extends dttz {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final engw f;
    public final int g;
    private final dtty h;

    public dtqy(String str, String str2, int i, int i2, boolean z, engw engwVar, dtty dttyVar, int i3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = engwVar;
        this.h = dttyVar;
        this.g = i3;
    }

    @Override // defpackage.dttz
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dttz
    public final int b() {
        return this.g;
    }

    @Override // defpackage.dttz
    public final int c() {
        return this.d;
    }

    @Override // defpackage.dttz
    public final dtty d() {
        return this.h;
    }

    @Override // defpackage.dttz
    public final engw e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        dtty dttyVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dttz) {
            dttz dttzVar = (dttz) obj;
            if (this.a.equals(dttzVar.g()) && this.b.equals(dttzVar.f()) && this.c == dttzVar.a() && this.d == dttzVar.c() && this.e == dttzVar.h() && enkr.h(this.f, dttzVar.e()) && ((dttyVar = this.h) != null ? dttyVar.equals(dttzVar.d()) : dttzVar.d() == null) && this.g == dttzVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dttz
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dttz
    public final String g() {
        return this.a;
    }

    @Override // defpackage.dttz
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int hashCode2 = (((((((hashCode * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode();
        dtty dttyVar = this.h;
        return (((hashCode2 * 1000003) ^ (dttyVar == null ? 0 : dttyVar.hashCode())) * 1000003) ^ this.g;
    }

    public final String toString() {
        dtty dttyVar = this.h;
        return "DatabaseConstructionParameters{storageFileName=" + this.a + ", handleName=" + this.b + ", currentSchemaVersion=" + this.c + ", transactionOrderingPosition=" + this.d + ", ignoreDowngrade=" + this.e + ", invalidRanges=" + this.f.toString() + ", onOpenCallback=" + String.valueOf(dttyVar) + ", maxAllowableSchemaVersionForUniqueIndex=" + this.g + "}";
    }
}
