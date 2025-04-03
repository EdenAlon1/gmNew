package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaff extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aafh b;
    final /* synthetic */ alxr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaff(aafh aafhVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aafhVar;
        this.c = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaff) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ((cydc) this.b.f.b()).b();
            aafh aafhVar = this.b;
            this.a = 1;
            obj = aafhVar.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        final aafh aafhVar2 = this.b;
        final alxr alxrVar = this.c;
        final String str = (String) obj;
        aafhVar2.e.b(new ffji() { // from class: aafe
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                String str2 = str;
                final aafh aafhVar3 = aafhVar2;
                String str3 = aafhVar3.g;
                final ajiy ajiyVar = (ajiy) obj2;
                List b = ffdx.b(new dltp("https://support.google.com/messages/?p=premium_sms", ffpc.Q(str2, str3, 0, false, 6), ffpc.Q(str2, str3, 0, false, 6) + str3.length(), new ffji() { // from class: aafb
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        aafh aafhVar4 = aafh.this;
                        ((cydc) aafhVar4.f.b()).d();
                        Uri parse = Uri.parse("https://support.google.com/messages/?p=premium_sms");
                        parse.getClass();
                        aafhVar4.d.h(new aile(parse));
                        return true;
                    }
                }, 24));
                ffix ffixVar = new ffix() { // from class: aafc
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aafh aafhVar4 = aafh.this;
                        ((cydc) aafhVar4.f.b()).e();
                        aafhVar4.d.h(new aimi());
                        ajiyVar.a();
                        return ffcu.a;
                    }
                };
                final alxr alxrVar2 = alxrVar;
                return new abfq(new ffix() { // from class: aaez
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ((cydc) aafh.this.f.b()).a();
                        return ffcu.a;
                    }
                }, str2, b, ffixVar, new ffix() { // from class: aafa
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aafh aafhVar4 = aafh.this;
                        axol.k(aafhVar4.a, aafhVar4.b, new aafg(aafhVar4, alxrVar2, null), 2);
                        ajiyVar.a();
                        return ffcu.a;
                    }
                });
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaff(this.b, this.c, ffguVar);
    }
}
