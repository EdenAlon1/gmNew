package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknf extends dknv {
    private dknw a;

    @Override // defpackage.dknv
    public final FileTransferResult a() {
        if (this.a != null) {
            return new dkng(this.a);
        }
        throw new IllegalStateException("Missing required properties: resultCode");
    }

    @Override // defpackage.dknv
    public final void b(dknw dknwVar) {
        if (dknwVar == null) {
            throw new NullPointerException("Null resultCode");
        }
        this.a = dknwVar;
    }
}
