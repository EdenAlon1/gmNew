package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvsc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ cvsd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvsc(long j, cvsd cvsdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = j;
        this.c = cvsdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvsc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
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
        this.c.a = null;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvsc(this.b, this.c, ffguVar);
    }
}
