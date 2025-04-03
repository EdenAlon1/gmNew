package defpackage;

import android.net.Uri;
import android.os.Build;
import android.webkit.URLUtil;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eepe {
    private static final entd a = entd.c("UrlChecker");
    private static final Pattern b = Pattern.compile("(\\.|%2e){2,}|%u", 2);

    protected abstract boolean a(String str);

    public final boolean b(Uri uri) {
        if (Build.VERSION.SDK_INT < 30) {
            uri = Uri.parse(uri.toString());
        }
        Pattern pattern = eepd.a;
        Uri.Builder encodedFragment = uri.buildUpon().encodedFragment(null);
        if (uri.isHierarchical()) {
            encodedFragment.clearQuery();
        }
        String uri2 = encodedFragment.build().toString();
        if (b.matcher(uri2).find()) {
            ((ensz) a.n().h("com/google/android/libraries/saferwebview/UrlChecker", "isUrlAllowlisted", 78, "UrlChecker.java")).t("'..' and '%%u' are not allowed in '%s'", eepd.a(uri));
            return false;
        }
        if ((!emxe.c(uri.getHost()) && "https".equalsIgnoreCase(uri.getScheme())) || URLUtil.isAssetUrl(uri2) || URLUtil.isAboutUrl(uri2) || uri2.startsWith("file:///android_res/")) {
            return a(uri2);
        }
        ((ensz) a.n().h("com/google/android/libraries/saferwebview/UrlChecker", "isUrlAllowlisted", 88, "UrlChecker.java")).t("Url '%s' is not allowed (empty host/non-https or non resource/asset/about url)", eepd.a(uri));
        return false;
    }
}
