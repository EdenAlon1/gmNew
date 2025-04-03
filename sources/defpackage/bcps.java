package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bcps extends bcpr {
    private boolean a = false;

    @Override // defpackage.bcpr
    public final void ga(String str) {
        if (this.a) {
            throw new IllegalStateException();
        }
        super.ga(str);
        this.a = true;
    }

    @Override // defpackage.bcpr
    public final boolean i() {
        return super.i();
    }
}
