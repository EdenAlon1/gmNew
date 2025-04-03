package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egtr extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;

    public egtr(ffgu ffguVar) {
        super(5, ffguVar);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffci.b(obj);
        Object obj3 = this.a;
        boolean z = obj3 instanceof egtc;
        Object obj4 = this.b;
        Object obj5 = this.c;
        Object obj6 = this.d;
        if (z) {
            return egto.a;
        }
        if (obj3 instanceof egtb) {
            if (obj5 == null) {
                obj5 = ((egtb) obj3).a;
            }
            if (obj4 != null) {
                obj2 = ((eguc) obj4).a;
            } else {
                obj2 = ((egtb) obj3).b;
                obj4 = null;
            }
            egtb egtbVar = (egtb) obj3;
            return new egtn((String) obj5, obj2, egtbVar.c, egtbVar.f, egtbVar.d, egtbVar.e, obj4 != null ? ((eguc) obj4).b : egtbVar.g, egtbVar.h, (Uri) obj6, egtbVar.i);
        }
        if (obj3 instanceof egsx) {
            return egtk.a;
        }
        if (obj3 instanceof egtd) {
            if (obj5 == null) {
                obj5 = ((egtd) obj3).a;
            }
            return new egtp((String) obj5, obj4 != null ? ((eguc) obj4).a : ((egtd) obj3).b);
        }
        if (!(obj3 instanceof egsz)) {
            throw new ffcd();
        }
        if (obj5 == null) {
            obj5 = ((egsz) obj3).d;
        }
        Object obj7 = obj4 != null ? ((eguc) obj4).a : ((egsz) obj3).e;
        egsz egszVar = (egsz) obj3;
        return new egtl((String) obj5, obj7, egszVar.a, egszVar.b, egszVar.c, egszVar.j);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        egtr egtrVar = new egtr((ffgu) obj5);
        egtrVar.a = (egte) obj;
        egtrVar.b = (eguc) obj2;
        egtrVar.c = (String) obj3;
        egtrVar.d = (Uri) obj4;
        return egtrVar.b(ffcu.a);
    }
}
