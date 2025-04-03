package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class efee {
    public static File a(efef efefVar, Uri uri) {
        throw new efcy("Cannot convert uri to file " + efefVar.i() + " " + String.valueOf(uri));
    }

    public static Iterable b(efef efefVar) {
        throw new efcy("children not supported by ".concat(efefVar.i()));
    }

    public static void c(efef efefVar) {
        throw new efcy("createDirectory not supported by ".concat(efefVar.i()));
    }

    public static void d(efef efefVar) {
        throw new efcy("deleteDirectory not supported by ".concat(efefVar.i()));
    }

    public static long e(efef efefVar) {
        throw new efcy("fileSize not supported by ".concat(efefVar.i()));
    }

    public static OutputStream f(efef efefVar) {
        throw new efcy("openForAppend not supported by ".concat(efefVar.i()));
    }
}
