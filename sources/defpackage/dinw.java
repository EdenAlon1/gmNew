package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dinw extends diny {
    final /* synthetic */ dioc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dinw(dioc diocVar) {
        super(diocVar);
        this.a = diocVar;
    }

    @Override // defpackage.diny
    protected final int a() {
        dkty.o("Attempt to execute discovery for untried entries", new Object[0]);
        return this.a.c.b();
    }

    @Override // defpackage.diny
    protected final Cursor b() {
        return this.a.c.d();
    }
}
