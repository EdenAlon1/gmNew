package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class onz {
    final int a;
    final int b;
    final String c;

    public onz(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.A;
        this.b = preference.B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof onz)) {
            return false;
        }
        onz onzVar = (onz) obj;
        return this.a == onzVar.a && this.b == onzVar.b && TextUtils.equals(this.c, onzVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
