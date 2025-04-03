package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aacn implements zsu {
    public final alxr a;
    public final boolean b;
    public final Uri c;
    public final boolean d;
    public final boolean e;
    public final apqd f;
    public final boolean g;
    public final String h;

    public aacn(alxr alxrVar, boolean z, Uri uri, boolean z2, boolean z3, apqd apqdVar, boolean z4, String str) {
        this.a = alxrVar;
        this.b = z;
        this.c = uri;
        this.d = z2;
        this.e = z3;
        this.f = apqdVar;
        this.g = z4;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aacn)) {
            return false;
        }
        aacn aacnVar = (aacn) obj;
        return ffkj.e(this.a, aacnVar.a) && this.b == aacnVar.b && ffkj.e(this.c, aacnVar.c) && this.d == aacnVar.d && this.e == aacnVar.e && ffkj.e(this.f, aacnVar.f) && this.g == aacnVar.g && ffkj.e(this.h, aacnVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.c;
        return ((((((((((((hashCode + aacm.a(this.b)) * 31) + (uri == null ? 0 : uri.hashCode())) * 31) + aacm.a(this.d)) * 31) + aacm.a(this.e)) * 31) + this.f.hashCode()) * 31) + aacm.a(this.g)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "ImageBubbleArgs(message=" + this.a + ", isOutgoing=" + this.b + ", previewUri=" + this.c + ", isGroupConversation=" + this.d + ", isSpatulaSettingsEnabled=" + this.e + ", content=" + this.f + ", isHighlighted=" + this.g + ", contentDescription=" + this.h + ")";
    }
}
