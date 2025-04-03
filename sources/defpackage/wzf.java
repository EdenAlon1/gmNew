package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzf extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ wzg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzf(wzg wzgVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wzgVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        wzf wzfVar = new wzf(this.c, (ffgu) obj3);
        wzfVar.a = (aaxe) obj;
        wzfVar.b = booleanValue;
        return wzfVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final aaxe aaxeVar = (aaxe) this.a;
        List list = aaxeVar.a;
        boolean z = this.b;
        if (list.size() != 1 || !wzh.d(((alxr) ffdx.T(aaxeVar.a)).g()) || z || !wzh.c((alxr) ffdx.T(aaxeVar.a))) {
            return null;
        }
        String string = this.c.a.getString(R.string.action_share);
        string.getClass();
        final wzg wzgVar = this.c;
        return new dlsr(string, null, false, true, false, false, null, false, null, new ffix() { // from class: wze
            @Override // defpackage.ffix
            public final Object invoke() {
                wzg.this.d((alxr) ffdx.T(aaxeVar.a));
                return ffcu.a;
            }
        }, 1014);
    }
}
