package defpackage;

import android.media.MediaMetadataRetriever;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drqj extends ffhv implements ffjm {
    final /* synthetic */ ffji a;
    final /* synthetic */ drqk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drqj(ffji ffjiVar, drqk drqkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ffjiVar;
        this.b = drqkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drqj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.a.invoke(mediaMetadataRetriever);
        try {
            return this.b.a(mediaMetadataRetriever);
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drqj(this.a, this.b, ffguVar);
    }
}
