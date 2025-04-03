package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvwo extends dvwq {
    public final String a;
    public final eyhs b;
    public final epme c;
    public final Integer d;
    public final faxs e;
    public final int[] f;
    public final int[] g;
    public final dfli h;

    public dvwo(String str, eyhs eyhsVar, epme epmeVar, Integer num, faxs faxsVar, int[] iArr, int[] iArr2, dfli dfliVar) {
        this.a = str;
        this.b = eyhsVar;
        this.c = epmeVar;
        this.d = num;
        this.e = faxsVar;
        this.f = iArr;
        this.g = iArr2;
        this.h = dfliVar;
    }

    @Override // defpackage.dvwq
    public final dfli a() {
        return this.h;
    }

    @Override // defpackage.dvwq
    public final epme b() {
        return this.c;
    }

    @Override // defpackage.dvwq
    public final eyhs c() {
        return this.b;
    }

    @Override // defpackage.dvwq
    public final faxs d() {
        return this.e;
    }

    @Override // defpackage.dvwq
    public final Integer e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        epme epmeVar;
        Integer num;
        dfli dfliVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvwq) {
            dvwq dvwqVar = (dvwq) obj;
            if (this.a.equals(dvwqVar.f()) && this.b.equals(dvwqVar.c()) && ((epmeVar = this.c) != null ? epmeVar.equals(dvwqVar.b()) : dvwqVar.b() == null) && ((num = this.d) != null ? num.equals(dvwqVar.e()) : dvwqVar.e() == null)) {
                dvwqVar.j();
                dvwqVar.i();
                if (this.e.equals(dvwqVar.d())) {
                    dvwqVar.k();
                    boolean z = dvwqVar instanceof dvwo;
                    if (Arrays.equals(this.f, z ? ((dvwo) dvwqVar).f : dvwqVar.g())) {
                        if (Arrays.equals(this.g, z ? ((dvwo) dvwqVar).g : dvwqVar.h()) && ((dfliVar = this.h) != null ? dfliVar.equals(dvwqVar.a()) : dvwqVar.a() == null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dvwq
    public final String f() {
        return this.a;
    }

    @Override // defpackage.dvwq
    public final int[] g() {
        return this.f;
    }

    @Override // defpackage.dvwq
    public final int[] h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        epme epmeVar = this.c;
        int hashCode2 = ((hashCode * 1000003) ^ (epmeVar == null ? 0 : epmeVar.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode3 = (((((((hashCode2 ^ (num == null ? 0 : num.hashCode())) * 583896283) ^ this.e.hashCode()) * (-721379959)) ^ Arrays.hashCode(this.f)) * 1000003) ^ Arrays.hashCode(this.g)) * 1000003;
        dfli dfliVar = this.h;
        return hashCode3 ^ (dfliVar != null ? dfliVar.hashCode() : 0);
    }

    public final String toString() {
        dfli dfliVar = this.h;
        int[] iArr = this.g;
        int[] iArr2 = this.f;
        faxs faxsVar = this.e;
        epme epmeVar = this.c;
        return "ClearcutData{logSource=" + this.a + ", message=" + this.b.toString() + ", visualElements=" + String.valueOf(epmeVar) + ", eventCode=" + this.d + ", wallTime=null, elapsedTime=null, qosTier=" + faxsVar.toString() + ", logVerifier=null, experimentIds=" + Arrays.toString(iArr2) + ", testCodes=" + Arrays.toString(iArr) + ", complianceProductData=" + String.valueOf(dfliVar) + "}";
    }

    @Override // defpackage.dvwq
    public final void i() {
    }

    @Override // defpackage.dvwq
    public final void j() {
    }

    @Override // defpackage.dvwq
    public final void k() {
    }
}
