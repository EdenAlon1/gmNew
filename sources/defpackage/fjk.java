package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjk implements ibz {
    final /* synthetic */ fjn a;

    public fjk(fjn fjnVar) {
        this.a = fjnVar;
    }

    @Override // defpackage.ibz
    public final long a() {
        fjn fjnVar = this.a;
        long a = fjnVar.c.a();
        if (a != 16) {
            return a;
        }
        fml fmlVar = (fml) isv.a(fjnVar, fmn.a);
        if (fmlVar != null) {
            long j = fmlVar.a;
            if (j != 16) {
                return j;
            }
        }
        long j2 = ((ibw) isv.a(this.a, fjb.a)).i;
        return (((fin) isv.a(this.a, fip.a)).m() || ((double) iby.a(j2)) >= 0.5d) ? j2 : ibw.d;
    }
}
