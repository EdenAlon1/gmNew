package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgv implements dvgl {
    private static final entd a = entd.c("GnpSdk");
    private final dvdy b;

    public dvgv(dvdy dvdyVar) {
        this.b = dvdyVar;
    }

    @Override // defpackage.dvgl
    public final dvgk a() {
        return dvgk.DASHER_FILTER;
    }

    @Override // defpackage.emva
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        ewag ewagVar = (ewag) obj;
        dvgn dvgnVar = (dvgn) obj2;
        if (ewagVar == null) {
            this.b.c(dvgnVar.a(), "TriggeringConditions is null in DasherFilteringPredicate", new Object[0]);
            return false;
        }
        ewae b = ewae.b(ewagVar.i);
        if (b == null) {
            b = ewae.DASHER_DEVICE_FILTER_UNKNOWN;
        }
        if (b != ewae.BLOCK_WHEN_DASHER_ON_DEVICE) {
            return true;
        }
        if (fdnf.a.get().b()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/predicates/impl/DasherFilteringPredicate", "apply", 44, "DasherFilteringPredicate.java")).q("Promotion is shown because there is a Google account on device");
            return true;
        }
        if (!fdnf.a.get().a()) {
            return true;
        }
        this.b.c(dvgnVar.a(), "Promotion blocked: Dasher account on device", new Object[0]);
        return false;
    }
}
