package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cosa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cosd b;
    final /* synthetic */ cors c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cosa(cosd cosdVar, cors corsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cosdVar;
        this.c = corsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cosa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cosd cosdVar = this.b;
            cors corsVar = this.c;
            this.a = 1;
            obj = cosdVar.l(corsVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Optional.ofNullable(obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cosa(this.b, this.c, ffguVar);
    }
}
