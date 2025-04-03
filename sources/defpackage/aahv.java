package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aahv extends ffhv implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ apyv b;
    final /* synthetic */ aahw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aahv(boolean z, apyv apyvVar, aahw aahwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = z;
        this.b = apyvVar;
        this.c = aahwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aahv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && this.a) {
            apyv apyvVar = this.b;
            aahw aahwVar = this.c;
            boolean e = ffkj.e(apyvVar, aahwVar.D);
            boolean e2 = ffkj.e(apyvVar, aahwVar.E);
            if (e2 && ((Boolean) ctjd.ao.e()).booleanValue()) {
                ((aigz) this.c.j.b()).h(new aiiy(null));
            } else if (e || e2) {
                ((ddzb) this.c.l.b()).h(R.string.feedback_confirmation);
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aahv(this.a, this.b, this.c, ffguVar);
    }
}
