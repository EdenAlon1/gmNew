package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxs extends ejxm {
    final /* synthetic */ ejxk a;
    final /* synthetic */ ejxw b;

    public ejxs(ejxw ejxwVar, ejxk ejxkVar) {
        this.a = ejxkVar;
        this.b = ejxwVar;
    }

    @Override // defpackage.ejxm
    public final void a(ejxi ejxiVar) {
        efbd.c();
        ejxw ejxwVar = this.b;
        if (ejxwVar.b == null) {
            throw new ejxv();
        }
        if (!ejxwVar.a.P().a().equals(lkj.STARTED) && !this.b.a.P().a().equals(lkj.RESUMED)) {
            throw new ejxu();
        }
        ejxw ejxwVar2 = this.b;
        ejxk ejxkVar = this.a;
        final ejyr ejyrVar = ejxwVar2.b;
        efbd.c();
        final ejyu ejyuVar = (ejyu) ejyrVar.b.get(ejxkVar);
        emxf.m(ejyuVar != null, "This callback object reference wasn't registered. Callback instances must be registered before LifecycleOwner reaches CREATED.");
        efbd.c();
        ejys ejysVar = ejyuVar.a;
        ejysVar.getClass();
        ejyuVar.a = new ejxf(emxc.j(ejxiVar), ejysVar.a(), ejysVar.c(), ejysVar.d());
        efbd.c();
        ejyrVar.d.execute(eldl.l(new Runnable() { // from class: ejyn
            @Override // java.lang.Runnable
            public final void run() {
                ejyr.this.d(ejyuVar);
            }
        }));
    }
}
