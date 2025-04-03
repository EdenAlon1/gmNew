package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dilv {
    public final String a;
    public final String b;
    public final dime c;

    public dilv(String str, String str2, dime dimeVar) {
        this.a = str;
        this.b = str2;
        this.c = dimeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dilv)) {
            return false;
        }
        dilv dilvVar = (dilv) obj;
        return TextUtils.equals(this.a, dilvVar.a) && TextUtils.equals(this.b, dilvVar.b) && this.c.equals(dilvVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "Display text: " + this.a + ", web page: " + this.b + ", uris: " + this.c.toString();
    }
}
