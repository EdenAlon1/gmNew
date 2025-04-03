package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejvq implements erqj {
    final /* synthetic */ Object a;
    final /* synthetic */ ejvu b;
    final /* synthetic */ emxc c;
    final /* synthetic */ ejvr d;

    public ejvq(ejvr ejvrVar, Object obj, ejvu ejvuVar, emxc emxcVar) {
        this.a = obj;
        this.b = ejvuVar;
        this.c = emxcVar;
        this.d = ejvrVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        enip i;
        Object obj2 = this.a;
        obj2.getClass();
        ejvr ejvrVar = this.d;
        synchronized (ejvrVar.a) {
            enib enibVar = new enib();
            if (obj2 instanceof ejvi) {
                enie enieVar = (enie) ejvrVar.b.get(obj2);
                if (enieVar != null) {
                    enibVar.b(enieVar);
                }
            } else if (obj2 instanceof ejuj) {
                enqu listIterator = ((ejuj) obj2).b().listIterator();
                while (listIterator.hasNext()) {
                    enie enieVar2 = (enie) ejvrVar.b.get(listIterator.next());
                    if (enieVar2 != null) {
                        enibVar.b(enieVar2);
                    }
                }
            } else {
                enie enieVar3 = (enie) ejvrVar.b.get(obj2);
                if (enieVar3 != null) {
                    enibVar.b(enieVar3);
                }
            }
            i = enibVar.a().i();
        }
        enqu listIterator2 = ((enje) i).listIterator();
        while (listIterator2.hasNext()) {
            emxc emxcVar = this.c;
            ejvv ejvvVar = (ejvv) listIterator2.next();
            if (emxcVar.f() != ejvvVar) {
                ejvvVar.a(this.b);
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}
