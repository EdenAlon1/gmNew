package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cics extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cict b;
    final /* synthetic */ erww c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cics(cict cictVar, erww erwwVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cictVar;
        this.c = erwwVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cics) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cict cictVar = this.b;
        erww erwwVar = this.c;
        String str = this.d;
        this.a = 1;
        Object b = cictVar.b(erwwVar, str, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cics(this.b, this.c, this.d, ffguVar);
    }
}
