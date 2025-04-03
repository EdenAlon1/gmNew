package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wul extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public wul(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wul wulVar = new wul((ffgu) obj3);
        wulVar.a = (Recipient) obj;
        wulVar.b = (cyxc) obj2;
        return wulVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        if (obj2 == null || obj3 == cyxc.a) {
            return null;
        }
        return obj2;
    }
}
