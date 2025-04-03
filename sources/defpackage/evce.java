package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evce extends evcz {
    private enhk a;
    private final evcd b;

    public evce(evcd evcdVar) {
        this.b = evcdVar;
        enhd enhdVar = new enhd();
        enqu listIterator = ((evbz) evcdVar).b.listIterator();
        while (listIterator.hasNext()) {
            emxc emxcVar = (emxc) listIterator.next();
            if (emxcVar.g()) {
                evcb evcbVar = (evcb) emxcVar.c();
                enqu listIterator2 = evcbVar.a.listIterator();
                while (listIterator2.hasNext()) {
                    enhdVar.k((String) listIterator2.next(), evcbVar);
                }
            }
            this.a = enhdVar.c();
        }
    }

    @Override // defpackage.evcz
    public final evew a() {
        if (((evbz) this.b).b.isEmpty()) {
            return new evbt(((evbz) this.b).a, enoz.a);
        }
        evcd evcdVar = this.b;
        return new evbt(((evbz) evcdVar).a, this.a);
    }
}
