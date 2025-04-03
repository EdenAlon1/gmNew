package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfh implements qtw {
    public static final qtt a = new qtt("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, qtt.a);
    private final Context b;

    public rfh(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        return c((Uri) obj, qtuVar);
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final qwv c(Uri uri, qtu qtuVar) {
        Context context;
        int parseInt;
        Drawable a2;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException(a.F(uri, "Package name for ", " is null or empty"));
        }
        if (authority.equals(this.b.getPackageName())) {
            context = this.b;
        } else {
            try {
                context = this.b.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(this.b.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e);
                }
                context = this.b;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            parseInt = context.getResources().getIdentifier(str2, str, authority2);
            if (parseInt == 0) {
                parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (parseInt == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
            }
            try {
                parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e2);
            }
        }
        rkf.f(authority);
        Resources.Theme theme = authority.equals(this.b.getPackageName()) ? (Resources.Theme) qtuVar.b(a) : null;
        if (theme == null) {
            a2 = rfd.a(this.b, context, parseInt, null);
        } else {
            Context context2 = this.b;
            a2 = rfd.a(context2, context2, parseInt, theme);
        }
        return rfg.g(a2);
    }
}
