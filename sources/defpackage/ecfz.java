package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecfz extends ThreadLocal {
    final /* synthetic */ ecga a;

    public ecfz(ecga ecgaVar) {
        this.a = ecgaVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        ecgb ecgbVar = new ecgb();
        Thread currentThread = Thread.currentThread();
        synchronized (this.a.b) {
            this.a.b.put(currentThread, ecgbVar);
        }
        return ecgbVar;
    }
}
