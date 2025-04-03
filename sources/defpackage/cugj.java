package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cugj {
    public final long a;
    public List b = null;
    public List c = null;
    public culf d = null;
    public List e = null;
    public ParticipantsTable.BindData f = null;
    public byyt g = null;
    public List h = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cugj)) {
            return false;
        }
        cugj cugjVar = (cugj) obj;
        return this.a == cugjVar.a && ffkj.e(this.b, cugjVar.b) && ffkj.e(this.c, cugjVar.c) && ffkj.e(this.d, cugjVar.d) && ffkj.e(this.e, cugjVar.e) && ffkj.e(this.f, cugjVar.f) && this.g == cugjVar.g && ffkj.e(this.h, cugjVar.h);
    }

    public final int hashCode() {
        List list = this.b;
        int hashCode = list == null ? 0 : list.hashCode();
        long j = this.a;
        List list2 = this.c;
        int hashCode2 = list2 == null ? 0 : list2.hashCode();
        int i = (((int) (j ^ (j >>> 32))) * 31) + hashCode;
        culf culfVar = this.d;
        int hashCode3 = ((((i * 31) + hashCode2) * 31) + (culfVar == null ? 0 : culfVar.hashCode())) * 31;
        List list3 = this.e;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ParticipantsTable.BindData bindData = this.f;
        int hashCode5 = (hashCode4 + (bindData == null ? 0 : bindData.hashCode())) * 31;
        byyt byytVar = this.g;
        int hashCode6 = (hashCode5 + (byytVar == null ? 0 : byytVar.hashCode())) * 31;
        List list4 = this.h;
        return hashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        return "SpamLoggingMetadataCache(eventTimestampMillis=" + this.a + ", classifications=" + this.b + ", latestMessages=" + this.c + ", targetMessage=" + this.d + ", participants=" + this.e + ", targetParticipant=" + this.f + ", archiveStatus=" + this.g + ", conversationAndMessageLoggingIds=" + this.h + ")";
    }
}
