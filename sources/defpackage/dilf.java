package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dilf {
    public int h;
    public String a = "";
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public String d = "";
    public String e = "";
    public dime f = new dime(dimb.NONE);
    public dime g = new dime(dimb.NONE);
    public dilm i = new dilm();

    public final void a(dilf dilfVar) {
        if (this.b.isPresent()) {
            this.b.equals(dilfVar.b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dilf)) {
            return false;
        }
        dilf dilfVar = (dilf) obj;
        return this.h == dilfVar.h && TextUtils.equals(this.a, dilfVar.a) && TextUtils.equals(this.d, dilfVar.d) && TextUtils.equals(this.e, dilfVar.e) && this.b.equals(dilfVar.b) && this.i.equals(dilfVar.i) && this.f.equals(dilfVar.f) && this.g.equals(dilfVar.g) && this.c.equals(dilfVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), this.a, this.d, this.e, this.b, this.i, this.f, this.g, this.c});
    }

    public final String toString() {
        return "Subject: " + (this.b.isPresent() ? dktx.MESSAGE_CONTENT.c(this.b.get()) : "Optional.empty()") + ", conference URIs: " + String.valueOf(this.f) + ", max user count: " + this.h + ", display text: " + this.a + ", free text: " + this.d + ", keywords: " + this.e + ", service URIs: " + String.valueOf(this.g) + ", available media: " + String.valueOf(this.i) + ", subject ext: " + String.valueOf(this.c);
    }
}
