package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pfx extends pff {
    private final Pattern b = Pattern.compile("\\A\\d+");

    @Override // defpackage.pfg
    public final boolean d() {
        PackageInfo currentWebViewPackage;
        boolean d = super.d();
        if (!d || Build.VERSION.SDK_INT >= 29) {
            return d;
        }
        Uri uri = pew.a;
        currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            return false;
        }
        Matcher matcher = this.b.matcher(currentWebViewPackage.versionName);
        return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
