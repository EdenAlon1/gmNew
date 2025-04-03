package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhh {
    public static final void a(final cwhs cwhsVar, hfd hfdVar, final int i) {
        int i2;
        doia doiaVar;
        cwhsVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(3762328);
        if (i3 == 0) {
            i2 = (true != b.D(cwhsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else if (cwhsVar.a && (doiaVar = cwhsVar.b) != null) {
            dohz.c(doiaVar, jfw.a(hvi.e, "SimSelectorConversation"), b, 48);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwhg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cwhh.a(cwhs.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
