package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahya extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahya(ffxx ffxxVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahya) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.d;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ffxx ffxxVar = this.b;
            ahxz ahxzVar = new ahxz(linkedHashSet, this.c, ffxyVar);
            this.a = 1;
            if (ffxxVar.a(ahxzVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahya ahyaVar = new ahya(this.b, this.c, ffguVar);
        ahyaVar.d = obj;
        return ahyaVar;
    }
}
