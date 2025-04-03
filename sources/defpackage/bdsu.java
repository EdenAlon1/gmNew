package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdsu {
    public final ffbr a;
    public final ffbr b;
    private final cfva c;

    public bdsu(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        cfup f = cfvl.f(cfvl.b, "country_code_cache_expiry_millis", 1000L);
        this.c = f;
        emyl emylVar = new emyl() { // from class: bdss
            @Override // defpackage.emyl
            public final Object get() {
                bdsu bdsuVar = bdsu.this;
                List m = ((ctwb) bdsuVar.a.b()).m();
                ArrayList arrayList = new ArrayList(ffdx.n(m, 10));
                Iterator it = m.iterator();
                while (it.hasNext()) {
                    arrayList.add(bdsuVar.a(((ctwi) it.next()).p()));
                }
                ArrayList arrayList2 = new ArrayList(ffdx.n(m, 10));
                Iterator it2 = m.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(bdsuVar.a(((ctwi) it2.next()).s()));
                }
                ctvf a = bdsuVar.a(((ctwb) bdsuVar.a.b()).g().s());
                ctvf a2 = bdsuVar.a((String) ((ctwb) bdsuVar.a.b()).g().j().orElse(""));
                ctvf a3 = bdsuVar.a(((ctwb) bdsuVar.a.b()).g().r());
                ctuy ctuyVar = (ctuy) ((Optional) bdsuVar.b.b()).orElse(null);
                return new bdst(a2, a3, a, bdsuVar.a(ctuyVar != null ? ctuyVar.b() : null), arrayList2, arrayList);
            }
        };
        Object e = f.e();
        e.getClass();
        emys.b(emylVar, Duration.ofMillis(((Number) e).longValue()));
    }

    public final ctvf a(String str) {
        if (str != null) {
            if (str.length() != 2) {
                str = null;
            }
            if (str != null) {
                ctvb g = ((ctwb) this.a.b()).g();
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                ctvf c = g.c(upperCase);
                ctvf ctvfVar = true != c.a() ? c : null;
                if (ctvfVar != null) {
                    return ctvfVar;
                }
            }
        }
        return new ctvf(0);
    }
}
