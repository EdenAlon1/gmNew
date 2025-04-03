package defpackage;

import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aquk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqum b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aquk(aqum aqumVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqumVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aquk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = this.b.g.b();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        engw engwVar = (engw) obj;
        engwVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : engwVar) {
            if (((aqux) obj2).u()) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() <= 1) {
            return Optional.ofNullable(ffdx.M(arrayList));
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aquk(this.b, ffguVar);
    }
}
