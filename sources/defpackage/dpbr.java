package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpbr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpbu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpbr(dpbu dpbuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpbuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpbr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpbu dpbuVar = this.b;
            this.a = 1;
            obj = dpbuVar.b(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        int intValue = ((Number) obj).intValue();
        MediaCodec mediaCodec = this.b.d;
        if (mediaCodec == null) {
            ffkj.c("mediaCodec");
            mediaCodec = null;
        }
        mediaCodec.queueInputBuffer(intValue, 0, 0, this.b.a(), 4);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpbr(this.b, ffguVar);
    }
}
