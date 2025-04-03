package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wuv extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ wuy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuv(wuy wuyVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wuyVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        wuv wuvVar = new wuv(this.c, (ffgu) obj3);
        wuvVar.a = (aaxe) obj;
        wuvVar.b = booleanValue;
        return wuvVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final aaxe aaxeVar = (aaxe) this.a;
        List list = aaxeVar.a;
        boolean z = this.b;
        if (list.size() != 1 || z) {
            return null;
        }
        String string = this.c.a.getString(R.string.message_context_menu_view_details);
        string.getClass();
        final wuy wuyVar = this.c;
        return new dlsr(string, null, false, true, true, false, null, false, null, new ffix() { // from class: wuu
            @Override // defpackage.ffix
            public final Object invoke() {
                wuy.this.c((alxr) ffdx.T(aaxeVar.a));
                return ffcu.a;
            }
        }, 998);
    }
}
