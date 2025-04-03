package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efln {
    public final ContentResolver a;
    public final Uri b;
    public final Uri c;
    public final Uri d;

    public efln(ContentResolver contentResolver, Uri uri, Uri uri2, Uri uri3) {
        this.a = contentResolver;
        this.b = uri;
        this.c = uri2;
        this.d = uri3;
    }

    public static String a(String str) {
        String[] split = str.split("/");
        int length = split.length - 1;
        split[length] = Uri.encode(split[length]);
        return emww.d('/').f(split);
    }
}
