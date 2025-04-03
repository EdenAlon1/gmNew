package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqr implements fbba {
    public static eere a(Context context, ffbr ffbrVar) {
        ewnm ewnmVar;
        cskc cskcVar = caqq.a;
        String str = (String) cful.M.e();
        Locale f = kqt.a(context.getResources().getConfiguration()).f(0);
        eere eereVar = (eere) ffbrVar.b();
        try {
            ewnmVar = (ewnm) eyfy.parseFrom(ewnm.a, (byte[]) cful.N.e());
            if (ewnmVar.b.size() == 0) {
                caqq.a.r("StickerMarketConfig is empty!");
            }
        } catch (eygu e) {
            caqq.a.o("getStickerMarketConfig:", e);
            ewnmVar = ewnm.a;
        }
        eereVar.q(str, f, ewnmVar);
        csjb c = caqq.a.c();
        c.I("Providing ExpressiveStickerClient with metadata.");
        c.A(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, str);
        c.A("locale", f);
        c.r();
        eereVar.getClass();
        return eereVar;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
