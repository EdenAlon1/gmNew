package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqel extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqfc b;
    final /* synthetic */ drnm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqel(dqfc dqfcVar, drnm drnmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqfcVar;
        this.c = drnmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqel) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dqel dqelVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            dqelVar = this;
        } else {
            dqfc dqfcVar = this.b;
            drnm drnmVar = this.c;
            drpd r = dqfcVar.r();
            drka l = drnmVar.l();
            Uri parse = Uri.parse(drnmVar.f());
            parse.getClass();
            Long l2 = new Long(this.c.a());
            drnm drnmVar2 = this.c;
            Instant c = drnmVar2.c();
            doxr fm = drnmVar2.fm();
            this.a = 1;
            dqelVar = this;
            obj = drpd.e(r, l, parse, l2, c, fm, dqelVar);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        dqelVar.b.ba((drnn) obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqel(this.b, this.c, ffguVar);
    }
}
