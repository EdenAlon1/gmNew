package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class edwn implements eroh {
    public final /* synthetic */ edwv a;

    public /* synthetic */ edwn(edwv edwvVar) {
        this.a = edwvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        final edwv edwvVar;
        List list = (List) obj;
        ((enrr) ((enrr) edwv.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl", "uploadObservations", 320, "MobaltPeriodicJobImpl.java")).r("Mobalt: uploading logs to the Cobalt Server, got %s observations", list.size());
        if (list.isEmpty()) {
            return elfo.e(null);
        }
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = list.iterator();
        while (true) {
            edwvVar = this.a;
            if (!it.hasNext()) {
                break;
            }
            edxt b = ((edvp) it.next()).b();
            emsm emsmVar = (emsm) emsn.a.createBuilder();
            emsp emspVar = b.c;
            if (emspVar == null) {
                emspVar = emsp.a;
            }
            emsmVar.copyOnWrite();
            emsn emsnVar = (emsn) emsmVar.instance;
            emspVar.getClass();
            emsnVar.c = emspVar;
            emsnVar.b |= 1;
            for (edxr edxrVar : b.d) {
                edtx edtxVar = edwvVar.o;
                emsl emslVar = edxrVar.d;
                if (emslVar == null) {
                    emslVar = emsl.a;
                }
                int i2 = edtxVar.b;
                emrs a = edtx.a(emslVar, 12, edtxVar.d, edty.d, edxrVar.c);
                emsmVar.copyOnWrite();
                emsn emsnVar2 = (emsn) emsmVar.instance;
                a.getClass();
                emsnVar2.a();
                emsnVar2.d.add(a);
            }
            engrVar.h((emsn) emsmVar.build());
        }
        edwi edwiVar = edwvVar.i;
        engw g = engrVar.g();
        engr engrVar2 = new engr();
        HashMap hashMap = new HashMap();
        enqv it2 = g.iterator();
        while (it2.hasNext()) {
            emsn emsnVar3 = (emsn) it2.next();
            emsp emspVar2 = emsnVar3.c;
            if (emspVar2 == null) {
                emspVar2 = emsp.a;
            }
            eyee byteString = emspVar2.toByteString();
            emsm emsmVar2 = (emsm) hashMap.get(byteString);
            if (emsmVar2 == null) {
                emsmVar2 = (emsm) emsn.a.createBuilder();
                emsmVar2.copyOnWrite();
                emsn emsnVar4 = (emsn) emsmVar2.instance;
                emspVar2.getClass();
                emsnVar4.c = emspVar2;
                emsnVar4.b |= 1;
                hashMap.put(byteString, emsmVar2);
                engrVar2.h(emsmVar2);
            }
            eygr eygrVar = emsnVar3.d;
            emsmVar2.copyOnWrite();
            emsn emsnVar5 = (emsn) emsmVar2.instance;
            emsnVar5.a();
            eydl.addAll(eygrVar, emsnVar5.d);
        }
        engw engwVar = (engw) Collection.EL.stream(engrVar2.g()).map(new Function() { // from class: edwh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return (emsn) ((emsm) obj2).build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        emrt emrtVar = (emrt) emru.a.createBuilder();
        eyee eyeeVar = edwiVar.a;
        emrtVar.copyOnWrite();
        ((emru) emrtVar.instance).c = eyeeVar;
        emrtVar.copyOnWrite();
        emru emruVar = (emru) emrtVar.instance;
        eygr eygrVar2 = emruVar.b;
        if (!eygrVar2.c()) {
            emruVar.b = eyfy.mutableCopy(eygrVar2);
        }
        eydl.addAll(engwVar, emruVar.b);
        emru emruVar2 = (emru) emrtVar.build();
        edtx edtxVar2 = edwiVar.b;
        int i3 = edtxVar2.a;
        emrs a2 = edtx.a(emruVar2, 11, edtxVar2.c, edty.b, eyee.b);
        final edtw edtwVar = edwvVar.h;
        ((enrr) ((enrr) edtw.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/clearcut/ClearcutUploader", "upload", 64, "ClearcutUploader.java")).t("Mobalt: start uploading logs to Clearcut log_source = %s", edtwVar.c.i);
        edtwVar.c.i(a2).c().s(new dhqs() { // from class: edtu
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                edtw edtwVar2 = edtw.this;
                if (dhreVar.m()) {
                    ((enrr) ((enrr) edtw.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/clearcut/ClearcutUploader", "upload", 71, "ClearcutUploader.java")).t("Mobalt: successfully finished uploading logs to Clearcut log_source = %s", edtwVar2.c.i);
                    return;
                }
                enrr enrrVar = (enrr) ((enrr) edtw.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/clearcut/ClearcutUploader", "upload", 75, "ClearcutUploader.java");
                dfld dfldVar = edtwVar2.c;
                enrrVar.D("Mobalt: finished uploading logs to Clearcut log_source = %s with status: %s", dfldVar.i, dhreVar.h());
            }
        });
        final engw engwVar2 = (engw) Collection.EL.stream(list).map(new Function() { // from class: edwt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return Long.valueOf(((edvp) obj2).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        return (engwVar2.isEmpty() ? elfo.e(null) : elfl.g(edwvVar.g.c.e(new efkr() { // from class: edux
            @Override // defpackage.efkr
            public final void a(efks efksVar) {
                enru enruVar = edva.a;
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                sb.append("observation_store_id IN(?");
                List list2 = engwVar2;
                arrayList.add(String.valueOf(list2.get(0)));
                for (int i4 = 1; i4 < list2.size(); i4++) {
                    sb.append(", ?");
                    arrayList.add(String.valueOf(list2.get(i4)));
                }
                sb.append(")");
                efksVar.a(efkm.a("ObservationStore", sb, arrayList));
            }
        }))).i(new eroh() { // from class: edwl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return edwv.this.g.c();
            }
        }, edwvVar.j).i(new edwn(edwvVar), edwvVar.j);
    }
}
