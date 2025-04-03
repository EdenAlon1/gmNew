package defpackage;

import android.window.BackEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ BackEvent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggs(cxj cxjVar, BackEvent backEvent, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = backEvent;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ggs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        float progress;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            progress = this.c.getProgress();
            Float f = new Float(hby.a(progress));
            this.a = 1;
            if (cxjVar.e(f, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ggs(this.b, this.c, ffguVar);
    }
}
