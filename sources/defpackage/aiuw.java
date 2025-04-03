package defpackage;

import com.google.android.apps.messaging.otp.deletion.save.SaveOtpCallbackInput;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class aiuw extends SaveOtpCallbackInput {
    public final String a;

    public aiuw(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = str;
    }

    @Override // com.google.android.apps.messaging.otp.deletion.save.SaveOtpCallbackInput
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SaveOtpCallbackInput) {
            return this.a.equals(((SaveOtpCallbackInput) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SaveOtpCallbackInput{messageId=" + this.a + "}";
    }
}
