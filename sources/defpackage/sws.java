package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sws extends ffhv implements ffjm {
    final /* synthetic */ swt a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sws(ffgu ffguVar, swt swtVar, String str) {
        super(2, ffguVar);
        this.a = swtVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sws) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        crqk a;
        ffci.b(obj);
        crrm crrmVar = this.a.b;
        a = crqj.a(false, this.b, (r15 & 4) != 0, ((r15 & 8) == 0) & false, null, 3, 2, 2);
        return Boolean.valueOf(crrmVar.b(a) != null);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sws swsVar = new sws(ffguVar, this.a, this.b);
        swsVar.c = obj;
        return swsVar;
    }
}
