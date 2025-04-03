package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ciii implements ciil {
    public final String a;
    private final ciik d = ciik.PHONE_NUMBER;

    public ciii(String str) {
        this.a = str;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("normalizedPhoneNumber is empty");
        }
    }

    @Override // defpackage.ciil
    public final ciik a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ciii) {
            return Objects.equals(this.a, ((ciii) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
