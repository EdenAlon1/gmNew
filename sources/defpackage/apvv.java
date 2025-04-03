package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apvv implements alxw {
    public final alxw a;
    public final long b;

    public apvv(alxw alxwVar, long j) {
        this.a = alxwVar;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        alxw alxwVar = (alxw) obj;
        alxwVar.getClass();
        if (alxwVar instanceof apvv) {
            return this.a.compareTo(((apvv) alxwVar).a);
        }
        throw new InvalidParameterException("wrong PagingKey type, excepted a VersionedPagingKey");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apvv)) {
            return false;
        }
        apvv apvvVar = (apvv) obj;
        return ffkj.e(this.a, apvvVar.a) && this.b == apvvVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "VersionedPagingKey(innerKey=" + this.a + ", version=" + this.b + ")";
    }
}
