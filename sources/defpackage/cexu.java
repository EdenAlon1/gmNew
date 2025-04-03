package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cexu extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fgcm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cexu(fgcm fgcmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = fgcmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cexu) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Map map = (Map) this.b;
            fgcm fgcmVar = this.c;
            this.a = 1;
            if (fgcmVar.fQ(map, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cexu cexuVar = new cexu(this.c, ffguVar);
        cexuVar.b = obj;
        return cexuVar;
    }
}
