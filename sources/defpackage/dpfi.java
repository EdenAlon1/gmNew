package defpackage;

import j$.time.Instant;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpfi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpfm b;
    final /* synthetic */ Instant c;
    final /* synthetic */ ByteBuffer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfi(dpfm dpfmVar, Instant instant, ByteBuffer byteBuffer, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpfmVar;
        this.c = instant;
        this.d = byteBuffer;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpfi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpfm dpfmVar = this.b;
            dpde dpdeVar = new dpde(this.c, this.d.slice());
            this.a = 1;
            if (dpfmVar.d.fQ(dpdeVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpfi(this.b, this.c, this.d, ffguVar);
    }
}
