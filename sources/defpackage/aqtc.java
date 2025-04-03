package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqtc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqtc(aqte aqteVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqteVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqtc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aqte aqteVar = this.b;
            this.a = 1;
            obj = aqteVar.h(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Optional.ofNullable((aqux) obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqtc(this.b, ffguVar);
    }
}
