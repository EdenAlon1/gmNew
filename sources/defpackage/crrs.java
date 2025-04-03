package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crrs extends crsf {
    private final Boolean a;
    private final Boolean b;
    private final cukx c;
    private final ConversationIdType d;
    private final ConversationId e;
    private final String f;
    private final boolean g;
    private final eoko h;
    private final int i;
    private final int j;
    private final int k;

    public crrs(Boolean bool, Boolean bool2, cukx cukxVar, ConversationIdType conversationIdType, ConversationId conversationId, String str, boolean z, eoko eokoVar, int i, int i2, int i3) {
        this.a = bool;
        this.b = bool2;
        this.c = cukxVar;
        this.d = conversationIdType;
        this.e = conversationId;
        this.f = str;
        this.g = z;
        this.h = eokoVar;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    @Override // defpackage.crsf
    public final ConversationId a() {
        return this.e;
    }

    @Override // defpackage.crsf
    public final ConversationIdType b() {
        return this.d;
    }

    @Override // defpackage.crsf
    public final cukx c() {
        return this.c;
    }

    @Override // defpackage.crsf
    public final eoko d() {
        return this.h;
    }

    @Override // defpackage.crsf
    public final Boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        eoko eokoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crsf) {
            crsf crsfVar = (crsf) obj;
            Boolean bool = this.a;
            if (bool != null ? bool.equals(crsfVar.e()) : crsfVar.e() == null) {
                Boolean bool2 = this.b;
                if (bool2 != null ? bool2.equals(crsfVar.f()) : crsfVar.f() == null) {
                    cukx cukxVar = this.c;
                    if (cukxVar != null ? cukxVar.equals(crsfVar.c()) : crsfVar.c() == null) {
                        ConversationIdType conversationIdType = this.d;
                        if (conversationIdType != null ? conversationIdType.equals(crsfVar.b()) : crsfVar.b() == null) {
                            ConversationId conversationId = this.e;
                            if (conversationId != null ? conversationId.equals(crsfVar.a()) : crsfVar.a() == null) {
                                String str = this.f;
                                if (str != null ? str.equals(crsfVar.g()) : crsfVar.g() == null) {
                                    crsfVar.m();
                                    if (this.g == crsfVar.h() && ((eokoVar = this.h) != null ? eokoVar.equals(crsfVar.d()) : crsfVar.d() == null) && this.i == crsfVar.k() && this.j == crsfVar.j() && this.k == crsfVar.i()) {
                                        crsfVar.l();
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.crsf
    public final Boolean f() {
        return this.b;
    }

    @Override // defpackage.crsf
    public final String g() {
        return this.f;
    }

    @Override // defpackage.crsf
    public final boolean h() {
        return this.g;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.b;
        int hashCode2 = (((hashCode ^ 1000003) * 1000003) ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        cukx cukxVar = this.c;
        int hashCode3 = (hashCode2 ^ (cukxVar == null ? 0 : cukxVar.hashCode())) * 1000003;
        ConversationIdType conversationIdType = this.d;
        int hashCode4 = (hashCode3 ^ (conversationIdType == null ? 0 : conversationIdType.hashCode())) * 1000003;
        ConversationId conversationId = this.e;
        int hashCode5 = (hashCode4 ^ (conversationId == null ? 0 : conversationId.hashCode())) * 1000003;
        String str = this.f;
        int hashCode6 = (((hashCode5 ^ (str == null ? 0 : str.hashCode())) * (-721379959)) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        eoko eokoVar = this.h;
        int hashCode7 = (((((hashCode6 ^ (eokoVar != null ? eokoVar.hashCode() : 0)) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003;
        int i = this.k;
        erfb.c(i);
        return (hashCode7 ^ i) * 1000003;
    }

    @Override // defpackage.crsf
    public final int i() {
        return this.k;
    }

    @Override // defpackage.crsf
    public final int j() {
        return this.j;
    }

    @Override // defpackage.crsf
    public final int k() {
        return this.i;
    }

    public final String toString() {
        int i = this.k;
        int i2 = this.j;
        int i3 = this.i;
        eoko eokoVar = this.h;
        ConversationId conversationId = this.e;
        ConversationIdType conversationIdType = this.d;
        return "BlockAndReportSpamRequestJava{blockStatus=" + this.a + ", spamStatus=" + this.b + ", classificationSource=" + String.valueOf(this.c) + ", conversationId=" + String.valueOf(conversationIdType) + ", mapiConversationId=" + String.valueOf(conversationId) + ", targetParticipantId=" + this.f + ", targetRecipient=null, allowExternalReporting=" + this.g + ", bugleConversationOrigin=" + String.valueOf(eokoVar) + ", scope=" + erfd.c(i3) + ", entryPoint=" + erfc.b(i2) + ", dialog=" + erfb.b(i) + ", spamUserActionType=null}";
    }

    @Override // defpackage.crsf
    public final void l() {
    }

    @Override // defpackage.crsf
    public final void m() {
    }
}
