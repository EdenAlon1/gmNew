package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dioa extends diny {
    final /* synthetic */ dioc a;
    private long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dioa(dioc diocVar) {
        super(diocVar);
        this.a = diocVar;
    }

    @Override // defpackage.diny
    protected final int a() {
        dkty.o("Attempt to poll status for unknowns, IMS and non IMS contacts last tried over %ds ago.", Long.valueOf(this.c / 1000));
        return this.a.c.a(this.c);
    }

    @Override // defpackage.diny
    protected final Cursor b() {
        return this.a.c.c(this.c);
    }

    @Override // defpackage.diny
    protected final void c() {
        super.c();
        dioc diocVar = this.b;
        this.c = !diocVar.i() ? 86400000L : diocVar.f.a;
    }
}
