package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknn extends dkoh {
    private FileTransferResult a;

    @Override // defpackage.dkoh
    public final ResumeDownloadResult a() {
        FileTransferResult fileTransferResult = this.a;
        if (fileTransferResult != null) {
            return new dkno(fileTransferResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // defpackage.dkoh
    public final void b(FileTransferResult fileTransferResult) {
        if (fileTransferResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = fileTransferResult;
    }
}
