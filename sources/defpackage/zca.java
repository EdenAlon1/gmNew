package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zca implements ampp {
    final /* synthetic */ zch a;
    final /* synthetic */ zcb b;

    public zca(zch zchVar, zcb zcbVar) {
        this.a = zchVar;
        this.b = zcbVar;
    }

    @Override // defpackage.ampp
    public final Instant a() {
        Instant f = this.b.d.f();
        f.getClass();
        return f;
    }

    @Override // defpackage.ampp
    public final Integer b() {
        zch zchVar = this.a;
        if (zchVar != null) {
            return Integer.valueOf(zchVar.a);
        }
        return null;
    }
}
