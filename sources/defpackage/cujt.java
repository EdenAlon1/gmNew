package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujt extends ffhv implements ffjm {
    final /* synthetic */ MessageCoreData a;
    final /* synthetic */ Integer b;
    final /* synthetic */ cusf c;
    final /* synthetic */ cuke d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cujt(ffgu ffguVar, MessageCoreData messageCoreData, Integer num, cusf cusfVar, cuke cukeVar) {
        super(2, ffguVar);
        this.a = messageCoreData;
        this.b = num;
        this.c = cusfVar;
        this.d = cukeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cujt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffsk ffskVar = (ffsk) this.e;
        ffhe ffheVar = ffhe.a;
        ffss b = ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new cuju(null, this.d, this.a));
        ffhe ffheVar2 = ffhe.a;
        ffss b2 = ffra.b(ffskVar, ekxi.a(ffheVar2), ffsm.a, new cujv(null, this.d, this.a));
        ffhe ffheVar3 = ffhe.a;
        ffss b3 = ffra.b(ffskVar, ekxi.a(ffheVar3), ffsm.a, new cujw(null, this.d, this.a));
        ffhe ffheVar4 = ffhe.a;
        ffss b4 = ffra.b(ffskVar, ekxi.a(ffheVar4), ffsm.a, new cujx(null, this.d, b2));
        ffhe ffheVar5 = ffhe.a;
        return new cujo(this.a, b, b2, b3, b4, ffra.b(ffskVar, ekxi.a(ffheVar5), ffsm.a, new cujy(null, this.d, b4)), new cujq(this.d, this.a, null), new cujr(this.d, b4, null), this.b, this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cujt cujtVar = new cujt(ffguVar, this.a, this.b, this.c, this.d);
        cujtVar.e = obj;
        return cujtVar;
    }
}
