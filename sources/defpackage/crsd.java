package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crsd {
    public final Boolean a;
    public final Boolean b;
    public final cukx c;
    public final ConversationId d;
    public final ConversationIdType e;
    public final String f;
    public final ResolvedRecipient g;
    public final boolean h;
    public final eoko i;
    public final erfe j;
    public final boolean k;
    public final crsn l;
    public final int m;
    public final int n;
    public final int o;

    public /* synthetic */ crsd(Boolean bool, Boolean bool2, cukx cukxVar, ConversationId conversationId, ConversationIdType conversationIdType, String str, ResolvedRecipient resolvedRecipient, boolean z, eoko eokoVar, int i, int i2, int i3, erfe erfeVar, boolean z2, crsn crsnVar, int i4) {
        cukx cukxVar2 = (i4 & 4) != 0 ? cukx.b : cukxVar;
        ConversationId conversationId2 = (i4 & 8) != 0 ? null : conversationId;
        ConversationIdType conversationIdType2 = (i4 & 16) != 0 ? null : conversationIdType;
        String str2 = (i4 & 32) != 0 ? null : str;
        ResolvedRecipient resolvedRecipient2 = (i4 & 64) != 0 ? null : resolvedRecipient;
        boolean z3 = (!((i4 & 128) == 0)) | z;
        eoko eokoVar2 = (i4 & 256) != 0 ? null : eokoVar;
        int i5 = (i4 & 2048) != 0 ? 2 : i3;
        int i6 = i4 & 1;
        Boolean bool3 = (i4 & 2) != 0 ? null : bool2;
        Boolean bool4 = 1 == i6 ? null : bool;
        erfe erfeVar2 = (i4 & 4096) != 0 ? null : erfeVar;
        boolean z4 = ((i4 & 8192) == 0) & z2;
        crsn crsnVar2 = (i4 & 16384) != 0 ? null : crsnVar;
        this.a = bool4;
        this.b = bool3;
        this.c = cukxVar2;
        this.d = conversationId2;
        this.e = conversationIdType2;
        this.f = str2;
        this.g = resolvedRecipient2;
        this.h = z3;
        this.i = eokoVar2;
        this.m = i;
        this.n = i2;
        this.o = i5;
        this.j = erfeVar2;
        this.k = z4;
        this.l = crsnVar2;
        if (bool4 == null && bool3 == null) {
            throw new IllegalArgumentException("At least one status must be updated");
        }
        if (bool4 != null && bool3 != null && !z4 && !ffkj.e(bool4, bool3)) {
            throw new IllegalArgumentException("This API does not support blocking & reporting-not-spam, nor unblocking & reporting spam. Both operations have to move in the same direction.");
        }
        if (str2 != null && str2.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (cubs.a().booleanValue()) {
            if (conversationId2 == null && ((str2 == null || str2.length() == 0) && resolvedRecipient2 == null)) {
                throw new IllegalArgumentException("We must have a conversation and/or a participant/recipient to update statuses.");
            }
        } else if (conversationIdType2 == null && ((str2 == null || str2.length() == 0) && resolvedRecipient2 == null)) {
            throw new IllegalArgumentException("We must have a conversation and/or a participant/recipient to update statuses.");
        }
        if (bool3 != null) {
            if (eokoVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (z4) {
                if (cukxVar2 != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else if (cukxVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (z4 && crsnVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crsd)) {
            return false;
        }
        crsd crsdVar = (crsd) obj;
        return ffkj.e(this.a, crsdVar.a) && ffkj.e(this.b, crsdVar.b) && this.c == crsdVar.c && ffkj.e(this.d, crsdVar.d) && ffkj.e(this.e, crsdVar.e) && ffkj.e(this.f, crsdVar.f) && ffkj.e(this.g, crsdVar.g) && this.h == crsdVar.h && this.i == crsdVar.i && this.m == crsdVar.m && this.n == crsdVar.n && this.o == crsdVar.o && this.j == crsdVar.j && this.k == crsdVar.k && ffkj.e(this.l, crsdVar.l);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.b;
        int hashCode2 = bool2 == null ? 0 : bool2.hashCode();
        int i = hashCode * 31;
        cukx cukxVar = this.c;
        int hashCode3 = (((i + hashCode2) * 31) + (cukxVar == null ? 0 : cukxVar.hashCode())) * 31;
        ConversationId conversationId = this.d;
        int hashCode4 = (hashCode3 + (conversationId == null ? 0 : conversationId.hashCode())) * 31;
        ConversationIdType conversationIdType = this.e;
        int hashCode5 = (hashCode4 + (conversationIdType == null ? 0 : conversationIdType.hashCode())) * 31;
        String str = this.f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        ResolvedRecipient resolvedRecipient = this.g;
        int hashCode7 = (((hashCode6 + (resolvedRecipient == null ? 0 : resolvedRecipient.hashCode())) * 31) + crsb.a(this.h)) * 31;
        eoko eokoVar = this.i;
        int hashCode8 = (((((hashCode7 + (eokoVar == null ? 0 : eokoVar.hashCode())) * 31) + this.m) * 31) + this.n) * 31;
        int i2 = this.o;
        erfb.c(i2);
        int i3 = (hashCode8 + i2) * 31;
        erfe erfeVar = this.j;
        int hashCode9 = (((i3 + (erfeVar == null ? 0 : erfeVar.hashCode())) * 31) + crsb.a(this.k)) * 31;
        crsn crsnVar = this.l;
        return hashCode9 + (crsnVar != null ? crsnVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockAndReportSpamRequest(blockStatus=");
        sb.append(this.a);
        sb.append(", spamStatus=");
        sb.append(this.b);
        sb.append(", classificationSource=");
        sb.append(this.c);
        sb.append(", mapiConversationId=");
        sb.append(this.d);
        sb.append(", conversationId=");
        sb.append(this.e);
        sb.append(", targetParticipantId=");
        sb.append(this.f);
        sb.append(", targetRecipient=");
        sb.append(this.g);
        sb.append(", allowExternalReporting=");
        sb.append(this.h);
        sb.append(", bugleConversationOrigin=");
        sb.append(this.i);
        sb.append(", scope=");
        sb.append((Object) erfd.c(this.m));
        sb.append(", entryPoint=");
        sb.append((Object) erfc.b(this.n));
        sb.append(", dialog=");
        int i = this.o;
        sb.append((Object) (i != 0 ? erfb.b(i) : "null"));
        sb.append(", spamUserActionType=");
        sb.append(this.j);
        sb.append(", isUndo=");
        sb.append(this.k);
        sb.append(", undoBlockAndReportSpamRequest=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
