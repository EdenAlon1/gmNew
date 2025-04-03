package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiqt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aiqu b;
    final /* synthetic */ emhv c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiqt(aiqu aiquVar, emhv emhvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aiquVar;
        this.c = emhvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aiqt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffud b = axnh.b(((emmt) this.b.a.b()).c(this.c), (ffsk) this.d);
            this.a = 1;
            obj = ((ffuq) b).B(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        eyfc a = eyfc.a();
        fbxo fbxoVar = (fbxo) eyfy.parseFrom(fbxo.a, (InputStream) obj, a);
        fbxoVar.getClass();
        return fbxoVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aiqt aiqtVar = new aiqt(this.b, this.c, ffguVar);
        aiqtVar.d = obj;
        return aiqtVar;
    }
}
