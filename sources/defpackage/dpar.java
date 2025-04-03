package defpackage;

import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpar {
    public final Map a;
    private final Map b;

    public dpar(Map map, Map map2) {
        this.b = map;
        this.a = map2;
    }

    public final doza a(doxs doxsVar) {
        dpav dpavVar = (dpav) this.b.get(doxsVar.getClass());
        if (dpavVar == null) {
            Objects.toString(doxsVar);
            throw new dpap("No AttachmentSerializer found for ".concat(doxsVar.toString()));
        }
        eyhs d = dpavVar.b.d(doxsVar);
        doyz doyzVar = (doyz) doza.a.createBuilder();
        doyzVar.getClass();
        doyzVar.copyOnWrite();
        doza dozaVar = (doza) doyzVar.instance;
        dozaVar.b |= 1;
        dozaVar.c = dpavVar.a;
        doyzVar.copyOnWrite();
        doza dozaVar2 = (doza) doyzVar.instance;
        dozaVar2.b |= 2;
        dozaVar2.d = 1;
        eyee byteString = d.toByteString();
        byteString.getClass();
        doyzVar.copyOnWrite();
        doza dozaVar3 = (doza) doyzVar.instance;
        dozaVar3.b |= 4;
        dozaVar3.e = byteString;
        eyfy build = doyzVar.build();
        build.getClass();
        return (doza) build;
    }
}
