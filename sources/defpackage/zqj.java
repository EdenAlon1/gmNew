package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqj implements zpi {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl");
    public final Context b;
    public final ffbr c;
    public final cuxh d;
    public final ajjc e;
    public final atfm f;
    public final fgdj g;
    public final abjk h;
    public final fgdj i;
    public final fgdj j;
    public final fgdj k;
    private final ffxx l;
    private final ffbr m;
    private final ffbr n;
    private final aufx o;
    private final fgdj p;

    /* JADX WARN: Type inference failed for: r7v10, types: [ajmc, java.lang.Object] */
    public zqj(Context context, ffsk ffskVar, ffxx ffxxVar, ffxx ffxxVar2, ffxx ffxxVar3, ffxx ffxxVar4, ffxx ffxxVar5, ffxx ffxxVar6, ffbr ffbrVar, aaxk aaxkVar, ydb ydbVar, Optional optional, ffbr ffbrVar2, cuxh cuxhVar, ajjc ajjcVar, ffbr ffbrVar3, aufx aufxVar, atfm atfmVar) {
        context.getClass();
        ffskVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffxxVar5.getClass();
        ffxxVar6.getClass();
        ffbrVar.getClass();
        aaxkVar.getClass();
        ydbVar.getClass();
        cuxhVar.getClass();
        ajjcVar.getClass();
        this.b = context;
        this.l = ffxxVar6;
        this.m = ffbrVar;
        this.c = ffbrVar2;
        this.d = cuxhVar;
        this.e = ajjcVar;
        this.n = ffbrVar3;
        this.o = aufxVar;
        this.f = atfmVar;
        zpm zpmVar = new zpm(ffxxVar, this, ffskVar, ffxxVar);
        int i = fgcz.a;
        this.g = fgbn.b(zpmVar, ffskVar, fgcy.a, null);
        this.h = aufxVar.a() ? abjk.a : null;
        fgdj a2 = (((Boolean) ((cfup) ctjd.bD.get()).e()).booleanValue() && ((Optional) ffbrVar.b()).isPresent()) ? ((yzu) ((Optional) ffbrVar.b()).get()).a() : fgdm.a(false);
        this.p = a2;
        this.i = (((Boolean) ctjd.bo.e()).booleanValue() || ((Boolean) ctjd.bp.e()).booleanValue()) ? ((Boolean) ((cfup) ctjd.by.get()).e()).booleanValue() ? fgbn.b(fgck.c(ffxxVar5, ffyy.a(new zpp(ydbVar.a)), ffxxVar4, ((xie) ffbrVar3.b()).b(), a2, new zpz(this, aaxkVar, null)), ffskVar, fgcy.a, null) : fgbn.b(fgck.c(ffxxVar2, ffyy.a(new zps(ydbVar.a)), ffxxVar3, ((xie) ffbrVar3.b()).b(), a2, new zqa(this, aaxkVar, null)), ffskVar, fgcy.a, null) : ((Boolean) ((cfup) ctjd.by.get()).e()).booleanValue() ? fgbn.b(fgck.a(ffxxVar5, ffyy.a(new zpv(ydbVar.a)), a2, new zqb(this, aaxkVar, null)), ffskVar, fgcy.a, null) : fgbn.b(fgck.a(ffxxVar2, ffyy.a(new zpy(ydbVar.a)), a2, new zqc(this, aaxkVar, null)), ffskVar, fgcy.a, null);
        optional.isPresent();
        this.j = optional.get().a();
        this.k = fgbn.b(ffxxVar6, ffskVar, fgcy.a, false);
    }

    public final abet a(engw engwVar, final ajiy ajiyVar, final ffix ffixVar) {
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            alxc alxcVar = (alxc) it.next();
            dnyo dnyoVar = new dnyo(((crpw) this.c.b()).c(alxcVar.a()), null, 0, null, 0.0f, null, 62);
            String x = alxcVar.a().x(true);
            x.getClass();
            arrayList.add(new dngp(dnyoVar, x, null, null, null, null, 124));
        }
        return new abet(arrayList, new ffix() { // from class: zpj
            @Override // defpackage.ffix
            public final Object invoke() {
                ((ffud) ffix.this.invoke()).t(null);
                ajiyVar.a();
                return ffcu.a;
            }
        });
    }
}
