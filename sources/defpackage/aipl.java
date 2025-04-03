package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aipl extends cgwl {
    public static final enru a = enru.c("com/google/android/apps/messaging/net/cronet/AttachmentUploaderImpl");
    public static final cfva b = cfvl.f(cfvl.b, "upload_file_size_limit", 199229440);
    public final cgzv c;
    public final akzt d;
    public final faws e;
    private final ConcurrentHashMap f = new ConcurrentHashMap();
    private final ConcurrentHashMap g = new ConcurrentHashMap();
    private final Context h;
    private final ctap i;
    private final albq j;
    private final errl k;
    private final errl l;
    private final ffbr m;
    private final csuu n;
    private final chga o;
    private final ffbr p;

    public aipl(Context context, cgzv cgzvVar, ctap ctapVar, akzt akztVar, albq albqVar, errl errlVar, errl errlVar2, ffbr ffbrVar, faws fawsVar, csuu csuuVar, chga chgaVar, ffbr ffbrVar2) {
        this.h = context;
        this.c = cgzvVar;
        this.i = ctapVar;
        this.d = akztVar;
        this.j = albqVar;
        this.k = errlVar;
        this.l = errlVar2;
        this.m = ffbrVar;
        this.e = fawsVar;
        this.n = csuuVar;
        this.o = chgaVar;
        this.p = ffbrVar2;
    }

    public static ListenableFuture b(String str) {
        return erqt.h(new aipk(str));
    }

    public static String e(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    private final InputStream h(Uri uri) {
        InputStream openInputStream = this.h.getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            return openInputStream;
        }
        throw new FileNotFoundException("Could not open uri for upload: ".concat(String.valueOf(String.valueOf(uri))));
    }

    private static void i(MessagePartCoreData messagePartCoreData, bcyf bcyfVar) {
        messagePartCoreData.as(bcyfVar.d());
    }

    private static void j(MessagePartCoreData messagePartCoreData, bcyf bcyfVar) {
        messagePartCoreData.aA(bcyfVar.d());
    }

    private final void k(MessagePartCoreData messagePartCoreData) {
        ConversationIdType A = messagePartCoreData.A();
        MessageIdType B = messagePartCoreData.B();
        String aa = messagePartCoreData.aa();
        ekzz f = eleg.f("AttachmentUploaderImpl#updateMessagePartCompressedBlobUploadPermanentFailure");
        try {
            csix.h();
            bdpt bdptVar = (bdpt) this.m.b();
            String[] strArr = PartsTable.a;
            bwdi bwdiVar = new bwdi();
            bwdiVar.ap("updateMessagePartCompressedBlobUploadPermanentFailure");
            int intValue = PartsTable.e().intValue();
            int intValue2 = PartsTable.e().intValue();
            if (intValue2 < 27000) {
                dtub.w("compressed_blob_upload_permanent_failure", intValue2);
            }
            if (intValue >= 27000) {
                bwdiVar.a.put("compressed_blob_upload_permanent_failure", (Boolean) true);
            }
            bdptVar.f(A, B, aa, bwdiVar);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void l(MessagePartCoreData messagePartCoreData) {
        ConversationIdType A = messagePartCoreData.A();
        MessageIdType B = messagePartCoreData.B();
        String aa = messagePartCoreData.aa();
        ekzz f = eleg.f("AttachmentUploaderImpl#updateMessagePartBlobUploadPermanentFailure");
        try {
            csix.h();
            bdpt bdptVar = (bdpt) this.m.b();
            String[] strArr = PartsTable.a;
            bwdi bwdiVar = new bwdi();
            bwdiVar.ap("updateMessagePartBlobUploadPermanentFailure");
            int intValue = PartsTable.e().intValue();
            int intValue2 = PartsTable.e().intValue();
            if (intValue2 < 18000) {
                dtub.w("blob_upload_permanent_failure", intValue2);
            }
            if (intValue >= 18000) {
                bwdiVar.a.put("blob_upload_permanent_failure", (Boolean) true);
            }
            bdptVar.f(A, B, aa, bwdiVar);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static boolean m(String str, int i) {
        if (!le.k(str)) {
            entd entdVar = cstz.a;
            if (i == 1 || i == 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean n(MessagePartCoreData messagePartCoreData, int i, Uri uri, InputStream inputStream) {
        boolean z = true;
        String str = (i == 2 || i == 1) ? "Bugle.Ditto.Attachment.EncryptSmallImage.Latency" : "Bugle.Ditto.Attachment.Encrypt.Latency";
        String valueOf = String.valueOf(messagePartCoreData.B());
        String aa = messagePartCoreData.aa();
        String valueOf2 = String.valueOf(valueOf);
        String valueOf3 = String.valueOf(aa);
        albq albqVar = this.j;
        String concat = valueOf2.concat(valueOf3);
        albqVar.c(str, concat);
        File i2 = azyy.i(uri, this.h);
        int i3 = i - 1;
        bcyf bcyfVar = i3 != 1 ? new bcyf(messagePartCoreData.bL()) : new bcyf(messagePartCoreData.bK());
        if (!bcyfVar.b()) {
            bcyfVar = bcyf.a();
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(i2);
                try {
                    this.c.B(inputStream, fileOutputStream, bcyfVar);
                    if (i3 == 0) {
                        j(messagePartCoreData, bcyfVar);
                        i(messagePartCoreData, bcyfVar);
                    } else if (i3 != 1) {
                        j(messagePartCoreData, bcyfVar);
                    } else {
                        i(messagePartCoreData, bcyfVar);
                    }
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.j.p(str, concat);
            }
        } catch (IOException | GeneralSecurityException e) {
            csjy.p("BugleNetwork", e, "Failed to encrypt attachment, uploading raw instead");
            azyy.j(this.h, uri);
            z = false;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c8 A[Catch: Exception -> 0x0386, TryCatch #8 {Exception -> 0x0386, blocks: (B:69:0x0207, B:72:0x0221, B:74:0x0282, B:75:0x0289, B:77:0x028f, B:78:0x02b1, B:83:0x02bb, B:84:0x0359, B:105:0x02ad, B:108:0x02c8, B:110:0x02ec, B:111:0x02f3), top: B:65:0x01fc }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0124 A[Catch: Exception -> 0x039c, TRY_LEAVE, TryCatch #3 {Exception -> 0x039c, blocks: (B:19:0x00c8, B:21:0x00ce, B:24:0x00e0, B:27:0x00ec, B:30:0x013c, B:32:0x0158, B:34:0x015f, B:38:0x016f, B:39:0x0197, B:43:0x0184, B:53:0x017f, B:52:0x017c, B:57:0x01ae, B:58:0x01c1, B:60:0x01ca, B:61:0x01e1, B:116:0x01d7, B:117:0x01dc, B:119:0x00f6, B:121:0x00fe, B:123:0x0116, B:125:0x011c, B:127:0x0124, B:130:0x012c, B:141:0x013b, B:140:0x0138, B:143:0x01b6, B:129:0x0128, B:136:0x0133), top: B:18:0x00c8, inners: #2, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce A[Catch: Exception -> 0x039c, TryCatch #3 {Exception -> 0x039c, blocks: (B:19:0x00c8, B:21:0x00ce, B:24:0x00e0, B:27:0x00ec, B:30:0x013c, B:32:0x0158, B:34:0x015f, B:38:0x016f, B:39:0x0197, B:43:0x0184, B:53:0x017f, B:52:0x017c, B:57:0x01ae, B:58:0x01c1, B:60:0x01ca, B:61:0x01e1, B:116:0x01d7, B:117:0x01dc, B:119:0x00f6, B:121:0x00fe, B:123:0x0116, B:125:0x011c, B:127:0x0124, B:130:0x012c, B:141:0x013b, B:140:0x0138, B:143:0x01b6, B:129:0x0128, B:136:0x0133), top: B:18:0x00c8, inners: #2, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ca A[Catch: Exception -> 0x039c, TryCatch #3 {Exception -> 0x039c, blocks: (B:19:0x00c8, B:21:0x00ce, B:24:0x00e0, B:27:0x00ec, B:30:0x013c, B:32:0x0158, B:34:0x015f, B:38:0x016f, B:39:0x0197, B:43:0x0184, B:53:0x017f, B:52:0x017c, B:57:0x01ae, B:58:0x01c1, B:60:0x01ca, B:61:0x01e1, B:116:0x01d7, B:117:0x01dc, B:119:0x00f6, B:121:0x00fe, B:123:0x0116, B:125:0x011c, B:127:0x0124, B:130:0x012c, B:141:0x013b, B:140:0x0138, B:143:0x01b6, B:129:0x0128, B:136:0x0133), top: B:18:0x00c8, inners: #2, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fe A[Catch: Exception -> 0x0388, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0388, blocks: (B:63:0x01e8, B:67:0x01fe), top: B:62:0x01e8 }] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl a(defpackage.fcdu r25, j$.util.Optional r26, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r27, final java.lang.String r28, final boolean r29) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aipl.a(fcdu, j$.util.Optional, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.String, boolean):elfl");
    }

    @Override // defpackage.cgwl
    public final ListenableFuture c(final fcdu fcduVar, final Optional optional, final MessagePartCoreData messagePartCoreData) {
        ConcurrentHashMap concurrentHashMap = this.f;
        String aa = messagePartCoreData.aa();
        emyl emylVar = (emyl) concurrentHashMap.get(aa);
        if (emylVar == null) {
            this.f.putIfAbsent(aa, emys.a(new emyl() { // from class: aipf
                @Override // defpackage.emyl
                public final Object get() {
                    MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                    String str = true != messagePartCoreData2.bo() ? null : "Bugle.Ditto.UploadEncryptedFullSizeImageToBlobstore.Latency";
                    return aipl.this.a(fcduVar, optional, messagePartCoreData2, str, false);
                }
            }));
            csjy.i("BugleNetwork", "Uploading attachment for part ".concat(String.valueOf(aa)));
            emylVar = (emyl) this.f.get(aa);
        } else {
            csjy.c("BugleNetwork", a.a(aa, "Already uploading part ", ", skipping"));
        }
        return (ListenableFuture) emylVar.get();
    }

    @Override // defpackage.cgwl
    public final ListenableFuture d(final fcdu fcduVar, final Optional optional, final MessagePartCoreData messagePartCoreData) {
        ConcurrentHashMap concurrentHashMap = this.g;
        String aa = messagePartCoreData.aa();
        emyl emylVar = (emyl) concurrentHashMap.get(aa);
        if (emylVar == null) {
            this.g.putIfAbsent(aa, emys.a(new emyl() { // from class: aipi
                @Override // defpackage.emyl
                public final Object get() {
                    aipl aiplVar = aipl.this;
                    MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                    String str = null;
                    if (messagePartCoreData2.bo() && aiplVar.c.E(messagePartCoreData2)) {
                        str = "Bugle.Ditto.UploadEncryptedCompressedImageToBlobstore.Latency";
                    }
                    String str2 = str;
                    return aiplVar.a(fcduVar, optional, messagePartCoreData2, str2, true);
                }
            }));
            csjy.i("BugleNetwork", "Uploading attachment for part ".concat(String.valueOf(aa)));
            emylVar = (emyl) this.g.get(aa);
        } else {
            csjy.c("BugleNetwork", a.a(aa, "Already uploading part ", ", skipping"));
        }
        return (ListenableFuture) emylVar.get();
    }

    public final void f(String str, boolean z, MessagePartCoreData messagePartCoreData, favp favpVar, Uri uri) {
        String aa = messagePartCoreData.aa();
        if (str != null) {
            this.j.p(str, String.valueOf(String.valueOf(messagePartCoreData.B())).concat(String.valueOf(aa)));
        }
        if (z) {
            this.g.remove(aa);
        } else {
            this.f.remove(aa);
        }
        if (favpVar != null) {
            try {
                favpVar.close();
            } catch (IOException e) {
                csjy.h("BugleNetwork", e, "Could not close the uploader's data stream.");
            }
        }
        if (uri != null) {
            azyy.j(this.h, uri);
        }
    }

    public final void g(MessagePartCoreData messagePartCoreData, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            l(messagePartCoreData);
            k(messagePartCoreData);
        } else if (i2 != 1) {
            l(messagePartCoreData);
        } else {
            k(messagePartCoreData);
        }
    }
}
