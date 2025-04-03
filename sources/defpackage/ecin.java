package defpackage;

import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecin extends eciv {
    public final String a;
    public final boolean b;
    public final fgqx c;
    public final fgmh d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final Predicate j;
    public final ecfy k;
    public final int l;

    public ecin(String str, boolean z, fgqx fgqxVar, fgmh fgmhVar, String str2, Long l, boolean z2, boolean z3, int i, Predicate predicate, ecfy ecfyVar, int i2) {
        this.a = str;
        this.b = z;
        this.c = fgqxVar;
        this.d = fgmhVar;
        this.e = str2;
        this.f = l;
        this.g = z2;
        this.h = z3;
        this.i = i;
        this.j = predicate;
        this.k = ecfyVar;
        this.l = i2;
    }

    @Override // defpackage.eciv
    public final int a() {
        return this.l;
    }

    @Override // defpackage.eciv
    public final int b() {
        return this.i;
    }

    @Override // defpackage.eciv
    public final ecfy c() {
        return this.k;
    }

    @Override // defpackage.eciv
    public final Long d() {
        return this.f;
    }

    @Override // defpackage.eciv
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        fgmh fgmhVar;
        String str;
        Long l;
        boolean equals;
        ecfy ecfyVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eciv) {
            eciv ecivVar = (eciv) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(ecivVar.f()) : ecivVar.f() == null) {
                if (this.b == ecivVar.j() && this.c.equals(ecivVar.i()) && ((fgmhVar = this.d) != null ? fgmhVar.equals(ecivVar.h()) : ecivVar.h() == null) && ((str = this.e) != null ? str.equals(ecivVar.e()) : ecivVar.e() == null) && ((l = this.f) != null ? l.equals(ecivVar.d()) : ecivVar.d() == null) && this.g == ecivVar.k() && this.h == ecivVar.l() && this.i == ecivVar.b()) {
                    equals = this.j.equals(ecivVar.g());
                    if (equals && ((ecfyVar = this.k) != null ? ecfyVar.equals(ecivVar.c()) : ecivVar.c() == null) && this.l == ecivVar.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.eciv
    public final String f() {
        return this.a;
    }

    @Override // defpackage.eciv
    public final Predicate g() {
        return this.j;
    }

    @Override // defpackage.eciv
    public final fgmh h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int hashCode2 = (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        fgmh fgmhVar = this.d;
        int hashCode3 = ((hashCode2 * 1000003) ^ (fgmhVar == null ? 0 : fgmhVar.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.f;
        int hashCode5 = (((((((hashCode4 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237)) * 1000003) ^ this.i) * 1000003;
        hashCode = this.j.hashCode();
        int i = (hashCode5 ^ hashCode) * 1000003;
        ecfy ecfyVar = this.k;
        return ((i ^ (ecfyVar != null ? ecfyVar.hashCode() : 0)) * 1000003) ^ this.l;
    }

    @Override // defpackage.eciv
    public final fgqx i() {
        return this.c;
    }

    @Override // defpackage.eciv
    public final boolean j() {
        return this.b;
    }

    @Override // defpackage.eciv
    public final boolean k() {
        return this.g;
    }

    @Override // defpackage.eciv
    public final boolean l() {
        return this.h;
    }

    public final String toString() {
        ecfy ecfyVar = this.k;
        Predicate predicate = this.j;
        fgmh fgmhVar = this.d;
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + this.c.toString() + ", metricExtension=" + String.valueOf(fgmhVar) + ", accountableComponentName=" + this.e + ", sampleRatePermille=" + this.f + ", isUnsampled=" + this.g + ", shouldAttachActiveTraces=" + this.h + ", maxActiveTraces=" + this.i + ", activeTracePredicate=" + predicate.toString() + ", debugLogsTime=" + String.valueOf(ecfyVar) + ", debugLogsSize=" + this.l + "}";
    }
}
