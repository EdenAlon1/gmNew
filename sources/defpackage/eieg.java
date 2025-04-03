package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_FileTransferInformation;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eieg extends eifp {
    private FileInformation a;
    private Optional b;
    private Optional c;
    private Optional d;

    public eieg() {
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
    }

    @Override // defpackage.eifp
    public final FileTransferInformation a() {
        FileInformation fileInformation = this.a;
        if (fileInformation != null) {
            return new AutoValue_FileTransferInformation(fileInformation, this.b, this.c, this.d);
        }
        throw new IllegalStateException("Missing required properties: fileInformation");
    }

    @Override // defpackage.eifp
    public final void b(eyee eyeeVar) {
        this.c = Optional.of(eyeeVar);
    }

    @Override // defpackage.eifp
    public final void c(FileInformation fileInformation) {
        if (fileInformation == null) {
            throw new NullPointerException("Null fileInformation");
        }
        this.a = fileInformation;
    }

    @Override // defpackage.eifp
    public final void d(eyee eyeeVar) {
        this.d = Optional.of(eyeeVar);
    }

    @Override // defpackage.eifp
    public final void e(FileInformation fileInformation) {
        this.b = Optional.of(fileInformation);
    }

    public eieg(FileTransferInformation fileTransferInformation) {
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
        AutoValue_FileTransferInformation autoValue_FileTransferInformation = (AutoValue_FileTransferInformation) fileTransferInformation;
        this.a = autoValue_FileTransferInformation.a;
        this.b = autoValue_FileTransferInformation.b;
        this.c = autoValue_FileTransferInformation.c;
        this.d = autoValue_FileTransferInformation.d;
    }
}
