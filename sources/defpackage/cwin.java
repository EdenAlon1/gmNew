package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwin extends ffhv implements ffjm {
    int a;
    final /* synthetic */ jgp b;
    final /* synthetic */ hzi c;
    final /* synthetic */ dsma d;
    final /* synthetic */ View e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwin(jgp jgpVar, hzi hziVar, dsma dsmaVar, View view, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = jgpVar;
        this.c = hziVar;
        this.d = dsmaVar;
        this.e = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwin) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final jgp jgpVar = this.b;
            ffxx a = hkt.a(new ffix() { // from class: cwil
                @Override // defpackage.ffix
                public final Object invoke() {
                    return Boolean.valueOf(jgp.this.b());
                }
            });
            cwim cwimVar = new cwim(this.c, this.d, this.e);
            this.a = 1;
            if (a.a(cwimVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwin(this.b, this.c, this.d, this.e, ffguVar);
    }
}
