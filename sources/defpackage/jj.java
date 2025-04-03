package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jj implements Runnable {
    final /* synthetic */ jz a;

    public jj(jz jzVar) {
        this.a = jzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz jzVar = this.a;
        jzVar.t.showAtLocation(jzVar.s, 55, 0, 0);
        this.a.E();
        if (!this.a.N()) {
            this.a.s.setAlpha(1.0f);
            this.a.s.setVisibility(0);
            return;
        }
        this.a.s.setAlpha(0.0f);
        jz jzVar2 = this.a;
        kwd e = kvo.e(jzVar2.s);
        e.b(1.0f);
        jzVar2.v = e;
        this.a.v.d(new ji(this));
    }
}
