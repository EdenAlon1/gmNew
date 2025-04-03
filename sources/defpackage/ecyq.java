package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecyq {
    public final ExperimentTokens a;
    public final String b;

    public ecyq(ExperimentTokens experimentTokens, String str) {
        this.a = experimentTokens;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecyq)) {
            return false;
        }
        ecyq ecyqVar = (ecyq) obj;
        return ffkj.e(this.a, ecyqVar.a) && ffkj.e(this.b, ecyqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
