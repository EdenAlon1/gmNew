package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwoq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwor b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwoq(cwor cworVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cworVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwoq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.c;
            cwor cworVar = this.b;
            cwop cwopVar = new cwop(cworVar, ffskVar);
            this.a = 1;
            if (fgct.g((fgct) cworVar.d.a, cwopVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cwoq cwoqVar = new cwoq(this.b, ffguVar);
        cwoqVar.c = obj;
        return cwoqVar;
    }
}
