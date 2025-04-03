package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbmh extends cbni {
    private final MessageIdType a;
    private final ConversationIdType b;
    private final String c;
    private final boolean d;
    private final long e;
    private final String f;
    private final Optional g;
    private final int h;
    private final fbuk i;
    private final String j;
    private final fbuk k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final Long q;
    private final boolean r;

    public cbmh(MessageIdType messageIdType, ConversationIdType conversationIdType, String str, boolean z, long j, String str2, Optional optional, int i, fbuk fbukVar, String str3, fbuk fbukVar2, String str4, String str5, String str6, String str7, String str8, Long l, boolean z2) {
        this.a = messageIdType;
        this.b = conversationIdType;
        this.c = str;
        this.d = z;
        this.e = j;
        this.f = str2;
        this.g = optional;
        this.h = i;
        this.i = fbukVar;
        this.j = str3;
        this.k = fbukVar2;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = str7;
        this.p = str8;
        this.q = l;
        this.r = z2;
    }

    @Override // defpackage.cbni
    public final int a() {
        return this.h;
    }

    @Override // defpackage.cbni
    public final long b() {
        return this.e;
    }

    @Override // defpackage.cbni
    public final ConversationIdType c() {
        return this.b;
    }

    @Override // defpackage.cbni
    public final MessageIdType d() {
        return this.a;
    }

    @Override // defpackage.cbni
    public final fbuk e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        fbuk fbukVar;
        String str3;
        fbuk fbukVar2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbni) {
            cbni cbniVar = (cbni) obj;
            if (this.a.equals(cbniVar.d()) && this.b.equals(cbniVar.c()) && ((str = this.c) != null ? str.equals(cbniVar.p()) : cbniVar.p() == null) && this.d == cbniVar.q() && this.e == cbniVar.b() && ((str2 = this.f) != null ? str2.equals(cbniVar.o()) : cbniVar.o() == null) && this.g.equals(cbniVar.g()) && this.h == cbniVar.a() && ((fbukVar = this.i) != null ? fbukVar.equals(cbniVar.e()) : cbniVar.e() == null) && ((str3 = this.j) != null ? str3.equals(cbniVar.i()) : cbniVar.i() == null) && ((fbukVar2 = this.k) != null ? fbukVar2.equals(cbniVar.f()) : cbniVar.f() == null) && ((str4 = this.l) != null ? str4.equals(cbniVar.j()) : cbniVar.j() == null) && ((str5 = this.m) != null ? str5.equals(cbniVar.m()) : cbniVar.m() == null) && ((str6 = this.n) != null ? str6.equals(cbniVar.n()) : cbniVar.n() == null) && ((str7 = this.o) != null ? str7.equals(cbniVar.k()) : cbniVar.k() == null) && ((str8 = this.p) != null ? str8.equals(cbniVar.l()) : cbniVar.l() == null) && ((l = this.q) != null ? l.equals(cbniVar.h()) : cbniVar.h() == null) && this.r == cbniVar.r()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cbni
    public final fbuk f() {
        return this.k;
    }

    @Override // defpackage.cbni
    public final Optional g() {
        return this.g;
    }

    @Override // defpackage.cbni
    public final Long h() {
        return this.q;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i = true != this.d ? 1237 : 1231;
        long j = this.e;
        int i2 = (((hashCode2 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str2 = this.f;
        int hashCode3 = (((((i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003;
        fbuk fbukVar = this.i;
        int hashCode4 = (hashCode3 ^ (fbukVar == null ? 0 : fbukVar.hashCode())) * 1000003;
        String str3 = this.j;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        fbuk fbukVar2 = this.k;
        int hashCode6 = (hashCode5 ^ (fbukVar2 == null ? 0 : fbukVar2.hashCode())) * 1000003;
        String str4 = this.l;
        int hashCode7 = (hashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.m;
        int hashCode8 = (hashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.n;
        int hashCode9 = (hashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.o;
        int hashCode10 = (hashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.p;
        int hashCode11 = (hashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        Long l = this.q;
        return ((hashCode11 ^ (l != null ? l.hashCode() : 0)) * 1000003) ^ (true == this.r ? 1231 : 1237);
    }

    @Override // defpackage.cbni
    public final String i() {
        return this.j;
    }

    @Override // defpackage.cbni
    public final String j() {
        return this.l;
    }

    @Override // defpackage.cbni
    public final String k() {
        return this.o;
    }

    @Override // defpackage.cbni
    public final String l() {
        return this.p;
    }

    @Override // defpackage.cbni
    public final String m() {
        return this.m;
    }

    @Override // defpackage.cbni
    public final String n() {
        return this.n;
    }

    @Override // defpackage.cbni
    public final String o() {
        return this.f;
    }

    @Override // defpackage.cbni
    public final String p() {
        return this.c;
    }

    @Override // defpackage.cbni
    public final boolean q() {
        return this.d;
    }

    @Override // defpackage.cbni
    public final boolean r() {
        return this.r;
    }

    public final String toString() {
        fbuk fbukVar = this.k;
        fbuk fbukVar2 = this.i;
        Optional optional = this.g;
        ConversationIdType conversationIdType = this.b;
        return "LocationSearchItemData{messageId=" + this.a.toString() + ", conversationId=" + conversationIdType.toString() + ", participantNormalizedDestination=" + this.c + ", hasRbmBotRecipient=" + this.d + ", receivedTimestamp=" + this.e + ", participantFullName=" + this.f + ", participantMessagingIdentity=" + String.valueOf(optional) + ", participantSubId=" + this.h + ", addressAnnotation=" + String.valueOf(fbukVar2) + ", addressId=" + this.j + ", linkAnnotation=" + String.valueOf(fbukVar) + ", linkId=" + this.l + ", linkPreviewTitle=" + this.m + ", linkPreviewTriggerUrl=" + this.n + ", linkPreviewCanonicalUrl=" + this.o + ", linkPreviewImageUrl=" + this.p + ", linkPreviewExpirationTimeMillis=" + this.q + ", isStarred=" + this.r + "}";
    }
}
