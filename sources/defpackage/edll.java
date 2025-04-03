package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edll extends edpl {
    public edpu a;
    public edpu b;
    public edpu c;
    public edpu d;
    public edpu e;
    public edpu f;
    public edpu g;

    @Override // defpackage.edpl
    public final void a(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null freeGarageParking");
        }
        this.f = edpuVar;
    }

    @Override // defpackage.edpl
    public final void b(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null freeParkingLot");
        }
        this.a = edpuVar;
    }

    @Override // defpackage.edpl
    public final void c(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null freeStreetParking");
        }
        this.c = edpuVar;
    }

    @Override // defpackage.edpl
    public final void d(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null paidGarageParking");
        }
        this.g = edpuVar;
    }

    @Override // defpackage.edpl
    public final void e(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null paidParkingLot");
        }
        this.b = edpuVar;
    }

    @Override // defpackage.edpl
    public final void f(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null paidStreetParking");
        }
        this.d = edpuVar;
    }

    @Override // defpackage.edpl
    public final void g(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null valetParking");
        }
        this.e = edpuVar;
    }
}
