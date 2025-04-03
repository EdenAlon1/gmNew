package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czce extends ffhv implements ffiy {
    /* synthetic */ int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;
    /* synthetic */ boolean g;
    /* synthetic */ Object h;
    final /* synthetic */ czcv i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czce(czcv czcvVar, ffgu ffguVar) {
        super(10, ffguVar);
        this.i = czcvVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        int i;
        ffci.b(obj);
        int i2 = this.a;
        aotn aotnVar = (aotn) this.b;
        engw engwVar = aotnVar.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.f;
        boolean z = this.g;
        Object obj6 = this.h;
        ffnl k = ffno.k(ffno.i(ffno.i(ffdx.as(engwVar), new ffji() { // from class: czbx
            @Override // defpackage.ffji
            public final Object invoke(Object obj7) {
                alyw alywVar = (alyw) obj7;
                alywVar.getClass();
                return ((alyg) alywVar).a;
            }
        }), new ffji() { // from class: czby
            @Override // defpackage.ffji
            public final Object invoke(Object obj7) {
                return ((appq) obj7).e();
            }
        }), 10);
        final czcv czcvVar = this.i;
        final dlsr dlsrVar = (dlsr) obj3;
        engw b = engq.b(ffno.i(k, new ffji() { // from class: czbz
            @Override // defpackage.ffji
            public final Object invoke(Object obj7) {
                final czcv czcvVar2 = czcv.this;
                String string = czcvVar2.a.getString(R.string.shared_image);
                final dlsr dlsrVar2 = dlsrVar;
                return new dmiz((Uri) obj7, string, new ffix() { // from class: czcd
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dlsr.this.k.invoke();
                        ((cyuj) czcvVar2.e.b()).b();
                        return ffcu.a;
                    }
                });
            }
        }));
        fffs fffsVar = new fffs((byte[]) null);
        int i3 = aotnVar.a;
        final czcv czcvVar2 = this.i;
        if (i3 > 0) {
            String str = dlsrVar.a;
            dmzz dmzzVar = dlsrVar.b;
            dmzzVar.getClass();
            i = i2;
            fffsVar.add(new czbs(new dnlz(str, null, null, null, new Integer(aotnVar.a), new dnlf(dmzzVar), new dnlf(dmzz.ah), new ffix() { // from class: czca
                @Override // defpackage.ffix
                public final Object invoke() {
                    dlsr.this.k.invoke();
                    ((cyuj) czcvVar2.e.b()).b();
                    return ffcu.a;
                }
            }, 14), new dmjg(b)));
        } else {
            i = i2;
        }
        if (i > 0 && obj4 != null) {
            String string = czcvVar2.a.getString(R.string.videos_links_and_more);
            string.getClass();
            final dlsr dlsrVar2 = (dlsr) obj4;
            fffsVar.add(new czbs(new dnlz(string, null, null, null, null, new dnlf(dmzz.bR), new dnlf(dmzz.ah), new ffix() { // from class: czcb
                @Override // defpackage.ffix
                public final Object invoke() {
                    dlsr.this.k.invoke();
                    ((cyuj) czcvVar2.e.b()).c();
                    return ffcu.a;
                }
            }, 30)));
        }
        Integer num = (Integer) obj2;
        if (num.intValue() > 0 && obj5 != null) {
            final dlsr dlsrVar3 = (dlsr) obj5;
            dmzz dmzzVar2 = dlsrVar3.b;
            dmzzVar2.getClass();
            fffsVar.add(new czbs(new dnlz(dlsrVar3.a, null, null, null, num, new dnlf(dmzzVar2), new dnlf(dmzz.ah), new ffix() { // from class: czcc
                @Override // defpackage.ffix
                public final Object invoke() {
                    dlsr.this.k.invoke();
                    ((cyuj) czcvVar2.e.b()).d();
                    return ffcu.a;
                }
            }, 14)));
        }
        if (z) {
            fffsVar.add(czcvVar2.e());
            fffsVar.add(czcvVar2.d());
            if (((Boolean) ((cfup) ctjd.aw.get()).e()).booleanValue()) {
                fffsVar.add(czcvVar2.c((fbpo) obj6));
            }
        }
        return new czcw(engq.a(ffdx.a(fffsVar)));
    }

    @Override // defpackage.ffiy
    public final /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj7).booleanValue();
        czce czceVar = new czce(this.i, (ffgu) obj10);
        czceVar.a = intValue;
        czceVar.b = (aotn) obj2;
        czceVar.c = (Integer) obj3;
        czceVar.d = (dlsr) obj4;
        czceVar.e = (dlsr) obj5;
        czceVar.f = (dlsr) obj6;
        czceVar.g = booleanValue;
        czceVar.h = (fbpo) obj8;
        return czceVar.b(ffcu.a);
    }
}
