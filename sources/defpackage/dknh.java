package defpackage;

import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknh extends dkob {
    private String a;

    @Override // defpackage.dkob
    public final PauseDownloadRequest a() {
        String str = this.a;
        if (str != null) {
            return new dkni(str);
        }
        throw new IllegalStateException("Missing required properties: downloadId");
    }

    @Override // defpackage.dkob
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null downloadId");
        }
        this.a = str;
    }
}
