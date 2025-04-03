package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efow {
    public static final long a = TimeUnit.DAYS.toMillis(1);

    static int a() {
        String g = g();
        if (g.contains(".")) {
            g = g.substring(g.lastIndexOf(".") + 1);
        }
        return Integer.parseInt(g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle b(fajm fajmVar) {
        fajl fajlVar = fajmVar.c;
        if (fajlVar == null) {
            fajlVar = fajl.a;
        }
        eygr eygrVar = fajlVar.b;
        int size = eygrVar.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            fajk fajkVar = (fajk) eygrVar.get(i);
            bundle.putString(fajkVar.b, fajkVar.c);
        }
        return bundle;
    }

    public static eyhs c(eyhs eyhsVar, byte[] bArr) {
        try {
            return eyhsVar.toBuilder().mergeFrom(bArr, eyfc.a()).build();
        } catch (eygu e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fahm d(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efow.d(android.content.Context):fahm");
    }

    public static String e(PackageInfo packageInfo) {
        if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
                if (digest == null) {
                    return null;
                }
                int length = digest.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (byte b : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                Log.e("SurveyUtils", "Can't find SHA1.", e);
            }
        }
        return null;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || !Patterns.WEB_URL.matcher(emuz.c(str)).matches()) {
            Log.e("SurveyUtils", "Follow up URL was empty or invalid.");
            return "";
        }
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            Uri parse = Uri.parse(str);
            try {
                efpb efpbVar = efor.c;
                if (efor.b(fdwk.a.get().a(efor.b))) {
                    return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), parse.getQuery(), null).toString();
                }
                return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), parse.getQuery() != null ? URLEncoder.encode(parse.getQuery(), "utf-8") : "").toString();
            } catch (UnsupportedEncodingException | URISyntaxException e) {
                Log.e("SurveyUtils", e.getMessage());
            }
        }
        Log.e("SurveyUtils", "Follow up URL is not http or https.");
        return "";
    }

    static String g() {
        efpb efpbVar = efor.c;
        String a2 = fdur.a.get().a(efor.b);
        if (!a2.equals("1")) {
            return a2;
        }
        efpb efpbVar2 = efor.c;
        return fdur.a.get().b(efor.b);
    }

    public static void h(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void i(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public static boolean j(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static boolean k(faje fajeVar) {
        fajg fajgVar = fajeVar.f;
        if (fajgVar == null) {
            fajgVar = fajg.a;
        }
        return fajgVar.b;
    }

    public static boolean l(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean m(faje fajeVar) {
        if (fajeVar.g.size() <= 1) {
            fajr fajrVar = (fajr) fajeVar.g.get(0);
            int i = fajrVar.i;
            int a2 = fajq.a(i);
            if (a2 != 0 && a2 == 3) {
                fagz fagzVar = (fajrVar.c == 4 ? (fakn) fajrVar.d : fakn.a).c;
                if (fagzVar == null) {
                    fagzVar = fagz.a;
                }
                Iterator<E> it = fagzVar.b.iterator();
                while (it.hasNext()) {
                    int a3 = fagv.a(((fagx) it.next()).c);
                    if (a3 != 0 && a3 == 4) {
                        return true;
                    }
                }
                return false;
            }
            int a4 = fajq.a(i);
            if (a4 != 0 && a4 == 5) {
                return false;
            }
        }
        return true;
    }
}
