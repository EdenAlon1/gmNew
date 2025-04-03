package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class diqx implements diuc {
    protected final Context a;
    protected final diqp b;

    public diqx(Context context, diqp diqpVar) {
        this.a = context;
        this.b = diqpVar;
    }

    protected abstract String a();

    @Override // defpackage.diuc
    public void c(diqh diqhVar) {
        String a = a();
        dkty.c("HTTP file transfer failed for pendingTransferKey %s, fileTransferError %s", a, diqhVar);
        ((diqo) this.b).f.remove(a);
        if (diqh.f.equals(diqhVar)) {
            ((diqo) this.b).i.a.onReconfigurationRequested();
        }
    }
}
