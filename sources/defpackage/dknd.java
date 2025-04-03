package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknd extends dkns {
    private String a;

    @Override // defpackage.dkns
    public final FileDownloadResult a() {
        String str = this.a;
        if (str != null) {
            return new dkne(str);
        }
        throw new IllegalStateException("Missing required properties: fileDownloadId");
    }

    @Override // defpackage.dkns
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null fileDownloadId");
        }
        this.a = str;
    }
}
