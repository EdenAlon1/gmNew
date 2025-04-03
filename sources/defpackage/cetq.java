package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cetq extends cfkl {
    public final String a;
    public final String b;
    public final Duration c;
    public final String d;
    public final erqj e;
    public final cevu f;

    public cetq(String str, String str2, Duration duration, String str3, erqj erqjVar, cevu cevuVar) {
        this.a = str;
        this.b = str2;
        this.c = duration;
        this.d = str3;
        this.e = erqjVar;
        this.f = cevuVar;
    }

    @Override // defpackage.cfkl
    public final cevu a() {
        return this.f;
    }

    @Override // defpackage.cfkl
    public final erqj b() {
        return this.e;
    }

    @Override // defpackage.cfkl
    public final Duration c() {
        return this.c;
    }

    @Override // defpackage.cfkl
    public final String d() {
        return this.d;
    }

    @Override // defpackage.cfkl
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cfkl) {
            cfkl cfklVar = (cfkl) obj;
            String str = this.a;
            if (str != null ? str.equals(cfklVar.f()) : cfklVar.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(cfklVar.e()) : cfklVar.e() == null) {
                    Duration duration = this.c;
                    if (duration != null ? duration.equals(cfklVar.c()) : cfklVar.c() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(cfklVar.d()) : cfklVar.d() == null) {
                            erqj erqjVar = this.e;
                            if (erqjVar != null ? erqjVar.equals(cfklVar.b()) : cfklVar.b() == null) {
                                cevu cevuVar = this.f;
                                if (cevuVar != null ? cevuVar.equals(cfklVar.a()) : cfklVar.a() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cfkl
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        Duration duration = this.c;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (duration == null ? 0 : duration.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        erqj erqjVar = this.e;
        int hashCode5 = (hashCode4 ^ (erqjVar == null ? 0 : erqjVar.hashCode())) * 1000003;
        cevu cevuVar = this.f;
        return hashCode5 ^ (cevuVar != null ? cevuVar.hashCode() : 0);
    }

    public final String toString() {
        cevu cevuVar = this.f;
        erqj erqjVar = this.e;
        return "WorkRequestExtras{subQueue=" + this.a + ", deduplicationTag=" + this.b + ", initialDelay=" + String.valueOf(this.c) + ", cancellationTag=" + this.d + ", callback=" + String.valueOf(erqjVar) + ", workQueueCallback=" + String.valueOf(cevuVar) + "}";
    }
}
