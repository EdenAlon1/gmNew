package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqt extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ zqu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqt(zqu zquVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = zquVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zqt zqtVar = new zqt(this.c, (ffgu) obj3);
        zqtVar.a = (alxj) obj;
        zqtVar.b = (Optional) obj2;
        return zqtVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Uri a;
        ffci.b(obj);
        ?? r13 = this.a;
        final Optional optional = (Optional) this.b;
        if (optional.isEmpty() || (a = r13.a()) == null) {
            return null;
        }
        dnyo dnyoVar = new dnyo(new dnwn(a, null, null, (((aqmo) optional.get()).e() == null || ((aqmo) optional.get()).d() == null) ? dnwk.a : dnwk.b, null, 22), null, 0, null, 0.0f, null, 62);
        String c = ((aqmo) optional.get()).c();
        final zqu zquVar = this.c;
        return new dobh(dnyoVar, c, new ffix() { // from class: zqr
            @Override // defpackage.ffix
            public final Object invoke() {
                zqu zquVar2 = zqu.this;
                axol.k(zquVar2.a, null, new zqs(zquVar2, optional, null), 3);
                return ffcu.a;
            }
        });
    }
}
