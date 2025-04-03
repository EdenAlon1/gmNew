package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawt extends ffhv implements ffjm {
    final /* synthetic */ LoadMessagesReceiver a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawt(ffgu ffguVar, LoadMessagesReceiver loadMessagesReceiver, String str) {
        super(2, ffguVar);
        this.a = loadMessagesReceiver;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dawt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new Long(((covs) this.a.f().b()).f(coto.e, this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dawt dawtVar = new dawt(ffguVar, this.a, this.b);
        dawtVar.c = obj;
        return dawtVar;
    }
}
