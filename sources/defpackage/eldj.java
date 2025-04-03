package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldj implements erqj {
    final /* synthetic */ elat a;
    final /* synthetic */ erqj b;

    public eldj(elat elatVar, erqj erqjVar) {
        this.a = elatVar;
        this.b = erqjVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        elat h = ekyf.h(ekyf.b(), this.a);
        try {
            this.b.b(obj);
        } finally {
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        th.getClass();
        elat h = ekyf.h(ekyf.b(), this.a);
        try {
            this.b.hx(th);
        } finally {
        }
    }
}
