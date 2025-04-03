package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.Formatter;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgy extends cjha {
    private final Context a;
    private final List b;
    private final List c;
    private final Uri d;
    private final String e;
    private final String f;

    public cjgy(Context context, List list, List list2) {
        String string;
        long j;
        this.a = context;
        this.b = list;
        this.c = list2;
        this.d = (Uri) ffdx.K(list);
        this.e = f(list.size());
        if (list2.isEmpty()) {
            string = context.getString(R.string.attachment_preview_photos_link_share_upload_size_placeholder);
            string.getClass();
        } else {
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((drso) it.next()) instanceof drsj) {
                        string = this.a.getString(R.string.attachment_preview_photos_link_share_upload_size_failure);
                        string.getClass();
                        break;
                    }
                }
            }
            if (!list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (!(((drso) it2.next()) instanceof drsh)) {
                        Context context2 = this.a;
                        Iterator it3 = list2.iterator();
                        long j2 = 0;
                        while (it3.hasNext()) {
                            drso drsoVar = (drso) it3.next();
                            if (drsoVar instanceof drsn) {
                                j = ((drsn) drsoVar).a;
                            } else if (drsoVar instanceof drsl) {
                                j = ((drsl) drsoVar).a;
                            } else {
                                if (!(drsoVar instanceof drsj) && !(drsoVar instanceof drsh)) {
                                    throw new ffcd();
                                }
                                j = 0;
                            }
                            j2 += j;
                        }
                        string = context2.getString(R.string.attachment_preview_photos_link_share_upload_size, Formatter.formatFileSize(context2, j2));
                        string.getClass();
                    }
                }
            }
            string = this.a.getString(R.string.attachment_preview_photos_link_share_no_upload_needed);
            string.getClass();
        }
        this.f = string;
    }

    @Override // defpackage.cjha
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.cjha
    public final Uri b() {
        return this.d;
    }

    @Override // defpackage.cjha
    public final /* bridge */ /* synthetic */ cjia c() {
        return null;
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
        if (!(obj instanceof cjgy)) {
            return false;
        }
        cjgy cjgyVar = (cjgy) obj;
        return ffkj.e(this.a, cjgyVar.a) && ffkj.e(this.b, cjgyVar.b) && ffkj.e(this.c, cjgyVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Draft(context=" + this.a + ", mediaUris=" + this.b + ", uploadStates=" + this.c + ")";
    }
}
