package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjov {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final byyt e;
    public final Uri f;
    public final MessageIdType g;

    public cjov(boolean z, boolean z2, boolean z3, boolean z4, byyt byytVar, Uri uri, MessageIdType messageIdType) {
        byytVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = byytVar;
        this.f = uri;
        this.g = messageIdType;
    }

    public static /* synthetic */ cjov a(cjov cjovVar, Uri uri, MessageIdType messageIdType, int i) {
        boolean z = (i & 1) != 0 ? cjovVar.a : false;
        boolean z2 = (i & 2) != 0 ? cjovVar.b : false;
        boolean z3 = (i & 4) != 0 ? cjovVar.c : false;
        boolean z4 = (i & 8) != 0 ? cjovVar.d : false;
        byyt byytVar = (i & 16) != 0 ? cjovVar.e : null;
        if ((i & 32) != 0) {
            uri = cjovVar.f;
        }
        Uri uri2 = uri;
        if ((i & 64) != 0) {
            messageIdType = cjovVar.g;
        }
        byytVar.getClass();
        return new cjov(z, z2, z3, z4, byytVar, uri2, messageIdType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjov)) {
            return false;
        }
        cjov cjovVar = (cjov) obj;
        return this.a == cjovVar.a && this.b == cjovVar.b && this.c == cjovVar.c && this.d == cjovVar.d && this.e == cjovVar.e && ffkj.e(this.f, cjovVar.f) && ffkj.e(this.g, cjovVar.g);
    }

    public final int hashCode() {
        int a = cjou.a(this.a);
        byyt byytVar = this.e;
        int a2 = (((((((a * 31) + cjou.a(this.b)) * 31) + cjou.a(this.c)) * 31) + cjou.a(this.d)) * 31) + byytVar.hashCode();
        Uri uri = this.f;
        int hashCode = ((a2 * 31) + (uri == null ? 0 : uri.hashCode())) * 31;
        MessageIdType messageIdType = this.g;
        return hashCode + (messageIdType != null ? messageIdType.hashCode() : 0);
    }

    public final String toString() {
        return "MessageState(notified=" + this.a + ", isAllowedByParents=" + this.b + ", isHiddenOtp=" + this.c + ", isSecondaryUser=" + this.d + ", archiveStatus=" + this.e + ", telephonyUri=" + this.f + ", messageId=" + this.g + ")";
    }
}
