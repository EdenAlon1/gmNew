package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dilx {
    public final String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public dily f = dily.NONE;

    public dilx(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dilx)) {
            return false;
        }
        dilx dilxVar = (dilx) obj;
        return this.f == dilxVar.f && TextUtils.equals(this.a, dilxVar.a) && TextUtils.equals(this.e, dilxVar.e) && TextUtils.equals(this.c, dilxVar.c) && TextUtils.equals(this.d, dilxVar.d) && TextUtils.equals(this.b, dilxVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.a, this.e, this.c, this.d, this.b});
    }

    public final String toString() {
        return "Media ID: " + this.a + ", type: " + this.c + ", display text: " + this.b + ", status: " + String.valueOf(this.f);
    }
}
