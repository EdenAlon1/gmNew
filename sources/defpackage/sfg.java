package defpackage;

import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sfg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ sfk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfg(sfk sfkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = sfkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sfg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dhre a = ((dhvo) this.b.d.b()).a();
            this.a = 1;
            obj = fgju.a(a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ((PendingIntent) obj).send();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new sfg(this.b, ffguVar);
    }
}
