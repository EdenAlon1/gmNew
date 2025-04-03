package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlff implements dlfe {
    private final Map a;
    private final Optional b;

    public dlff(Map map, Optional optional) {
        this.a = map;
        this.b = optional;
    }

    @Override // defpackage.dlfe
    public final dlfk a(String str) {
        dlgd dlgdVar = (dlgd) this.a.get(str);
        if (dlgdVar == null) {
            dlgdVar = dlgd.a;
        }
        Object b = fflm.b(this.b);
        if (true != dlgdVar.d) {
            b = null;
        }
        return (dlfk) b;
    }
}
