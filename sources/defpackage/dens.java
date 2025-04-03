package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dens extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ deny c;
    final /* synthetic */ cvjl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dens(deny denyVar, cvjl cvjlVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = denyVar;
        this.d = cvjlVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dens densVar = new dens(this.c, this.d, (ffgu) obj3);
        densVar.a = (dekh) obj;
        densVar.b = (cjtw) obj2;
        return densVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        boolean z = obj2 instanceof deke;
        Object obj3 = this.b;
        if (z || (obj2 instanceof dekf)) {
            return null;
        }
        if (!(obj2 instanceof dekg)) {
            throw new ffcd();
        }
        deny denyVar = this.c;
        String string = denyVar.a.getString(this.d.ordinal() != 2 ? ((avdh) denyVar.o.b()).a() ? R.string.welcome_customization_title_v2 : R.string.welcome_customization_title : R.string.welcome_new_user_title);
        string.getClass();
        deny denyVar2 = this.c;
        String string2 = this.d.ordinal() == 2 ? ((avdh) denyVar2.o.b()).a() ? denyVar2.a.getString(R.string.welcome_customization_title_v2) : denyVar2.a.getString(R.string.welcome_customization_title) : null;
        String c = this.c.c((cjtw) obj3);
        final deny denyVar3 = this.c;
        final cvjl cvjlVar = this.d;
        final fgcm a = fgdm.a(false);
        return new deng(string, string2, c, new dend(ffdx.g(new demy(denyVar3.c(cjtw.SHARE_TO_EVERYONE), new ffix() { // from class: denj
            @Override // defpackage.ffix
            public final Object invoke() {
                deny.this.d(cjtw.SHARE_TO_EVERYONE, cvjlVar);
                a.f(false);
                return ffcu.a;
            }
        }), new demy(denyVar3.c(cjtw.SHARE_TO_CONTACTS_ONLY), new ffix() { // from class: denk
            @Override // defpackage.ffix
            public final Object invoke() {
                deny.this.d(cjtw.SHARE_TO_CONTACTS_ONLY, cvjlVar);
                a.f(false);
                return ffcu.a;
            }
        }), new demy(denyVar3.c(cjtw.SHARE_TO_NO_ONE), new ffix() { // from class: denl
            @Override // defpackage.ffix
            public final Object invoke() {
                deny.this.d(cjtw.SHARE_TO_NO_ONE, cvjlVar);
                a.f(false);
                return ffcu.a;
            }
        })), a, new ffji() { // from class: denm
            @Override // defpackage.ffji
            public final Object invoke(Object obj4) {
                Boolean bool = (Boolean) obj4;
                bool.booleanValue();
                fgcm.this.f(bool);
                return ffcu.a;
            }
        }), new denq(this.c.c.b()), new denr(this.c.c.b()), new denf(((avdj) this.c.m.b()).a(), ((avdk) this.c.n.b()).a()), ((avcs) this.c.p.b()).a() ? this.d : cvjl.WELCOME_FLOW_UNSPECIFIED);
    }
}
