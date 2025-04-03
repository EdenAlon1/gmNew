package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crbe {
    private static final cskc a = cskc.g("BugleFileTransfer", "FilePreviewSizeProvider");
    private final azbq b;

    public crbe(azbq azbqVar) {
        this.b = azbqVar;
    }

    public final int a(engw engwVar) {
        if (engwVar.size() != 1) {
            return ((Integer) dimn.E().k().a()).intValue();
        }
        aoku aokuVar = (aoku) engwVar.get(0);
        avlk a2 = this.b.a(aokuVar);
        if (a2.f()) {
            csjb e = a.e();
            e.I("Capabilities are empty for");
            e.k(aokuVar.toString());
            e.I("while trying to determine the file transfer preview size");
            e.r();
            return Math.min(((Integer) dimn.E().l().a()).intValue(), ((Integer) dimn.E().k().a()).intValue());
        }
        if (a2.i()) {
            return ((Integer) dimn.E().k().a()).intValue();
        }
        int intValue = ((Integer) dimn.E().l().a()).intValue();
        csjb c = a.c();
        c.I("Using pre-UP file transfer preview size:");
        c.G(intValue);
        c.I("bytes");
        c.r();
        return intValue;
    }
}
