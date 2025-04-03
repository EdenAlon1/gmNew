package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapn {
    public final MessageId a;
    public final int b;

    public aapn(MessageId messageId, int i) {
        this.a = messageId;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aapn)) {
            return false;
        }
        aapn aapnVar = (aapn) obj;
        return ffkj.e(this.a, aapnVar.a) && this.b == aapnVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CardstoneArgs(messageId=");
        sb.append(this.a);
        sb.append(", cardstoneType=");
        switch (this.b) {
            case 1:
                str = "DEMO_EMERGENCY_MODE";
                break;
            case 2:
                str = "START_EMERGENCY_CASE";
                break;
            case 3:
                str = "END_EMERGENCY_CASE_SUCCESS_DONT_NEED_HELP";
                break;
            case 4:
                str = "END_EMERGENCY_CASE_SUCCESS_STILL_NEED_HELP";
                break;
            case 5:
                str = "END_EMERGENCY_CASE_FAILURE_DONT_NEED_HELP";
                break;
            case 6:
                str = "END_EMERGENCY_CASE_FAILURE_STILL_NEED_HELP";
                break;
            case 7:
                str = "END_EMERGENCY_CASE_UNEXPECTED";
                break;
            default:
                str = "TEXTING_EMERGENCY_MODE";
                break;
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
