package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qao extends ffkk implements ffix {
    final /* synthetic */ ffji a;
    final /* synthetic */ WorkDatabase b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qao(ffji ffjiVar, WorkDatabase workDatabase) {
        super(0);
        this.a = ffjiVar;
        this.b = workDatabase;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        return this.a.invoke(this.b);
    }
}
