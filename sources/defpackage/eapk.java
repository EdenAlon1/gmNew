package defpackage;

import java.net.URL;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eapk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eapm b;
    final /* synthetic */ easy c;
    final /* synthetic */ String d;
    final /* synthetic */ exuu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eapk(eapm eapmVar, easy easyVar, String str, exuu exuuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eapmVar;
        this.c = easyVar;
        this.d = str;
        this.e = exuuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eapk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eapm eapmVar = this.b;
            easy easyVar = this.c;
            String str = this.d;
            exuu exuuVar = this.e;
            URL k = eapmVar.k("/v1/updateandfetchthreads");
            exuw exuwVar = exuw.a;
            exuwVar.getClass();
            this.a = 1;
            obj = eapmVar.i(easyVar, str, k, exuuVar, exuwVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return (eafl) obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eapk(this.b, this.c, this.d, this.e, ffguVar);
    }
}
