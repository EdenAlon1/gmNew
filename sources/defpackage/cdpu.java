package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdpu {
    public static final cskc a = cskc.g("BugleCms", "CmsUploadContentToBlobstoreWorker");
    private static final enru f = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsUploadContentToBlobstoreWorker");
    public final chgn b;
    public final Context c;
    public final ctap d;
    public final asjg e;
    private final errl g;
    private final csuu h;
    private final ekos i;
    private final cgzv j;
    private final asir k;

    public cdpu(chgn chgnVar, cgzv cgzvVar, ctap ctapVar, ekos ekosVar, Context context, errl errlVar, csuu csuuVar, asjg asjgVar, asir asirVar) {
        this.b = chgnVar;
        this.j = cgzvVar;
        this.d = ctapVar;
        this.c = context;
        this.g = errlVar;
        this.i = ekosVar;
        this.h = csuuVar;
        this.e = asjgVar;
        this.k = asirVar;
    }

    public static elfl c(fawm fawmVar, bcyf bcyfVar, String str) {
        if (fawmVar != null && fawmVar.b()) {
            return elfo.d(fawmVar.a);
        }
        if (fawmVar == null || !fawmVar.a()) {
            return elfo.d(new cdpr(cdps.UNKNOWN_FAILURE));
        }
        favt favtVar = fawmVar.b;
        int i = favtVar.a;
        if (i != 200) {
            a.n(a.h(i, "Error response code for uploading: "));
            return elfo.d(new cdpr(cdps.HTTP_RESPONSE_ERROR, favtVar.a));
        }
        if (favtVar.c == null) {
            return elfo.d(new cdpr(cdps.HTTP_EMPTY_RESPONSE));
        }
        byte[] d = bcyfVar.d();
        eyee eyeeVar = null;
        if (bcyfVar.b() && d != null) {
            eyeeVar = eyee.x(d);
        }
        return elfo.e(new cdjx(str, eyeeVar));
    }

    public static boolean f(fawm fawmVar) {
        return fawmVar != null && fawmVar.a() && fawmVar.b.a == 401;
    }

    public static final Uri h(int i, Uri uri) {
        return i + (-1) != 1 ? uri : Uri.parse(uri.toString().concat("/compressed"));
    }

    public final elfl a(eisx eisxVar) {
        return elfl.g(this.i.b(eisxVar)).h(new cdpo(), erpp.a);
    }

    public final elfl b(eisx eisxVar) {
        return elfl.g(this.i.a(eisxVar)).h(new cdpo(), erpp.a);
    }

    public final elfl d(final Uri uri, final eisx eisxVar, final String str, final boolean z) {
        final bcyf a2 = bcyf.a();
        final Uri d = azyy.d(null, this.c);
        return g(a2, uri, d).i(new eroh() { // from class: cdpp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cdpu cdpuVar = cdpu.this;
                eisx eisxVar2 = eisxVar;
                return (cdpuVar.e.a() && z) ? cdpuVar.b(eisxVar2) : cdpuVar.a(eisxVar2);
            }
        }, erpp.a).i(new eroh() { // from class: cdpq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cdpu.this.k((String) obj, false, str, uri, d);
            }
        }, this.g).i(new eroh() { // from class: cdpf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cdpu cdpuVar = cdpu.this;
                fawm fawmVar = (fawm) obj;
                azyy.j(cdpuVar.c, d);
                String str2 = str;
                if (!cdpuVar.e.a() || z || !cdpu.f(fawmVar)) {
                    return cdpu.c(fawmVar, a2, str2);
                }
                eisx eisxVar2 = eisxVar;
                Uri uri2 = uri;
                cdpu.a.n("Unauthorized error when uploading content, retrying with a refreshed authentication token");
                return cdpuVar.d(uri2, eisxVar2, str2, true);
            }
        }, this.g).f(Exception.class, new eroh() { // from class: cdpg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                azyy.j(cdpu.this.c, d);
                return elfo.d((Exception) obj);
            }
        }, this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [cgzv] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.FileOutputStream, java.io.OutputStream] */
    public final /* synthetic */ ListenableFuture e(bcyf bcyfVar, Uri uri, Uri uri2) {
        if (bcyfVar.d() == null) {
            return elfo.d(new cdpr(cdps.ENCRYPTION_ERROR));
        }
        File i = azyy.i(uri, this.c);
        ?? a2 = ((ersq) ((arjv) this.k).a.b()).a("bugle.log_detailed_media_upload_failure");
        if (a2 != 0) {
            try {
                try {
                    a2 = new FileOutputStream(i);
                    try {
                        InputStream k = this.h.k(uri2);
                        try {
                            this.j.B(k, a2, bcyfVar);
                            elfl e = elfo.e(null);
                            k.close();
                            a2.close();
                            return e;
                        } finally {
                        }
                    } catch (FileNotFoundException e2) {
                        ensk j = f.j();
                        j.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsUploadContentToBlobstoreWorker", "encryptContent", (char) 412, "CmsUploadContentToBlobstoreWorker.java")).q("FileNotFoundException for original content");
                        azyy.j(this.c, uri);
                        elfl d = elfo.d(new cdpr(cdps.FILE_NOT_FOUND_ORIGINAL));
                        a2.close();
                        return d;
                    }
                } finally {
                }
            } catch (FileNotFoundException e3) {
                ensk j2 = f.j();
                j2.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) ((enrr) j2).g(e3)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsUploadContentToBlobstoreWorker", "encryptContent", (char) 420, "CmsUploadContentToBlobstoreWorker.java")).q("FileNotFoundException for encryption output in media scratch space");
                azyy.j(this.c, uri);
                return elfo.d(new cdpr(cdps.FILE_NOT_FOUND_WRITE_SCRATCH_SPACE));
            } catch (GeneralSecurityException e4) {
                ensk j3 = f.j();
                j3.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) ((enrr) j3).g(e4)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsUploadContentToBlobstoreWorker", "encryptContent", (char) 427, "CmsUploadContentToBlobstoreWorker.java")).q("Encrypt media failed");
                azyy.j(this.c, uri);
                return elfo.d(new cdpr(cdps.ENCRYPTION_ERROR));
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(i);
                try {
                    InputStream k2 = this.h.k(uri2);
                    try {
                        this.j.B(k2, fileOutputStream, bcyfVar);
                        elfl e5 = elfo.e(null);
                        k2.close();
                        fileOutputStream.close();
                        return e5;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException | GeneralSecurityException e6) {
                azyy.j(this.c, uri);
                a.o("Saving encrypted content to scratch space failed", e6);
                return elfo.d(new cdpr(cdps.ENCRYPTION_ERROR));
            }
        }
    }

    public final elfl g(final bcyf bcyfVar, final Uri uri, final Uri uri2) {
        return elfo.h(new erog() { // from class: cdph
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return cdpu.this.e(bcyfVar, uri2, uri);
            }
        }, this.g);
    }

    public final void i() {
        this.b.a();
    }

    public final elfl j(final String str, final Uri uri, final Uri uri2, final int i, final int i2, final eisx eisxVar, final String str2, final boolean z) {
        final bcyf a2 = bcyf.a();
        Context context = this.c;
        final Uri d = azyy.d(null, context);
        final Uri d2 = azyy.d(null, context);
        return elfo.g(new Callable() { // from class: cdpm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cdpu cdpuVar = cdpu.this;
                ctap ctapVar = cdpuVar.d;
                String str3 = str;
                Uri uri3 = uri2;
                Uri uri4 = uri;
                Uri uri5 = d2;
                int i3 = i;
                Context context2 = cdpuVar.c;
                byte[] r = ctapVar.r(str3, uri3, uri4, i3, i2);
                File i4 = azyy.i(uri5, context2);
                if (r == null) {
                    throw new cdpr(cdps.COMPRESS_IMAGE_ERROR);
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(i4);
                    try {
                        fileOutputStream.write(r);
                        fileOutputStream.close();
                        return null;
                    } finally {
                    }
                } catch (IOException e) {
                    azyy.j(cdpuVar.c, uri5);
                    cdpu.a.o("Saving compressed image to scratch space failed for content:".concat(String.valueOf(String.valueOf(uri5))), e);
                    return null;
                }
            }
        }, this.g).i(new eroh() { // from class: cdpe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cdpu.this.g(a2, d2, d);
            }
        }, this.g).i(new eroh() { // from class: cdpi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cdpu cdpuVar = cdpu.this;
                eisx eisxVar2 = eisxVar;
                return (cdpuVar.e.a() && z) ? cdpuVar.b(eisxVar2) : cdpuVar.a(eisxVar2);
            }
        }, this.g).i(new eroh() { // from class: cdpj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cdpu.this.k((String) obj, true, str2, uri2, d);
            }
        }, this.g).i(new eroh() { // from class: cdpk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cdpu cdpuVar = cdpu.this;
                fawm fawmVar = (fawm) obj;
                azyy.j(cdpuVar.c, d2);
                azyy.j(cdpuVar.c, d);
                String str3 = str2;
                if (!cdpuVar.e.a() || z || !cdpu.f(fawmVar)) {
                    return cdpu.c(fawmVar, a2, str3);
                }
                eisx eisxVar2 = eisxVar;
                int i3 = i2;
                int i4 = i;
                Uri uri3 = uri2;
                Uri uri4 = uri;
                String str4 = str;
                cdpu.a.n("Unauthorized error when uploading compressed image, retrying with a refreshed authentication token");
                return cdpuVar.j(str4, uri4, uri3, i4, i3, eisxVar2, str3, true);
            }
        }, this.g).f(Exception.class, new eroh() { // from class: cdpl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cdpu cdpuVar = cdpu.this;
                azyy.j(cdpuVar.c, d2);
                azyy.j(cdpuVar.c, d);
                return elfo.d((Exception) obj);
            }
        }, this.g);
    }

    public final elfl k(final String str, boolean z, final String str2, Uri uri, final Uri uri2) {
        final Uri h = h(true == z ? 2 : 1, uri);
        return elfo.h(new erog() { // from class: cdpn
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return cdpu.this.b.b(str, str2, uri2);
            }
        }, this.g);
    }
}
