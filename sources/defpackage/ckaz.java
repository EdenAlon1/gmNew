package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckaz extends ckep {
    public final bdhg a;
    public final awui b;
    public final awui c;
    public final boolean d;
    public final azhq e;
    public final String f;
    public final long g;
    public final long h;
    public final String i;
    public final boolean j;
    public final awxk k;
    private final String l;
    private final azcr m;
    private final String n;
    private final String o;
    private final long p;
    private final int q;
    private final boolean r;
    private final fayv s;
    private final LocationInformation t;
    private final int u;
    private final Bundle v;
    private final boolean w;
    private final boolean x;
    private final boolean y;

    public ckaz(bdhg bdhgVar, String str, awui awuiVar, azcr azcrVar, awui awuiVar2, String str2, boolean z, azhq azhqVar, String str3, String str4, long j, long j2, String str5, long j3, int i, boolean z2, fayv fayvVar, LocationInformation locationInformation, int i2, Bundle bundle, boolean z3, boolean z4, boolean z5, boolean z6, awxk awxkVar) {
        this.a = bdhgVar;
        this.l = str;
        this.b = awuiVar;
        this.m = azcrVar;
        this.c = awuiVar2;
        this.n = str2;
        this.d = z;
        this.e = azhqVar;
        this.f = str3;
        this.o = str4;
        this.g = j;
        this.h = j2;
        this.i = str5;
        this.p = j3;
        this.q = i;
        this.r = z2;
        this.s = fayvVar;
        this.t = locationInformation;
        this.u = i2;
        this.v = bundle;
        this.w = z3;
        this.x = z4;
        this.y = z5;
        this.j = z6;
        this.k = awxkVar;
    }

    @Override // defpackage.ckep
    public final int a() {
        return this.u;
    }

    @Override // defpackage.ckep
    public final int b() {
        return this.q;
    }

    @Override // defpackage.ckep
    public final long c() {
        return this.p;
    }

    @Override // defpackage.ckep
    public final long d() {
        return this.h;
    }

    @Override // defpackage.ckep
    public final long e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        String str;
        azhq azhqVar;
        String str2;
        String str3;
        String str4;
        fayv fayvVar;
        LocationInformation locationInformation;
        awxk awxkVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckep) {
            ckep ckepVar = (ckep) obj;
            if (this.a.equals(ckepVar.l()) && this.l.equals(ckepVar.s()) && this.b.equals(ckepVar.g()) && this.m.equals(ckepVar.j()) && this.c.equals(ckepVar.h()) && ((str = this.n) != null ? str.equals(ckepVar.p()) : ckepVar.p() == null)) {
                ckepVar.B();
                if (this.d == ckepVar.v() && ((azhqVar = this.e) != null ? azhqVar.equals(ckepVar.k()) : ckepVar.k() == null) && ((str2 = this.f) != null ? str2.equals(ckepVar.r()) : ckepVar.r() == null) && ((str3 = this.o) != null ? str3.equals(ckepVar.q()) : ckepVar.q() == null) && this.g == ckepVar.e() && this.h == ckepVar.d() && ((str4 = this.i) != null ? str4.equals(ckepVar.o()) : ckepVar.o() == null) && this.p == ckepVar.c()) {
                    ckepVar.z();
                    ckepVar.A();
                    if (this.q == ckepVar.b() && this.r == ckepVar.w() && ((fayvVar = this.s) != null ? fayvVar.equals(ckepVar.n()) : ckepVar.n() == null) && ((locationInformation = this.t) != null ? locationInformation.equals(ckepVar.m()) : ckepVar.m() == null) && this.u == ckepVar.a() && this.v.equals(ckepVar.f()) && this.w == ckepVar.t() && this.x == ckepVar.x() && this.y == ckepVar.u() && this.j == ckepVar.y() && ((awxkVar = this.k) != null ? awxkVar.equals(ckepVar.i()) : ckepVar.i() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ckep
    public final Bundle f() {
        return this.v;
    }

    @Override // defpackage.ckep
    public final awui g() {
        return this.b;
    }

    @Override // defpackage.ckep
    public final awui h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.c.hashCode();
        String str = this.n;
        int hashCode2 = ((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * (-721379959)) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        azhq azhqVar = this.e;
        int hashCode3 = (hashCode2 ^ (azhqVar == null ? 0 : azhqVar.hashCode())) * 1000003;
        String str2 = this.f;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.o;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        long j = this.g;
        int i = (((hashCode4 ^ hashCode5) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.h;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.i;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        long j3 = this.p;
        int i3 = (((((((i2 ^ hashCode6) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 583896283) ^ this.q) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003;
        fayv fayvVar = this.s;
        int hashCode7 = (i3 ^ (fayvVar == null ? 0 : fayvVar.hashCode())) * 1000003;
        LocationInformation locationInformation = this.t;
        int hashCode8 = (((((((((((((hashCode7 ^ (locationInformation == null ? 0 : locationInformation.hashCode())) * 1000003) ^ this.u) * 1000003) ^ this.v.hashCode()) * 1000003) ^ (true != this.w ? 1237 : 1231)) * 1000003) ^ (true != this.x ? 1237 : 1231)) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ (true == this.j ? 1231 : 1237)) * 1000003;
        awxk awxkVar = this.k;
        return hashCode8 ^ (awxkVar != null ? awxkVar.hashCode() : 0);
    }

    @Override // defpackage.ckep
    public final awxk i() {
        return this.k;
    }

    @Override // defpackage.ckep
    public final azcr j() {
        return this.m;
    }

    @Override // defpackage.ckep
    public final azhq k() {
        return this.e;
    }

    @Override // defpackage.ckep
    public final bdhg l() {
        return this.a;
    }

    @Override // defpackage.ckep
    public final LocationInformation m() {
        return this.t;
    }

    @Override // defpackage.ckep
    public final fayv n() {
        return this.s;
    }

    @Override // defpackage.ckep
    public final String o() {
        return this.i;
    }

    @Override // defpackage.ckep
    public final String p() {
        return this.n;
    }

    @Override // defpackage.ckep
    public final String q() {
        return this.o;
    }

    @Override // defpackage.ckep
    public final String r() {
        return this.f;
    }

    @Override // defpackage.ckep
    @Deprecated
    public final String s() {
        return this.l;
    }

    @Override // defpackage.ckep
    public final boolean t() {
        return this.w;
    }

    public final String toString() {
        awxk awxkVar = this.k;
        Bundle bundle = this.v;
        LocationInformation locationInformation = this.t;
        fayv fayvVar = this.s;
        azhq azhqVar = this.e;
        awui awuiVar = this.c;
        azcr azcrVar = this.m;
        awui awuiVar2 = this.b;
        String obj = this.a.toString();
        String obj2 = awuiVar2.toString();
        String obj3 = azcrVar.toString();
        String obj4 = awuiVar.toString();
        String valueOf = String.valueOf(azhqVar);
        String valueOf2 = String.valueOf(fayvVar);
        String valueOf3 = String.valueOf(locationInformation);
        String obj5 = bundle.toString();
        String valueOf4 = String.valueOf(awxkVar);
        StringBuilder sb = new StringBuilder("ReceiveRcsActionParameters{rcsMessageId=");
        sb.append(obj);
        sb.append(", remoteUserId=");
        sb.append(this.l);
        sb.append(", remoteChatEndpoint=");
        sb.append(obj2);
        sb.append(", senderDestinationToken=");
        sb.append(obj3);
        sb.append(", selfChatEndpoint=");
        sb.append(obj4);
        sb.append(", messageRawText=");
        sb.append(this.n);
        sb.append(", remoteInstance=null, isGroup=");
        sb.append(this.d);
        sb.append(", groupToken=");
        sb.append(valueOf);
        sb.append(", rcsConversationId=");
        sb.append(this.f);
        sb.append(", rcsConferenceUri=");
        sb.append(this.o);
        sb.append(", sentTimestamp=");
        sb.append(this.g);
        sb.append(", receivedTimestamp=");
        sb.append(this.h);
        sb.append(", contentType=");
        sb.append(this.i);
        sb.append(", rcsSessionId=");
        sb.append(this.p);
        sb.append(", alias=null, groupInfo=null, spamVerdict=");
        sb.append(this.q);
        sb.append(", isMarkedAsBot=");
        sb.append(this.r);
        sb.append(", customHeaders=");
        sb.append(valueOf2);
        sb.append(", locationInformation=");
        sb.append(valueOf3);
        sb.append(", messageStatus=");
        sb.append(this.u);
        sb.append(", additionalMessageDetails=");
        sb.append(obj5);
        sb.append(", isDeliveryReportRequested=");
        sb.append(this.w);
        sb.append(", isNegativeDeliveryReportRequested=");
        boolean z = this.j;
        boolean z2 = this.y;
        sb.append(this.x);
        sb.append(", isDisplayReportRequested=");
        sb.append(z2);
        sb.append(", shouldClearTypingIndicator=");
        sb.append(z);
        sb.append(", incomingChatMessageRequest=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.ckep
    public final boolean u() {
        return this.y;
    }

    @Override // defpackage.ckep
    public final boolean v() {
        return this.d;
    }

    @Override // defpackage.ckep
    public final boolean w() {
        return this.r;
    }

    @Override // defpackage.ckep
    public final boolean x() {
        return this.x;
    }

    @Override // defpackage.ckep
    public final boolean y() {
        return this.j;
    }

    @Override // defpackage.ckep
    public final void A() {
    }

    @Override // defpackage.ckep
    public final void B() {
    }

    @Override // defpackage.ckep
    public final void z() {
    }
}
