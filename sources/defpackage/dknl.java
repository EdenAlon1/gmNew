package defpackage;

import android.app.PendingIntent;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknl extends dkof {
    private PendingIntent a;
    private String b;
    private FileInformation c;

    @Override // defpackage.dkof
    public final ResumeDownloadRequest a() {
        String str;
        FileInformation fileInformation;
        PendingIntent pendingIntent = this.a;
        if (pendingIntent != null && (str = this.b) != null && (fileInformation = this.c) != null) {
            return new dknm(pendingIntent, str, fileInformation);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" downloadId");
        }
        if (this.c == null) {
            sb.append(" fileInformation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dkof
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null downloadId");
        }
        this.b = str;
    }

    @Override // defpackage.dkof
    public final void c(FileInformation fileInformation) {
        if (fileInformation == null) {
            throw new NullPointerException("Null fileInformation");
        }
        this.c = fileInformation;
    }

    @Override // defpackage.dkof
    public final void d(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = pendingIntent;
    }
}
