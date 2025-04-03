package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ hho b;
    final /* synthetic */ dwn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwi(dwn dwnVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dwnVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dwi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ArrayList arrayList = new ArrayList();
            dwn dwnVar = this.c;
            dwh dwhVar = new dwh(arrayList, this.b);
            this.a = 1;
            if (fgct.g((fgct) dwnVar.a, dwhVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dwi(this.c, this.b, ffguVar);
    }
}
