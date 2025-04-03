package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfz implements dpft {
    public static final enru a = enru.c("com/google/android/libraries/compose/cameragallery/data/GalleryLoaderImpl");
    public final ffsk b;
    public final drpd c;
    public final dpaa d;
    public final dqkk e;
    public final dqdf f;
    public final dpfr g;
    public final ffbz h;

    public dpfz(ffsk ffskVar, Optional optional, drpd drpdVar, dpaa dpaaVar, dqkk dqkkVar, final ffbr ffbrVar, dqdf dqdfVar) {
        dqdf dqdfVar2;
        this.b = ffskVar;
        this.c = drpdVar;
        this.d = dpaaVar;
        this.e = dqkkVar;
        if (dqdfVar == null) {
            dqdfVar2 = new dqdf((dqgf) null, (dpnj) null, (ffbz) null, false, false, false, false, 1023);
        } else {
            dqdfVar2 = dqdfVar;
        }
        this.f = dqdfVar2;
        ffca.a(new ffix() { // from class: dpfv
            @Override // defpackage.ffix
            public final Object invoke() {
                Object b = ffbr.this.b();
                b.getClass();
                Optional optional2 = (Optional) b;
                return (dozj) (optional2.isPresent() ? optional2.get() : new dozj(null));
            }
        });
        this.g = (dpfr) fflm.b(optional);
        this.h = ffca.a(new ffix() { // from class: dpfw
            @Override // defpackage.ffix
            public final Object invoke() {
                String c;
                Iterable iterable = (Iterable) dpfz.this.f.f.a();
                ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((drka) it.next()).c().a());
                }
                List g = ffdx.g(1, 3);
                c = ffpc.c("mime_type IN ('" + ffdx.aA(arrayList, "','", null, null, null, 62) + "') \n    AND media_type IN (" + ffdx.aA(g, ",", null, null, null, 62) + ")", "|");
                return c;
            }
        });
    }
}
