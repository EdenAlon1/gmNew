package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dday {
    public final Context a;
    public final Executor b;
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;

    public dday(Context context, Executor executor, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = context;
        this.b = executor;
        this.c = ffbrVar;
        this.e = ffbrVar2;
        this.d = ffbrVar3;
    }

    public final void a(final String str, final epgr epgrVar) {
        cmao cmaoVar = (cmao) this.e.b();
        final clze clzeVar = clze.PROMO_BANNER;
        cmaoVar.d(str).h(new emwl() { // from class: clzp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = (engw) obj;
                return new clxo(cmao.b(engwVar), cmao.a(engwVar, clze.this));
            }
        }, cmaoVar.i).h(new emwl() { // from class: ddav
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cmam cmamVar = (cmam) obj;
                cmfb cmfbVar = (cmfb) dday.this.d.b();
                epgt epgtVar = epgt.PROVISIONING_UI_TYPE_PHONE_NUMBER_PROMO_BANNER;
                epgn epgnVar = (epgn) epgo.a.createBuilder();
                int a = cmamVar.a() + 1;
                epgnVar.copyOnWrite();
                epgo epgoVar = (epgo) epgnVar.instance;
                epgoVar.b |= 8;
                epgoVar.e = a;
                cmfbVar.g(epgtVar, epgrVar, 3, (epgo) epgnVar.build(), cmamVar.b() + 1, str);
                return null;
            }
        }, this.b).k(axnw.b(), erpp.a);
    }
}
