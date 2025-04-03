package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxri extends cxxi {
    public final MessageCoreData a;
    public final int b;
    public final long c;
    public final MessageUsageStatisticsData d;

    public cxri(MessageCoreData messageCoreData, int i, long j, MessageUsageStatisticsData messageUsageStatisticsData) {
        if (messageCoreData == null) {
            throw new NullPointerException("Null messageCoreData");
        }
        this.a = messageCoreData;
        this.b = i;
        this.c = j;
        if (messageUsageStatisticsData == null) {
            throw new NullPointerException("Null messageUsageStatisticsData");
        }
        this.d = messageUsageStatisticsData;
    }

    @Override // defpackage.cxxi
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cxxi
    public final long b() {
        return this.c;
    }

    @Override // defpackage.cxxi
    public final MessageCoreData c() {
        return this.a;
    }

    @Override // defpackage.cxxi
    public final MessageUsageStatisticsData d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxxi) {
            cxxi cxxiVar = (cxxi) obj;
            if (this.a.equals(cxxiVar.c()) && this.b == cxxiVar.a() && this.c == cxxiVar.b() && this.d.equals(cxxiVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        return (((((hashCode * 1000003) ^ this.b) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        MessageUsageStatisticsData messageUsageStatisticsData = this.d;
        return "MessageSenderParameters{messageCoreData=" + this.a.toString() + ", conversationSelfSubId=" + this.b + ", sendRealtime=" + this.c + ", messageUsageStatisticsData=" + messageUsageStatisticsData.toString() + "}";
    }
}
