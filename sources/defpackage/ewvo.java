package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewvo extends ewwh {
    private final String a;
    private final int b;

    public ewvo(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null contactId");
        }
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.ewwh
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ewwh
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ewwh) {
            ewwh ewwhVar = (ewwh) obj;
            if (this.a.equals(ewwhVar.a()) && this.b == ewwhVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str;
        switch (this.b) {
            case 1:
                str = "DISPLAY_NAME_STRUCTURED";
                break;
            case 2:
                str = "DISPLAY_NAME_UNSTRUCTURED";
                break;
            case 3:
                str = "GIVEN_NAME";
                break;
            case 4:
                str = "FAMILY_NAME";
                break;
            case 5:
                str = VCardConstants.PROPERTY_NICKNAME;
                break;
            case 6:
                str = "EMAIL_ADDRESS";
                break;
            case 7:
                str = "PHONE_NUMBER";
                break;
            case 8:
                str = "SOURCE_ID";
                break;
            case 9:
                str = "ACCOUNT_TYPE";
                break;
            default:
                str = "ACCOUNT_NAME";
                break;
        }
        return "ContactAttributeKey{contactId=" + this.a + ", type=" + str + "}";
    }
}
