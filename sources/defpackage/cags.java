package defpackage;

import com.google.communication.synapse.security.scytale.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cags extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cagq b;
    final /* synthetic */ cagt c;
    final /* synthetic */ Scope d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cags(cagq cagqVar, cagt cagtVar, Scope scope, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cagqVar;
        this.c = cagtVar;
        this.d = scope;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cags) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.e;
            eygr<cagp> eygrVar = this.b.b;
            eygrVar.getClass();
            cagt cagtVar = this.c;
            Scope scope = this.d;
            ArrayList arrayList = new ArrayList(ffdx.n(eygrVar, 10));
            for (cagp cagpVar : eygrVar) {
                ffhe ffheVar = ffhe.a;
                arrayList.add(ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new cagr(null, cagpVar, cagtVar, scope)));
            }
            this.a = 1;
            if (ffqv.a(arrayList, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ceyt.i();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cags cagsVar = new cags(this.b, this.c, this.d, ffguVar);
        cagsVar.e = obj;
        return cagsVar;
    }
}
