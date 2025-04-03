package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cene extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cenh b;
    final /* synthetic */ PrintWriter c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cene(cenh cenhVar, PrintWriter printWriter, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cenhVar;
        this.c = printWriter;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cene) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cenh cenhVar = this.b;
            PrintWriter printWriter = this.c;
            this.a = 1;
            Object a = ffra.a(ekxi.a(cenhVar.g), new cend(null, cenhVar, printWriter), this);
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
        return new cene(this.b, this.c, ffguVar);
    }
}
