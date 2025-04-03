package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yll extends ffhv implements ffjm {
    final /* synthetic */ yln a;
    final /* synthetic */ fjay b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yll(ffgu ffguVar, yln ylnVar, fjay fjayVar) {
        super(2, ffguVar);
        this.a = ylnVar;
        this.b = fjayVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yll) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        fjay fjayVar = this.b;
        fjayVar.getClass();
        fjayVar.getClass();
        efbd.c();
        abaj abajVar = this.a.h;
        abajVar.a.g(cpeu.SEND_BUTTON_ACCURATE, fjayVar.b);
        abajVar.c.a(194898, null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yll yllVar = new yll(ffguVar, this.a, this.b);
        yllVar.c = obj;
        return yllVar;
    }
}
