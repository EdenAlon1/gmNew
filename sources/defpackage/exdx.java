package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exdx implements exdv {
    public static final /* synthetic */ int a = 0;
    private static final enzu b;
    private final enya c;

    static {
        engw engwVar = enzu.a;
        enzq enzqVar = new enzq();
        enzqVar.a = 100;
        b = new enzu(enzqVar);
    }

    public exdx(enya enyaVar) {
        this.c = enyaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x02f7, code lost:
    
        if ((r8 - r11) >= 0) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x042b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0474 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x033f A[LOOP:4: B:70:0x0338->B:72:0x033f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ca  */
    @Override // defpackage.exdv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(double r25, double r27, double r29) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exdx.a(double, double, double):boolean");
    }

    @Override // defpackage.exdv
    public final boolean b() {
        Iterator<enxz> it = this.c.iterator();
        while (it.hasNext()) {
            if (!it.next().H()) {
                return false;
            }
        }
        enya enyaVar = this.c;
        for (int i = 1; i < enyaVar.a.size(); i++) {
            if (((enxz) enyaVar.a.get(i - 1)).x().compareTo(((enxz) enyaVar.a.get(i)).y()) >= 0) {
                return false;
            }
        }
        return true;
    }
}
