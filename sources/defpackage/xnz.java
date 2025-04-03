package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xnz extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ xoa e;
    final /* synthetic */ xmq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnz(xoa xoaVar, xmq xmqVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = xoaVar;
        this.f = xmqVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        xrb xrbVar = (xrb) this.c;
        ffix ffixVar = xrbVar.b;
        dmzz dmzzVar = xrbVar.a;
        boolean z = this.d;
        dmzz a = this.e.a();
        fffs fffsVar = new fffs((byte[]) null);
        xoa xoaVar = this.e;
        if (xoaVar.d.a() && (((dste) obj3).a instanceof dsum) && z) {
            String string = xoaVar.a.getString(R.string.tune_button_content_description);
            string.getClass();
            fffsVar.add(new dsrv(dmzzVar, string, ffixVar));
        }
        xmq xmqVar = this.f;
        Context context = xoaVar.a;
        dmzz dmzzVar2 = dmzz.e;
        String string2 = context.getString(R.string.show_camera_button_content_description);
        string2.getClass();
        fffsVar.add(new dsrv(dmzzVar2, string2, xmqVar.a));
        return new xob((String) obj2, a, ffdx.a(fffsVar));
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        xnz xnzVar = new xnz(this.e, this.f, (ffgu) obj5);
        xnzVar.a = (String) obj;
        xnzVar.b = (dste) obj2;
        xnzVar.c = (xrb) obj3;
        xnzVar.d = booleanValue;
        return xnzVar.b(ffcu.a);
    }
}
