package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dill {
    public String a;
    public String b;
    public final dily c;
    public final String d;

    public dill(String str, String str2, String str3, dily dilyVar) {
        this.a = "";
        this.b = "";
        dily dilyVar2 = dily.RECV_ONLY;
        this.d = str;
        this.b = str2;
        this.a = str3;
        this.c = dilyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dill)) {
            return false;
        }
        dill dillVar = (dill) obj;
        return this.c == dillVar.c && TextUtils.equals(this.a, dillVar.a) && TextUtils.equals(this.d, dillVar.d) && TextUtils.equals(this.b, dillVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.d, this.b});
    }

    public final String toString() {
        return "Label: " + this.d + ", display text: " + this.a + ", type: " + this.b + ", status: " + String.valueOf(this.c);
    }
}
