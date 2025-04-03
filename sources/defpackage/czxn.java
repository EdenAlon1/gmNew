package defpackage;

import android.text.SpannableStringBuilder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czxn {
    public final SpannableStringBuilder a;
    public final String b;
    public final Integer c;
    public final boolean d;
    public final String e = "";
    private final String f = null;
    private final String g = null;
    private final String h = null;
    private final String i = null;

    public czxn(SpannableStringBuilder spannableStringBuilder, String str, Integer num, boolean z) {
        this.a = spannableStringBuilder;
        this.b = str;
        this.c = num;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czxn)) {
            return false;
        }
        czxn czxnVar = (czxn) obj;
        if (!ffkj.e(this.a, czxnVar.a) || !ffkj.e(this.b, czxnVar.b) || !ffkj.e(this.c, czxnVar.c) || this.d != czxnVar.d || !ffkj.e(this.e, czxnVar.e)) {
            return false;
        }
        String str = czxnVar.f;
        if (!ffkj.e(null, null)) {
            return false;
        }
        String str2 = czxnVar.g;
        if (!ffkj.e(null, null)) {
            return false;
        }
        String str3 = czxnVar.h;
        if (!ffkj.e(null, null)) {
            return false;
        }
        String str4 = czxnVar.i;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.c;
        return ((((((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode()) * 923521;
    }

    public final String toString() {
        return "ToolstoneUiData(text=" + ((Object) this.a) + ", linkText=" + this.b + ", iconRes=" + this.c + ", hasCloseButton=" + this.d + ", title=" + this.e + ", descriptionText=null, primaryButtonLabel=null, secondaryButtonLabel=null, linkUrl=null)";
    }
}
