package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeca extends vm {
    final /* synthetic */ aedh a;

    public aeca(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.vm
    public final void d(int i, int i2) {
        aedh aedhVar = this.a;
        if (aedhVar.aS) {
            aedhVar.aS = aedhVar.w.a() == 0;
            aedh aedhVar2 = this.a;
            aedhVar2.B(aedhVar2.aS);
        }
    }

    @Override // defpackage.vm
    public final void e(int i, int i2) {
        ekzz f = eleg.f("ConcatAdapterObserver#onItemRangeRemoved");
        try {
            aedh aedhVar = this.a;
            if (!aedhVar.aS && aedhVar.w.a() == 0 && this.a.j().v()) {
                aedh aedhVar2 = this.a;
                aedhVar2.aS = true;
                aedhVar2.B(true);
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
