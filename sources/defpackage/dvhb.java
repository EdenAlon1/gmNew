package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvhb implements dvgl {
    private final dvdy a;

    public dvhb(dvdy dvdyVar) {
        this.a = dvdyVar;
    }

    @Override // defpackage.dvgl
    public final dvgk a() {
        return dvgk.MINOR_FILTER;
    }

    @Override // defpackage.emva
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        dvgn dvgnVar = (dvgn) obj2;
        if (!fdnf.a.get().c()) {
            return true;
        }
        this.a.c(dvgnVar.a(), "Promotion blocked: Minor account on device", new Object[0]);
        return false;
    }
}
