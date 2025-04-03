package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgz extends cjha {
    public final cjia a;
    private final Context b;
    private final List c;
    private final Uri d;
    private final String e;
    private final String f;

    public cjgz(Context context, cjia cjiaVar, List list) {
        String str;
        this.b = context;
        this.a = cjiaVar;
        this.c = list;
        this.d = (Uri) ffdx.K(list);
        this.e = f(list.size());
        int a = cjiaVar != null ? cjhz.a(cjiaVar.b) : 0;
        if (a != 0) {
            int i = a - 1;
            if (i == 0 || i == 1) {
                str = context.getString(R.string.attachment_preview_photos_link_share_getting_link);
            } else if (i == 2) {
                str = context.getString(R.string.link_preview_google_photos_display_name);
            }
            str.getClass();
            this.f = str;
        }
        str = "";
        str.getClass();
        this.f = str;
    }

    @Override // defpackage.cjha
    public final Context a() {
        return this.b;
    }

    @Override // defpackage.cjha
    public final Uri b() {
        return this.d;
    }

    @Override // defpackage.cjha
    public final cjia c() {
        return this.a;
    }

    @Override // defpackage.cjha
    public final String d() {
        return this.f;
    }

    @Override // defpackage.cjha
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjgz)) {
            return false;
        }
        cjgz cjgzVar = (cjgz) obj;
        return ffkj.e(this.b, cjgzVar.b) && ffkj.e(this.a, cjgzVar.a) && ffkj.e(this.c, cjgzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        cjia cjiaVar = this.a;
        return ((hashCode + (cjiaVar == null ? 0 : cjiaVar.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MessageList(context=" + this.b + ", sharingState=" + this.a + ", mediaUris=" + this.c + ")";
    }
}
