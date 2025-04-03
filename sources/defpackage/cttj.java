package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cttj extends ffhv implements ffjm {
    final /* synthetic */ cttm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cttj(cttm cttmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cttmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cttj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((cgoo) ((Optional) this.a.c.b()).get()).d(true, false);
        return this.a.e(new ffji() { // from class: ctti
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ctsw builder = ((ctsx) obj2).toBuilder();
                builder.copyOnWrite();
                ctsx ctsxVar = (ctsx) builder.instance;
                ctsxVar.b |= 1;
                ctsxVar.c = false;
                ctsx build = builder.build();
                build.getClass();
                return build;
            }
        });
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cttj(this.a, ffguVar);
    }
}
