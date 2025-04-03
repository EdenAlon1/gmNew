package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class akvg implements akvf, akux, cssx {
    public static final Intent S(Context context, Uri uri, String str) {
        return new Intent("android.intent.action.SEND").setType(str).putExtra("android.intent.extra.STREAM", v(context, uri, str));
    }

    public static Uri u(Context context, MessagePartCoreData messagePartCoreData) {
        Uri t = messagePartCoreData.t();
        if (messagePartCoreData.bt()) {
            return null;
        }
        return (!messagePartCoreData.bz() || t == null) ? t : cbgl.b(context, t, messagePartCoreData.Y(), le.a(messagePartCoreData.V()), messagePartCoreData.p());
    }

    public static Uri v(Context context, Uri uri, String str) {
        return (cbgi.k(uri, context) || csuu.z(uri)) ? cbgl.b(context, uri, null, str, 0L) : uri;
    }

    public abstract void A(Context context);

    public abstract void B(ea eaVar, eptm eptmVar);

    public abstract void C(Context context, Uri uri, String str);

    public abstract void D(Context context, MessageCoreData messageCoreData, equr equrVar);

    public abstract void E(Context context, Uri uri, String str);

    public abstract void F(ea eaVar, int i, int i2, int i3, eptm eptmVar);

    public abstract void G(ea eaVar, String str, int i, int i2, int i3, eptm eptmVar);

    public abstract void H(Context context);

    public abstract void I(Context context);

    public abstract void J(Context context, eisx eisxVar);

    public abstract void K(Context context);

    public abstract void L(Context context);

    public abstract void M(Context context, eisx eisxVar);

    public abstract void N(Context context, eisx eisxVar);

    public abstract void O(MessagePartCoreData messagePartCoreData);

    public abstract void P(Uri uri, String str, Uri uri2, String str2);

    public abstract void Q(Context context, aoku aokuVar, Point point, aler alerVar);

    public abstract Intent R(String str, Uri uri, Uri uri2);

    public abstract void T(Context context, eisx eisxVar);

    public abstract void U(Context context);

    public abstract void V(Activity activity, Uri uri, Uri uri2);

    public abstract void W(ea eaVar, Uri uri, Uri uri2);

    public abstract void X(Activity activity, Uri uri, Uri uri2);

    public abstract void Y(ea eaVar, Uri uri, Uri uri2);

    public abstract void Z(Activity activity, String str, int i);

    public abstract void aa(Activity activity);

    public abstract void ab(Context context);

    public abstract Intent i(Context context);

    public abstract Intent j(Context context);

    public abstract Intent k(Context context, int i, String str);

    public abstract Intent l(Activity activity);

    public abstract Intent m(Context context, int i);

    public abstract Intent n(Context context);

    public abstract Intent o(Context context);

    public abstract Intent p(Context context);

    public abstract Intent q(Context context);

    public abstract Intent r(Context context);

    public abstract Intent s(Context context);

    public abstract Intent t(Context context);

    public abstract void w(Context context, eisx eisxVar);

    public abstract void x(Context context);

    public abstract void y(Context context, String str);

    public abstract void z(Context context, ContentValues contentValues);
}
