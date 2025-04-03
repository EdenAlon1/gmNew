package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cypf extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cypg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cypf(cypg cypgVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = cypgVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cypf cypfVar = new cypf(this.c, (ffgu) obj3);
        cypfVar.a = (alxj) obj;
        cypfVar.b = (aqux) obj2;
        return cypfVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        cypp cyppVar;
        ffci.b(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        obj2.getClass();
        if (!byyr.d(((amfx) obj2).v()) || r0 == 0) {
            return null;
        }
        if (r0.o().length() == 0) {
            String n = r0.n();
            if (n == null) {
                n = "";
            }
            cyppVar = new cypp(n, null);
        } else {
            cyppVar = new cypp(r0.o(), r0.n());
        }
        cypg cypgVar = this.c;
        return new cyph(new dnlz(cyppVar.a, cyppVar.b, null, null, null, new dnlf(dmzz.dw), null, new ffix() { // from class: cypb
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, 92), cypgVar.a.getString(R.string.active_sim));
    }
}
