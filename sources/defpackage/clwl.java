package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clwl extends ffhv implements ffjm {
    final /* synthetic */ clwn a;
    final /* synthetic */ djrj b;
    final /* synthetic */ Integer c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ boolean f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clwl(clwn clwnVar, djrj djrjVar, Integer num, String str, String str2, boolean z, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = clwnVar;
        this.b = djrjVar;
        this.c = num;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clwl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        eqyc eqycVar = (eqyc) eqyd.a.createBuilder();
        eqycVar.getClass();
        djrj djrjVar = this.b;
        if (djrjVar != null) {
            String d = clwn.d(djrjVar);
            eqycVar.copyOnWrite();
            eqyd eqydVar = (eqyd) eqycVar.instance;
            eqydVar.b |= 1;
            eqydVar.c = d;
        }
        Integer num = this.c;
        if (num != null) {
            int intValue = num.intValue();
            eqycVar.copyOnWrite();
            eqyd eqydVar2 = (eqyd) eqycVar.instance;
            eqydVar2.b |= 2;
            eqydVar2.d = intValue;
        }
        boolean z = this.f;
        String str = this.e;
        String str2 = this.d;
        eqycVar.copyOnWrite();
        eqyd eqydVar3 = (eqyd) eqycVar.instance;
        eqydVar3.b |= 4;
        eqydVar3.e = str2;
        eqycVar.copyOnWrite();
        eqyd eqydVar4 = (eqyd) eqycVar.instance;
        eqydVar4.b |= 8;
        eqydVar4.f = str;
        eqycVar.copyOnWrite();
        eqyd eqydVar5 = (eqyd) eqycVar.instance;
        eqydVar5.b |= 16;
        eqydVar5.g = z;
        eyfy build = eqycVar.build();
        build.getClass();
        int i = this.g;
        eqyd eqydVar6 = (eqyd) build;
        eqxx eqxxVar = (eqxx) eqyh.a.createBuilder();
        eqxxVar.getClass();
        eqyi.c(i, eqxxVar);
        if (i - 1 != 18) {
            eqxxVar.copyOnWrite();
            eqyh eqyhVar = (eqyh) eqxxVar.instance;
            eqyhVar.h = eqydVar6;
            eqyhVar.b |= 32768;
        } else {
            eqxxVar.copyOnWrite();
            eqyh eqyhVar2 = (eqyh) eqxxVar.instance;
            eqyhVar2.g = eqydVar6;
            eqyhVar2.b |= 16384;
        }
        this.a.c(eqyi.a(eqxxVar));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new clwl(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
