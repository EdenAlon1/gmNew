package defpackage;

import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyb implements ccum {
    public static final entd a = entd.c("BugleCms");
    public final axkm b;
    public final csci c;
    public final cdnd d;
    private final ffsk e;
    private final ffhd f;
    private final ffsk g;
    private final ffbr h;

    public ccyb(ffsk ffskVar, ffhd ffhdVar, ffsk ffskVar2, ffbr ffbrVar, axkm axkmVar, csci csciVar, cdnd cdndVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        axkmVar.getClass();
        cdndVar.getClass();
        this.e = ffskVar;
        this.f = ffhdVar;
        this.g = ffskVar2;
        this.h = ffbrVar;
        this.b = axkmVar;
        this.c = csciVar;
        this.d = cdndVar;
    }

    @Override // defpackage.ccum
    public final /* synthetic */ Object a(Map map, ccvl ccvlVar, ffgu ffguVar) {
        return ccuf.a(map);
    }

    @Override // defpackage.ccum
    public final void b(axue axueVar, String str, Optional optional, String str2, ccvl ccvlVar) {
        axueVar.getClass();
        ekzz f = eleg.f("CmsParticipantsBackupDelegate.onSuccess");
        try {
            ensk o = a.o();
            o.Y(cdii.c, str);
            o.Y(cdii.d, ccvlVar.b.a);
            o.Y(cdii.p, Integer.valueOf(ccvlVar.b.b));
            o.Y(csux.m, str2);
            o.q("Processed CMS participant backup");
            axol.k(this.e, this.f, new ccya(this, str, str2, ccvlVar, null), 2);
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.ccum
    public final Object c(String str, String str2) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cdii.c, str);
        enszVar.q("Recovering from ALREADY_EXISTS error for participant");
        return ccug.a;
    }

    @Override // defpackage.ccum
    public final Object d(Map map) {
        Object value;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = ((etah) entry.getValue()).c;
            str.getClass();
            if (linkedHashSet.contains(str)) {
                ensz enszVar = (ensz) a.j();
                enszVar.Y(cdii.c, str);
                enszVar.q("Invalid participantId contained in batch create request.");
                value = ffci.a(new ccuh((String) entry.getKey()));
            } else {
                linkedHashSet.add(str);
                value = entry.getValue();
            }
            linkedHashMap.put(key, new ffch(value));
        }
        return linkedHashMap;
    }

    @Override // defpackage.ccum
    public final void e(axue axueVar, String str, ccvl ccvlVar) {
        axueVar.getClass();
        ensz enszVar = (ensz) a.j();
        enszVar.Y(cdii.d, ccvlVar.b.a);
        enszVar.Y(cdii.c, str);
        enszVar.Y(cdii.p, Integer.valueOf(ccvlVar.b.b));
        enszVar.q("Failure while processing CmsParticipant.");
    }

    @Override // defpackage.ccum
    public final void f(List list, ccvl ccvlVar) {
        if (csgj.a() && ((asif) this.h.b()).a() && csfx.b(ccvlVar.c)) {
            axol.k(this.g, null, new ccxz(this, list, null), 3);
        }
    }
}
