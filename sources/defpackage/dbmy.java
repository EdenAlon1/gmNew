package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbmy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbne b;
    final /* synthetic */ Activity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbmy(dbne dbneVar, Activity activity, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dbneVar;
        this.c = activity;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbmy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dbne dbneVar = this.b;
            this.a = 1;
            if (dbneVar.f.b(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.b(this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbmy(this.b, this.c, ffguVar);
    }
}
