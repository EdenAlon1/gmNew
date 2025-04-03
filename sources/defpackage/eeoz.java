package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeoz extends eepe {
    public static final /* synthetic */ int a = 0;
    private final engw b;

    public eeoz(engw engwVar) {
        this.b = engwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eepe
    protected final boolean a(String str) {
        int i = 0;
        while (true) {
            engw engwVar = this.b;
            if (i >= ((enou) engwVar).c) {
                return false;
            }
            eepb eepbVar = (eepb) engwVar.get(i);
            if (eepbVar != null && eepbVar.a.matcher(str).matches()) {
                return true;
            }
            i++;
        }
    }

    @Deprecated
    public eeoz(List list) {
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!emxe.c(str)) {
                emxc a2 = eepb.a(str);
                if (a2.g()) {
                    engrVar.h(a2.c());
                }
            }
        }
        this.b = engrVar.g();
    }
}
