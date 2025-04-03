package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyif extends eydx {
    final eyih a;
    eydz b = b();
    final /* synthetic */ eyij c;

    public eyif(eyij eyijVar) {
        this.c = eyijVar;
        this.a = new eyih(eyijVar);
    }

    private final eydz b() {
        eyih eyihVar = this.a;
        if (eyihVar.hasNext()) {
            return eyihVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.eydz
    public final byte a() {
        eydz eydzVar = this.b;
        if (eydzVar == null) {
            throw new NoSuchElementException();
        }
        byte a = eydzVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
