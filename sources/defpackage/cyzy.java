package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyzy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eot b;
    final /* synthetic */ int c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyzy(eot eotVar, int i, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eotVar;
        this.c = i;
        this.d = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyzy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eot eotVar = this.b;
            int size = (this.c + 1) % this.d.size();
            dbu c = cxu.c(350, 0, null, 6);
            this.a = 1;
            if (eot.z(eotVar, size, c, this, 2) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyzy(this.b, this.c, this.d, ffguVar);
    }
}
