package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cakq extends ffhv implements ffjm {
    final /* synthetic */ cakw a;
    final /* synthetic */ List b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cakq(ffgu ffguVar, cakw cakwVar, List list) {
        super(2, ffguVar);
        this.a = cakwVar;
        this.b = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cakq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!ekxi.b(u())) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        ekzz f = eleg.f("E2eeInfoDataSource#getFreshRemoteInstances");
        try {
            engw d = ((chef) this.a.c.b()).d(engq.a(this.b));
            ffig.a(f, null);
            return d;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cakq cakqVar = new cakq(ffguVar, this.a, this.b);
        cakqVar.c = obj;
        return cakqVar;
    }
}
