package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alar implements akzx {
    private static final entd a = entd.c("BugleClearcutLogger");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public alar(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    @Override // defpackage.akzx
    public final eoli a() {
        if (!((ctvs) this.d.b()).e()) {
            return ((akyt) this.b.b()).b();
        }
        akyt akytVar = (akyt) this.b.b();
        akytVar.c(((ctwb) this.c.b()).f());
        return akytVar.b();
    }

    @Override // defpackage.akzx
    public final eoli b(String str) {
        akyt akytVar = (akyt) this.b.b();
        if (dktk.c(str)) {
            String str2 = (String) emye.b('@').i(str).get(1);
            eole eoleVar = akytVar.b;
            eoleVar.copyOnWrite();
            eoli eoliVar = (eoli) eoleVar.instance;
            eoli eoliVar2 = eoli.a;
            str.getClass();
            eoliVar.b |= 8;
            eoliVar.f = str;
            eole eoleVar2 = akytVar.b;
            eoleVar2.copyOnWrite();
            eoli eoliVar3 = (eoli) eoleVar2.instance;
            str2.getClass();
            eoliVar3.b |= 16;
            eoliVar3.g = str2;
        } else {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/analytics/common/PhoneDimensionsProvider", "getCustomDimensionsForRbm", 50, "PhoneDimensionsProvider.java")).q("Can't set custom RBM info in UMA counter: RBM bot id is not an email");
        }
        return akytVar.b();
    }
}
