package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wrl extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ wrn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrl(wrn wrnVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = wrnVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [alxg, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        final ?? r2 = this.b;
        final ?? r3 = this.c;
        if ((this.d && !((aspy) this.e.g.b()).a()) || this.e.d.e || r2.b() == alxi.RBM || !r2.j()) {
            return null;
        }
        String string = this.e.a.getString(R.string.contact_picker_title_add_people);
        string.getClass();
        final wrn wrnVar = this.e;
        final engw engwVar = (engw) obj2;
        return new dlsr(string, dmzz.bt, false, !wrnVar.d.d, false, false, null, false, null, new ffix() { // from class: wrk
            @Override // defpackage.ffix
            public final Object invoke() {
                wrn.this.i.a(engwVar, r2, r3);
                return ffcu.a;
            }
        }, 1012);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        wrl wrlVar = new wrl(this.e, (ffgu) obj5);
        wrlVar.a = (engw) obj;
        wrlVar.b = (alxj) obj2;
        wrlVar.c = (alxg) obj3;
        wrlVar.d = booleanValue;
        return wrlVar.b(ffcu.a);
    }
}
