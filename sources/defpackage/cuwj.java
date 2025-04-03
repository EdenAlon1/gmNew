package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuwj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuwp b;
    final /* synthetic */ String c;
    final /* synthetic */ Map d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuwj(ffgu ffguVar, cuwp cuwpVar, String str, Map map) {
        super(2, ffguVar);
        this.b = cuwpVar;
        this.c = str;
        this.d = map;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuwj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
                return obj;
            }
            ffci.b(obj);
            ListenableFuture a = kfg.a(new cuwl(this.b, this.c, this.d));
            this.a = 1;
            Object c = fgfz.c(a, this);
            return c == ffhhVar ? ffhhVar : c;
        } catch (Throwable th) {
            ensk i = cuwp.a.i();
            i.Y(ente.a, "BugleSpam");
            ((enrr) ((enrr) i).g(th).h("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamGrpcProxyImpl$getDroidGuardResultsHelper$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 100, "TachyonSpamGrpcProxyImpl.kt")).q("TachyonSpamGrpcProxyImpl#getDroidGuardResults: Failed to get DroidGuard results. If you're seeing this in a test, please include `shadows = ShadowDroidGuardClient.class` in your test-class configuration, or include a module which provides a TachyonSpamGrpcProxyFake, rather than this impl. Failing to do either will cause flakes because TestingTaskBarrier does not know how to await for CallbackToFutureAdapter. https://groups.google.com/a/google.com/g/tiktok-users/c/HYrD36zsxt4/m/NbCeXn__AwAJ");
            return null;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuwj cuwjVar = new cuwj(ffguVar, this.b, this.c, this.d);
        cuwjVar.e = obj;
        return cuwjVar;
    }
}
