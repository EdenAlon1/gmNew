package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azeh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azei b;
    final /* synthetic */ Function c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azeh(azei azeiVar, Function function, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azeiVar;
        this.c = function;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azeh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            azei azeiVar = this.b;
            azeg azegVar = new azeg(this.c, null);
            this.a = 1;
            if (azeiVar.b(azegVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azeh(this.b, this.c, ffguVar);
    }
}
