package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhix implements dhge {
    private final Status a;
    private final dhjh b;

    public dhix(Status status, dhjh dhjhVar) {
        this.a = status;
        this.b = dhjhVar;
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.dfri
    public final void b() {
        dhjh dhjhVar = this.b;
        if (dhjhVar != null) {
            dhjhVar.b();
        }
    }

    @Override // defpackage.dhge
    public final dhjh c() {
        return this.b;
    }
}
