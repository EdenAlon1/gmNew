package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylu extends ffhv implements ffjm {
    final /* synthetic */ ylx a;
    final /* synthetic */ fjay b;
    final /* synthetic */ fjay c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylu(ffgu ffguVar, ylx ylxVar, fjay fjayVar, fjay fjayVar2) {
        super(2, ffguVar);
        this.a = ylxVar;
        this.b = fjayVar;
        this.c = fjayVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ylu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        fjay fjayVar = this.c;
        fjayVar.getClass();
        fjay fjayVar2 = this.b;
        fjayVar2.getClass();
        fjayVar.getClass();
        efbd.c();
        cpeu cpeuVar = cpeu.SEND_BUTTON_ACCURATE;
        String str = fjayVar2.b;
        boolean booleanValue = ((Boolean) cpev.j.e()).booleanValue();
        abaj abajVar = this.a.a;
        if (booleanValue) {
            cpev cpevVar = abajVar.a;
            ((ConcurrentHashMap) cpevVar.u.get(cpeuVar.ordinal())).remove(str);
        }
        abajVar.a.g(cpeu.SEND_BUTTON_ACCURATE, fjayVar.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ylu yluVar = new ylu(ffguVar, this.a, this.b, this.c);
        yluVar.d = obj;
        return yluVar;
    }
}
