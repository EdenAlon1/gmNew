package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvw {
    public static SharedPreferences a(Context context, String str, emxc emxcVar) {
        return context.getSharedPreferences(d(str, emxcVar), 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [eyhs, java.lang.Object] */
    public static eyhs b(String str, eyhz eyhzVar) {
        try {
            byte[] decode = Base64.decode(str, 3);
            eyfc eyfcVar = eyfc.a;
            eyib eyibVar = eyib.a;
            return eyhzVar.l(decode, eyfc.a);
        } catch (IllegalArgumentException e) {
            throw new eygu(new IOException(e), null);
        }
    }

    public static eyhs c(SharedPreferences sharedPreferences, String str, eyhz eyhzVar) {
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return b(string, eyhzVar);
        } catch (eygu unused) {
            return null;
        }
    }

    public static String d(String str, emxc emxcVar) {
        return (emxcVar == null || !emxcVar.g()) ? str : str.concat((String) emxcVar.c());
    }

    public static String e(eyhs eyhsVar) {
        return Base64.encodeToString(eyhsVar.toByteArray(), 3);
    }

    public static void f(SharedPreferences.Editor editor, String str) {
        editor.remove(str);
    }

    public static void g(SharedPreferences.Editor editor, String str, eyhs eyhsVar) {
        editor.putString(str, e(eyhsVar));
    }

    public static boolean h(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    public static boolean i(SharedPreferences sharedPreferences, String str, eyhs eyhsVar) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        g(edit, str, eyhsVar);
        return edit.commit();
    }
}
