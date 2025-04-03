package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgw implements dvgl {
    private final dvdy a;

    public dvgw(dvdy dvdyVar) {
        this.a = dvdyVar;
    }

    @Override // defpackage.dvgl
    public final dvgk a() {
        return dvgk.DISPLAY_WITHOUT_NEW_SYNC;
    }

    @Override // defpackage.emva
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        ewag ewagVar = (ewag) obj;
        dvgn dvgnVar = (dvgn) obj2;
        if (!dvgnVar.c()) {
            return true;
        }
        boolean z = (ewagVar.b & 16) != 0 ? ewagVar.g : false;
        if (z) {
            return z;
        }
        this.a.c(dvgnVar.a(), "Promotion needs sync to display.", new Object[0]);
        return false;
    }
}
