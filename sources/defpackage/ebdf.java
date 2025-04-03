package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ebdf {
    private final llg a;
    final llg b;
    final llg c;
    final llg d;
    public final llg e;
    final int f;
    public ebny g;
    public emxc h;
    private View.OnClickListener i;

    ebdf() {
        this(105607);
    }

    public void b(lkr lkrVar, llh llhVar) {
        this.a.f(lkrVar, llhVar);
    }

    public void c(lkr lkrVar) {
        this.a.l(lkrVar);
    }

    public final void g() {
        ebon ebonVar = new ebon(this.i);
        ebonVar.d = new Runnable() { // from class: ebdb
            @Override // java.lang.Runnable
            public final void run() {
                ebdf.this.g.b().run();
            }
        };
        ebonVar.e = new Runnable() { // from class: ebdc
            @Override // java.lang.Runnable
            public final void run() {
                ebdf.this.g.a().run();
            }
        };
        ebonVar.b = this.h;
        eboe.a(this.b, emxc.j(new ebol(ebonVar)));
    }

    public final void m(View.OnClickListener onClickListener) {
        this.i = onClickListener;
        g();
    }

    public final void n(boolean z) {
        eboe.a(this.a, Boolean.valueOf(z));
    }

    public ebdf(int i) {
        this.a = new llg(true);
        this.b = new llg(emux.a);
        this.c = new llg(emux.a);
        this.d = new llg(false);
        this.e = new llg(emux.a);
        this.i = new View.OnClickListener() { // from class: ebdd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
        this.g = new ebde();
        this.h = emux.a;
        this.f = i;
    }

    protected void d() {
    }

    protected void a(lkr lkrVar) {
    }
}
