package defpackage;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqsc extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ Context c;
    final /* synthetic */ Locale d;
    final /* synthetic */ boolean e;
    final /* synthetic */ dqse f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqsc(Context context, Locale locale, boolean z, dqse dqseVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = context;
        this.d = locale;
        this.e = z;
        this.f = dqseVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqsc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            Context context = this.c;
            Locale locale = this.d;
            context.getClass();
            locale.getClass();
            File file = new File(new File(String.valueOf(context.getCacheDir().getPath()).concat("/emoji/search"), dqks.a(locale)), "model");
            File file2 = true != file.isDirectory() ? null : file;
            if (file2 != null) {
                file2.delete();
            }
            if (!file.exists()) {
                if (this.e) {
                    Context context2 = this.c;
                    Locale locale2 = this.d;
                    InputStream open = context2.getAssets().open("emoji_search_" + dqks.a(locale2) + ".zip");
                    try {
                        open.getClass();
                        dqse.c(open, file, locale2);
                        ffig.a(open, null);
                    } finally {
                    }
                } else {
                    dqse dqseVar = this.f;
                    dqrv dqrvVar = dqseVar.a;
                    if (dqrvVar != null) {
                        Locale locale3 = this.d;
                        this.a = file;
                        this.b = 1;
                        if (dqseVar.a(dqrvVar, locale3, file, this) == ffhhVar) {
                            return ffhhVar;
                        }
                    }
                }
            }
            obj2 = file;
        }
        if (((File) obj2).exists()) {
            return obj2;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqsc(this.c, this.d, this.e, this.f, ffguVar);
    }
}
