package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvb {
    public static Uri a(Context context, emxc emxcVar) {
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(context);
        efbrVar.f((emxcVar == null || !emxcVar.g()) ? "datadownload" : (String) emxcVar.c());
        if (emxcVar != null && emxcVar.g()) {
            efbrVar.g("datadownload");
        }
        return efbrVar.a();
    }

    public static Uri b(Context context, emxc emxcVar) {
        return a(context, emxcVar).buildUpon().appendPath("links").build();
    }

    public static Uri c(Context context, String str) {
        int i = efby.a;
        return efbx.a(str, context.getPackageName(), 0L);
    }

    public static String d(String str, emxc emxcVar) {
        if (emxcVar != null && emxcVar.g()) {
            str = str.concat((String) emxcVar.c());
        }
        return str.concat(".pb");
    }

    public static Uri e(Context context, int i, String str, String str2, dwxf dwxfVar, emxc emxcVar, boolean z) {
        try {
            return z ? c(context, str2) : a(context, emxcVar).buildUpon().appendPath(f(i)).build().buildUpon().appendPath(str).build();
        } catch (Exception e) {
            dxth.k(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            dwxfVar.a();
            return null;
        }
    }

    public static String f(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? "public_3p" : "private" : "public";
    }

    public static Uri g(Context context) {
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(context);
        efbrVar.f("datadownloadmanifest");
        efbrVar.g("datadownload");
        return efbrVar.a();
    }
}
