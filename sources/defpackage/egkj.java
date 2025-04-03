package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egkj extends egkp {
    public int a;
    private emxc b;
    private emxc c;

    public egkj() {
        emux emuxVar = emux.a;
        this.b = emuxVar;
        this.c = emuxVar;
    }

    @Override // defpackage.egkp
    public final egkq a() {
        int i = this.a;
        if (i != 0) {
            return new egkk(this.b, i, this.c);
        }
        throw new IllegalStateException("Missing required properties: state");
    }

    @Override // defpackage.egkp
    public final void b(exfw exfwVar) {
        this.c = emxc.j(exfwVar);
    }

    @Override // defpackage.egkp
    public final void c(Uri uri) {
        this.b = emxc.j(uri);
    }
}
