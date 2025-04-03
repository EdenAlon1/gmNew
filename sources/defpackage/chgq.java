package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chgq implements chgn {
    private static final cskc a = cskc.g("BugleCms", "ContentUploaderImpl");
    private final faws b;
    private final Context c;
    private final csuu d;

    public chgq(faws fawsVar, Context context, csuu csuuVar) {
        new ArrayMap();
        this.b = fawsVar;
        this.c = context;
        this.d = csuuVar;
    }

    @Override // defpackage.chgn
    public final void a() {
        a.i().q("ContentUploaderUploadCaching is disabled");
    }

    @Override // defpackage.chgn
    public final ListenableFuture b(String str, String str2, final Uri uri) {
        int i = SettableFuture.a;
        String uri2 = new Uri.Builder().scheme("https").authority(chgl.a()).appendPath("upload").appendPath("v1").appendPath("files").appendQueryParameter("header.box_profile.application_id", "ANDROID_MESSAGES").appendQueryParameter("file.file_id", str2).build().toString();
        try {
            fawo fawoVar = new fawo();
            fawoVar.a = 5L;
            fawp fawpVar = new fawp(fawoVar);
            final favz favzVar = new favz(this.d.k(uri), this.d.b(uri), 1048576);
            favs favsVar = new favs();
            favsVar.e("X-Goog-Upload-Header-Content-Length", Long.toString(favzVar.e()));
            String type = this.c.getContentResolver().getType(uri);
            if (!TextUtils.isEmpty(type)) {
                favsVar.e("X-Goog-Upload-Header-Content-Type", emuz.c(type));
            }
            favsVar.d("Authorization", a.t(str, "Bearer "));
            return ernq.g(erny.f(erqc.o(this.b.b(uri2, favsVar, favzVar, null, fawpVar).b()), new emwl() { // from class: chgo
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    fawm fawmVar = (fawm) obj;
                    chgq.this.c(favzVar, uri);
                    return fawmVar;
                }
            }, erpp.a), ExecutionException.class, new eroh() { // from class: chgp
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    ExecutionException executionException = (ExecutionException) obj;
                    chgq.this.c(favzVar, uri);
                    throw executionException;
                }
            }, erpp.a);
        } catch (FileNotFoundException e) {
            return erqt.h(e);
        }
    }

    public final void c(favp favpVar, Uri uri) {
        try {
            favpVar.close();
        } catch (IOException e) {
            a.o("failed to close stream after uploaded the content", e);
        }
        if (uri != null) {
            azyy.j(this.c, uri);
        }
    }
}
