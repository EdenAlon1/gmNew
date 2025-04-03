package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivo {
    public static final List a(iny inyVar) {
        inyVar.getClass();
        iui L = ((ivn) inyVar).L();
        boolean b = b(L);
        List I = L.I();
        ArrayList arrayList = new ArrayList(I.size());
        int size = I.size();
        for (int i = 0; i < size; i++) {
            iui iuiVar = (iui) I.get(i);
            arrayList.add(b ? iuiVar.E() : iuiVar.F());
        }
        return arrayList;
    }

    private static final boolean b(iui iuiVar) {
        int aD = iuiVar.aD();
        int i = aD - 1;
        if (aD == 0) {
            throw null;
        }
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new ffcd();
                }
                iui u = iuiVar.u();
                if (u != null) {
                    return b(u);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }
}
