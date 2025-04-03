package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dimd {
    public final String a;
    public final String b;
    public final String c;
    public final dilu d;

    public dimd(String str, String str2, String str3, dilu diluVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = diluVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dimd)) {
            return false;
        }
        dimd dimdVar = (dimd) obj;
        if (!TextUtils.equals(this.a, dimdVar.a) || !TextUtils.equals(this.c, dimdVar.c) || !TextUtils.equals(this.b, dimdVar.b)) {
            return false;
        }
        dilu diluVar = this.d;
        if (diluVar != null || dimdVar.d == null) {
            return diluVar == null || diluVar.equals(dimdVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d});
    }

    public final String toString() {
        return "Uri: " + dktx.URI.c(this.a) + ", purpose: " + this.c + ". display text: " + dktx.USER_ID.c(this.b) + ", modified: " + String.valueOf(this.d);
    }
}
