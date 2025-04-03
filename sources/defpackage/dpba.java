package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpba extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpbd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpba(dpbd dpbdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpbdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpba) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpbd dpbdVar = this.b;
            this.a = 1;
            obj = dpbdVar.b(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        int intValue = ((Number) obj).intValue();
        MediaCodec mediaCodec = this.b.e;
        if (mediaCodec == null) {
            ffkj.c("mediaCodec");
            mediaCodec = null;
        }
        mediaCodec.queueInputBuffer(intValue, 0, 0, this.b.a(), 4);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpba(this.b, ffguVar);
    }
}
