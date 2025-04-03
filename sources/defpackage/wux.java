package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wux extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wuy b;
    final /* synthetic */ alxr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wux(wuy wuyVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wuyVar;
        this.c = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wux) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl m = this.c.m();
            this.a = 1;
            obj = fgfz.c(m, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        wuy wuyVar = this.b;
        String str = (String) obj;
        String string = wuyVar.a.getString(R.string.message_details_popup_title);
        str.getClass();
        String string2 = this.b.a.getString(R.string.close_button_text);
        string2.getClass();
        wuyVar.b.c(new dmve(str, null, null, string, true, false, new doas(string2, new ffix() { // from class: wuw
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }), null, null, 422), true);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wux(this.b, this.c, ffguVar);
    }
}
