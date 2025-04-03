package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvm {
    public static dwtm a(String str) {
        try {
            return (dwtm) dxvw.b(str, dwtm.a.getParserForType());
        } catch (eygu | NullPointerException e) {
            throw new dxvl("Failed to deserialize key:".concat(String.valueOf(str)), e);
        }
    }

    public static File b(Context context, emxc emxcVar) {
        String str = "gms_icing_mdd_garbage_file";
        if (emxcVar != null && emxcVar.g()) {
            str = "gms_icing_mdd_garbage_file".concat((String) emxcVar.c());
        }
        return new File(context.getFilesDir(), str);
    }

    public static String c(dwtm dwtmVar) {
        return Base64.encodeToString(dwtmVar.toByteArray(), 3);
    }
}
