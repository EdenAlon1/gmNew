package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axrl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ ffxx[] c;
    final /* synthetic */ boolean[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axrl(long j, ffxx[] ffxxVarArr, boolean[] zArr, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = j;
        this.c = ffxxVarArr;
        this.d = zArr;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axrl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            long j = this.b;
            this.a = 1;
            if (ffsw.d(j, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        ffxx[] ffxxVarArr = this.c;
        boolean[] zArr = this.d;
        int i2 = 0;
        int i3 = 0;
        while (i2 < ffxxVarArr.length) {
            ffxx ffxxVar = ffxxVarArr[i2];
            int i4 = i3 + 1;
            if (!zArr[i3]) {
                ((enrr) axqb.a.i().h("com/google/android/apps/messaging/shared/concurrent/flow/LoggedCombineKt$combineWithLogging$10$1", "invokeSuspend", 390, "LoggedCombine.kt")).t("Flow used in combine did not emit a value. Flow: %s", ffxxVar);
            }
            i2++;
            i3 = i4;
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axrl(this.b, this.c, this.d, ffguVar);
    }
}
