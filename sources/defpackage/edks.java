package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edks extends edmg {
    public edpu a;
    public edpu b;
    public edpu c;
    public edpu d;

    @Override // defpackage.edmg
    public final void a(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.b = edpuVar;
    }

    @Override // defpackage.edmg
    public final void b(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleParking");
        }
        this.a = edpuVar;
    }

    @Override // defpackage.edmg
    public final void c(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleRestroom");
        }
        this.c = edpuVar;
    }

    @Override // defpackage.edmg
    public final void d(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleSeating");
        }
        this.d = edpuVar;
    }
}
