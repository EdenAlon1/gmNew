package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mos implements mpl {
    public final mph a;
    public mpa b;
    public boolean c;
    final /* synthetic */ mow d;

    public mos(mow mowVar, mph mphVar) {
        this.d = mowVar;
        this.a = mphVar;
    }

    @Override // defpackage.mpl
    public final void a() {
        Handler handler = this.d.j;
        lti.f(handler);
        lvf.am(handler, new Runnable() { // from class: mor
            @Override // java.lang.Runnable
            public final void run() {
                mos mosVar = mos.this;
                if (mosVar.c) {
                    return;
                }
                mpa mpaVar = mosVar.b;
                if (mpaVar != null) {
                    mpaVar.j(mosVar.a);
                }
                mosVar.d.d.remove(mosVar);
                mosVar.c = true;
            }
        });
    }
}
