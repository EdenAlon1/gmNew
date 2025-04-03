package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajqv {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final long e;

    public ajqv(PartsTable.BindData bindData) {
        bindData.getClass();
        String K = bindData.K();
        Uri t = bindData.t();
        String H = bindData.H();
        String I = bindData.I();
        long r = bindData.r();
        this.a = K;
        this.b = t;
        this.c = H;
        this.d = I;
        this.e = r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajqv)) {
            return false;
        }
        ajqv ajqvVar = (ajqv) obj;
        return ffkj.e(this.a, ajqvVar.a) && ffkj.e(this.b, ajqvVar.b) && ffkj.e(this.c, ajqvVar.c) && ffkj.e(this.d, ajqvVar.d) && this.e == ajqvVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.b;
        int hashCode2 = uri == null ? 0 : uri.hashCode();
        int i = hashCode * 31;
        String str2 = this.c;
        int hashCode3 = (((i + hashCode2) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j = this.e;
        return hashCode4 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Part(text=" + this.a + ", contentUri=" + this.b + ", contentType=" + this.c + ", fileName=" + this.d + ", durationMs=" + this.e + ")";
    }
}
