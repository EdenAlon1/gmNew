package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgdj b;
    final /* synthetic */ hsv c;
    final /* synthetic */ List d;
    final /* synthetic */ zgu e;
    final /* synthetic */ ffsk f;
    final /* synthetic */ ffix g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgt(fgdj fgdjVar, hsv hsvVar, List list, zgu zguVar, ffsk ffskVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgdjVar;
        this.c = hsvVar;
        this.d = list;
        this.e = zguVar;
        this.f = ffskVar;
        this.g = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zgt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgdj fgdjVar = this.b;
            zgs zgsVar = new zgs(this.c, this.d, this.e, this.f, this.g);
            this.a = 1;
            if (fgdjVar.a(zgsVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zgt(this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
