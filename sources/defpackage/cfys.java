package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfys {
    public final long a;
    public final SmartSuggestionData b;

    public cfys(long j, SmartSuggestionData smartSuggestionData) {
        this.a = j;
        this.b = smartSuggestionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfys)) {
            return false;
        }
        cfys cfysVar = (cfys) obj;
        return this.a == cfysVar.a && ffkj.e(this.b, cfysVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SmartSuggestionLoggingInfo(timestamp=" + this.a + ", suggestion=" + this.b + ")";
    }
}
