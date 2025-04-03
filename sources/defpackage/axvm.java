package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvm {
    private final Context a;
    private final ffbr b;

    public axvm(Context context, ffbr ffbrVar) {
        this.a = context;
        this.b = ffbrVar;
    }

    public static Uri a(Uri uri, String str, long j) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (uri.equals(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI) || uri.equals(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI)) {
            buildUpon.appendQueryParameter("limit", (String) csqw.b.e());
        }
        return buildUpon.appendPath(str).appendQueryParameter("directory", String.valueOf(j)).build();
    }

    public static boolean e(String str) {
        return str != null && str.contains("@");
    }

    public final csqz b(String str, csqy csqyVar) {
        Uri uri;
        Uri uri2;
        if (e(str)) {
            uri2 = ContactsContract.CommonDataKinds.Email.ENTERPRISE_CONTENT_FILTER_URI;
            return c(uri2, str, csqyVar);
        }
        uri = ContactsContract.CommonDataKinds.Phone.ENTERPRISE_CONTENT_FILTER_URI;
        return d(uri, str, csqyVar);
    }

    public final csqz c(Uri uri, String str, csqy csqyVar) {
        if (!((ctud) this.b.b()).i()) {
            return new csqm(csqyVar, null);
        }
        return new csqm(csqyVar, new bcqd(this.a, a(uri, str, csqyVar.a()), axvk.a, null, null, "sort_key").a());
    }

    public final csqz d(Uri uri, String str, csqy csqyVar) {
        if (!((ctud) this.b.b()).i()) {
            return new csqm(csqyVar, null);
        }
        return new csqm(csqyVar, new bcqd(this.a, a(uri, str, csqyVar.a()), axvk.a, null, null, "sort_key").a());
    }
}
