package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahii extends ahij {
    private final cxkc a;
    private final long b;
    private final SuperSortLabel c;

    public ahii(cxkc cxkcVar, long j, SuperSortLabel superSortLabel) {
        if (cxkcVar == null) {
            throw new NullPointerException("Null consentState");
        }
        this.a = cxkcVar;
        this.b = j;
        if (superSortLabel == null) {
            throw new NullPointerException("Null defaultLabel");
        }
        this.c = superSortLabel;
    }

    @Override // defpackage.ahij
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ahij
    public final SuperSortLabel b() {
        return this.c;
    }

    @Override // defpackage.ahij
    public final cxkc c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahij) {
            ahij ahijVar = (ahij) obj;
            if (this.a.equals(ahijVar.c()) && this.b == ahijVar.a() && this.c.equals(ahijVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        SuperSortLabel superSortLabel = this.c;
        return "SuperSortSettingState{consentState=" + this.a.toString() + ", quickClassificationsAttempts=" + this.b + ", defaultLabel=" + superSortLabel.toString() + "}";
    }
}
