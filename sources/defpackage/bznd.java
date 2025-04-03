package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bznd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ bznk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bznd(long j, bznk bznkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = j;
        this.c = bznkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bznd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        elfl c;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            long j = this.b;
            this.a = 1;
            if (ffsw.c(j, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        bznk bznkVar = this.c;
        bznkVar.p.set(false);
        bznk.b.n().q("Trigger DownloadEmojiTimer, notify.");
        c = axol.c(bznkVar.d, ffhe.a, ffsm.a, new bznh(bznkVar, null));
        bznkVar.i.a(c, bzmc.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bznd(this.b, this.c, ffguVar);
    }
}
