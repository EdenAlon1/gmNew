package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aape extends ffkh implements ffjq {
    public aape(Object obj) {
        super(6, obj, aapg.class, "openVideo", "openVideo-myKFqkg(Lcom/google/android/apps/messaging/shared/api/messaging/Message;Ljava/util/List;Landroid/net/Uri;Ljava/lang/String;JZ)V", 0);
    }

    @Override // defpackage.ffjq
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        alxr alxrVar = (alxr) obj;
        List list = (List) obj2;
        Uri uri = (Uri) obj3;
        String str = (String) obj4;
        long j = ((ffpw) obj5).c;
        boolean booleanValue = ((Boolean) obj6).booleanValue();
        alxrVar.getClass();
        list.getClass();
        uri.getClass();
        str.getClass();
        aapg aapgVar = (aapg) this.g;
        if (aapgVar.h.a()) {
            ((dsqt) aapgVar.g.b()).b(((akld) aapgVar.m.a()).a(list, list.indexOf(alxrVar)));
        } else {
            axol.k(aapgVar.b, null, new aapd(aapgVar, uri, str, j, booleanValue, null), 3);
        }
        return ffcu.a;
    }
}
