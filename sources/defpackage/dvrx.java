package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvrx implements dvqw {
    private static final entd g = entd.c("GnpSdk");
    public final dvqo a;
    public final ffsk b;
    public final dvqv c;
    public final Map d;
    public final Map e;
    public final Set f;

    public dvrx(dvqo dvqoVar, ffsk ffskVar, dvqv dvqvVar) {
        dvqoVar.getClass();
        ffskVar.getClass();
        dvqvVar.getClass();
        this.a = dvqoVar;
        this.b = ffskVar;
        this.c = dvqvVar;
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashSet();
    }

    private final eafl b(dvdp dvdpVar, List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                evzn evznVar = (evzn) it.next();
                evzm b = evzm.b(evznVar.c);
                if (b == null) {
                    b = evzm.UNSPECIFIED;
                }
                if (b == evzm.LIGHT) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        evzn evznVar2 = (evzn) it2.next();
                        evzm b2 = evzm.b(evznVar2.c);
                        if (b2 == null) {
                            b2 = evzm.UNSPECIFIED;
                        }
                        if (b2 == evzm.DARK) {
                            return new eafo(new ffcf(evznVar, evznVar2));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            c(dvdpVar, dvqt.FAILED_THEME_NOT_FOUND);
            return new eafi(new dvrm());
        }
    }

    private final void c(dvdp dvdpVar, dvqt dvqtVar) {
        ffqy.d(this.b, null, null, new dvrw(this, dvdpVar, dvqtVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0198  */
    @Override // defpackage.dvqw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.os.Parcelable r23, defpackage.ffgu r24) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvrx.a(android.os.Parcelable, ffgu):java.lang.Object");
    }
}
