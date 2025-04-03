package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dima {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dima(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.a = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dima)) {
            return false;
        }
        dima dimaVar = (dima) obj;
        return TextUtils.equals(this.b, dimaVar.b) && TextUtils.equals(this.a, dimaVar.a) && TextUtils.equals(this.c, dimaVar.c) && TextUtils.equals(this.d, dimaVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d});
    }

    public final String toString() {
        return "Call ID: " + this.b + ", from: " + this.c + ", to: " + this.d + ", display text: " + this.a;
    }
}
