package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtjq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtjf(dtjq dtjqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtjqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtjf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqli e = this.b.e();
            List b = ffdx.b(dqlf.g);
            this.a = 1;
            obj = e.b(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.bb();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtjf(this.b, ffguVar);
    }
}
