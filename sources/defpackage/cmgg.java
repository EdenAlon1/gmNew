package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmgg implements cmfj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcsdata/carriertos/CarrierTosDataServiceImpl");
    public static final ejui b = new ejtz("explicit_carrier_tos_data_source_key");
    public final comc c;
    public final ffsk d;
    public final ffhd e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final aune i;
    private final Context j;
    private final ffbr k;
    private final ffbr l;

    public cmgg(Context context, comc comcVar, ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, aune auneVar) {
        context.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.j = context;
        this.c = comcVar;
        this.d = ffskVar;
        this.e = ffhdVar;
        this.f = ffbrVar;
        this.k = ffbrVar2;
        this.g = ffbrVar3;
        this.l = ffbrVar4;
        this.h = ffbrVar5;
        this.i = auneVar;
    }

    @Override // defpackage.cmfj
    public final ejxi a(String str) {
        str.getClass();
        return new cmfv(this, str);
    }

    @Override // defpackage.cmfj
    public final elfl b() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new cmfr(this, null));
        return c;
    }

    @Override // defpackage.cmfj
    public final elfl c() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new cmfs(this, null));
        return c;
    }

    @Override // defpackage.cmfj
    public final elfl d() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new cmga(this, null));
        return c;
    }

    @Override // defpackage.cmfj
    public final elfl e(djrm djrmVar) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new cmgb(djrmVar, this, null));
        return c;
    }

    @Override // defpackage.cmfj
    public final void f(djrm djrmVar) {
        axol.k(this.d, null, new cmgd(this, djrmVar, null), 3);
    }

    @Override // defpackage.cmfj
    public final void g(djrm djrmVar, diuo diuoVar) {
        diuoVar.getClass();
        axol.k(this.d, null, new cmgf(this, djrmVar, diuoVar, null), 3);
    }

    @Override // defpackage.cmfj
    public final void h(final djrm djrmVar, final diuo diuoVar) {
        diuoVar.getClass();
        final ffji ffjiVar = new ffji() { // from class: cmfm
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                enru enruVar = cmgg.a;
                cmgj cmgjVar = (cmgj) ((cmgn) obj).toBuilder();
                cmgjVar.a(djrn.a(djrm.this).a, diuoVar);
                return (cmgn) cmgjVar.build();
            }
        };
        this.c.m(new emwl() { // from class: cmfn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enru enruVar = cmgg.a;
                return ffji.this.invoke(obj);
            }
        });
    }

    @Override // defpackage.cmfj
    public final void i(final djrm djrmVar, final boolean z) {
        final ffji ffjiVar = new ffji() { // from class: cmfk
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                enru enruVar = cmgg.a;
                cmgj cmgjVar = (cmgj) ((cmgn) obj).toBuilder();
                cmgjVar.b(djrn.a(djrm.this).a, z);
                return (cmgn) cmgjVar.build();
            }
        };
        this.c.m(new emwl() { // from class: cmfl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enru enruVar = cmgg.a;
                return ffji.this.invoke(obj);
            }
        });
    }

    @Override // defpackage.cmfj
    public final boolean j(djrm djrmVar) {
        return p((cmgn) this.c.l()).containsKey(djrmVar);
    }

    @Override // defpackage.cmfj
    public final int k(djrm djrmVar) {
        djrmVar.getClass();
        int i = ((cmeo) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((cmbx) ((cmel) this.l.b()).d.l()).n), djrn.a(djrmVar).a, cmeo.a)).b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.djrm r10, java.lang.String r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmgg.l(djrm, java.lang.String, ffgu):java.lang.Object");
    }

    public final Object m(ffgu ffguVar) {
        return this.c.c(ffguVar);
    }

    public final Object n(djrm djrmVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new cmfy(null, this, djrmVar), ffguVar);
    }

    public final Object o(djrm djrmVar, ffgu ffguVar) {
        Object c = fgfz.c(((cmel) this.l.b()).m(djrn.a(djrmVar).a, 2), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    public final java.util.Map p(cmgn cmgnVar) {
        java.util.Map unmodifiableMap = DesugarCollections.unmodifiableMap(cmgnVar.d);
        unmodifiableMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(unmodifiableMap.size()));
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            linkedHashMap.put(new djro((String) key), entry.getValue());
        }
        return linkedHashMap;
    }
}
