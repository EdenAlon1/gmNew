package defpackage;

import androidx.car.app.AppManager;
import androidx.car.app.model.TemplateWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cfl implements lkr {
    public final lkv a = new lkv(this);
    public TemplateWrapper b;
    public boolean c;
    private final cex d;

    protected cfl(cex cexVar) {
        this.d = cexVar;
    }

    @Override // defpackage.lkr
    public final lkk P() {
        return this.a;
    }

    public abstract cjg a();

    public final void b(final lki lkiVar) {
        cls.b(new Runnable() { // from class: cfk
            @Override // java.lang.Runnable
            public final void run() {
                cfl cflVar = cfl.this;
                if (cflVar.a.c.a(lkj.INITIALIZED)) {
                    cflVar.a.e(lkiVar);
                }
            }
        });
    }

    public final void c() {
        if (this.a.c.a(lkj.STARTED)) {
            ((AppManager) this.d.a(AppManager.class)).a();
        }
    }
}
