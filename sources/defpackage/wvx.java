package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wvx extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ Context c;
    final /* synthetic */ wwb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvx(Context context, wwb wwbVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = context;
        this.d = wwbVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        wvx wvxVar = new wvx(this.c, this.d, (ffgu) obj3);
        wvxVar.a = booleanValue;
        wvxVar.b = (aaxe) obj2;
        return wvxVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        final aaxe aaxeVar = (aaxe) this.b;
        if (aaxeVar.a.size() != 1 || !((alxr) ffdx.T(aaxeVar.a)).t()) {
            return null;
        }
        String string = this.c.getString(R.string.message_context_menu_forward_message);
        string.getClass();
        dmzz dmzzVar = z ? dmzz.bk : null;
        boolean z2 = !z;
        final wwb wwbVar = this.d;
        return new dlsr(string, dmzzVar, false, z2, true, false, null, false, null, new ffix() { // from class: wvw
            @Override // defpackage.ffix
            public final Object invoke() {
                wwb.this.c((alxr) ffdx.T(aaxeVar.a));
                return ffcu.a;
            }
        }, 996);
    }
}
