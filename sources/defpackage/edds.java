package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edds {
    private final String a = "/com/google/android/libraries/phonenumbers/data/PhoneNumberMetadataProto".concat("_");

    public final String a(Object obj) {
        String obj2 = obj.toString();
        if (obj2 != null && obj2.length() != 0) {
            int length = obj2.length();
            int i = 0;
            while (i < length) {
                int codePointAt = obj2.codePointAt(i);
                if (Character.isLetterOrDigit(codePointAt)) {
                    i += Character.charCount(codePointAt);
                }
            }
            String str = this.a;
            Objects.toString(obj);
            return str.concat(String.valueOf(obj));
        }
        throw new IllegalArgumentException("Invalid key: ".concat(String.valueOf(obj2)));
    }
}
