package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bbhu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bbhv b;
    final /* synthetic */ UUID c;
    final /* synthetic */ Duration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbhu(bbhv bbhvVar, UUID uuid, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bbhvVar;
        this.c = uuid;
        this.d = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bbhu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bbhv bbhvVar = this.b;
            this.a = 1;
            obj = ffra.a(ekxi.a(bbhvVar.c), new bbht(null), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        int intValue = ((Number) obj).intValue();
        bbhv bbhvVar2 = this.b;
        UUID uuid = this.c;
        Duration duration = this.d;
        bbic bbicVar = bbhvVar2.a;
        axol.k(bbicVar.b, null, new bbhz(bbicVar, duration, uuid, intValue, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bbhu(this.b, this.c, this.d, ffguVar);
    }
}
