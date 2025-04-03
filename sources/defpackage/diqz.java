package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqz extends diqx {
    private final long c;
    private final long d;
    private final HttpFileTransferPushMessage e;
    private final int f;
    private final ditk g;
    private final String h;

    public diqz(diqp diqpVar, long j, long j2, HttpFileTransferPushMessage httpFileTransferPushMessage, Context context, ditk ditkVar, String str) {
        super(context, diqpVar);
        this.c = j;
        this.d = j2;
        this.e = httpFileTransferPushMessage;
        this.f = dksy.a("Bugle.RcsEngine.FileTransfer.ThumbnailDownload.Duration");
        this.g = ditkVar;
        this.h = str;
    }

    @Override // defpackage.diqx
    protected final String a() {
        return Long.toString(this.c);
    }

    @Override // defpackage.diuc
    public final void b(byte[] bArr, Uri uri) {
        dkty.c("Thumbnail download completed for session ID %d, file ID %s. Received %d bytes.", Long.valueOf(this.c), this.h, Integer.valueOf(bArr.length));
        dksy.g(this.f);
        ditb ditbVar = new ditb();
        ditbVar.j(this.e.mSender);
        ditbVar.i(this.h);
        ditbVar.f(this.e.mFileInfo.mSize);
        ditbVar.c(this.e.mFileInfo.mContentType);
        ditbVar.h(this.e.mFileInfo.mUrl);
        ditbVar.g(this.c);
        ditbVar.b(this.d);
        ditbVar.l(bArr);
        String str = this.e.mFileInfo.mFileName;
        if (str != null) {
            ditbVar.e(str);
        }
        FileInfo fileInfo = this.e.mThumbnailInfo;
        if (fileInfo != null) {
            ditbVar.k(fileInfo.mContentType);
        }
        try {
            dkuk.c(this.a, RcsIntents.ACTION_INCOMING_FILE_TRANSFER_PREVIEW_UPDATE, this.g.a(ditbVar.a()), dkuj.THUMBNAIL_DOWNLOAD_LISTENER);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof TransactionTooLargeException)) {
                throw e;
            }
            dkty.i(e, "Failed to notify file transfer preview update: thumbnail is too big.", new Object[0]);
        }
    }

    @Override // defpackage.diqx, defpackage.diuc
    public final void c(diqh diqhVar) {
        super.c(diqhVar);
        dksy.c(this.f);
        dksy.d("Bugle.RcsEngine.FileTransfer.ThumbnailDownload.Failed");
    }
}
