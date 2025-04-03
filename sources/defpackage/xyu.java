package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyu implements xyg {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/converter/LocalVideoConverter");
    private final ffbr b;

    public xyu(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
    }

    @Override // defpackage.xyg
    public final Object a(xho xhoVar, xyj xyjVar, String str, ffgu ffguVar) {
        doxs doxsVar = xhoVar.a;
        if (!(doxsVar instanceof drnl)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        drnl drnlVar = (drnl) doxsVar;
        String str2 = drnlVar.b;
        Uri uri = xhoVar.b.c;
        Uri parse = Uri.parse(str2);
        Uri uri2 = uri == null ? parse : uri;
        drnd drndVar = drnlVar.a;
        String a2 = (((atws) this.b.b()).a() && ((drndVar instanceof drmr) || ffkj.e(drndVar, drms.a))) ? "video/mp4" : drjy.a(drndVar).a();
        uri2.getClass();
        xzo xzoVar = new xzo(a2, uri2, true != (drnlVar.f instanceof dpgo) ? null : parse, new Size(drnlVar.c, drnlVar.d), drnlVar.g, drnlVar.e, xhq.d(xhoVar), drnlVar.f instanceof dpgo, xhoVar.b.b);
        ensk e = a.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/converter/LocalVideoConverter", "convert", 54, "LocalVideoConverter.kt")).I("MapiVideoContent isResizable %s, saveToExternalStorage %b", xzoVar.a, xzoVar.b);
        return new xzc(xzoVar, parse);
    }
}
