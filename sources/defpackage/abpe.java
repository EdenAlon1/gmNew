package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpe extends ffhv implements ffjr {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ boolean e;
    /* synthetic */ boolean f;
    final /* synthetic */ abpg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abpe(abpg abpgVar, ffgu ffguVar) {
        super(7, ffguVar);
        this.g = abpgVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        int i = ((aotn) this.a).a + ((aotn) this.b).a + ((aotn) this.c).a + ((aotn) this.d).a;
        boolean z = this.e;
        boolean z2 = this.f;
        if (i <= 0 || !z2 || !z) {
            return null;
        }
        abpn abpnVar = this.g.d;
        axol.k(abpnVar.a, null, new abpm(abpnVar, null), 3);
        abpg abpgVar = this.g;
        String string = abpgVar.a.getString(R.string.tooltip_close_action);
        string.getClass();
        doqp doqpVar = new doqp(string, new abpf(abpgVar));
        String string2 = abpgVar.a.getString(R.string.cdp_education_tooltip_content);
        string2.getClass();
        engw r = engw.r(doqpVar);
        r.getClass();
        return new dorc(string2, r);
    }

    @Override // defpackage.ffjr
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        boolean booleanValue2 = ((Boolean) obj6).booleanValue();
        abpe abpeVar = new abpe(this.g, (ffgu) obj7);
        abpeVar.a = (aotn) obj;
        abpeVar.b = (aotn) obj2;
        abpeVar.c = (aotn) obj3;
        abpeVar.d = (aotn) obj4;
        abpeVar.e = booleanValue;
        abpeVar.f = booleanValue2;
        return abpeVar.b(ffcu.a);
    }
}
