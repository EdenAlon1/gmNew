package defpackage;

import android.content.Context;
import android.os.Build;
import android.security.advancedprotection.AdvancedProtectionManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufj extends ffhv implements ffjm {
    final /* synthetic */ cufk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cufj(cufk cufkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cufkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cufj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean b = ekxi.b(u());
        final cufk cufkVar = this.a;
        if (!b) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        ekzz f = eleg.f("AapmManager.registerCallback");
        try {
            Context context = cufkVar.a;
            errl errlVar = cufkVar.c;
            final ffji ffjiVar = new ffji() { // from class: cufh
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    cufk cufkVar2 = cufk.this;
                    axol.m(cufkVar2.d, new cufi(cufkVar2, booleanValue, null));
                    return ffcu.a;
                }
            };
            if (Build.VERSION.SDK_INT >= 36) {
                Object systemService = context.getSystemService("advanced_protection");
                systemService.getClass();
                ((AdvancedProtectionManager) systemService).registerAdvancedProtectionCallback(errlVar, new AdvancedProtectionManager.Callback() { // from class: cufl
                    public final void onAdvancedProtectionChanged(boolean z) {
                        ffji.this.invoke(Boolean.valueOf(z));
                    }
                });
            }
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cufj(this.a, ffguVar);
    }
}
