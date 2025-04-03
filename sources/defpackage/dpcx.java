package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpcx extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dpcz c;
    final /* synthetic */ ffrp d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpcx(dpcz dpczVar, ffrp ffrpVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dpczVar;
        this.d = ffrpVar;
        this.e = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpcx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffkz ffkzVar = new ffkz();
            ffkz ffkzVar2 = new ffkz();
            dpcz dpczVar = this.c;
            ffxx c = fgaj.c(new fgds(dpczVar.b.a, new dpct(this.d, null)), new dpcw(null));
            dpcv dpcvVar = new dpcv(ffkzVar2, ffkzVar, this.e, this.c);
            this.a = ffkzVar;
            this.b = 1;
            if (c.a(dpcvVar, this) == ffhhVar) {
                return ffhhVar;
            }
            obj2 = ffkzVar;
        }
        ffkz ffkzVar3 = (ffkz) obj2;
        if (ffkzVar3.a != 0) {
            ((enrr) dpcz.a.h().h("com/google/android/libraries/compose/audio/processor/AudioLevelProcessor$launchInputCoroutine$job$1", "invokeSuspend", 105, "AudioLevelProcessor.kt")).r("Dropping maxAmplitude value %d due to non-complete audio level polling window.", ffkzVar3.a);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpcx(this.c, this.d, this.e, ffguVar);
    }
}
