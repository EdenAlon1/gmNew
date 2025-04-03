package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctth extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cttm b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctth(cttm cttmVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cttmVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctth) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        if (((Optional) this.b.c.b()).isPresent() && !this.c) {
            ((cgoo) ((Optional) this.b.c.b()).get()).d(false, true);
        }
        cttm cttmVar = this.b;
        final boolean z = this.c;
        ffji ffjiVar = new ffji() { // from class: cttg
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ctsw builder = ((ctsx) obj2).toBuilder();
                builder.copyOnWrite();
                ctsx ctsxVar = (ctsx) builder.instance;
                ctsxVar.b |= 4;
                ctsxVar.e = z;
                ctsx build = builder.build();
                build.getClass();
                return build;
            }
        };
        this.a = 1;
        if (cttmVar.f(ffjiVar, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctth(this.b, this.c, ffguVar);
    }
}
