package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgcv extends fgdx {
    public long a = -1;
    public ffgu b;

    @Override // defpackage.fgdx
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        fgct fgctVar = (fgct) obj;
        if (this.a >= 0) {
            return false;
        }
        long j = fgctVar.b;
        if (j < fgctVar.c) {
            fgctVar.c = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.fgdx
    public final /* bridge */ /* synthetic */ ffgu[] b(Object obj) {
        boolean z = ffso.a;
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((fgct) obj).l(j);
    }
}
