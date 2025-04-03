package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuci {
    public final boolean a;
    public final ConversationIdType b;
    public final String c;
    public final cukx d;
    public final boolean e;
    public final boolean f;
    public final eoko g;
    public final cugj h;
    public final erfe i;
    public final boolean j;
    public final byyt k;
    public final cukz l;
    public final int m;
    public final int n;
    public final int o;

    public cuci(boolean z, ConversationIdType conversationIdType, String str, cukx cukxVar, boolean z2, boolean z3, eoko eokoVar, cugj cugjVar, erfe erfeVar, int i, int i2, int i3, boolean z4, byyt byytVar, cukz cukzVar) {
        this.a = z;
        this.b = conversationIdType;
        this.c = str;
        this.d = cukxVar;
        this.e = z2;
        this.f = z3;
        this.g = eokoVar;
        this.h = cugjVar;
        this.i = erfeVar;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.j = z4;
        this.k = byytVar;
        this.l = cukzVar;
        if (conversationIdType != null) {
            if (conversationIdType.b()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (z2) {
            throw new IllegalArgumentException("This API currently does not support external reporting without a conversation. It's reasonable to implement this, but it's not currently implemented.");
        }
        if (str != null && str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (conversationIdType == null && str == null) {
            throw new IllegalArgumentException("If we have neither a conversation nor a participant to update, then calling SpamReporter is invalid, as there's no work to do.");
        }
        if (z4) {
            if (cukxVar != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (cukzVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            return;
        }
        if (cukxVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (cukzVar != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuci)) {
            return false;
        }
        cuci cuciVar = (cuci) obj;
        return this.a == cuciVar.a && ffkj.e(this.b, cuciVar.b) && ffkj.e(this.c, cuciVar.c) && this.d == cuciVar.d && this.e == cuciVar.e && this.f == cuciVar.f && this.g == cuciVar.g && ffkj.e(this.h, cuciVar.h) && this.i == cuciVar.i && this.m == cuciVar.m && this.n == cuciVar.n && this.o == cuciVar.o && this.j == cuciVar.j && this.k == cuciVar.k && ffkj.e(this.l, cuciVar.l);
    }

    public final int hashCode() {
        ConversationIdType conversationIdType = this.b;
        int hashCode = conversationIdType == null ? 0 : conversationIdType.hashCode();
        boolean z = this.a;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int a = (cucg.a(z) * 31) + hashCode;
        cukx cukxVar = this.d;
        int hashCode3 = ((((((((((a * 31) + hashCode2) * 31) + (cukxVar == null ? 0 : cukxVar.hashCode())) * 31) + cucg.a(this.e)) * 31) + cucg.a(this.f)) * 31) + this.g.hashCode()) * 31;
        cugj cugjVar = this.h;
        int hashCode4 = (hashCode3 + (cugjVar == null ? 0 : cugjVar.hashCode())) * 31;
        erfe erfeVar = this.i;
        int hashCode5 = (((((hashCode4 + (erfeVar == null ? 0 : erfeVar.hashCode())) * 31) + this.m) * 31) + this.n) * 31;
        int i = this.o;
        erfb.c(i);
        int a2 = (((hashCode5 + i) * 31) + cucg.a(this.j)) * 31;
        byyt byytVar = this.k;
        int hashCode6 = (a2 + (byytVar == null ? 0 : byytVar.hashCode())) * 31;
        cukz cukzVar = this.l;
        return hashCode6 + (cukzVar != null ? cukzVar.hashCode() : 0);
    }

    public final String toString() {
        return "SpamRequest(spamStatus=" + this.a + ", conversationId=" + this.b + ", targetParticipantId=" + this.c + ", classificationSource=" + this.d + ", allowExternalReporting=" + this.e + ", allowConversationArchiving=" + this.f + ", bugleConversationOrigin=" + this.g + ", metadata=" + this.h + ", userActionType=" + this.i + ", scope=" + ((Object) erfd.c(this.m)) + ", entryPoint=" + ((Object) erfc.b(this.n)) + ", dialog=" + ((Object) erfb.b(this.o)) + ", isUndo=" + this.j + ", archiveStatusForUndo=" + this.k + ", classificationSourcesForUndo=" + this.l + ")";
    }
}
