package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dms extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dmt b;
    final /* synthetic */ dva c;
    final /* synthetic */ dmk d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dms(dmt dmtVar, dva dvaVar, dmk dmkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dmtVar;
        this.c = dvaVar;
        this.d = dmkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dms) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        CancellationException cancellationException = null;
        try {
            try {
                if (this.a != 0) {
                    ffci.b(obj);
                } else {
                    ffci.b(obj);
                    ffud c = ffui.c(((ffsk) this.e).hT());
                    dmt dmtVar = this.b;
                    dmtVar.j = true;
                    dsp dspVar = dmtVar.b;
                    dhy dhyVar = dhy.a;
                    dmr dmrVar = new dmr(this.c, dmtVar, this.d, c, null);
                    this.a = 1;
                    if (dspVar.i(dhyVar, dmrVar, this) == ffhhVar) {
                        return ffhhVar;
                    }
                }
                dmg dmgVar = this.b.e;
                ffmj q = ffmk.q(0, dmgVar.a.b);
                int i = q.a;
                int i2 = q.b;
                if (i <= i2) {
                    while (true) {
                        ((dmo) dmgVar.a.a[i]).b.w(ffcu.a);
                        if (i == i2) {
                            break;
                        }
                        i++;
                    }
                }
                dmgVar.a.g();
                dmt dmtVar2 = this.b;
                dmtVar2.j = false;
                dmtVar2.e.a(null);
                this.b.g = false;
                return ffcu.a;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            dmt dmtVar3 = this.b;
            dmtVar3.j = false;
            dmtVar3.e.a(cancellationException);
            this.b.g = false;
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dms dmsVar = new dms(this.b, this.c, this.d, ffguVar);
        dmsVar.e = obj;
        return dmsVar;
    }
}
