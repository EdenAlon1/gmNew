package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class eerb {
    private static final Pattern a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
    private static int b;

    public static String a(int i, int i2, String str) {
        Set<String> unmodifiableSet;
        String str2 = str;
        String str3 = null;
        if (str2 == null) {
            return null;
        }
        if (!a.matcher(str2).find()) {
            str3 = str2;
            str2 = "https://images" + b() + "-esmobile-opensocial.googleusercontent.com/gadgets/proxy";
        }
        Uri parse = Uri.parse(str2);
        Uri.Builder buildUpon = Uri.EMPTY.buildUpon();
        buildUpon.authority(parse.getAuthority());
        buildUpon.scheme(parse.getScheme());
        buildUpon.path(parse.getPath());
        if (i != -1 && i2 != -1) {
            buildUpon.appendQueryParameter("resize_w", Integer.toString(i));
            buildUpon.appendQueryParameter("resize_h", Integer.toString(i2));
            buildUpon.appendQueryParameter("no_expand", "1");
        }
        buildUpon.appendQueryParameter("fpt", "a7bcfbce29e");
        Uri build = buildUpon.build();
        if (parse.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.EMPTY_SET;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i3 = 0;
            do {
                int indexOf = encodedQuery.indexOf(38, i3);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i3);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i3, indexOf2)));
                i3 = indexOf + 1;
            } while (i3 < encodedQuery.length());
            unmodifiableSet = DesugarCollections.unmodifiableSet(linkedHashSet);
        }
        for (String str4 : unmodifiableSet) {
            if (build.getQueryParameter(str4) == null) {
                boolean z = true;
                boolean z2 = "resize_w".equals(str4) || "resize_h".equals(str4) || "no_expand".equals(str4);
                if (i != -1 && i2 != -1) {
                    z = false;
                }
                Uri.Builder buildUpon2 = build.buildUpon();
                if ("url".equals(str4)) {
                    buildUpon2.appendQueryParameter("url", parse.getQueryParameter("url"));
                } else if (!z || !z2) {
                    Iterator<String> it = parse.getQueryParameters(str4).iterator();
                    while (it.hasNext()) {
                        buildUpon2.appendQueryParameter(str4, it.next());
                    }
                }
                build = buildUpon2.build();
            }
        }
        if (str3 != null && build.getQueryParameter("url") == null) {
            Uri.Builder buildUpon3 = build.buildUpon();
            buildUpon3.appendQueryParameter("url", str3);
            build = buildUpon3.build();
        }
        if (build.getQueryParameter("container") == null) {
            Uri.Builder buildUpon4 = build.buildUpon();
            buildUpon4.appendQueryParameter("container", "esmobile");
            build = buildUpon4.build();
        }
        if (build.getQueryParameter("gadget") == null) {
            Uri.Builder buildUpon5 = build.buildUpon();
            buildUpon5.appendQueryParameter("gadget", "a");
            build = buildUpon5.build();
        }
        if (build.getQueryParameter("rewriteMime") == null) {
            Uri.Builder buildUpon6 = build.buildUpon();
            buildUpon6.appendQueryParameter("rewriteMime", "image/*");
            build = buildUpon6.build();
        }
        return build.toString();
    }

    private static synchronized int b() {
        int i;
        synchronized (eerb.class) {
            i = b + 1;
            b = i % 3;
        }
        return i;
    }
}
