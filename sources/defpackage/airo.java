package defpackage;

import j$.time.MonthDay;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class airo extends ffhv implements ffjm {
    final /* synthetic */ MonthDay a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airo(ffgu ffguVar, MonthDay monthDay) {
        super(2, ffguVar);
        this.a = monthDay;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((airo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        brbn a = brbs.a();
        a.z("getBirthdaysByDateQuery");
        a.c(new airq(this.a));
        return a.b();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        airo airoVar = new airo(ffguVar, this.a);
        airoVar.b = obj;
        return airoVar;
    }
}
