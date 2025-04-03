package defpackage;

import android.app.PendingIntent;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknb extends dknq {
    private PendingIntent a;
    private FileInformation b;

    @Override // defpackage.dknq
    public final FileDownloadRequest a() {
        FileInformation fileInformation;
        PendingIntent pendingIntent = this.a;
        if (pendingIntent != null && (fileInformation = this.b) != null) {
            return new dknc(pendingIntent, fileInformation);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" fileInformation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dknq
    public final void b(FileInformation fileInformation) {
        if (fileInformation == null) {
            throw new NullPointerException("Null fileInformation");
        }
        this.b = fileInformation;
    }

    @Override // defpackage.dknq
    public final void c(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = pendingIntent;
    }
}
