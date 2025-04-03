package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwc {
    public static final MediaViewerItem a(xhp xhpVar, drlk drlkVar) {
        drlh d;
        doxs b = b(xhpVar);
        drlj drljVar = b instanceof drlj ? (drlj) b : null;
        if (drljVar == null || !c(drljVar.m())) {
            return null;
        }
        d = drma.d(drljVar, drlkVar, null);
        xho xhoVar = xhpVar instanceof xho ? (xho) xhpVar : null;
        Uri uri = xhoVar != null ? xhoVar.b.c : null;
        if (uri == null) {
            uri = Uri.parse(d.f());
        }
        dcuw dcuwVar = new dcuw();
        dcuwVar.c(uri);
        dcuwVar.a = null;
        dcuwVar.b(d.l().c().a());
        return dcuwVar.a();
    }

    public static final doxs b(xhp xhpVar) {
        if (xhpVar instanceof xho) {
            return ((xho) xhpVar).a;
        }
        if (xhpVar instanceof xhk) {
            return ((xhk) xhpVar).b;
        }
        if (xhpVar instanceof xhl) {
            return null;
        }
        if (xhpVar instanceof xhj) {
            return ((xhj) xhpVar).b;
        }
        throw new ffcd();
    }

    public static final boolean c(drlw drlwVar) {
        return ffkj.e(drlwVar, drlu.a) || ffkj.e(drlwVar, drlv.a);
    }
}
