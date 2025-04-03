package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cent extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cenv b;
    final /* synthetic */ PrintWriter c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cent(cenv cenvVar, PrintWriter printWriter, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cenvVar;
        this.c = printWriter;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cent) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cenv cenvVar = this.b;
            PrintWriter printWriter = this.c;
            this.a = 1;
            Object a = ffra.a(ekxi.a(cenvVar.f), new cens(null, cenvVar, printWriter), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cent(this.b, this.c, ffguVar);
    }
}
