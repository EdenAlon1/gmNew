package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class un implements Runnable {
    final /* synthetic */ uo a;

    public un(uo uoVar) {
        this.a = uoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ti tiVar = this.a.e;
        if (tiVar == null || !tiVar.isAttachedToWindow() || this.a.e.getCount() <= this.a.e.getChildCount()) {
            return;
        }
        int childCount = this.a.e.getChildCount();
        uo uoVar = this.a;
        if (childCount <= uoVar.k) {
            uoVar.r.setInputMethodMode(2);
            this.a.v();
        }
    }
}
