package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edjl extends edjq {
    public edjl(edrs edrsVar, Locale locale, String str, edto edtoVar) {
        super(edrsVar, locale, str, edtoVar);
    }

    @Override // defpackage.edjq
    protected final String d() {
        return "details/json";
    }

    @Override // defpackage.edjq
    public final Map e() {
        edrs edrsVar = (edrs) this.a;
        HashMap hashMap = new HashMap();
        f(hashMap, "placeid", edrsVar.b());
        f(hashMap, "sessiontoken", null);
        f(hashMap, "fields", edke.a(edrsVar.c()));
        return hashMap;
    }
}
