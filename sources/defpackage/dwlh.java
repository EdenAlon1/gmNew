package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlh {
    public final String a = "com.google.android.gms.fonts";
    public final String b = "com.google.android.gms";
    private final List c = null;
    private final int d = R.array.com_google_android_gms_fonts_certs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwlh)) {
            return false;
        }
        dwlh dwlhVar = (dwlh) obj;
        if (!ffkj.e(this.a, dwlhVar.a) || !ffkj.e(this.b, dwlhVar.b)) {
            return false;
        }
        List list = dwlhVar.c;
        if (!ffkj.e(null, null)) {
            return false;
        }
        int i = dwlhVar.d;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + R.array.com_google_android_gms_fonts_certs;
    }
}
