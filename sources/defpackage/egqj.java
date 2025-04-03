package defpackage;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egqj implements egqg {
    private static final engw b = engw.t(egqe.ART, egqe.GOOGLE_PHOTOS, egqe.DEVICE_PHOTOS);
    public final EnumMap a = new EnumMap(egqe.class);
    private final Map c;
    private final List d;

    public egqj(Map map, emxc emxcVar) {
        this.c = map;
        this.d = (List) emxcVar.e(b);
    }

    @Override // defpackage.egqg
    public final List a() {
        enfc d = enfc.d(this.d);
        final Map map = this.c;
        return engw.n(d.f(new emwl() { // from class: egqh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (egqf) map.get((egqe) obj);
            }
        }).c(new emxg() { // from class: egqi
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                Boolean bool;
                egqf egqfVar = (egqf) obj;
                boolean z = egqfVar != null && egqfVar.h();
                if (egqfVar != null) {
                    bool = (Boolean) egqj.this.a.get(egqfVar.e());
                } else {
                    bool = Boolean.FALSE;
                }
                return z && (bool == null || bool.booleanValue());
            }
        }).g());
    }

    @Override // defpackage.egqg
    public final void b(egqe egqeVar, boolean z) {
        this.a.put((EnumMap) egqeVar, (egqe) Boolean.valueOf(z));
    }
}
