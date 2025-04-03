package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgq implements erqj {
    final /* synthetic */ dzja a;
    final /* synthetic */ dzqs b;
    final /* synthetic */ dzgr c;

    public dzgq(dzgr dzgrVar, dzja dzjaVar, dzqs dzqsVar) {
        this.a = dzjaVar;
        this.b = dzqsVar;
        this.c = dzgrVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dzgt dzgtVar = (dzgt) obj;
        this.c.b(this.a, dzgtVar.a(), this.b);
        final dzhb a = dzgtVar.a();
        String str = ((dzgz) a).d;
        dzgr dzgrVar = this.c;
        erqt.r(erny.f(dzgrVar.b.submit(new dyjh(dzgrVar.a, str)), new emwl() { // from class: dzgn
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                Bitmap bitmap = (Bitmap) obj2;
                dzgy dzgyVar = new dzgy(dzhb.this);
                if (bitmap != null) {
                    dzgyVar.f(bitmap);
                }
                return dzgyVar.a();
            }
        }, erpp.a), new dzgp(this, this.a, this.b), erpp.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}
