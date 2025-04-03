package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawr extends ffhv implements ffjm {
    final /* synthetic */ LoadMessagesReceiver a;
    final /* synthetic */ fflb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawr(ffgu ffguVar, LoadMessagesReceiver loadMessagesReceiver, fflb fflbVar) {
        super(2, ffguVar);
        this.a = loadMessagesReceiver;
        this.b = fflbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dawr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        long e;
        ffci.b(obj);
        if (((Boolean) ayhv.a.e()).booleanValue()) {
            e = ((covs) this.a.f().b()).f(coto.e, (String) this.b.a);
        } else {
            e = ((covs) this.a.f().b()).e((String) this.b.a);
        }
        return new Long(e);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dawr dawrVar = new dawr(ffguVar, this.a, this.b);
        dawrVar.c = obj;
        return dawrVar;
    }
}
