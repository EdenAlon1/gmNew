package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elel implements elei {
    @Override // defpackage.elei
    public final elej a(elem elemVar) {
        elej<?> elejVar;
        synchronized (elemVar) {
            elejVar = elemVar.currentMetadata;
        }
        return elejVar;
    }

    @Override // defpackage.elei
    public final boolean b(elem elemVar, elej elejVar, elej elejVar2) {
        synchronized (elemVar) {
            if (elemVar.currentMetadata != elejVar) {
                return false;
            }
            elemVar.currentMetadata = elejVar2;
            return true;
        }
    }
}
