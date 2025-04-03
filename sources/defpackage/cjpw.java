package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjpx b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjpw(cjpx cjpxVar, int i, long j, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjpxVar;
        this.c = i;
        this.d = j;
        this.e = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjpw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjpx cjpxVar = this.b;
            int i2 = this.c;
            long j = this.d;
            List list = this.e;
            this.a = 1;
            if (cjpxVar.a(i2, j, list, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjpw(this.b, this.c, this.d, this.e, ffguVar);
    }
}
