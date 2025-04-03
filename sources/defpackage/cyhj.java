package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyhj extends cyhl {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final MessageIdType g;

    public cyhj(String str, String str2, String str3, String str4, String str5, boolean z, MessageIdType messageIdType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = messageIdType;
    }

    @Override // defpackage.cyhl
    public final MessageIdType a() {
        return this.g;
    }

    @Override // defpackage.cyhl
    public final String b() {
        return this.d;
    }

    @Override // defpackage.cyhl
    public final String c() {
        return this.b;
    }

    @Override // defpackage.cyhl
    public final String d() {
        return this.a;
    }

    @Override // defpackage.cyhl
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyhl) {
            cyhl cyhlVar = (cyhl) obj;
            if (this.a.equals(cyhlVar.d()) && this.b.equals(cyhlVar.c()) && this.c.equals(cyhlVar.e()) && this.d.equals(cyhlVar.b()) && this.e.equals(cyhlVar.f()) && this.f == cyhlVar.g() && this.g.equals(cyhlVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cyhl
    public final String f() {
        return this.e;
    }

    @Override // defpackage.cyhl
    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "ReminderData{id=" + this.a + ", formattedTime=" + this.b + ", messageText=" + this.c + ", attachmentType=" + this.d + ", senderName=" + this.e + ", msgFromSelf=" + this.f + ", messageId=" + this.g.toString() + "}";
    }
}
