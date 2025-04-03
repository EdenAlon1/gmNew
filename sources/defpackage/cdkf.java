package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdkf implements cdjy {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsDownloadContentFromBlobstoreWorkerImpl");
    public final Context b;
    public final errl c;
    public final asjf d;
    public final chgm e;
    private final ffbr f;
    private final ekos g;

    public cdkf(chgm chgmVar, ffbr ffbrVar, ekos ekosVar, errl errlVar, Context context, asjf asjfVar) {
        this.e = chgmVar;
        this.f = ffbrVar;
        this.c = errlVar;
        this.g = ekosVar;
        this.b = context;
        this.d = asjfVar;
    }

    @Override // defpackage.cdjy
    public final elfl a(String str, byte[] bArr, eisx eisxVar) {
        return b(str, bArr, eisxVar, false);
    }

    public final elfl b(final String str, final byte[] bArr, final eisx eisxVar, final boolean z) {
        final bcyf bcyfVar = new bcyf(bArr);
        return ((this.d.a() && z) ? elfl.g(this.g.a(eisxVar)).h(new emwl() { // from class: cdka
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ekor) obj).a;
            }
        }, erpp.a) : elfl.g(this.g.b(eisxVar)).h(new emwl() { // from class: cdka
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ekor) obj).a;
            }
        }, erpp.a)).i(new eroh() { // from class: cdkd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                chgm chgmVar = cdkf.this.e;
                Uri d = cbgi.d(null, chgmVar.a);
                SettableFuture create = SettableFuture.create();
                chgmVar.b.newUrlRequestBuilder(new Uri.Builder().scheme("https").authority(chgl.a()).appendPath("download").appendPath("v1").appendPath("files").appendPath(str).appendQueryParameter("header.box_profile.application_id", "ANDROID_MESSAGES").appendQueryParameter("alt", "media").build().toString(), new aiox(d, create, chgmVar.a, chgmVar.d, chgmVar.e), chgmVar.c).setTrafficStatsTag(8196).setPriority(2).addHeader("Authorization", "Bearer ".concat(String.valueOf((String) obj))).build().start();
                return create;
            }
        }, this.c).i(bcyfVar.b() ? new eroh() { // from class: cdkb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Uri uri = (Uri) obj;
                final cdkf cdkfVar = cdkf.this;
                Context context = cdkfVar.b;
                final Uri d = cbgi.d(null, context);
                final File i = cbgi.i(d, context);
                final File i2 = cbgi.i(uri, cdkfVar.b);
                final bcyf bcyfVar2 = bcyfVar;
                return cdkfVar.c.submit(eldl.m(new Callable() { // from class: cdjz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cdkf cdkfVar2 = cdkf.this;
                        File file = i2;
                        File file2 = i;
                        bcyf bcyfVar3 = bcyfVar2;
                        Uri uri2 = uri;
                        Uri uri3 = d;
                        cdkfVar2.c(file, file2, bcyfVar3, uri2, uri3);
                        return uri3;
                    }
                }));
            }
        } : new eroh() { // from class: cdkc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return elfo.e((Uri) obj);
            }
        }, erpp.a).f(fedn.class, new eroh() { // from class: cdke
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fedn fednVar = (fedn) obj;
                cdkf cdkfVar = cdkf.this;
                if (!cdkfVar.d.a()) {
                    throw fednVar;
                }
                if (z) {
                    throw fednVar;
                }
                if (!fednVar.a.equals(Status.j)) {
                    throw fednVar;
                }
                eisx eisxVar2 = eisxVar;
                byte[] bArr2 = bArr;
                String str2 = str;
                ensk i = cdkf.a.i();
                i.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) ((enrr) i).g(fednVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsDownloadContentFromBlobstoreWorkerImpl", "downloadContentFromBlobstoreInternal", 128, "CmsDownloadContentFromBlobstoreWorkerImpl.java")).t("%s Unauthorized error when downloading file, retrying with a refreshed authentication token", "CmsDownloadContentFromBlobstoreWorkerImpl:");
                return cdkfVar.b(str2, bArr2, eisxVar2, true);
            }
        }, this.c);
    }

    public final /* synthetic */ void c(File file, File file2, bcyf bcyfVar, Uri uri, Uri uri2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    ((cgzv) this.f.b()).A(fileInputStream, fileOutputStream, bcyfVar);
                    cbgi.j(this.b, uri);
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException | GeneralSecurityException e) {
            cbgi.j(this.b, uri);
            cbgi.j(this.b, uri2);
            throw new RuntimeException("Decryption failed for downloaded file at ".concat(String.valueOf(String.valueOf(uri))), e);
        }
    }
}
