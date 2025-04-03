package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cidd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cidg b;
    final /* synthetic */ escu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cidd(cidg cidgVar, escu escuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cidgVar;
        this.c = escuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cidd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cidg cidgVar = this.b;
            escu escuVar = this.c;
            this.a = 1;
            obj = cidgVar.a(escuVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Optional.ofNullable(obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cidd(this.b, this.c, ffguVar);
    }
}
