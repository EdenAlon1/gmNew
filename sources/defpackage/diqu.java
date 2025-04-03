package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqu extends diqx {
    private final ditk c;
    private final HttpFileTransferPushMessage d;
    private final long e;

    public diqu(diqp diqpVar, Context context, ditk ditkVar, HttpFileTransferPushMessage httpFileTransferPushMessage, long j) {
        super(context, diqpVar);
        this.c = ditkVar;
        this.d = httpFileTransferPushMessage;
        this.e = j;
    }

    @Override // defpackage.diqx
    protected final String a() {
        return Long.toString(this.e);
    }

    @Override // defpackage.diuc
    public final void b(byte[] bArr, Uri uri) {
        String l = Long.toString(this.e);
        dkty.c("HTTP file transfer download successful for pending transfer key %s", l);
        ditb ditbVar = new ditb();
        ditbVar.i(this.d.mFileId);
        ditbVar.g(this.e);
        ditbVar.j(this.d.mSender);
        ditbVar.f(this.d.mFileInfo.mSize);
        ditbVar.c(this.d.mFileInfo.mContentType);
        ditbVar.h(this.d.mFileInfo.mUrl);
        ditbVar.d(uri);
        String str = this.d.mFileInfo.mFileName;
        if (str != null) {
            ditbVar.e(str);
        }
        dkuk.c(this.a, RcsIntents.ACTION_INCOMING_FILE_TRANSFER_COMPLETED, this.c.a(ditbVar.a()), dkuj.FILE_DOWNLOAD_LISTENER);
        this.b.o(l);
    }
}
