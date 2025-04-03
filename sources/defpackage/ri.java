package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ri extends tq {
    final /* synthetic */ rp a;
    final /* synthetic */ rt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(rt rtVar, View view, rp rpVar) {
        super(view);
        this.b = rtVar;
        this.a = rpVar;
    }

    @Override // defpackage.tq
    public final ou a() {
        return this.a;
    }

    @Override // defpackage.tq
    public final boolean b() {
        if (this.b.b.x()) {
            return true;
        }
        this.b.b();
        return true;
    }
}
