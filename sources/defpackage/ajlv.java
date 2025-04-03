package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.welcome.v1.SignedInWelcomeActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajlv extends ffhv implements ffjm {
    final /* synthetic */ ajlw a;
    final /* synthetic */ ea b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajlv(ajlw ajlwVar, ea eaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ajlwVar;
        this.b = eaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajlv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((dekv) this.a.e.b()).a(cvjl.WELCOME_FLOW_SETTINGS);
        Intent intent = new Intent(this.b.A(), (Class<?>) SignedInWelcomeActivity.class);
        eiuy.c(intent, this.a.b);
        intent.putExtra("INTENT_EXTRA_WELCOME_FLOW_TRIGGER_SOURCE", cvjl.WELCOME_FLOW_SETTINGS.g);
        elhh.a(this.b, intent);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajlv(this.a, this.b, ffguVar);
    }
}
