package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsuo extends ffhv implements ffjm {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ dsuq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsuo(dsuq dsuqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = dsuqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((dsuo) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        ExoPlayer exoPlayer;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            z = this.c;
            Object obj2 = this.a;
            ffci.b(obj);
            exoPlayer = obj2;
        } else {
            ffci.b(obj);
            z = this.c;
            exoPlayer = this.d.h;
        }
        while (z && exoPlayer != null) {
            dsuq dsuqVar = this.d;
            dsuqVar.e.f(new Long(exoPlayer.y()));
            this.a = exoPlayer;
            this.c = true;
            this.b = 1;
            if (ffsw.c(100L, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dsuo dsuoVar = new dsuo(this.d, ffguVar);
        dsuoVar.c = ((Boolean) obj).booleanValue();
        return dsuoVar;
    }
}
