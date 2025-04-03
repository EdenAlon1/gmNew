package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvvf extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cvvj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvvf(cvvj cvvjVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = cvvjVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvvf cvvfVar = new cvvf(this.c, (ffgu) obj3);
        cvvfVar.a = (aixr) obj;
        cvvfVar.b = (cwir) obj2;
        return cvvfVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        List list = obj2 != null ? ((aixr) obj2).b : null;
        if (list == null || list.contains(aixs.c) || list.contains(aixs.d) || list.contains(aixs.e) || list.contains(aixs.f)) {
            return null;
        }
        if (!((Boolean) ((cfup) ctjd.aF.get()).e()).booleanValue() && ((cwir) obj3).d.a()) {
            return null;
        }
        String s = ((cjdk) this.c.d.b()).s();
        String string = this.c.a.getString(R.string.penpal_row_subtitle);
        string.getClass();
        dnyo dnyoVar = new dnyo(new dnwn(((cjdk) this.c.d.b()).c(), null, null, null, null, 30), null, 0, null, 0.0f, null, 62);
        final cvvj cvvjVar = this.c;
        final cwir cwirVar = (cwir) obj3;
        return new cvvl(s, string, dnyoVar, new ffix() { // from class: cvve
            @Override // defpackage.ffix
            public final Object invoke() {
                cvvj cvvjVar2 = cvvj.this;
                cwir cwirVar2 = cwirVar;
                ekzm b = cvvjVar2.f.b("PenpalRowUiAdapterImpl#onClick");
                try {
                    axol.k(cvvjVar2.c, cvvjVar2.b, new cvvg(cvvjVar2, cwirVar2, null), 2);
                    ajgd ajgdVar = (ajgd) cvvjVar2.g.b();
                    eqbx eqbxVar = (eqbx) eqbz.a.createBuilder();
                    eqbxVar.getClass();
                    eqvn.b(3, eqbxVar);
                    ajgdVar.a(eqvn.a(eqbxVar));
                    ffig.a(b, null);
                    return ffcu.a;
                } finally {
                }
            }
        });
    }
}
