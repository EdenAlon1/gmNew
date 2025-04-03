package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ofp b;
    final /* synthetic */ odv c;
    final /* synthetic */ oke d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofo(ofp ofpVar, odv odvVar, oke okeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ofpVar;
        this.c = odvVar;
        this.d = okeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ofo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ofp ofpVar = this.b;
            odv odvVar = this.c;
            this.a = 1;
            obj = ofpVar.a.b(odvVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        oke okeVar = this.d;
        odr odrVar = (odr) obj;
        List list = odrVar.a;
        return new oki(list, (list.isEmpty() && (okeVar instanceof okc)) ? null : odrVar.b, (odrVar.a.isEmpty() && (okeVar instanceof okb)) ? null : odrVar.c, odrVar.d, odrVar.e);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ofo(this.b, this.c, this.d, ffguVar);
    }
}
