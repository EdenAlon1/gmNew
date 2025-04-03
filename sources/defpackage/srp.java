package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srp {
    public static final enru a = enru.c("com/google/android/apps/messaging/banner/BannersUiAdapterImpl");
    public final ffxx b;
    public String c;
    public final fgdj d;
    public final src e;
    public final ssm f;
    public final ssm g;
    private final ffbr h;
    private final fgdj i;

    public srp(src srcVar, ssm ssmVar, ssm ssmVar2, ffbr ffbrVar, ffsk ffskVar, Map map, ffxx ffxxVar, ffxx ffxxVar2) {
        this.e = srcVar;
        this.f = ssmVar;
        this.g = ssmVar2;
        this.h = ffbrVar;
        this.b = ffxxVar2;
        this.i = (((Boolean) ((cfup) ctjd.bD.get()).e()).booleanValue() && ((Optional) ffbrVar.b()).isPresent()) ? ((yzu) ((Optional) ffbrVar.b()).get()).a() : fgdm.a(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((sry) entry.getKey()).b()) {
                ((enrr) a.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "isEnabled", 89, "BannersUiAdapterImpl.kt")).D("Filtering out banner %s with %s because of being disabled", entry.getKey(), entry.getValue());
            }
            if (((sry) entry.getKey()).b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List<ffcf> ah = ffdx.ah(ffew.p(linkedHashMap), new sro());
        ArrayList arrayList = new ArrayList(ffdx.n(ah, 10));
        for (ffcf ffcfVar : ah) {
            arrayList.add(new srj(((sry) ffcfVar.a).a(), ffcfVar));
        }
        fgch fgchVar = new fgch(new fgch(new fgch(new srm((ffxx[]) ffdx.ak(arrayList).toArray(new ffxx[0]), this), ffxxVar, new sre(this)), this.i, new srf(this)), this.g.a, new srg(this));
        srn srnVar = new srn(null, this);
        int i = fgau.a;
        fgen fgenVar = new fgen(srnVar, fgchVar);
        int i2 = fgcz.a;
        this.d = fgbn.b(fgenVar, ffskVar, fgcy.a(0L, 3), null);
    }

    public static final ssb b(ffcf ffcfVar) {
        return (ssb) ffcfVar.b;
    }

    public final srz a(ffcf ffcfVar) {
        return (srz) ffcfVar.a;
    }
}
