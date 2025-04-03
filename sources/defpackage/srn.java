package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srn extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ srp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srn(ffgu ffguVar, srp srpVar) {
        super(3, ffguVar);
        this.c = srpVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        srn srnVar = new srn((ffgu) obj3, this.c);
        srnVar.d = (ffxy) obj;
        srnVar.b = obj2;
        return srnVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx ffygVar;
        srb srbVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r6 = this.d;
            srz srzVar = (srz) this.b;
            srp srpVar = this.c;
            if (srzVar != null) {
                src srcVar = srpVar.e;
                if (srzVar instanceof ssg) {
                    srbVar = srcVar.a;
                } else {
                    if (!(srzVar instanceof ssl)) {
                        Objects.toString(srzVar);
                        throw new IllegalArgumentException("Unknown banner content type: ".concat(srzVar.toString()));
                    }
                    srbVar = srcVar.b;
                }
                ffygVar = srbVar.a(srzVar, srpVar.b);
            } else {
                ffygVar = new ffyg(null);
            }
            this.a = 1;
            if (ffyk.c(r6, ffygVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
