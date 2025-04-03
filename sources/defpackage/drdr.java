package defpackage;

import com.google.android.apps.messaging.R;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drdr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drds b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drdr(drds drdsVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drdsVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drdr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                drds drdsVar = this.b;
                int i = this.c;
                this.a = 1;
                if (drdsVar.b(i, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (IOException unused) {
            drgb.bi(this.b, null, null, this.b.d.compareAndSet(false, true) ? new Integer(R.string.gif_screen_unable_to_show_trending_content) : null, null, null, 27);
        }
        this.b.bJ();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drdr(this.b, this.c, ffguVar);
    }
}
