package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdf implements ibz {
    final /* synthetic */ gdi a;

    public gdf(gdi gdiVar) {
        this.a = gdiVar;
    }

    @Override // defpackage.ibz
    public final long a() {
        gdi gdiVar = this.a;
        long a = gdiVar.c.a();
        if (a != 16) {
            return a;
        }
        gkt gktVar = (gkt) isv.a(gdiVar, gkw.a);
        if (gktVar != null) {
            long j = gktVar.a;
            if (j != 16) {
                return j;
            }
        }
        return ((ibw) isv.a(this.a, fzc.a)).i;
    }
}
