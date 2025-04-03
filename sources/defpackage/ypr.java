package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ypr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yqb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypr(yqb yqbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yqbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ypr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0 && !((atth) this.b.m.b()).a()) {
            yqb yqbVar = this.b;
            String string = yqbVar.e.getString(R.string.not_available_on_satellite);
            string.getClass();
            ablt abltVar = new ablt(string, null, ((attc) this.b.j.b()).a(), 0, null, 117);
            this.a = 1;
            if (yqbVar.u.a(abltVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ypr(this.b, ffguVar);
    }
}
