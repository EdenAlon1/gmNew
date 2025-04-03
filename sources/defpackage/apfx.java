package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apfx extends apfz {
    private final ConversationId b;
    private final alyx c;
    private final enip d;
    private final alxh e;
    private final long f;
    private final boolean g;
    private final int h;
    private final int i;
    private final aqux j;
    private final engw k;
    private final azcr l;
    private final aqns m;
    private final eoxo n;
    private final amtc o;
    private final alxi p;
    private final boolean q;
    private final int r;
    private final int s;

    public apfx(ConversationId conversationId, alyx alyxVar, enip enipVar, alxh alxhVar, long j, int i, boolean z, int i2, int i3, aqux aquxVar, engw engwVar, azcr azcrVar, aqns aqnsVar, eoxo eoxoVar, amtc amtcVar, alxi alxiVar, boolean z2, int i4) {
        this.b = conversationId;
        this.c = alyxVar;
        this.d = enipVar;
        this.e = alxhVar;
        this.f = j;
        this.r = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = aquxVar;
        this.k = engwVar;
        this.l = azcrVar;
        this.m = aqnsVar;
        this.n = eoxoVar;
        this.o = amtcVar;
        this.p = alxiVar;
        this.q = z2;
        this.s = i4;
    }

    @Override // defpackage.alxg
    public final int a() {
        return this.h;
    }

    @Override // defpackage.alxg
    public final int b() {
        return this.i;
    }

    @Override // defpackage.alxg
    public final long c() {
        return this.f;
    }

    @Override // defpackage.alxg
    public final alxh d() {
        return this.e;
    }

    @Override // defpackage.alxg
    public final alyx e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        aqux aquxVar;
        aqns aqnsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof apfz) {
            apfz apfzVar = (apfz) obj;
            if (this.b.equals(apfzVar.f()) && this.c.equals(apfzVar.e()) && this.d.equals(apfzVar.i()) && this.e.equals(apfzVar.d()) && this.f == apfzVar.c() && this.r == apfzVar.n() && this.g == apfzVar.l() && this.h == apfzVar.a() && this.i == apfzVar.b() && ((aquxVar = this.j) != null ? aquxVar.equals(apfzVar.g()) : apfzVar.g() == null) && enkr.h(this.k, apfzVar.s()) && this.l.equals(apfzVar.r()) && ((aqnsVar = this.m) != null ? aqnsVar.equals(apfzVar.q()) : apfzVar.q() == null) && this.n.equals(apfzVar.t()) && this.o.equals(apfzVar.p()) && this.p.equals(apfzVar.o()) && this.q == apfzVar.u() && this.s == apfzVar.v()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.alxg
    public final ConversationId f() {
        return this.b;
    }

    @Override // defpackage.apfz, defpackage.alxg
    public final aqux g() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        aqux aquxVar = this.j;
        int hashCode2 = aquxVar == null ? 0 : aquxVar.hashCode();
        long j = this.f;
        int hashCode3 = ((((((((((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.r) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ hashCode2) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003;
        aqns aqnsVar = this.m;
        return ((((((((((hashCode3 ^ (aqnsVar != null ? aqnsVar.hashCode() : 0)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ (true == this.q ? 1231 : 1237)) * 1000003) ^ this.s;
    }

    @Override // defpackage.alxg
    public final enip i() {
        return this.d;
    }

    @Override // defpackage.alxg
    public final boolean l() {
        return this.g;
    }

    @Override // defpackage.alxg
    public final int n() {
        return this.r;
    }

    @Override // defpackage.apfz
    public final alxi o() {
        return this.p;
    }

    @Override // defpackage.apfz
    public final amtc p() {
        return this.o;
    }

    @Override // defpackage.apfz
    public final aqns q() {
        return this.m;
    }

    @Override // defpackage.apfz
    public final azcr r() {
        return this.l;
    }

    @Override // defpackage.apfz
    public final engw s() {
        return this.k;
    }

    @Override // defpackage.apfz
    public final eoxo t() {
        return this.n;
    }

    public final String toString() {
        int i = this.s;
        alxi alxiVar = this.p;
        amtc amtcVar = this.o;
        eoxo eoxoVar = this.n;
        aqns aqnsVar = this.m;
        azcr azcrVar = this.l;
        engw engwVar = this.k;
        aqux aquxVar = this.j;
        alxh alxhVar = this.e;
        enip enipVar = this.d;
        alyx alyxVar = this.c;
        return "BugleComposeConstraints{conversationId=" + this.b.toString() + ", bestAvailableTransportFeatureSet=" + alyxVar.toString() + ", supportedTransportFeatureSets=" + String.valueOf(enipVar) + ", composeDisabledReason=" + alxhVar.toString() + ", maxMessageSizeBytes=" + this.f + ", attachmentMode=" + alxf.a(this.r) + ", locationSharingSupported=" + this.g + ", attachmentCountLimit=" + this.h + ", textLengthLimit=" + this.i + ", selfIdentity=" + String.valueOf(aquxVar) + ", recipients=" + engwVar.toString() + ", destinationToken=" + azcrVar.toString() + ", aggregateCapabilities=" + String.valueOf(aqnsVar) + ", conversationProtocolConditions=" + eoxoVar.toString() + ", palMode=" + amtcVar.toString() + ", conversationKind=" + alxiVar.toString() + ", wasRcsConversation=" + this.q + ", encryptionAlgorithm=" + (i != 1 ? "SCYTALE" : "NONE") + "}";
    }

    @Override // defpackage.apfz
    public final boolean u() {
        return this.q;
    }

    @Override // defpackage.apfz
    public final int v() {
        return this.s;
    }
}
