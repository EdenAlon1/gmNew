package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckgv {
    public static final ejui a = new ejtz("rcs_availability_data_source_key");
    private final ffbr b;
    private final ffbr c;
    private final Map d = new ConcurrentHashMap();

    public ckgv(ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Deprecated
    public final eqwf a() {
        return b(((dkpp) this.b.b()).l());
    }

    public final eqwf b(String str) {
        eqwf eqwfVar = (eqwf) this.d.get(str);
        return eqwfVar != null ? eqwfVar : eqwf.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
    }

    public final void c(String str, final eqwf eqwfVar) {
        ejvo ejvoVar = (ejvo) this.c.b();
        ejtv ejtvVar = new ejtv();
        ejtvVar.b(elfo.e((eqwf) this.d.put(str, eqwfVar)));
        ejtvVar.c(a);
        ejtvVar.a = new emwl() { // from class: ckgu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ejui ejuiVar = ckgv.a;
                return eqwf.this;
            }
        };
        ejvoVar.a(ejtvVar.a());
    }
}
