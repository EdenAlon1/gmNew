package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajpc extends ajpn {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final ConversationIdType f;
    private final String g;
    private final boolean h;
    private final boolean i;

    public ajpc(String str, String str2, String str3, String str4, long j, ConversationIdType conversationIdType, String str5, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null reminderId");
        }
        this.d = str4;
        this.e = j;
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.f = conversationIdType;
        this.g = str5;
        this.h = z;
        this.i = z2;
    }

    @Override // defpackage.ajpn
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ajpn
    public final ConversationIdType b() {
        return this.f;
    }

    @Override // defpackage.ajpn
    public final String c() {
        return this.c;
    }

    @Override // defpackage.ajpn
    public final String d() {
        return this.g;
    }

    @Override // defpackage.ajpn
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpn) {
            ajpn ajpnVar = (ajpn) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(ajpnVar.f()) : ajpnVar.f() == null) {
                String str3 = this.b;
                if (str3 != null ? str3.equals(ajpnVar.g()) : ajpnVar.g() == null) {
                    String str4 = this.c;
                    if (str4 != null ? str4.equals(ajpnVar.c()) : ajpnVar.c() == null) {
                        if (this.d.equals(ajpnVar.e()) && this.e == ajpnVar.a() && this.f.equals(ajpnVar.b()) && ((str = this.g) != null ? str.equals(ajpnVar.d()) : ajpnVar.d() == null) && this.h == ajpnVar.h() && this.i == ajpnVar.i()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ajpn
    public final String f() {
        return this.a;
    }

    @Override // defpackage.ajpn
    public final String g() {
        return this.b;
    }

    @Override // defpackage.ajpn
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        String str3 = this.c;
        int hashCode3 = ((((((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        long j = this.e;
        int hashCode4 = (((hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str4 = this.g;
        return ((((hashCode4 ^ (str4 != null ? str4.hashCode() : 0)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true == this.i ? 1231 : 1237);
    }

    @Override // defpackage.ajpn
    public final boolean i() {
        return this.i;
    }

    public final String toString() {
        return "ReminderNotificationInfo{sender=" + this.a + ", text=" + this.b + ", attachmentType=" + this.c + ", reminderId=" + this.d + ", reminderTriggerTime=" + this.e + ", conversationId=" + this.f.toString() + ", chatName=" + this.g + ", isGroupChat=" + this.h + ", isSenderSelf=" + this.i + "}";
    }
}
