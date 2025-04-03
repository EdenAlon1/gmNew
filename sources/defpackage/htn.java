package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class htn implements htm {
    private final hpm a = new hpm();

    @Override // defpackage.htm
    public /* synthetic */ hto g(hto htoVar, hto htoVar2, hto htoVar3) {
        return null;
    }

    public final void j(int i) {
        int i2;
        do {
            i2 = this.a.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!this.a.compareAndSet(i2, i2 | i));
    }

    public final boolean k(int i) {
        return (i & this.a.get()) != 0;
    }
}
