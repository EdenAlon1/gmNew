package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bagm {
    public final Action a;
    public final MessageCoreData b;
    public final DeviceData c;
    public final MessageUsageStatisticsData d;
    public final eooi e;
    public final long f;
    public final int g;
    public final int h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final bawc p;

    public bagm(Action action, MessageCoreData messageCoreData, DeviceData deviceData, MessageUsageStatisticsData messageUsageStatisticsData, eooi eooiVar, long j, int i, int i2, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bawc bawcVar) {
        messageCoreData.getClass();
        this.a = action;
        this.b = messageCoreData;
        this.c = deviceData;
        this.d = messageUsageStatisticsData;
        this.e = eooiVar;
        this.f = j;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = str;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = bawcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bagm)) {
            return false;
        }
        bagm bagmVar = (bagm) obj;
        return ffkj.e(this.a, bagmVar.a) && ffkj.e(this.b, bagmVar.b) && ffkj.e(this.c, bagmVar.c) && ffkj.e(this.d, bagmVar.d) && this.e == bagmVar.e && this.f == bagmVar.f && this.g == bagmVar.g && this.h == bagmVar.h && this.i == bagmVar.i && ffkj.e(this.j, bagmVar.j) && this.k == bagmVar.k && this.l == bagmVar.l && this.m == bagmVar.m && this.n == bagmVar.n && this.o == bagmVar.o && ffkj.e(this.p, bagmVar.p);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        DeviceData deviceData = this.c;
        int hashCode2 = ((hashCode * 31) + (deviceData == null ? 0 : deviceData.hashCode())) * 31;
        MessageUsageStatisticsData messageUsageStatisticsData = this.d;
        int hashCode3 = (hashCode2 + (messageUsageStatisticsData == null ? 0 : messageUsageStatisticsData.hashCode())) * 31;
        eooi eooiVar = this.e;
        int hashCode4 = eooiVar == null ? 0 : eooiVar.hashCode();
        long j = this.f;
        int a = (((((((((hashCode3 + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.g) * 31) + this.h) * 31) + bagl.a(this.i)) * 31;
        String str = this.j;
        int hashCode5 = (((((((((((a + (str == null ? 0 : str.hashCode())) * 31) + bagl.a(this.k)) * 31) + bagl.a(this.l)) * 31) + bagl.a(this.m)) * 31) + bagl.a(this.n)) * 31) + bagl.a(this.o)) * 31;
        bawc bawcVar = this.p;
        return hashCode5 + (bawcVar != null ? bawcVar.hashCode() : 0);
    }

    public final String toString() {
        return "InsertNewMessageParameters(parentAction=" + this.a + ", message=" + this.b + ", secondaryDeviceData=" + this.c + ", defaultStatsData=" + this.d + ", source=" + this.e + ", sentTime=" + this.f + ", requestedSubId=" + this.g + ", requestedLockedDefaultSmsSubId=" + this.h + ", updateDraft=" + this.i + ", archiveStatusValue=" + this.j + ", shouldRefreshNotification=" + this.k + ", isFromNotification=" + this.l + ", hasRbmBotRecipient=" + this.m + ", isEarlySend=" + this.n + ", hasUiBeenNotified=" + this.o + ", messageSaveCallback=" + this.p + ")";
    }
}
