package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class siz {
    public static final entd a = entd.c("BugleVmt");
    public final ffbr b;
    public final ffbr c;
    public final Context d;
    public final ffhd e;
    public final ffhd f;
    public final ffhd g;
    public final errl h;
    public final sja i;
    public final PackageManager j;
    private final ffbz k;

    public siz(ffbr ffbrVar, ffbr ffbrVar2, Context context, ffhd ffhdVar, ffhd ffhdVar2, ffhd ffhdVar3, errl errlVar, sja sjaVar, PackageManager packageManager) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        context.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ffhdVar3.getClass();
        errlVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = context;
        this.e = ffhdVar;
        this.f = ffhdVar2;
        this.g = ffhdVar3;
        this.h = errlVar;
        this.i = sjaVar;
        this.j = packageManager;
        this.k = ffca.a(new ffix() { // from class: sik
            @Override // defpackage.ffix
            public final Object invoke() {
                cfup cfupVar = shv.a;
                return Boolean.valueOf(shv.a(siz.this.d));
            }
        });
    }

    public final Object a(Locale locale, ffgu ffguVar) {
        Object a2;
        return (((Optional) this.c.b()).isPresent() && (a2 = ffra.a(ekxi.a(this.g), new siy(null, this, locale), ffguVar)) == ffhh.a) ? a2 : ffcu.a;
    }

    public final boolean b() {
        return ((Boolean) this.k.a()).booleanValue();
    }
}
