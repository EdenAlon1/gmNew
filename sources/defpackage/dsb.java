package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dse b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsb(dse dseVar, float f, float f2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dseVar;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dse dseVar = this.b;
            float f = this.c;
            float f2 = this.d;
            long floatToRawIntBits = Float.floatToRawIntBits(f);
            long floatToRawIntBits2 = Float.floatToRawIntBits(f2);
            this.a = 1;
            if (drp.a(dseVar.b, (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32), this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsb(this.b, this.c, this.d, ffguVar);
    }
}
