package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tac {
    public final Map a;
    private final ajjc b;

    public tac(ajjc ajjcVar, Map map) {
        ajjcVar.getClass();
        this.b = ajjcVar;
        this.a = map;
    }

    public final void a(final tad tadVar) {
        this.b.d(true, new ffji() { // from class: tab
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ajiy ajiyVar = (ajiy) obj;
                ajiyVar.getClass();
                Map map = tac.this.a;
                tad tadVar2 = tadVar;
                szn sznVar = (szn) map.get(tal.a(tadVar2.c));
                if (sznVar != null) {
                    return sznVar.a(ajiyVar, tadVar2);
                }
                throw new IllegalStateException("There is no corresponding UiAdapter for DialogType \"" + ((Object) tal.a(tadVar2.c)) + "\"!");
            }
        });
    }
}
