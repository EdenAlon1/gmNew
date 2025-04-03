package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknj extends dkod {
    private FileTransferResult a;

    @Override // defpackage.dkod
    public final PauseDownloadResult a() {
        FileTransferResult fileTransferResult = this.a;
        if (fileTransferResult != null) {
            return new dknk(fileTransferResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // defpackage.dkod
    public final void b(FileTransferResult fileTransferResult) {
        if (fileTransferResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = fileTransferResult;
    }
}
