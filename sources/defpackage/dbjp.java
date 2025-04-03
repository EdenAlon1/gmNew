package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbjp extends ffhv implements ffji {
    int a;
    final /* synthetic */ dbjv b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbjp(dbjv dbjvVar, boolean z, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dbjvVar;
        this.c = z;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dbjv dbjvVar = this.b;
            boolean z = this.c;
            this.a = 1;
            dbja dbjaVar = dbjvVar.a.a;
            obj = ffra.a(ekxi.a(dbjaVar.a), new dbiz(null, dbjaVar, z), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        dbjc.c(this.b.b.a, (Uri) obj, true);
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbjp(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
