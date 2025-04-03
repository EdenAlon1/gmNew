package defpackage;

import android.content.ComponentName;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class snr extends ffhv implements ffjm {
    final /* synthetic */ sns a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snr(sns snsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = snsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((snr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        sns snsVar = this.a;
        ekzz f = eleg.f("MessagingTemplateScreenServiceEnabler#setComponentBasedOnPhenotypeFlag#scopeBody");
        try {
            ComponentName componentName = new ComponentName(snsVar.b, "com.google.android.apps.messaging.auto.MessagingTemplateScreenServiceModule");
            ((ensz) sns.a.f()).r("phenotype flag changed, setting component to new state %b", 1);
            snsVar.b.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new snr(this.a, ffguVar);
    }
}
