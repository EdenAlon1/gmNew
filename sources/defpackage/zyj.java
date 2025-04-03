package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyj extends ffhv implements ffjm {
    final /* synthetic */ zyq a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyj(ffgu ffguVar, zyq zyqVar) {
        super(2, ffguVar);
        this.a = zyqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zyj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        zyq zyqVar = this.a;
        MediaPlayer mediaPlayer = zyqVar.d;
        mediaPlayer.getClass();
        mediaPlayer.setDataSource(zyqVar.a, zyqVar.b);
        MediaPlayer mediaPlayer2 = this.a.d;
        mediaPlayer2.getClass();
        mediaPlayer2.prepare();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        zyj zyjVar = new zyj(ffguVar, this.a);
        zyjVar.b = obj;
        return zyjVar;
    }
}
