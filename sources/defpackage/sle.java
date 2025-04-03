package defpackage;

import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sle extends ffhv implements ffjm {
    int a;
    final /* synthetic */ slf b;
    final /* synthetic */ ParcelFileDescriptor c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sle(slf slfVar, ParcelFileDescriptor parcelFileDescriptor, int i, int i2, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = slfVar;
        this.c = parcelFileDescriptor;
        this.d = i;
        this.e = i2;
        this.f = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sle) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxe ffxeVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        if (i == 0) {
            ffci.b(obj);
            ffxeVar = (ffxe) this.g;
            slf slfVar = this.b;
            ffwm a = ffwp.a(-2, 0, 6);
            axol.k(ffxeVar, slfVar.c, new slc(a, ffxeVar, null), 2);
            slf slfVar2 = this.b;
            ParcelFileDescriptor parcelFileDescriptor = this.c;
            int i2 = this.d;
            int i3 = this.e;
            String str = this.f;
            ffhd a2 = ekxi.a(slfVar2.b);
            sld sldVar = new sld(null, slfVar2, a, parcelFileDescriptor, i2, i3, str);
            this.g = ffxeVar;
            this.a = 1;
            if (ffra.a(a2, sldVar, this) == ffhhVar) {
                return ffhhVar;
            }
        } else {
            if (i != 1) {
                ffci.b(obj);
                return ffcu.a;
            }
            ffxeVar = (ffxe) this.g;
            ffci.b(obj);
        }
        this.g = null;
        this.a = 2;
        if (ffxd.b(ffxeVar, new ffix() { // from class: ffxa
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, this) == ffhhVar) {
            return ffhhVar;
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sle sleVar = new sle(this.b, this.c, this.d, this.e, this.f, ffguVar);
        sleVar.g = obj;
        return sleVar;
    }
}
