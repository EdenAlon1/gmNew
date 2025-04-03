package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbac implements fbas {
    private volatile Object a;
    private final Object b = new Object();
    private final akmg c;

    public fbac(akmg akmgVar) {
        this.c = akmgVar;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = this.c.a();
                }
            }
        }
        return this.a;
    }
}
