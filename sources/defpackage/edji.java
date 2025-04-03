package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edji extends edjq {
    public edji(edrp edrpVar, String str, edto edtoVar) {
        super(edrpVar, null, str, edtoVar);
    }

    @Override // defpackage.edjq
    protected final String d() {
        return "photo";
    }

    @Override // defpackage.edjq
    public final Map e() {
        edrp edrpVar = (edrp) this.a;
        edps b = edrpVar.b();
        HashMap hashMap = new HashMap();
        f(hashMap, "maxheight", edrpVar.c());
        f(hashMap, "maxwidth", edrpVar.d());
        hashMap.put("photoreference", b.f());
        return hashMap;
    }
}
