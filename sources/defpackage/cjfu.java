package defpackage;

import android.location.Location;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjfw b;
    final /* synthetic */ Location c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfu(cjfw cjfwVar, Location location, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjfwVar;
        this.c = location;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjfw cjfwVar = this.b;
            cjft cjftVar = new cjft(this.c, null);
            this.a = 1;
            if (cjfwVar.d.a(cjftVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjfu(this.b, this.c, ffguVar);
    }
}
