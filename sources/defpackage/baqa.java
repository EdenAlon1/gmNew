package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class baqa implements ffix {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ bara b;
    final /* synthetic */ fflb c;
    final /* synthetic */ int d;

    public baqa(AtomicBoolean atomicBoolean, bara baraVar, fflb fflbVar, int i) {
        this.a = atomicBoolean;
        this.b = baraVar;
        this.c = fflbVar;
        this.d = i;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.set(true);
        return ((cpye) this.b.F.b()).c((aoku) this.c.a, this.d, true ^ ((asgl) this.b.P.b()).a());
    }
}
