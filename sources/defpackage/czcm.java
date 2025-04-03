package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czcm extends ffhv implements ffjs {
    int a;
    /* synthetic */ int b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;
    /* synthetic */ Object g;
    final /* synthetic */ czcv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czcm(czcv czcvVar, ffgu ffguVar) {
        super(8, ffguVar);
        this.h = czcvVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        final czcv czcvVar;
        List list;
        fbpo fbpoVar;
        List list2;
        fbpo fbpoVar2;
        Object f;
        List list3;
        ffhh ffhhVar = ffhh.a;
        if (this.a == 0) {
            ffci.b(obj);
            int i = this.b;
            aotn aotnVar = (aotn) this.c;
            Integer num = (Integer) this.d;
            final dlsr dlsrVar = (dlsr) this.e;
            Object obj2 = this.f;
            Object obj3 = this.g;
            ffnl k = ffno.k(ffno.i(ffno.i(ffdx.as(aotnVar.b), new ffji() { // from class: czcf
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    alyw alywVar = (alyw) obj4;
                    alywVar.getClass();
                    return ((alyg) alywVar).a;
                }
            }), new ffji() { // from class: czcg
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    return ((appq) obj4).e();
                }
            }), 10);
            final czcv czcvVar2 = this.h;
            engw b = engq.b(ffno.i(k, new ffji() { // from class: czch
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    final czcv czcvVar3 = czcv.this;
                    String string = czcvVar3.a.getString(R.string.shared_image);
                    final dlsr dlsrVar2 = dlsrVar;
                    return new dmiz((Uri) obj4, string, new ffix() { // from class: czcl
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dlsr.this.k.invoke();
                            ((cyuj) czcvVar3.e.b()).b();
                            return ffcu.a;
                        }
                    });
                }
            }));
            czcvVar = this.h;
            fffs fffsVar = new fffs((byte[]) null);
            if (aotnVar.a > 0) {
                String str = dlsrVar.a;
                dmzz dmzzVar = dlsrVar.b;
                dmzzVar.getClass();
                fffsVar.add(new czbs(new dnlz(str, null, null, null, new Integer(aotnVar.a), new dnlf(dmzzVar), new dnlf(dmzz.ah), new ffix() { // from class: czci
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dlsr.this.k.invoke();
                        ((cyuj) czcvVar.e.b()).b();
                        return ffcu.a;
                    }
                }, 14), new dmjg(b)));
            }
            if (i > 0 && obj2 != null) {
                String string = czcvVar.a.getString(R.string.videos_links_and_more);
                string.getClass();
                final dlsr dlsrVar2 = (dlsr) obj2;
                fffsVar.add(new czbs(new dnlz(string, null, null, null, null, new dnlf(dmzz.bR), new dnlf(dmzz.ah), new ffix() { // from class: czcj
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dlsr.this.k.invoke();
                        ((cyuj) czcvVar.e.b()).c();
                        return ffcu.a;
                    }
                }, 30)));
            }
            if (num.intValue() <= 0 || obj3 == null) {
                list = fffsVar;
                fbpoVar = null;
            } else {
                final dlsr dlsrVar3 = (dlsr) obj3;
                dmzz dmzzVar2 = dlsrVar3.b;
                dmzzVar2.getClass();
                list = fffsVar;
                fbpoVar = null;
                list.add(new czbs(new dnlz(dlsrVar3.a, null, null, null, num, new dnlf(dmzzVar2), new dnlf(dmzz.ah), new ffix() { // from class: czck
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dlsr.this.k.invoke();
                        ((cyuj) czcvVar.e.b()).d();
                        return ffcu.a;
                    }
                }, 14)));
            }
            if (czcvVar.b instanceof PenpalBotConversationId) {
                list.add(czcvVar.e());
                list.add(czcvVar.d());
                if (((Boolean) ((cfup) ctjd.aw.get()).e()).booleanValue()) {
                    if (czcvVar.f && ((Optional) czcvVar.c.b()).isPresent()) {
                        cjgc cjgcVar = (cjgc) ((Optional) czcvVar.c.b()).get();
                        this.c = czcvVar;
                        this.d = list;
                        this.e = list;
                        this.f = fbpoVar;
                        this.g = fbpoVar;
                        this.a = 1;
                        f = cjgcVar.f(this);
                        if (f == ffhhVar) {
                            return ffhhVar;
                        }
                        list3 = list;
                    } else {
                        list2 = list;
                        fbpoVar2 = fbpoVar;
                        list2.add(czcvVar.c(fbpoVar2));
                    }
                }
            }
            return new czcw(engq.a(ffdx.a(list)));
        }
        list3 = (List) this.e;
        list = (List) this.d;
        czcv czcvVar3 = (czcv) this.c;
        ffci.b(obj);
        czcvVar = czcvVar3;
        f = obj;
        fbpoVar2 = (fbpo) f;
        list2 = list3;
        list2.add(czcvVar.c(fbpoVar2));
        return new czcw(engq.a(ffdx.a(list)));
    }

    @Override // defpackage.ffjs
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int intValue = ((Number) obj).intValue();
        czcm czcmVar = new czcm(this.h, (ffgu) obj8);
        czcmVar.b = intValue;
        czcmVar.c = (aotn) obj2;
        czcmVar.d = (Integer) obj3;
        czcmVar.e = (dlsr) obj4;
        czcmVar.f = (dlsr) obj5;
        czcmVar.g = (dlsr) obj6;
        return czcmVar.b(ffcu.a);
    }
}
