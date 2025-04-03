package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awjo extends awkh {
    private final ConversationIdType a;
    private final cpxu b;
    private final String c;
    private final byyy d;
    private final Optional e;
    private final boolean f;
    private final String g;
    private final String h;
    private final Optional i;
    private final cknh j;
    private final awui k;
    private final SelfIdentityId l;
    private final int m;
    private final ayhd n;
    private final aztg o;

    public awjo(ConversationIdType conversationIdType, cpxu cpxuVar, String str, byyy byyyVar, Optional optional, boolean z, String str2, String str3, Optional optional2, cknh cknhVar, awui awuiVar, SelfIdentityId selfIdentityId, int i, ayhd ayhdVar, aztg aztgVar) {
        this.a = conversationIdType;
        this.b = cpxuVar;
        this.c = str;
        this.d = byyyVar;
        this.e = optional;
        this.f = z;
        this.g = str2;
        this.h = str3;
        this.i = optional2;
        this.j = cknhVar;
        this.k = awuiVar;
        this.l = selfIdentityId;
        this.m = i;
        this.n = ayhdVar;
        this.o = aztgVar;
    }

    @Override // defpackage.awkh
    public final int a() {
        return this.m;
    }

    @Override // defpackage.awkh
    public final SelfIdentityId b() {
        return this.l;
    }

    @Override // defpackage.awkh
    public final awui c() {
        return this.k;
    }

    @Override // defpackage.awkh
    public final ayhd d() {
        return this.n;
    }

    @Override // defpackage.awkh
    public final aztg e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awkh) {
            awkh awkhVar = (awkh) obj;
            if (this.a.equals(awkhVar.f()) && this.b.equals(awkhVar.i()) && this.c.equals(awkhVar.l()) && this.d.equals(awkhVar.g()) && this.e.equals(awkhVar.j()) && this.f == awkhVar.o() && this.g.equals(awkhVar.n()) && this.h.equals(awkhVar.m()) && this.i.equals(awkhVar.k()) && this.j.equals(awkhVar.h()) && this.k.equals(awkhVar.c()) && this.l.equals(awkhVar.b()) && this.m == awkhVar.a() && this.n.equals(awkhVar.d()) && this.o.equals(awkhVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.awkh
    public final ConversationIdType f() {
        return this.a;
    }

    @Override // defpackage.awkh
    public final byyy g() {
        return this.d;
    }

    @Override // defpackage.awkh
    public final cknh h() {
        return this.j;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode();
    }

    @Override // defpackage.awkh
    public final cpxu i() {
        return this.b;
    }

    @Override // defpackage.awkh
    public final Optional j() {
        return this.e;
    }

    @Override // defpackage.awkh
    public final Optional k() {
        return this.i;
    }

    @Override // defpackage.awkh
    public final String l() {
        return this.c;
    }

    @Override // defpackage.awkh
    public final String m() {
        return this.h;
    }

    @Override // defpackage.awkh
    public final String n() {
        return this.g;
    }

    @Override // defpackage.awkh
    public final boolean o() {
        return this.f;
    }

    public final String toString() {
        return "GroupConversationMetadata{conversationId=" + this.a.toString() + ", smsThreadId=" + this.b.toString() + ", name=" + this.c + ", groupNameSource=" + this.d.toString() + ", rcsGroupIconUrl=" + String.valueOf(this.e) + ", isUpgradeFromMmsGroup=" + this.f + ", rcsGroupId=" + this.g + ", rcsConferenceUri=" + this.h + ", rcsGroupSelfMsisdn=" + String.valueOf(this.i) + ", rcsGroupCapabilities=" + this.j.toString() + ", currentActiveRcsMsisdn=" + this.k.toString() + ", selfParticipantId=" + ((SelfIdentityIdImpl) this.l).a + ", joinState=" + this.m + ", errorState=" + this.n.toString() + ", selfSubscription=" + this.o.toString() + "}";
    }
}
