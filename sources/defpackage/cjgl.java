package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgl {
    private final ffbr a;

    public cjgl(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    public static /* synthetic */ void c(cjgl cjglVar, List list, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            list = ffel.a;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        cjglVar.b(list, i, z & ((i2 & 4) == 0));
    }

    public final void a(eqrg eqrgVar) {
        akxl akxlVar = (akxl) this.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.GOOGLE_PHOTOS_CREATE_SHARE_LINK_EVENT, eoluVar);
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.bk = eqrgVar;
        eolvVar.f |= 128;
        akxlVar.j((eolu) eogy.a(eoluVar).toBuilder());
    }

    public final void b(List list, int i, boolean z) {
        list.getClass();
        eqqu eqquVar = (eqqu) eqrg.a.createBuilder();
        eqquVar.getClass();
        eqqz eqqzVar = (eqqz) eqrf.a.createBuilder();
        eqqzVar.getClass();
        if (i != 0) {
            eqrb eqrbVar = (eqrb) eqrc.b.createBuilder();
            eqrbVar.getClass();
            eqrbVar.copyOnWrite();
            eqrc eqrcVar = (eqrc) eqrbVar.instance;
            eqrcVar.d = edei.a(i);
            eqrcVar.c |= 1;
            new eygk(((eqrc) eqrbVar.instance).e, eqrc.a);
            eqrbVar.copyOnWrite();
            eqrc eqrcVar2 = (eqrc) eqrbVar.instance;
            eygi eygiVar = eqrcVar2.e;
            if (!eygiVar.c()) {
                eqrcVar2.e = eyfy.mutableCopy(eygiVar);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eqrcVar2.e.h(((edfb) it.next()).a());
            }
            eyfy build = eqrbVar.build();
            build.getClass();
            eqqzVar.copyOnWrite();
            eqrf eqrfVar = (eqrf) eqqzVar.instance;
            eqrfVar.d = (eqrc) build;
            eqrfVar.c = 3;
        } else {
            eqrd eqrdVar = (eqrd) eqre.a.createBuilder();
            eqrdVar.getClass();
            eyfy build2 = eqrdVar.build();
            build2.getClass();
            eqqzVar.copyOnWrite();
            eqrf eqrfVar2 = (eqrf) eqqzVar.instance;
            eqrfVar2.d = (eqre) build2;
            eqrfVar2.c = 2;
        }
        eqqzVar.copyOnWrite();
        eqrf eqrfVar3 = (eqrf) eqqzVar.instance;
        eqrfVar3.b |= 1;
        eqrfVar3.e = z;
        eyfy build3 = eqqzVar.build();
        build3.getClass();
        eqquVar.copyOnWrite();
        eqrg eqrgVar = (eqrg) eqquVar.instance;
        eqrgVar.c = (eqrf) build3;
        eqrgVar.b = 2;
        a(eqrh.a(eqquVar));
    }
}
