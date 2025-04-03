package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajbw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajbx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbw(ajbx ajbxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ajbxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajbw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx b;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (((aspy) this.b.h.b()).a()) {
                ajbx ajbxVar = this.b;
                b = fgck.a(ajbxVar.e.b, ajbxVar.l, ajbxVar.m, new ajbp(ajbxVar, null));
            } else if (((Boolean) ctjd.ap.e()).booleanValue()) {
                ajbx ajbxVar2 = this.b;
                ajbv ajbvVar = new ajbv(null, ajbxVar2);
                int i2 = fgau.a;
                b = new fgen(ajbvVar, ajbxVar2.b);
            } else {
                ajbx ajbxVar3 = this.b;
                b = fgck.b(ajbxVar3.e.b, ajbxVar3.b, ajbxVar3.l, ajbxVar3.m, new ajbr(ajbxVar3, null));
            }
            ffxx a = ffyy.a(new ajbu(b, this.b));
            ajbo ajboVar = new ajbo(this.b);
            this.a = 1;
            if (a.a(ajboVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajbw(this.b, ffguVar);
    }
}
