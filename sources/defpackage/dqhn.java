package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqhn extends ffhv implements ffjm {
    final /* synthetic */ dqhs a;
    final /* synthetic */ Uri b;
    final /* synthetic */ eepm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqhn(dqhs dqhsVar, Uri uri, eepm eepmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dqhsVar;
        this.b = uri;
        this.c = eepmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqhn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return eepn.a(this.a.g, this.b, "w", this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqhn(this.a, this.b, this.c, ffguVar);
    }
}
