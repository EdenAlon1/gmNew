package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.communication.synapse.security.scytale.MediaEncryptor;
import j$.time.Duration;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzxu implements crbb {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor");
    private final Context b;
    private final cqoh c;
    private final fazb d;
    private final crbc e;
    private final csuu f;
    private final ffbr g;
    private final ffbr h;

    public bzxu(Context context, cqoh cqohVar, fazb fazbVar, crbc crbcVar, csuu csuuVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = context;
        this.c = cqohVar;
        this.d = fazbVar;
        this.e = crbcVar;
        this.f = csuuVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
    }

    @Override // defpackage.crbb
    public final crbv a(MessageCoreData messageCoreData, engw engwVar) {
        if (!messageCoreData.cB()) {
            return this.e.a(messageCoreData, engwVar);
        }
        MessagePartCoreData G = messageCoreData.G();
        if (G == null) {
            throw new IllegalArgumentException();
        }
        String[] strArr = btck.a;
        bszx bszxVar = new bszx();
        bszxVar.p(messageCoreData.E());
        bszxVar.g(this.c.f());
        entd entdVar = crbv.h;
        crbf crbfVar = new crbf();
        try {
            ekzz f = eleg.f("EncryptedFileUploadPreprocessor#encryptFile");
            try {
                Uri t = G.t();
                if (t == null) {
                    throw new IllegalArgumentException("The file transfer message does not contain an expected content URI");
                }
                String a2 = crba.a(G);
                String V = G.V();
                InputStream k = this.f.k(t);
                this.d.b();
                MediaEncryptor mediaEncryptor = (MediaEncryptor) cafo.a(MediaEncryptor.createEncryptorInstance());
                esos esosVar = new esos(k, mediaEncryptor, 1);
                try {
                    Uri g = cbgi.g(esosVar, this.b);
                    esosVar.close();
                    bszxVar.d(mediaEncryptor.getKeyMaterial());
                    bszxVar.c(mediaEncryptor.getDigest());
                    bszxVar.e(mediaEncryptor.getVersion());
                    bszxVar.f(g);
                    bszxVar.k(a2);
                    bszxVar.j(V);
                    enru enruVar = a;
                    ensk e = enruVar.e();
                    e.Y(ente.a, "BugleEtouffee");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor", "encryptAttachmentContentsAndProvideMetadata", 252, "EncryptedFileUploadPreprocessor.java")).q("Hiding file name and content type in fileUploadInfo");
                    crbfVar.d(bzpp.a);
                    crbfVar.e(g);
                    crbfVar.f("encrypted_file");
                    f.close();
                    if (G.bo() || G.bD()) {
                        ekzz f2 = eleg.f("EncryptedFileUploadPreprocessor#encryptPreview");
                        try {
                            byte[] a3 = ((crbd) this.g.b()).a(G, ((crbe) this.h.b()).a(engwVar));
                            if (a3 != null) {
                                this.d.b();
                                MediaEncryptor mediaEncryptor2 = (MediaEncryptor) cafo.a(MediaEncryptor.createEncryptorInstance());
                                byte[] bArr = (byte[]) cafo.a(mediaEncryptor2.encrypt(a3, true));
                                bszxVar.n(mediaEncryptor2.getKeyMaterial());
                                bszxVar.m(mediaEncryptor2.getDigest());
                                bszxVar.o(mediaEncryptor2.getVersion());
                                bszxVar.l(eijq.h.toString());
                                ensk e2 = enruVar.e();
                                e2.Y(ente.a, "BugleEtouffee");
                                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor", "createAndEncryptImagePreviewAndProvideMetadata", 316, "EncryptedFileUploadPreprocessor.java")).q("Hiding thumbnail content type in fileUploadInfo");
                                crbfVar.h(bzpp.a);
                                crbfVar.i(eyee.x(bArr));
                            }
                            f2.close();
                        } catch (Throwable th) {
                            try {
                                f2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else if (G.ba()) {
                        crbfVar.c(Duration.ofMillis(G.k()));
                    }
                    bszxVar.b();
                    return crbfVar.j();
                } finally {
                }
            } finally {
            }
        } catch (IOException e3) {
            ensk j = a.j();
            j.Y(ente.a, "BugleEtouffee");
            enrr enrrVar = (enrr) ((enrr) j).g(e3);
            enrrVar.Y(csux.f, messageCoreData.E());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor", "prepareFileForUpload", 146, "EncryptedFileUploadPreprocessor.java")).q("Unable to encrypt file transfer content");
            throw e3;
        }
    }
}
