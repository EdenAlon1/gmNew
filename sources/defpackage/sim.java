package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sim extends ffhv implements ffjm {
    final /* synthetic */ sip a;
    final /* synthetic */ Bundle b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sim(ffgu ffguVar, sip sipVar, Bundle bundle) {
        super(2, ffguVar);
        this.a = sipVar;
        this.b = bundle;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sim) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return sip.a(this.b, "com.google.recognition.extra.OFFLINE_PENDING_LANGUAGES", 3);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sim simVar = new sim(ffguVar, this.a, this.b);
        simVar.c = obj;
        return simVar;
    }
}
