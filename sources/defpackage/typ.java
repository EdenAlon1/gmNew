package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class typ extends tys {
    public final byyt a;
    public final ConversationIdType b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final Optional k;
    public final long l;
    public final int m;
    public final boolean n;
    public final String o;
    public final String p;
    public final ayhd q;
    public final boolean r;
    public final amny s;
    public final Optional t;
    private final boolean u;
    private final cpxu v;
    private final boolean w;

    public typ(byyt byytVar, ConversationIdType conversationIdType, int i, boolean z, boolean z2, boolean z3, int i2, String str, String str2, String str3, boolean z4, Optional optional, long j, int i3, boolean z5, String str4, String str5, cpxu cpxuVar, boolean z6, ayhd ayhdVar, boolean z7, amny amnyVar, Optional optional2) {
        this.a = byytVar;
        this.b = conversationIdType;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = i2;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.u = z4;
        this.k = optional;
        this.l = j;
        this.m = i3;
        this.n = z5;
        this.o = str4;
        this.p = str5;
        this.v = cpxuVar;
        this.w = z6;
        this.q = ayhdVar;
        this.r = z7;
        this.s = amnyVar;
        this.t = optional2;
    }

    @Override // defpackage.tys
    public final int a() {
        return this.c;
    }

    @Override // defpackage.tys
    public final int b() {
        return this.g;
    }

    @Override // defpackage.tys
    public final int c() {
        return this.m;
    }

    @Override // defpackage.tys
    public final long d() {
        return this.l;
    }

    @Override // defpackage.tys
    public final amny e() {
        return this.s;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tys) {
            tys tysVar = (tys) obj;
            if (this.a.equals(tysVar.h()) && this.b.equals(tysVar.g()) && this.c == tysVar.a() && this.d == tysVar.w() && this.e == tysVar.s() && this.f == tysVar.t() && this.g == tysVar.b() && ((str = this.h) != null ? str.equals(tysVar.m()) : tysVar.m() == null) && ((str2 = this.i) != null ? str2.equals(tysVar.p()) : tysVar.p() == null) && ((str3 = this.j) != null ? str3.equals(tysVar.l()) : tysVar.l() == null) && this.u == tysVar.v() && this.k.equals(tysVar.j()) && this.l == tysVar.d() && this.m == tysVar.c() && this.n == tysVar.u() && ((str4 = this.o) != null ? str4.equals(tysVar.o()) : tysVar.o() == null) && ((str5 = this.p) != null ? str5.equals(tysVar.n()) : tysVar.n() == null) && this.v.equals(tysVar.i()) && this.w == tysVar.q() && this.q.equals(tysVar.f()) && this.r == tysVar.r() && this.s.equals(tysVar.e()) && this.t.equals(tysVar.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tys
    public final ayhd f() {
        return this.q;
    }

    @Override // defpackage.tys
    public final ConversationIdType g() {
        return this.b;
    }

    @Override // defpackage.tys
    public final byyt h() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.h;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int i = this.c;
        int i2 = hashCode * 1000003;
        int i3 = (((((((((((i2 ^ i) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g) * 1000003) ^ hashCode2) * 1000003;
        String str2 = this.i;
        int hashCode3 = (i3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.j;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003) ^ this.k.hashCode()) * 1000003;
        long j = this.l;
        int i4 = (((((hashCode4 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.m) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003;
        String str4 = this.o;
        int hashCode5 = (i4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.p;
        return ((((((((((((hashCode5 ^ (str5 != null ? str5.hashCode() : 0)) * 1000003) ^ this.v.hashCode()) * 1000003) ^ (true != this.w ? 1237 : 1231)) * 1000003) ^ this.q.hashCode()) * 1000003) ^ (true == this.r ? 1231 : 1237)) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode();
    }

    @Override // defpackage.tys
    public final cpxu i() {
        return this.v;
    }

    @Override // defpackage.tys
    public final Optional j() {
        return this.k;
    }

    @Override // defpackage.tys
    public final Optional k() {
        return this.t;
    }

    @Override // defpackage.tys
    public final String l() {
        return this.j;
    }

    @Override // defpackage.tys
    public final String m() {
        return this.h;
    }

    @Override // defpackage.tys
    public final String n() {
        return this.p;
    }

    @Override // defpackage.tys
    public final String o() {
        return this.o;
    }

    @Override // defpackage.tys
    public final String p() {
        return this.i;
    }

    @Override // defpackage.tys
    public final boolean q() {
        return this.w;
    }

    @Override // defpackage.tys
    public final boolean r() {
        return this.r;
    }

    @Override // defpackage.tys
    public final boolean s() {
        return this.e;
    }

    @Override // defpackage.tys
    public final boolean t() {
        return this.f;
    }

    public final String toString() {
        Optional optional = this.t;
        amny amnyVar = this.s;
        ayhd ayhdVar = this.q;
        cpxu cpxuVar = this.v;
        Optional optional2 = this.k;
        ConversationIdType conversationIdType = this.b;
        return "ConversationMetadata{archiveStatus=" + this.a.toString() + ", conversationId=" + conversationIdType.toString() + ", conversationType=" + this.c + ", shouldEncryptDrafts=" + this.d + ", hasRbmBotRecipient=" + this.e + ", includeEmailAddress=" + this.f + ", joinState=" + this.g + ", name=" + this.h + ", subtitle=" + this.i + ", icon=" + this.j + ", nameIsAutomatic=" + this.u + ", otherParticipantMessagingIdentity=" + String.valueOf(optional2) + ", rcsSessionId=" + this.l + ", sendMode=" + this.m + ", isValid=" + this.n + ", rcsGroupId=" + this.o + ", rcsConferenceUri=" + this.p + ", smsThreadId=" + cpxuVar.toString() + ", awaitingReverseSync=" + this.w + ", errorState=" + ayhdVar.toString() + ", hasBeenE2ee=" + this.r + ", conversationParentalApprovalStatus=" + amnyVar.toString() + ", rcsGroupLastSyncTimestamp=" + String.valueOf(optional) + "}";
    }

    @Override // defpackage.tys
    public final boolean u() {
        return this.n;
    }

    @Override // defpackage.tys
    public final boolean v() {
        return this.u;
    }

    @Override // defpackage.tys
    public final boolean w() {
        return this.d;
    }
}
