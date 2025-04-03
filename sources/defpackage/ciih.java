package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ciih implements ciil {
    public final String a;
    private final ciik d = ciik.GAIA;

    public ciih(String str) {
        this.a = str;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("appName is empty");
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
        if (obj instanceof ciih) {
            return Objects.equals(this.a, ((ciih) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
