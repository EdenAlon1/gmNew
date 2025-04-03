package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class baho extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bahp b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baho(bahp bahpVar, MessageCoreData messageCoreData, int i, int i2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bahpVar;
        this.c = messageCoreData;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baho) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl f = ((axkm) this.b.H.b()).f();
            this.a = 1;
            obj = fgfz.c(f, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        axeu axeuVar = (axeu) obj;
        axeuVar.getClass();
        bahp bahpVar = this.b;
        eonp l = axmm.l(axeuVar);
        bahpVar.J.set(new bahl().m().fP(l));
        ((altk) this.b.q.b()).J(this.c, new Integer(this.d), this.e, l);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new baho(this.b, this.c, this.d, this.e, ffguVar);
    }
}
