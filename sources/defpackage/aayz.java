package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aayz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abac b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayz(abac abacVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abacVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aayz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ablq ablqVar = (ablq) this.b.w.b();
            String string = this.b.g.getString(R.string.business_action_failed_to_launch);
            string.getClass();
            ablt abltVar = new ablt(string, null, false, 2, null, 109);
            this.a = 1;
            if (ablqVar.a(abltVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aayz(this.b, ffguVar);
    }
}
