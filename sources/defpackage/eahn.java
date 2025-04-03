package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eahn extends eahr {
    public final String a;
    public final byte[] b;
    public final String c;
    public final int d;
    private final String e;
    private final Integer f;
    private final String g;
    private final int h;
    private final int i;

    public eahn(String str, int i, int i2, int i3, Integer num, String str2, byte[] bArr, String str3, String str4) {
        this.e = str;
        this.d = i;
        this.h = i2;
        this.i = i3;
        this.f = num;
        this.a = str2;
        this.b = bArr;
        this.g = str3;
        this.c = str4;
    }

    @Override // defpackage.eahr
    public final Integer a() {
        return this.f;
    }

    @Override // defpackage.eahr
    protected final String b() {
        return this.g;
    }

    @Override // defpackage.eahr
    public final String c() {
        return this.a;
    }

    @Override // defpackage.eahr
    public final String d() {
        return this.c;
    }

    @Override // defpackage.eahr
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eahr) {
            eahr eahrVar = (eahr) obj;
            String str4 = this.e;
            if (str4 != null ? str4.equals(eahrVar.e()) : eahrVar.e() == null) {
                if (this.d == eahrVar.g() && this.h == eahrVar.i() && this.i == eahrVar.h() && ((num = this.f) != null ? num.equals(eahrVar.a()) : eahrVar.a() == null) && ((str = this.a) != null ? str.equals(eahrVar.c()) : eahrVar.c() == null)) {
                    if (Arrays.equals(this.b, eahrVar instanceof eahn ? ((eahn) eahrVar).b : eahrVar.f()) && ((str2 = this.g) != null ? str2.equals(eahrVar.b()) : eahrVar.b() == null) && ((str3 = this.c) != null ? str3.equals(eahrVar.d()) : eahrVar.d() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.eahr
    public final byte[] f() {
        return this.b;
    }

    @Override // defpackage.eahr
    public final int g() {
        return this.d;
    }

    @Override // defpackage.eahr
    public final int h() {
        return this.i;
    }

    public final int hashCode() {
        String str = this.e;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.d;
        int i2 = this.h;
        int i3 = this.i;
        Integer num = this.f;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i4 = ((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3;
        String str2 = this.a;
        int hashCode3 = ((((((i4 * 1000003) ^ hashCode2) * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003;
        String str3 = this.g;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.c;
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // defpackage.eahr
    public final int i() {
        return this.h;
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "SEND_ERROR" : "SEND_EVENT" : "DELETED" : "MESSAGE" : "MESSAGE_TYPE_UNSPECIFIED";
        String str2 = this.e;
        int i2 = this.h;
        int i3 = this.i;
        Integer num = this.f;
        String str3 = this.a;
        byte[] bArr = this.b;
        String str4 = this.g;
        String str5 = this.c;
        return "FcmMessage{messageId=" + str2 + ", messageType=" + str + ", priorityOriginal=" + eahq.a(i2) + ", priorityDelivered=" + eahq.a(i3) + ", ttl=" + num + ", chimePayload=" + str3 + ", rawData=" + Arrays.toString(bArr) + ", chimeMessageIndicator=" + str4 + ", keyInvalidation=" + str5 + "}";
    }
}
