package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.libraries.abuse.hades.tartarus.runtime.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljg implements dljy {
    private final ffji a;
    private final dlfa b = new dlfa(true);

    public dljg(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.dljy
    public final dlfa a() {
        return this.b;
    }

    @Override // defpackage.dljy
    public final dljx b(final dlfy dlfyVar, final List list, final List list2) {
        dlfs dlfsVar;
        Map map;
        List o;
        dlfyVar.getClass();
        list.getClass();
        Object invoke = this.a.invoke(dlku.a(new ffji() { // from class: dljp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Data data = (Data) obj;
                data.getClass();
                rqm a = rql.a((rqj) rqk.a.createBuilder());
                rse rseVar = (rse) rsf.a.createBuilder();
                rseVar.getClass();
                rqn rqnVar = (rqn) rqo.a.createBuilder();
                rqnVar.getClass();
                rqnVar.copyOnWrite();
                rqo rqoVar = (rqo) rqnVar.instance;
                rqoVar.b |= 1;
                rqoVar.c = "/internal/moirai_default/1";
                eyfy build = rqnVar.build();
                build.getClass();
                rsg.b((rqo) build, rseVar);
                a.c(rsg.a(rseVar));
                for (Map.Entry entry : ffew.j(ffew.c(new ffcf("/engine/top_target_entity_id", a.a())), dlfy.this.a).entrySet()) {
                    String str = (String) entry.getKey();
                    final rqk rqkVar = (rqk) entry.getValue();
                    rqkVar.getClass();
                    data.putData(str, dleu.a(new dlcs() { // from class: dldz
                        @Override // defpackage.dlcs
                        public final void a(dlet dletVar) {
                            rqk rqkVar2 = rqk.this;
                            if ((rqkVar2.b & 1) != 0) {
                                final rsf rsfVar = rqkVar2.c;
                                if (rsfVar == null) {
                                    rsfVar = rsf.a;
                                }
                                rsfVar.getClass();
                                dletVar.b("canonical", new dlcs() { // from class: dldx
                                    @Override // defpackage.dlcs
                                    public final void a(dlet dletVar2) {
                                        rsf rsfVar2 = rsf.this;
                                        if ((rsfVar2.b & 1) != 0) {
                                            final rqo rqoVar2 = rsfVar2.c;
                                            if (rqoVar2 == null) {
                                                rqoVar2 = rqo.a;
                                            }
                                            rqoVar2.getClass();
                                            dletVar2.b("entityId", new dlcs() { // from class: dlen
                                                @Override // defpackage.dlcs
                                                public final void a(dlet dletVar3) {
                                                    rqo rqoVar3 = rqo.this;
                                                    if ((rqoVar3.b & 1) != 0) {
                                                        String str2 = rqoVar3.c;
                                                        str2.getClass();
                                                        dletVar3.c("id", str2);
                                                    }
                                                }
                                            });
                                        }
                                        if ((rsfVar2.b & 2) != 0) {
                                            final rqq rqqVar = rsfVar2.d;
                                            if (rqqVar == null) {
                                                rqqVar = rqq.a;
                                            }
                                            rqqVar.getClass();
                                            dletVar2.b(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, new dlcs() { // from class: dldw
                                                @Override // defpackage.dlcs
                                                public final void a(dlet dletVar3) {
                                                    rqq rqqVar2 = rqq.this;
                                                    if ((rqqVar2.b & 1) != 0) {
                                                        String str2 = rqqVar2.c;
                                                        str2.getClass();
                                                        dletVar3.c("rawContent", str2);
                                                    }
                                                    if ((rqqVar2.b & 2) != 0) {
                                                        String str3 = rqqVar2.d;
                                                        str3.getClass();
                                                        dletVar3.c("language", str3);
                                                    }
                                                }
                                            });
                                        }
                                        if ((rsfVar2.b & 4) != 0) {
                                            rqv rqvVar = rsfVar2.e;
                                            if (rqvVar == null) {
                                                rqvVar = rqv.a;
                                            }
                                            rqvVar.getClass();
                                            dletVar2.b("url", dler.a(rqvVar));
                                        }
                                        if ((rsfVar2.b & 8) != 0) {
                                            final rqx rqxVar = rsfVar2.f;
                                            if (rqxVar == null) {
                                                rqxVar = rqx.a;
                                            }
                                            rqxVar.getClass();
                                            dletVar2.b("urlSet", new dlcs() { // from class: dlem
                                                @Override // defpackage.dlcs
                                                public final void a(dlet dletVar3) {
                                                    eygr eygrVar = rqx.this.b;
                                                    eygrVar.getClass();
                                                    ArrayList arrayList = new ArrayList(ffdx.n(eygrVar, 10));
                                                    Iterator<E> it = eygrVar.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(dler.a((rqv) it.next()));
                                                    }
                                                    dletVar3.d("url", arrayList);
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                            if ((rqkVar2.b & 2) != 0) {
                                final rsi rsiVar = rqkVar2.d;
                                if (rsiVar == null) {
                                    rsiVar = rsi.a;
                                }
                                rsiVar.getClass();
                                dletVar.b("gppd", new dlcs() { // from class: dled
                                    @Override // defpackage.dlcs
                                    public final void a(dlet dletVar2) {
                                        rsi rsiVar2 = rsi.this;
                                        if ((rsiVar2.b & 1) != 0) {
                                            final rrn rrnVar = rsiVar2.c;
                                            if (rrnVar == null) {
                                                rrnVar = rrn.a;
                                            }
                                            rrnVar.getClass();
                                            dletVar2.b("swInput", new dlcs() { // from class: dlep
                                                @Override // defpackage.dlcs
                                                public final void a(dlet dletVar3) {
                                                    rrn rrnVar2 = rrn.this;
                                                    eygd eygdVar = rrnVar2.b;
                                                    eygdVar.getClass();
                                                    dletVar3.d("values", eygdVar);
                                                    eygr eygrVar = rrnVar2.c;
                                                    eygrVar.getClass();
                                                    dletVar3.d("strings", eygrVar);
                                                }
                                            });
                                        }
                                        if ((rsiVar2.b & 2) != 0) {
                                            final rrj rrjVar = rsiVar2.d;
                                            if (rrjVar == null) {
                                                rrjVar = rrj.a;
                                            }
                                            rrjVar.getClass();
                                            dletVar2.b("cmInput", new dlcs() { // from class: dleb
                                                @Override // defpackage.dlcs
                                                public final void a(dlet dletVar3) {
                                                    rrj rrjVar2 = rrj.this;
                                                    eygd eygdVar = rrjVar2.b;
                                                    eygdVar.getClass();
                                                    dletVar3.d("values", eygdVar);
                                                    eygr eygrVar = rrjVar2.c;
                                                    eygrVar.getClass();
                                                    dletVar3.d("strings", eygrVar);
                                                }
                                            });
                                        }
                                        if ((rsiVar2.b & 4) != 0) {
                                            final rrl rrlVar = rsiVar2.e;
                                            if (rrlVar == null) {
                                                rrlVar = rrl.a;
                                            }
                                            rrlVar.getClass();
                                            dletVar2.b("sprInput", new dlcs() { // from class: dlef
                                                @Override // defpackage.dlcs
                                                public final void a(dlet dletVar3) {
                                                    rrl rrlVar2 = rrl.this;
                                                    eygd eygdVar = rrlVar2.b;
                                                    eygdVar.getClass();
                                                    dletVar3.d("values", eygdVar);
                                                    eygr eygrVar = rrlVar2.c;
                                                    eygrVar.getClass();
                                                    dletVar3.d("strings", eygrVar);
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                            if ((rqkVar2.b & 4) != 0) {
                                final rsl rslVar = rqkVar2.e;
                                if (rslVar == null) {
                                    rslVar = rsl.a;
                                }
                                rslVar.getClass();
                                dletVar.b("onDevice", new dlcs() { // from class: dldv
                                    @Override // defpackage.dlcs
                                    public final void a(dlet dletVar2) {
                                        rsl rslVar2 = rsl.this;
                                        if ((rslVar2.b & 1) != 0) {
                                            final rrz rrzVar = rslVar2.c;
                                            if (rrzVar == null) {
                                                rrzVar = rrz.a;
                                            }
                                            rrzVar.getClass();
                                            dletVar2.b("signals", new dlcs() { // from class: dlek
                                                @Override // defpackage.dlcs
                                                public final void a(dlet dletVar3) {
                                                    rrz rrzVar2 = rrz.this;
                                                    if ((rrzVar2.b & 1) != 0) {
                                                        String str2 = rrzVar2.c;
                                                        str2.getClass();
                                                        dletVar3.c(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, str2);
                                                    }
                                                    if ((rrzVar2.b & 2) != 0) {
                                                        String str3 = rrzVar2.d;
                                                        str3.getClass();
                                                        dletVar3.c("androidId", str3);
                                                    }
                                                    if ((rrzVar2.b & 4) != 0) {
                                                        String str4 = rrzVar2.e;
                                                        str4.getClass();
                                                        dletVar3.c("filePath", str4);
                                                    }
                                                    eygr<rry> eygrVar = rrzVar2.f;
                                                    eygrVar.getClass();
                                                    ArrayList arrayList = new ArrayList(ffdx.n(eygrVar, 10));
                                                    for (final rry rryVar : eygrVar) {
                                                        rryVar.getClass();
                                                        arrayList.add(new dlcs() { // from class: dlel
                                                            @Override // defpackage.dlcs
                                                            public final void a(dlet dletVar4) {
                                                                rry rryVar2 = rry.this;
                                                                if ((rryVar2.b & 1) != 0) {
                                                                    String str5 = rryVar2.c;
                                                                    str5.getClass();
                                                                    dletVar4.c("tensorKey", str5);
                                                                }
                                                                eygi eygiVar = rryVar2.d;
                                                                eygiVar.getClass();
                                                                dletVar4.d("tensorShape", eygiVar);
                                                                if ((rryVar2.b & 2) != 0) {
                                                                    final rrx rrxVar = rryVar2.e;
                                                                    if (rrxVar == null) {
                                                                        rrxVar = rrx.a;
                                                                    }
                                                                    rrxVar.getClass();
                                                                    dletVar4.b("tensorsData", new dlcs() { // from class: dlea
                                                                        @Override // defpackage.dlcs
                                                                        public final void a(dlet dletVar5) {
                                                                            rrx rrxVar2 = rrx.this;
                                                                            if ((rrxVar2.b & 1) != 0) {
                                                                                final rrv rrvVar = rrxVar2.c;
                                                                                if (rrvVar == null) {
                                                                                    rrvVar = rrv.a;
                                                                                }
                                                                                rrvVar.getClass();
                                                                                dletVar5.b("tensorDataFloat", new dlcs() { // from class: dleg
                                                                                    @Override // defpackage.dlcs
                                                                                    public final void a(dlet dletVar6) {
                                                                                        eygh eyghVar = rrv.this.b;
                                                                                        eyghVar.getClass();
                                                                                        dletVar6.d("floatArray", eyghVar);
                                                                                    }
                                                                                });
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                        });
                                                    }
                                                    dletVar3.d("tensors", arrayList);
                                                }
                                            });
                                        }
                                        if ((rslVar2.b & 2) != 0) {
                                            final rrp rrpVar = rslVar2.d;
                                            if (rrpVar == null) {
                                                rrpVar = rrp.a;
                                            }
                                            rrpVar.getClass();
                                            dletVar2.b("hashes", new dlcs() { // from class: dleq
                                                @Override // defpackage.dlcs
                                                public final void a(dlet dletVar3) {
                                                    rrp rrpVar2 = rrp.this;
                                                    if ((rrpVar2.b & 1) != 0) {
                                                        String str2 = rrpVar2.c;
                                                        str2.getClass();
                                                        dletVar3.c("contentHash", str2);
                                                    }
                                                    if ((rrpVar2.b & 2) != 0) {
                                                        String str3 = rrpVar2.d;
                                                        str3.getClass();
                                                        dletVar3.c("encryptedHash", str3);
                                                    }
                                                    if ((rrpVar2.b & 4) != 0) {
                                                        dletVar3.e("isHashMatched", rrpVar2.e);
                                                    }
                                                    if ((rrpVar2.b & 8) != 0) {
                                                        dletVar3.e("isSignatureVerified", rrpVar2.f);
                                                    }
                                                }
                                            });
                                        }
                                        if ((rslVar2.b & 4) != 0) {
                                            final rrr rrrVar = rslVar2.e;
                                            if (rrrVar == null) {
                                                rrrVar = rrr.a;
                                            }
                                            rrrVar.getClass();
                                            dletVar2.b("ocr", new dlcs() { // from class: dlee
                                                @Override // defpackage.dlcs
                                                public final void a(dlet dletVar3) {
                                                    rrr rrrVar2 = rrr.this;
                                                    if ((rrrVar2.b & 1) != 0) {
                                                        String str2 = rrrVar2.c;
                                                        str2.getClass();
                                                        dletVar3.c("ocrResults", str2);
                                                    }
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                            if ((rqkVar2.b & 8) != 0) {
                                final rsc rscVar = rqkVar2.f;
                                if (rscVar == null) {
                                    rscVar = rsc.a;
                                }
                                rscVar.getClass();
                                dletVar.b("amOnDevice", new dlcs() { // from class: dldy
                                    @Override // defpackage.dlcs
                                    public final void a(dlet dletVar2) {
                                        rsc rscVar2 = rsc.this;
                                        if ((rscVar2.b & 1) != 0) {
                                            final rrh rrhVar = rscVar2.c;
                                            if (rrhVar == null) {
                                                rrhVar = rrh.a;
                                            }
                                            rrhVar.getClass();
                                            dletVar2.b("sInfoParams", new dlcs() { // from class: dleo
                                                @Override // defpackage.dlcs
                                                public final void a(dlet dletVar3) {
                                                    eygr<rrg> eygrVar = rrh.this.b;
                                                    eygrVar.getClass();
                                                    ArrayList arrayList = new ArrayList(ffdx.n(eygrVar, 10));
                                                    for (final rrg rrgVar : eygrVar) {
                                                        rrgVar.getClass();
                                                        arrayList.add(new dlcs() { // from class: dlec
                                                            @Override // defpackage.dlcs
                                                            public final void a(dlet dletVar4) {
                                                                if ((rrg.this.b & 1) != 0) {
                                                                    dletVar4.a.putDouble("uss", r0.c);
                                                                }
                                                            }
                                                        });
                                                    }
                                                    dletVar3.d("sInfos", arrayList);
                                                }
                                            });
                                        }
                                        if ((rscVar2.b & 2) != 0) {
                                            final rrd rrdVar = rscVar2.d;
                                            if (rrdVar == null) {
                                                rrdVar = rrd.a;
                                            }
                                            rrdVar.getClass();
                                            dletVar2.b("messageContext", new dlcs() { // from class: dlej
                                                @Override // defpackage.dlcs
                                                public final void a(dlet dletVar3) {
                                                    rrd rrdVar2 = rrd.this;
                                                    if ((rrdVar2.b & 1) != 0) {
                                                        int a2 = rra.a(rrdVar2.c);
                                                        if (a2 == 0) {
                                                            a2 = 1;
                                                        }
                                                        dletVar3.a("protocol", a2 - 1);
                                                    }
                                                    if ((rrdVar2.b & 2) != 0) {
                                                        dletVar3.a(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, (rrc.a(rrdVar2.d) != 0 ? r1 : 1) - 1);
                                                    }
                                                    if ((rrdVar2.b & 4) != 0) {
                                                        String str2 = rrdVar2.e;
                                                        str2.getClass();
                                                        dletVar3.c("groupName", str2);
                                                    }
                                                    if ((rrdVar2.b & 8) != 0) {
                                                        dletVar3.a("incomingMessageCount", rrdVar2.f);
                                                    }
                                                    if ((rrdVar2.b & 16) != 0) {
                                                        dletVar3.a("outgoingMessageCount", rrdVar2.g);
                                                    }
                                                    if ((rrdVar2.b & 32) != 0) {
                                                        final rqt rqtVar = rrdVar2.h;
                                                        if (rqtVar == null) {
                                                            rqtVar = rqt.a;
                                                        }
                                                        rqtVar.getClass();
                                                        dletVar3.b("firstInTimestamp", new dlcs() { // from class: dleh
                                                            @Override // defpackage.dlcs
                                                            public final void a(dlet dletVar4) {
                                                                rqt rqtVar2 = rqt.this;
                                                                if ((rqtVar2.b & 1) != 0) {
                                                                    dletVar4.a.putInteger("seconds", rqtVar2.c);
                                                                }
                                                                if ((rqtVar2.b & 2) != 0) {
                                                                    dletVar4.a("nanos", rqtVar2.d);
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        }
                    }));
                }
                for (final dlhk dlhkVar : list) {
                    dlku.b(data, "/internal/moirai_default/1/model_name/" + dlhkVar.c.a + "/model_version/live", new ffji() { // from class: dljo
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            Data data2 = (Data) obj2;
                            data2.getClass();
                            final dlhk dlhkVar2 = dlhk.this;
                            dlku.b(data2, "easyLearn", new ffji() { // from class: dljs
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj3) {
                                    Data data3 = (Data) obj3;
                                    data3.getClass();
                                    final dlhk dlhkVar3 = dlhk.this;
                                    dlku.b(data3, "classificationResult", new ffji() { // from class: dlju
                                        @Override // defpackage.ffji
                                        public final Object invoke(Object obj4) {
                                            Map map2;
                                            Data data4 = (Data) obj4;
                                            data4.getClass();
                                            dkzx dkzxVar = dlhk.this.a;
                                            if (dkzxVar != null && (map2 = dkzxVar.a) != null) {
                                                ArrayList arrayList = new ArrayList(map2.size());
                                                for (final Map.Entry entry2 : map2.entrySet()) {
                                                    arrayList.add(dlku.a(new ffji() { // from class: dljq
                                                        @Override // defpackage.ffji
                                                        public final Object invoke(Object obj5) {
                                                            Data data5 = (Data) obj5;
                                                            data5.getClass();
                                                            final Map.Entry entry3 = entry2;
                                                            dlku.b(data5, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, new ffji() { // from class: dljt
                                                                @Override // defpackage.ffji
                                                                public final Object invoke(Object obj6) {
                                                                    Data data6 = (Data) obj6;
                                                                    data6.getClass();
                                                                    final Map.Entry entry4 = entry3;
                                                                    dlku.b(data6, "id", new ffji() { // from class: dljr
                                                                        @Override // defpackage.ffji
                                                                        public final Object invoke(Object obj7) {
                                                                            Data data7 = (Data) obj7;
                                                                            data7.getClass();
                                                                            Object key = entry4.getKey();
                                                                            Objects.toString(key);
                                                                            data7.putString("id", "/abuse/label/".concat(String.valueOf(key)));
                                                                            return ffcu.a;
                                                                        }
                                                                    });
                                                                    return ffcu.a;
                                                                }
                                                            });
                                                            data5.putDouble("score", ((Number) entry3.getValue()).floatValue());
                                                            return ffcu.a;
                                                        }
                                                    }));
                                                }
                                                data4.putList("class", arrayList);
                                            }
                                            return ffcu.a;
                                        }
                                    });
                                    return ffcu.a;
                                }
                            });
                            return ffcu.a;
                        }
                    });
                }
                for (dlex dlexVar : list2) {
                    if (dlexVar instanceof dlew) {
                        dlew dlewVar = (dlew) dlexVar;
                        data.putBuffer(dlewVar.a, dlewVar.b);
                    }
                }
                return ffcu.a;
            }
        }));
        try {
            try {
                Data data = ((Data) invoke).getData("output/final-verdict");
                String string = data.getString("policy_violation");
                String string2 = data.getString(GroupManagementRequest.ACTION_TAG);
                if (ffkj.e(string2, "WARNING_REQUIRED")) {
                    dlfsVar = dlfs.b;
                } else {
                    try {
                        dlfsVar = (dlfs) Enum.valueOf(dlfs.class, string2);
                    } catch (IllegalArgumentException e) {
                        ((enrr) ((enrr) dljv.a.j()).g(e).h("com/google/android/libraries/abuse/hades/moirai/tartarus/TartarusOutputDataConverter", "toVerdict", 86, "TartarusOutputDataConverter.kt")).q("Unknown action in Tartarus verdict.");
                        throw new dlgk(8, 11, "Unknown action in Tartarus verdict.", e, 0, 48);
                    }
                }
                int i = 0;
                if (((Data) invoke).hasKey(".%z6g*")) {
                    map = new LinkedHashMap();
                    if (((Data) invoke).isData(".%z6g*")) {
                        Data data2 = ((Data) invoke).getData(".%z6g*");
                        int size = data2.size() - 1;
                        if (size >= 0) {
                            int i2 = 0;
                            while (true) {
                                String keyAt = data2.keyAt(i2);
                                map.put(keyAt, data2.getData(keyAt).toString());
                                if (i2 == size) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                } else {
                    map = ffem.a;
                }
                dlgu dlguVar = new dlgu(string, dlfsVar, map);
                Data data3 = (Data) invoke;
                String nullableString = data3.getNullableString("output/log");
                if (data3.isData("b!rgh*")) {
                    Data data4 = data3.getData("b!rgh*");
                    if (data4.size() == 0) {
                        o = ffel.a;
                    } else {
                        ffmj q = ffmk.q(0, data4.size());
                        ArrayList arrayList = new ArrayList();
                        ffev it = q.iterator();
                        while (((ffmi) it).a) {
                            String keyAt2 = data4.keyAt(it.a());
                            ArrayList arrayList2 = null;
                            if (data4.isData(keyAt2)) {
                                Data data5 = data4.getData(keyAt2);
                                ffmj q2 = ffmk.q(i, data5.size());
                                ArrayList arrayList3 = new ArrayList();
                                ffev it2 = q2.iterator();
                                while (((ffmi) it2).a) {
                                    String keyAt3 = data5.keyAt(it2.a());
                                    dlgi dlgiVar = !data5.isDouble(keyAt3) ? null : new dlgi(keyAt2, keyAt3, data5.getDouble(keyAt3));
                                    if (dlgiVar != null) {
                                        arrayList3.add(dlgiVar);
                                    }
                                }
                                arrayList2 = arrayList3;
                            }
                            if (arrayList2 != null) {
                                arrayList.add(arrayList2);
                            }
                            i = 0;
                        }
                        o = ffdx.o(arrayList);
                    }
                } else {
                    o = ffel.a;
                }
                return new dljx(dlguVar, nullableString, o, ffel.a);
            } catch (NullPointerException e2) {
                ((enrr) ((enrr) dljv.a.j()).g(e2).h("com/google/android/libraries/abuse/hades/moirai/tartarus/TartarusOutputDataConverter", "toVerdict", 67, "TartarusOutputDataConverter.kt")).q("No verdict in Tartarus output.");
                throw new dlgk(7, 15, "No verdict in Tartarus output.", e2, 0, 48);
            }
        } catch (RuntimeException e3) {
            ((enrr) ((enrr) dljv.a.j()).g(e3).h("com/google/android/libraries/abuse/hades/moirai/tartarus/TartarusOutputDataConverter", "convert", 46, "TartarusOutputDataConverter.kt")).q("Error converting Tartarus data to verdict.");
            throw new dlgk(6, 10, "Error converting Tartarus data to verdict.", e3, 0, 48);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
