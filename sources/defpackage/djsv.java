package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djsv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djsz b;
    final /* synthetic */ djrj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djsv(djsz djszVar, djrj djrjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = djszVar;
        this.c = djrjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djsv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            djsz djszVar = this.b;
            djrj djrjVar = this.c;
            this.a = 1;
            obj = ffra.a(ekxi.a(djszVar.d), new djsu(null, djszVar, djrjVar), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Optional.ofNullable(obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new djsv(this.b, this.c, ffguVar);
    }
}
