package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbwp extends cbxd {
    public Uri a;
    private etdt b;
    private byzi c;

    @Override // defpackage.cbxd
    public final cbxe a() {
        byzi byziVar;
        etdt etdtVar = this.b;
        if (etdtVar != null && (byziVar = this.c) != null) {
            return new cbwq(etdtVar, byziVar, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" brandInfo");
        }
        if (this.c == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cbxd
    public final void b(etdt etdtVar) {
        if (etdtVar == null) {
            throw new NullPointerException("Null brandInfo");
        }
        this.b = etdtVar;
    }

    @Override // defpackage.cbxd
    public final void c(byzi byziVar) {
        if (byziVar == null) {
            throw new NullPointerException("Null status");
        }
        this.c = byziVar;
    }
}
