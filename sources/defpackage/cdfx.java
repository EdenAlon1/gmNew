package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdfx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdfy b;
    final /* synthetic */ ccce c;
    final /* synthetic */ List d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdfx(cdfy cdfyVar, ccce ccceVar, List list, int i, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cdfyVar;
        this.c = ccceVar;
        this.d = list;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdfx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cdfy cdfyVar = this.b;
            ccce ccceVar = this.c;
            List list = this.d;
            int i2 = this.e;
            String str = this.f;
            this.a = 1;
            if (ffra.a(ekxi.a(cdfyVar.b), new cdfv(null, list, cdfyVar, ccceVar, i2, str), this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdfx(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
