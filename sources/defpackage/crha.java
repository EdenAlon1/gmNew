package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crha implements crgp {
    private final ffbr a;

    public crha(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.crgp
    public final Object a(Set set, ffgu ffguVar) {
        ckly cklyVar = (ckly) this.a.b();
        ezkb ezkbVar = ezkb.RCS_TRANSPORT_TYPE_SINGLE_REGISTRATION;
        ArrayList arrayList = new ArrayList(ffdx.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(((crgw) it.next()).b));
        }
        Object c = fgfz.c(cklyVar.c(ezkbVar, arrayList), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    @Override // defpackage.crgp
    public final Object b(crgw crgwVar, ffgu ffguVar) {
        Object c = fgfz.c(((ckly) this.a.b()).b(ezkb.RCS_TRANSPORT_TYPE_SINGLE_REGISTRATION, crgwVar.b), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    @Override // defpackage.crgp
    public final boolean c(crgw crgwVar) {
        crgwVar.getClass();
        return crgwVar.a.m().C();
    }
}
