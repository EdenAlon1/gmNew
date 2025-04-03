package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djiy implements djix {
    private final dked b;
    private djtr c;

    public djiy(Context context, dked dkedVar) {
        this.b = dkedVar;
        dkuy.i(context);
        dkuy.i(context);
    }

    @Override // defpackage.djix
    public final int a() {
        djtr djtrVar = this.c;
        if (djtrVar != null) {
            return djtrVar.c();
        }
        return 0;
    }

    @Override // defpackage.djix
    @Deprecated
    public final String b() {
        return (String) this.b.c().orElse(null);
    }

    @Override // defpackage.djix
    public final String c() {
        djtr djtrVar = this.c;
        if (djtrVar != null) {
            return djtrVar.n();
        }
        return null;
    }

    @Override // defpackage.djix
    public final String d() {
        djtr djtrVar = this.c;
        if (djtrVar != null) {
            return djtrVar.q();
        }
        return null;
    }

    @Override // defpackage.djix
    public final void e(djtr djtrVar) {
        this.c = djtrVar;
    }

    @Override // defpackage.djix
    public final boolean f() {
        djtr djtrVar = this.c;
        return djtrVar != null && djtrVar.C();
    }
}
