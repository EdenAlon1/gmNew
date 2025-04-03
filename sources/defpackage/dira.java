package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.filetransfer.http.PendingTransferInfo;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Optional;
import java.io.IOException;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dira extends diqx {
    static final diyy c = dizd.a(183016660);
    protected final long d;
    protected final String e;
    private final ditk f;
    private final diqw g;

    public dira(Context context, ditk ditkVar, diqw diqwVar, diqp diqpVar, long j, String str) {
        super(context, diqpVar);
        this.f = ditkVar;
        this.g = diqwVar;
        this.d = j;
        this.e = str;
    }

    private final void d() {
        if (((diqr) this.g).a && ((Boolean) c.a()).booleanValue()) {
            this.b.o(Long.toString(this.d));
        }
    }

    @Override // defpackage.diqx
    protected final String a() {
        return Long.toString(this.d);
    }

    @Override // defpackage.diuc
    public void b(byte[] bArr, Uri uri) {
        HttpFileTransferPushMessage httpFileTransferPushMessage;
        try {
            httpFileTransferPushMessage = HttpFileTransferPushMessage.a(bArr);
            httpFileTransferPushMessage.mFileId = this.e;
        } catch (IOException e) {
            dkty.i(e, "Error parsing HTTP file transfer for session ID %d, file ID %s", Long.valueOf(this.d), this.e);
            httpFileTransferPushMessage = null;
        }
        if (httpFileTransferPushMessage != null) {
            PendingTransferInfo a = this.b.a(Long.toString(this.d));
            if (a == null) {
                dkty.g("Pending file transfer info not found after uploading file.", new Object[0]);
                d();
                return;
            }
            a.mPushMessage = httpFileTransferPushMessage;
            a.uploadPushMessageData = bArr;
            ditb ditbVar = new ditb();
            ditbVar.i(httpFileTransferPushMessage.mFileId);
            ditbVar.f(httpFileTransferPushMessage.mFileInfo.mSize);
            ditbVar.c(httpFileTransferPushMessage.mFileInfo.mContentType);
            ditbVar.h(httpFileTransferPushMessage.mFileInfo.mUrl);
            ditbVar.g(this.d);
            ditbVar.c = Optional.of(bArr);
            Date date = httpFileTransferPushMessage.mFileInfo.mValidity;
            if (date != null) {
                ditbVar.m(date.getTime());
            }
            if (((diqr) this.g).b) {
                String str = httpFileTransferPushMessage.mFileInfo.mBrandedUrl;
                if (!emxe.c(str)) {
                    ditbVar.b = Optional.of(str);
                }
            }
            dkuk.c(this.a, RcsIntents.ACTION_FILE_TRANSFER_METADATA_UPDATE, this.f.a(ditbVar.a()), dkuj.UPLOAD_LISTENER);
        }
        d();
    }
}
