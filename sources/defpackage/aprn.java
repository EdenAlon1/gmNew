package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aprn extends apro {
    public final MessageCoreData a;
    private final apfz b;
    private final appj c;
    private final engw d;
    private final alxr e;
    private final apsd f;
    private final MessageUsageStatisticsDataImpl g;
    private final long h;
    private final long i;

    public aprn(apfz apfzVar, MessageCoreData messageCoreData, appj appjVar, engw engwVar, alxr alxrVar, apsd apsdVar, MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl, long j, long j2) {
        this.b = apfzVar;
        this.a = messageCoreData;
        this.c = appjVar;
        this.d = engwVar;
        this.e = alxrVar;
        this.f = apsdVar;
        this.g = messageUsageStatisticsDataImpl;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.apro
    public final long a() {
        return this.i;
    }

    @Override // defpackage.apro
    public final long b() {
        return this.h;
    }

    @Override // defpackage.apro
    public final alxr c() {
        return this.e;
    }

    @Override // defpackage.apro
    public final apfz d() {
        return this.b;
    }

    @Override // defpackage.apro
    public final appj e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        appj appjVar;
        alxr alxrVar;
        apsd apsdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof apro) {
            apro aproVar = (apro) obj;
            if (this.b.equals(aproVar.d()) && this.a.equals(aproVar.g()) && ((appjVar = this.c) != null ? appjVar.equals(aproVar.e()) : aproVar.e() == null) && enkr.h(this.d, aproVar.i()) && ((alxrVar = this.e) != null ? alxrVar.equals(aproVar.c()) : aproVar.c() == null) && ((apsdVar = this.f) != null ? apsdVar.equals(aproVar.f()) : aproVar.f() == null) && this.g.equals(aproVar.h()) && this.h == aproVar.b() && this.i == aproVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.apro
    public final apsd f() {
        return this.f;
    }

    @Override // defpackage.apro
    public final MessageCoreData g() {
        return this.a;
    }

    @Override // defpackage.apro
    public final MessageUsageStatisticsDataImpl h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
        appj appjVar = this.c;
        int hashCode2 = ((((hashCode * 1000003) ^ (appjVar == null ? 0 : appjVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        alxr alxrVar = this.e;
        int hashCode3 = (hashCode2 ^ (alxrVar == null ? 0 : alxrVar.hashCode())) * 1000003;
        apsd apsdVar = this.f;
        int hashCode4 = (((hashCode3 ^ (apsdVar != null ? apsdVar.hashCode() : 0)) * 1000003) ^ this.g.hashCode()) * 1000003;
        long j = this.h;
        long j2 = this.i;
        return ((hashCode4 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // defpackage.apro
    public final engw i() {
        return this.d;
    }

    public final String toString() {
        MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl = this.g;
        apsd apsdVar = this.f;
        alxr alxrVar = this.e;
        engw engwVar = this.d;
        appj appjVar = this.c;
        MessageCoreData messageCoreData = this.a;
        return "BugleMessageEnvelope{constraints=" + this.b.toString() + ", message=" + messageCoreData.toString() + ", textContent=" + String.valueOf(appjVar) + ", attachments=" + engwVar.toString() + ", repliedToMessage=" + String.valueOf(alxrVar) + ", reactionEnvelopeInfo=" + String.valueOf(apsdVar) + ", usageStatistics=" + messageUsageStatisticsDataImpl.toString() + ", sendStartTime=" + this.h + ", sendElapsedTime=" + this.i + "}";
    }
}
