package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgfw implements erqj {
    final /* synthetic */ ffrp a;

    public fgfw(ffrp ffrpVar) {
        this.a = ffrpVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        Object a;
        try {
            a = Boolean.valueOf(((ffuq) this.a).S(obj));
        } catch (Throwable th) {
            a = ffci.a(th);
        }
        Throwable c = ffch.c(a);
        if (c != null) {
            ffsf.b(ffhe.a, c);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Object a;
        try {
            a = Boolean.valueOf(this.a.a(th));
        } catch (Throwable th2) {
            a = ffci.a(th2);
        }
        Throwable c = ffch.c(a);
        if (c != null) {
            ffsf.b(ffhe.a, c);
        }
    }
}
