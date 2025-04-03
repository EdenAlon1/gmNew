package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axzw implements Runnable {
    final /* synthetic */ axzx a;
    final /* synthetic */ eyja b;

    public axzw(axzx axzxVar, eyja eyjaVar) {
        this.a = axzxVar;
        this.b = eyjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final axzv axzvVar = new axzv(this.b);
        this.a.c.m(new emwl() { // from class: axzt
            @Override // defpackage.emwl
            public final /* synthetic */ Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }
        });
        if (((Boolean) this.a.f.b()).booleanValue()) {
            ((cevh) ((aybb) this.a.e.b()).a.b()).a(ceyr.g("schedule_delete_and_import_contacts", eyex.a));
        } else {
            this.a.b.a();
        }
    }
}
