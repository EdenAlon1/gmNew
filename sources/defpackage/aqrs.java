package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqrs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqru b;
    final /* synthetic */ aqkp c;
    final /* synthetic */ eisx d;
    final /* synthetic */ engw e;
    final /* synthetic */ boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqrs(ffgu ffguVar, aqru aqruVar, aqkp aqkpVar, eisx eisxVar, engw engwVar, boolean z) {
        super(2, ffguVar);
        this.b = aqruVar;
        this.c = aqkpVar;
        this.d = eisxVar;
        this.e = engwVar;
        this.f = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqrs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [ffbr, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            aqru aqruVar = this.b;
            aqkp aqkpVar = this.c;
            eisx eisxVar = this.d;
            engw engwVar = this.e;
            boolean z = this.f;
            this.a = 1;
            Optional fN = ((aqqb) ekhv.a(aqruVar.b, aqqb.class, eisxVar)).fN();
            if (fN.isEmpty()) {
                obj = enoz.a;
            } else {
                Object b = fN.get().b();
                b.getClass();
                obj = aqruVar.d(aqkpVar, (alyr) b, engwVar, z, this);
            }
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return engq.e((Map) obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aqrs aqrsVar = new aqrs(ffguVar, this.b, this.c, this.d, this.e, this.f);
        aqrsVar.g = obj;
        return aqrsVar;
    }
}
