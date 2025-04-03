package defpackage;

import androidx.work.Worker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqx extends ffkk implements ffix {
    final /* synthetic */ Worker a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqx(Worker worker) {
        super(0);
        this.a = worker;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return this.a.c();
    }
}
