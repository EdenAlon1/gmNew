package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccye implements ccuq {
    private final crzd b;
    private final csci c;
    private final ffbr d;
    private final entd e;
    private final csck f;

    public ccye(crzd crzdVar, csci csciVar, csck csckVar, ffbr ffbrVar) {
        crzdVar.getClass();
        ffbrVar.getClass();
        this.b = crzdVar;
        this.c = csciVar;
        this.f = csckVar;
        this.d = ffbrVar;
        this.e = entd.c("BugleCms");
    }

    @Override // defpackage.ccuq
    public final /* bridge */ /* synthetic */ csgg a(Object obj) {
        csby csbyVar = (csby) obj;
        csbyVar.getClass();
        return csbyVar.b().H();
    }

    @Override // defpackage.ccuq
    public final /* bridge */ /* synthetic */ Object b(Object obj, bqvj bqvjVar, boolean z, EnumSet enumSet, ffgu ffguVar) {
        int i;
        csby csbyVar = (csby) obj;
        ParticipantsTable.BindData b = csbyVar.b();
        String S = b.S();
        String U = b.U();
        int r = b.r();
        akzt akztVar = (akzt) this.d.b();
        boolean z2 = r == -1;
        etah etahVar = null;
        if (z2) {
            if (U == null) {
                i = 1;
                U = null;
            } else {
                i = 2;
            }
        } else if (U == null) {
            U = null;
            i = 3;
        } else {
            i = 4;
        }
        akztVar.e("Bugle.Cms.Participants.Assembly.DestinationStatus", i - 1);
        if (!z2 && TextUtils.isEmpty(U)) {
            throw new cscj();
        }
        String b2 = this.b.b(U, Boolean.valueOf(z2));
        csck csckVar = this.f;
        emxf.l(!efbd.g());
        ParticipantsTable.BindData b3 = csbyVar.b();
        int r2 = b3.r();
        if (r2 == -2 || r2 == -1) {
            esjz esjzVar = (esjz) eska.a.createBuilder();
            ParticipantsTable.BindData b4 = csbyVar.b();
            String S2 = b4.S();
            if (!TextUtils.isEmpty(S2)) {
                long a = csbyVar.a();
                esjzVar.copyOnWrite();
                ((eska) esjzVar.instance).p = a;
            }
            String U2 = b4.U();
            if (!TextUtils.isEmpty(U2)) {
                esjzVar.copyOnWrite();
                eska eskaVar = (eska) esjzVar.instance;
                U2.getClass();
                eskaVar.c = U2;
                String format = String.format("#%06X", Integer.valueOf((b4.l() == 2 ? b4.m() : ((cttz) csckVar.d.b()).e(crjn.a(U2), false)) & 16777215));
                esjzVar.copyOnWrite();
                eska eskaVar2 = (eska) esjzVar.instance;
                format.getClass();
                eskaVar2.k = format;
            }
            String W = b4.W();
            if (!TextUtils.isEmpty(W)) {
                esjzVar.copyOnWrite();
                eska eskaVar3 = (eska) esjzVar.instance;
                W.getClass();
                eskaVar3.d = W;
            }
            String P = b4.P();
            if (!TextUtils.isEmpty(P)) {
                esjzVar.copyOnWrite();
                eska eskaVar4 = (eska) esjzVar.instance;
                P.getClass();
                eskaVar4.e = P;
            }
            String Q = b4.Q();
            if (!TextUtils.isEmpty(Q)) {
                esjzVar.copyOnWrite();
                eska eskaVar5 = (eska) esjzVar.instance;
                Q.getClass();
                eskaVar5.f = Q;
            }
            String R = b4.R();
            if (!TextUtils.isEmpty(R)) {
                esjzVar.copyOnWrite();
                eska eskaVar6 = (eska) esjzVar.instance;
                R.getClass();
                eskaVar6.g = R;
            }
            String V = b4.V();
            if (!TextUtils.isEmpty(V)) {
                csjb c = csck.b.c();
                c.I("Backing up blobId for");
                c.A("participant", S2);
                c.A("blobId", V);
                c.r();
                esjzVar.copyOnWrite();
                eska eskaVar7 = (eska) esjzVar.instance;
                V.getClass();
                eskaVar7.h = V;
            }
            byte[] ad = b4.ad();
            if (ad != null) {
                eyee x = eyee.x(ad);
                esjzVar.copyOnWrite();
                ((eska) esjzVar.instance).i = x;
            }
            boolean m = bdtd.m(b4);
            esjzVar.copyOnWrite();
            ((eska) esjzVar.instance).j = m;
            boolean Y = b4.Y();
            esjzVar.copyOnWrite();
            ((eska) esjzVar.instance).l = Y;
            boolean ab = b4.ab();
            esjzVar.copyOnWrite();
            ((eska) esjzVar.instance).n = ab;
            int n = b4.n();
            esjzVar.copyOnWrite();
            ((eska) esjzVar.instance).o = n;
            int o = b4.o();
            int i2 = o != 0 ? o != 1 ? 2 : 4 : 3;
            esjzVar.copyOnWrite();
            ((eska) esjzVar.instance).m = i2 - 2;
            if (m) {
                eskb eskbVar = (eskb) eskc.a.createBuilder();
                bxro c2 = csbyVar.c();
                if (c2 != null) {
                    String n2 = c2.n();
                    if (!TextUtils.isEmpty(n2)) {
                        eskbVar.copyOnWrite();
                        eskc eskcVar = (eskc) eskbVar.instance;
                        n2.getClass();
                        eskcVar.b = n2;
                    }
                    int k = c2.k();
                    eskbVar.copyOnWrite();
                    ((eskc) eskbVar.instance).c = k;
                    int l = c2.l();
                    eskbVar.copyOnWrite();
                    ((eskc) eskbVar.instance).d = l;
                    c2.az(5, "subscription_name");
                    String str = c2.f;
                    if (!TextUtils.isEmpty(str)) {
                        eskbVar.copyOnWrite();
                        eskc eskcVar2 = (eskc) eskbVar.instance;
                        str.getClass();
                        eskcVar2.e = str;
                    }
                    c2.az(8, "smsc");
                    String str2 = c2.i;
                    if (!TextUtils.isEmpty(str2)) {
                        eskbVar.copyOnWrite();
                        eskc eskcVar3 = (eskc) eskbVar.instance;
                        str2.getClass();
                        eskcVar3.f = str2;
                    }
                }
                eskc eskcVar4 = (eskc) eskbVar.build();
                esjzVar.copyOnWrite();
                eska eskaVar8 = (eska) esjzVar.instance;
                eskcVar4.getClass();
                eskaVar8.q = eskcVar4;
                eskaVar8.b |= 1;
            }
            byte[] byteArray = ((eska) esjzVar.build()).toByteArray();
            esii esiiVar = (esii) esij.a.createBuilder();
            csck.l(byteArray, bqvjVar, esiiVar);
            esij esijVar = (esij) esiiVar.build();
            String L = b3.L();
            etag etagVar = (etag) etah.a.createBuilder();
            if (L == null || !L.startsWith("dummy_participant_cms_id_")) {
                if (!TextUtils.isEmpty(L)) {
                    etagVar.copyOnWrite();
                    etah etahVar2 = (etah) etagVar.instance;
                    L.getClass();
                    etahVar2.c = L;
                }
                String U3 = b3.U();
                boolean z3 = b3.r() == -1;
                if (!z3 && TextUtils.isEmpty(U3)) {
                    throw new cscj();
                }
                String b5 = csckVar.c.b(U3, Boolean.valueOf(z3));
                eszr eszrVar = (eszr) eszs.a.createBuilder();
                eszrVar.copyOnWrite();
                ((eszs) eszrVar.instance).b = b5;
                eszrVar.copyOnWrite();
                ((eszs) eszrVar.instance).c = eszq.a(7);
                eszs eszsVar = (eszs) eszrVar.build();
                etal etalVar = (etal) etam.a.createBuilder();
                etalVar.copyOnWrite();
                etam etamVar = (etam) etalVar.instance;
                eszsVar.getClass();
                etamVar.c = eszsVar;
                etamVar.b |= 1;
                etam etamVar2 = (etam) etalVar.build();
                etagVar.copyOnWrite();
                etah etahVar3 = (etah) etagVar.instance;
                etamVar2.getClass();
                etahVar3.d = etamVar2;
                etahVar3.b |= 1;
                eydp eydpVar = (eydp) eydq.a.createBuilder();
                eydpVar.copyOnWrite();
                ((eydq) eydpVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
                eyee byteString = esijVar.toByteString();
                eydpVar.copyOnWrite();
                ((eydq) eydpVar.instance).c = byteString;
                etagVar.copyOnWrite();
                etah etahVar4 = (etah) etagVar.instance;
                eydq eydqVar = (eydq) eydpVar.build();
                eydqVar.getClass();
                etahVar4.e = eydqVar;
                etahVar4.b |= 2;
                etahVar = (etah) etagVar.build();
            }
        }
        if (etahVar == null) {
            ensz enszVar = (ensz) this.e.h();
            enszVar.Y(cdii.c, S);
            enszVar.q("CMS Participant item was skipped");
            S.getClass();
            throw new ccwq(S);
        }
        String str3 = etahVar.c;
        str3.getClass();
        if (str3.length() > 0 && !ffkj.e(etahVar.c, b2)) {
            ensz enszVar2 = (ensz) this.e.j();
            enszVar2.Y(cdii.c, S);
            enszVar2.Y(cdii.g, etahVar.c);
            enszVar2.q("CMS Participant ID does not match to its normalized destination Hash.");
            S.getClass();
            throw new ccwq(S);
        }
        etag etagVar2 = (etag) etahVar.toBuilder();
        etagVar2.getClass();
        String str4 = ((etah) etagVar2.instance).c;
        str4.getClass();
        if (str4.length() == 0) {
            etam etamVar3 = ((etah) etagVar2.instance).d;
            if (etamVar3 == null) {
                etamVar3 = etam.a;
            }
            etamVar3.getClass();
            eszs eszsVar2 = etamVar3.c;
            if (eszsVar2 == null) {
                eszsVar2 = eszs.a;
            }
            String str5 = eszsVar2.b;
            str5.getClass();
            etagVar2.copyOnWrite();
            ((etah) etagVar2.instance).c = str5;
        }
        eyfy build = etagVar2.build();
        build.getClass();
        return (etah) build;
    }

    @Override // defpackage.ccuq
    public final /* bridge */ /* synthetic */ Object c(final String str, EnumSet enumSet) {
        str.getClass();
        enumSet.getClass();
        Object orElseThrow = this.c.a(str).orElseThrow(new Supplier() { // from class: ccyd
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ccwp(str);
            }
        });
        orElseThrow.getClass();
        return (csby) orElseThrow;
    }

    @Override // defpackage.ccuq
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        csby csbyVar = (csby) obj;
        csbyVar.getClass();
        return csbyVar.b().L();
    }

    @Override // defpackage.ccuq
    public final Map e(Collection collection, EnumSet enumSet) {
        collection.getClass();
        enumSet.getClass();
        List ak = ffdx.ak(collection);
        final csci csciVar = this.c;
        enhk enhkVar = (enhk) Collection.EL.stream(((bdrr) csciVar.c.b()).n(ak).entrySet()).collect(endq.a(new Function() { // from class: cscf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: cscg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) entry.getValue();
                String str = (String) entry.getKey();
                csbx d = csby.d();
                d.c(bindData);
                csci csciVar2 = csci.this;
                d.b(bdvu.d(str));
                if (bindData.r() == -1) {
                    bxro a = bdtf.a(aqvf.b(str));
                    if (a != null) {
                        ((crtt) d).a = a;
                    }
                }
                return d.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        enhkVar.getClass();
        ArrayList arrayList = new ArrayList(enhkVar.size());
        Iterator it = enhkVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new ffcf((String) entry.getKey(), new ffch((csby) entry.getValue())));
        }
        Map k = ffew.k(arrayList);
        Set e = fffi.e(ffdx.ar(collection), k.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(e, 10)), 16));
        for (Object obj : e) {
            String str = (String) obj;
            str.getClass();
            linkedHashMap.put(obj, new ffch(ffci.a(new ccwp(str))));
        }
        return ffew.j(k, linkedHashMap);
    }
}
