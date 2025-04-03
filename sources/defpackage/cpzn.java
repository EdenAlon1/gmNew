package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpzn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpzo b;
    final /* synthetic */ cpzl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpzn(cpzo cpzoVar, cpzl cpzlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpzoVar;
        this.c = cpzlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpzn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cpzo cpzoVar = this.b;
            cpzm cpzmVar = new cpzm(cpzoVar, this.c, null);
            this.a = 1;
            if (albs.a(cpzoVar.c, "Bugle.Telephony.ForwardSync.SpotSyncWorkHandler.Duration", cpzmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ceyt.i();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpzn(this.b, this.c, ffguVar);
    }
}
