package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cygj {
    public final boolean a;
    public final MessageCoreData b;
    public final fbwv c;

    public cygj(boolean z, MessageCoreData messageCoreData, fbwv fbwvVar) {
        this.a = z;
        this.b = messageCoreData;
        this.c = fbwvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cygj)) {
            return false;
        }
        cygj cygjVar = (cygj) obj;
        return this.a == cygjVar.a && ffkj.e(this.b, cygjVar.b) && ffkj.e(this.c, cygjVar.c);
    }

    public final int hashCode() {
        MessageCoreData messageCoreData = this.b;
        int hashCode = ((true != this.a ? 1237 : 1231) * 31) + (messageCoreData == null ? 0 : messageCoreData.hashCode());
        fbwv fbwvVar = this.c;
        return (hashCode * 31) + (fbwvVar != null ? fbwvVar.hashCode() : 0);
    }

    public final String toString() {
        return "NudgeLoadedData(isBannerEligible=" + this.a + ", latestMessage=" + this.b + ", nudgeClassification=" + this.c + ")";
    }
}
