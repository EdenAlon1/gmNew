package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cixb {
    public static final cfva a = cfvl.e(cfvl.b, "max_lines_in_inbox_style_notification", 5);
    public static final entd b = entd.c("BugleNotifications");
    public final Context c;
    public final ekmz d;
    public final errm e;
    public final errl f;
    public final ciuz g;

    public cixb(Context context, ekmz ekmzVar, errm errmVar, errl errlVar, ciuz ciuzVar) {
        this.c = context;
        this.d = ekmzVar;
        this.e = errmVar;
        this.f = errlVar;
        this.g = ciuzVar;
    }

    final elfl a(String str, Uri uri, Uri uri2) {
        final knq knqVar = new knq();
        knqVar.a = str;
        if (uri2 != null) {
            knqVar.c = uri2.toString();
        }
        elfo.e(null);
        Resources resources = this.c.getResources();
        return elfl.g(qsl.a(((qqo) this.d.b().A()).q(new rig().Q((int) resources.getDimension(R.dimen.notification_large_icon_width), (int) resources.getDimension(R.dimen.notification_large_icon_height))).i(uri))).h(new emwl() { // from class: ciwx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                cfva cfvaVar = cixb.a;
                knq knqVar2 = knq.this;
                if (bitmap != null) {
                    knqVar2.b = IconCompat.g(bitmap);
                }
                return new knr(knqVar2);
            }
        }, this.e);
    }
}
