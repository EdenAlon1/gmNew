package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.messaging.ui.debug.workqueue.pwqui.PwqDebugUiActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbns extends ffhv implements ffjm {
    final /* synthetic */ dbnz a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbns(dbnz dbnzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dbnzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbns) c((dbiq) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Activity activity = ((dbiq) this.b).a;
        eldl.p(activity, new Intent(activity, (Class<?>) PwqDebugUiActivity.class));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbns dbnsVar = new dbns(this.a, ffguVar);
        dbnsVar.b = obj;
        return dbnsVar;
    }
}
