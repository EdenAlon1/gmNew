package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dywa extends dzwu {
    public final Executor a = new ersb(dyhp.b().a);
    protected final dywd b;
    protected final dyvz c;
    protected final dyti d;

    public dywa(Context context, emwl emwlVar, dyti dytiVar, Uri uri, dywd dywdVar) {
        this.b = dywdVar;
        this.d = dytiVar;
        this.c = new dyvz(this, context, emwlVar, uri);
    }

    @Override // defpackage.dzwu
    protected final synchronized void a() {
        final dyvz dyvzVar = this.c;
        dyvzVar.getClass();
        i(new Runnable() { // from class: dyvu
            @Override // java.lang.Runnable
            public final void run() {
                dyvz.this.o();
            }
        });
    }

    @Override // defpackage.dzwu
    protected final synchronized void b() {
        final dyvz dyvzVar = this.c;
        dyvzVar.getClass();
        i(new Runnable() { // from class: dyvw
            @Override // java.lang.Runnable
            public final void run() {
                dyvz.this.p();
            }
        });
    }

    @Override // defpackage.dzwu
    protected final void c(Object obj) {
        super.c(obj);
    }
}
