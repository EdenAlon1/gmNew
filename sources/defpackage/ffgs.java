package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffgs extends ffkk implements ffjm {
    final /* synthetic */ ffhd[] a;
    final /* synthetic */ ffkz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffgs(ffhd[] ffhdVarArr, ffkz ffkzVar) {
        super(2);
        this.a = ffhdVarArr;
        this.b = ffkzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ffha ffhaVar = (ffha) obj2;
        ((ffcu) obj).getClass();
        ffhaVar.getClass();
        ffkz ffkzVar = this.b;
        int i = ffkzVar.a;
        ffkzVar.a = i + 1;
        this.a[i] = ffhaVar;
        return ffcu.a;
    }
}
