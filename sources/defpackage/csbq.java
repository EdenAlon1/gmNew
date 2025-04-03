package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csbq extends crvh implements csbk {
    public static final /* synthetic */ int e = 0;
    private static final Map f;
    public final MessageCoreData b;
    public final ashs c;
    public final bseh d;
    private final entd g;
    private final cgzv h;
    private final csuu i;
    private final List j;
    private final List k;
    private final enhk l;
    private final List m;
    private final ashx n;
    private final bqvj o;
    private final ataa p;
    private final asyh q;
    private Optional r;
    private final bton s;
    private final ParticipantsTable.BindData t;
    private final ParticipantsTable.BindData u;

    static {
        enhd enhdVar = new enhd();
        int i = 0;
        for (csbj csbjVar : csbj.values()) {
            enhdVar.k(csbjVar, Integer.valueOf(i));
            i++;
        }
        f = enhdVar.c();
    }

    public csbq(ffbr ffbrVar, cgzv cgzvVar, csuu csuuVar, ashs ashsVar, ashx ashxVar, ataa ataaVar, asyh asyhVar, crzp crzpVar, bqvj bqvjVar) {
        super(ffbrVar);
        this.g = entd.c("BugleCms");
        this.r = Optional.empty();
        this.h = cgzvVar;
        this.i = csuuVar;
        this.t = crzpVar.e();
        this.u = crzpVar.d();
        this.b = crzpVar.a();
        this.d = crzpVar.b();
        this.s = crzpVar.c();
        this.j = crzpVar.f();
        this.k = crzpVar.h();
        this.l = crzpVar.i();
        this.m = crzpVar.g();
        this.c = ashsVar;
        this.n = ashxVar;
        this.p = ataaVar;
        this.q = asyhVar;
        this.o = bqvjVar;
    }

    public static int c(csbj csbjVar) {
        Integer num = (Integer) f.get(csbjVar);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.csbk
    public final etaq a(csbj csbjVar) {
        emxf.l(!efbd.g());
        int i = csbp.a[csbjVar.ordinal()];
        if (i == 1) {
            if (this.c.a() && csgj.a()) {
                return d();
            }
            return null;
        }
        if (i == 2) {
            return e();
        }
        if (i != 3) {
            return null;
        }
        return f();
    }

    @Override // defpackage.csbk
    public final void b(csbg csbgVar) {
        this.r = Optional.of(csbgVar);
    }

    public final etaq d() {
        final eshf eshfVar = (eshf) eshh.a.createBuilder();
        Map.EL.forEach(this.l, new BiConsumer() { // from class: csbo
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i = csbq.e;
                String name = ((eshn) obj).name();
                eshf.this.a(name, (eyee) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        esii esiiVar = (esii) esij.a.createBuilder();
        l(((eshh) eshfVar.build()).toByteArray(), this.o, esiiVar);
        etap etapVar = (etap) etaq.a.createBuilder();
        String str = csbj.OBJECT_PAYLOAD_PART_ADDITIONAL_FIELDS.d;
        etapVar.copyOnWrite();
        etaq etaqVar = (etaq) etapVar.instance;
        str.getClass();
        etaqVar.f = str;
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
        eyee byteString = ((esij) esiiVar.build()).toByteString();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = byteString;
        etapVar.copyOnWrite();
        etaq etaqVar2 = (etaq) etapVar.instance;
        eydq eydqVar = (eydq) eydpVar.build();
        eydqVar.getClass();
        etaqVar2.g = eydqVar;
        etaqVar2.b |= 1;
        return (etaq) etapVar.build();
    }

    public final etaq e() {
        esiv esivVar = (esiv) esiw.a.createBuilder();
        esji a = csbr.a(this.b.k(), this.p.a());
        if (a != null) {
            esivVar.copyOnWrite();
            ((esiw) esivVar.instance).b = a.a();
        }
        boolean cO = this.b.cO();
        esivVar.copyOnWrite();
        ((esiw) esivVar.instance).d = cO;
        boolean cN = this.b.cN();
        esivVar.copyOnWrite();
        ((esiw) esivVar.instance).c = cN;
        esii esiiVar = (esii) esij.a.createBuilder();
        l(((esiw) esivVar.build()).toByteArray(), this.o, esiiVar);
        etap etapVar = (etap) etaq.a.createBuilder();
        String str = csbj.OBJECT_PAYLOAD_PART_ENCRYPTED_FREQ_CHANGED.d;
        etapVar.copyOnWrite();
        etaq etaqVar = (etaq) etapVar.instance;
        str.getClass();
        etaqVar.f = str;
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
        eyee byteString = ((esij) esiiVar.build()).toByteString();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = byteString;
        etapVar.copyOnWrite();
        etaq etaqVar2 = (etaq) etapVar.instance;
        eydq eydqVar = (eydq) eydpVar.build();
        eydqVar.getClass();
        etaqVar2.g = eydqVar;
        etaqVar2.b |= 1;
        return (etaq) etapVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final etaq f() {
        bseh bsehVar;
        eyee u;
        Optional ad;
        Optional of;
        emxf.l(!efbd.g());
        esjg esjgVar = (esjg) esjh.a.createBuilder();
        bseh bsehVar2 = this.d;
        if (bsehVar2 != null) {
            String R = bsehVar2.R();
            if (TextUtils.isEmpty(R)) {
                k(this.d.C().a(), 2);
            } else {
                esjgVar.copyOnWrite();
                esjh esjhVar = (esjh) esjgVar.instance;
                R.getClass();
                esjhVar.c = R;
            }
        }
        if (this.b.B() != null) {
            for (fbuk fbukVar : this.m) {
                esje esjeVar = (esje) esjf.a.createBuilder();
                esjeVar.copyOnWrite();
                esjf esjfVar = (esjf) esjeVar.instance;
                fbukVar.getClass();
                esjfVar.d = fbukVar;
                esjfVar.b |= 1;
                fbqt b = fbqt.b(fbukVar.e);
                if (b == null) {
                    b = fbqt.UNRECOGNIZED;
                }
                esjeVar.copyOnWrite();
                ((esjf) esjeVar.instance).c = b.a();
                esjgVar.copyOnWrite();
                esjh esjhVar2 = (esjh) esjgVar.instance;
                esjf esjfVar2 = (esjf) esjeVar.build();
                esjfVar2.getClass();
                eygr eygrVar = esjhVar2.q;
                if (!eygrVar.c()) {
                    esjhVar2.q = eyfy.mutableCopy(eygrVar);
                }
                esjhVar2.q.add(esjfVar2);
            }
            emxf.l(!efbd.g());
            esjo esjoVar = (esjo) esjp.a.createBuilder();
            List list = this.k;
            esjoVar.copyOnWrite();
            esjp esjpVar = (esjp) esjoVar.instance;
            eygi eygiVar = esjpVar.b;
            if (!eygiVar.c()) {
                esjpVar.b = eyfy.mutableCopy(eygiVar);
            }
            eydl.addAll(list, esjpVar.b);
            esjp esjpVar2 = (esjp) esjoVar.build();
            esjgVar.copyOnWrite();
            esjh esjhVar3 = (esjh) esjgVar.instance;
            esjpVar2.getClass();
            esjhVar3.o = esjpVar2;
            esjhVar3.b |= 4;
            Iterable iterable = (Iterable) Collection.EL.stream(this.j).map(new Function() { // from class: csbm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ConversationSuggestion conversationSuggestion = (ConversationSuggestion) obj;
                    int i = csbq.e;
                    esis esisVar = (esis) esit.a.createBuilder();
                    String serializeProperties = conversationSuggestion.serializeProperties();
                    if (serializeProperties != null) {
                        esisVar.copyOnWrite();
                        ((esit) esisVar.instance).c = serializeProperties;
                    }
                    esiu esiuVar = (esiu) ((enot) csbr.j).d.get(Integer.valueOf(conversationSuggestion.getSuggestionType()));
                    if (esiuVar != null) {
                        esisVar.copyOnWrite();
                        ((esit) esisVar.instance).b = esiuVar.a();
                    }
                    return (esit) esisVar.build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: csbn
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }));
            esjgVar.copyOnWrite();
            esjh esjhVar4 = (esjh) esjgVar.instance;
            eygr eygrVar2 = esjhVar4.r;
            if (!eygrVar2.c()) {
                esjhVar4.r = eyfy.mutableCopy(eygrVar2);
            }
            eydl.addAll(iterable, esjhVar4.r);
        }
        ParticipantsTable.BindData bindData = this.t;
        if (bindData != null) {
            String L = bindData.L();
            if (TextUtils.isEmpty(L)) {
                k(this.t.S(), 1);
            } else {
                esjgVar.copyOnWrite();
                esjh esjhVar5 = (esjh) esjgVar.instance;
                L.getClass();
                esjhVar5.e = L;
            }
        }
        ParticipantsTable.BindData bindData2 = this.u;
        if (bindData2 != null) {
            String L2 = bindData2.L();
            if (TextUtils.isEmpty(L2)) {
                k(this.u.S(), 1);
            } else {
                esjgVar.copyOnWrite();
                esjh esjhVar6 = (esjh) esjgVar.instance;
                L2.getClass();
                esjhVar6.f = L2;
            }
        }
        String au = this.b.au();
        if (au != null) {
            esjgVar.copyOnWrite();
            ((esjh) esjgVar.instance).g = au;
        }
        String av = this.b.av();
        esjq esjqVar = (esjq) esjr.a.createBuilder();
        if (this.n.a() && this.b.d() == 2) {
            String at = this.b.at();
            if (!TextUtils.isEmpty(at)) {
                esjqVar.copyOnWrite();
                esjr esjrVar = (esjr) esjqVar.instance;
                at.getClass();
                esjrVar.c = at;
            }
        }
        if (TextUtils.isEmpty(av)) {
            int d = this.b.d();
            if ((d == 1 || d == 2 || d == 3) && (bsehVar = this.d) != null) {
                String a = cker.a(this.b, bsehVar.ac(), bsehVar);
                esjqVar.copyOnWrite();
                esjr esjrVar2 = (esjr) esjqVar.instance;
                a.getClass();
                esjrVar2.b = a;
                esjr esjrVar3 = (esjr) esjqVar.build();
                esjgVar.copyOnWrite();
                esjh esjhVar7 = (esjh) esjgVar.instance;
                esjrVar3.getClass();
                esjhVar7.s = esjrVar3;
                esjhVar7.b |= 8;
            }
        } else {
            esjqVar.copyOnWrite();
            esjr esjrVar4 = (esjr) esjqVar.instance;
            av.getClass();
            esjrVar4.b = av;
            esjr esjrVar5 = (esjr) esjqVar.build();
            esjgVar.copyOnWrite();
            esjh esjhVar8 = (esjh) esjgVar.instance;
            esjrVar5.getClass();
            esjhVar8.s = esjrVar5;
            esjhVar8.b |= 8;
        }
        esjn c = csbr.c(this.b.b());
        if (c != null) {
            esjgVar.copyOnWrite();
            ((esjh) esjgVar.instance).k = c.a();
        }
        MessageCoreData messageCoreData = this.b;
        int j = messageCoreData.j();
        String aB = messageCoreData.aB();
        esix esixVar = (esix) esiy.a.createBuilder();
        esixVar.copyOnWrite();
        ((esiy) esixVar.instance).b = j;
        if (aB != null) {
            esixVar.copyOnWrite();
            ((esiy) esixVar.instance).c = aB;
        }
        esiy esiyVar = (esiy) esixVar.build();
        esjgVar.copyOnWrite();
        esjh esjhVar9 = (esjh) esjgVar.instance;
        esiyVar.getClass();
        esjhVar9.n = esiyVar;
        esjhVar9.b |= 2;
        long o = this.b.o();
        esjgVar.copyOnWrite();
        ((esjh) esjgVar.instance).h = o;
        long r = this.b.r();
        esjgVar.copyOnWrite();
        ((esjh) esjgVar.instance).i = r;
        esjj b2 = csbr.b(this.b.d());
        if (b2 != null) {
            esjgVar.copyOnWrite();
            ((esjh) esjgVar.instance).j = b2.a();
        }
        MessageCoreData messageCoreData2 = this.b;
        String ai = messageCoreData2.ai();
        String ah = messageCoreData2.ah();
        esiq esiqVar = (esiq) esir.a.createBuilder();
        if (ai != null) {
            esiqVar.copyOnWrite();
            ((esir) esiqVar.instance).b = ai;
        }
        if (ah != null) {
            esiqVar.copyOnWrite();
            ((esir) esiqVar.instance).c = ah;
        }
        esir esirVar = (esir) esiqVar.build();
        esjgVar.copyOnWrite();
        esjh esjhVar10 = (esjh) esjgVar.instance;
        esirVar.getClass();
        esjhVar10.m = esirVar;
        esjhVar10.b |= 1;
        esiz esizVar = (esiz) ((enot) csbr.h).d.get(Integer.valueOf(this.b.g()));
        if (esizVar != null) {
            esjgVar.copyOnWrite();
            ((esjh) esjgVar.instance).l = esizVar.a();
        }
        if (cbvv.h(this.b.k())) {
            esji a2 = csbr.a(this.b.k(), this.p.a());
            if (a2 == null) {
                of = Optional.empty();
            } else if (csbp.b[a2.ordinal()] != 1) {
                of = Optional.empty();
            } else {
                esju esjuVar = (esju) esjv.a.createBuilder();
                String dn = this.b.dn(1);
                esjuVar.copyOnWrite();
                ((esjv) esjuVar.instance).b = dn;
                of = Optional.of((esjv) esjuVar.build());
            }
            if (of.isPresent()) {
                Object obj = of.get();
                esjgVar.copyOnWrite();
                esjh esjhVar11 = (esjh) esjgVar.instance;
                esjhVar11.t = (esjv) obj;
                esjhVar11.b |= 16;
            }
        } else {
            List<MessagePartCoreData> ab = this.b.ab();
            if (!ab.isEmpty()) {
                emxf.l(!efbd.g());
                ArrayList arrayList = new ArrayList();
                for (MessagePartCoreData messagePartCoreData : ab) {
                    emxf.l(!efbd.g());
                    esjk esjkVar = (esjk) esjl.a.createBuilder();
                    String aa = messagePartCoreData.aa();
                    if (aa != null) {
                        esjkVar.copyOnWrite();
                        ((esjl) esjkVar.instance).d = aa;
                    }
                    esjm esjmVar = (this.q.a() && messagePartCoreData.bt()) ? esjm.RCS_LOCATION : messagePartCoreData.bo() ? esjm.IMAGE : messagePartCoreData.bA() ? esjm.TEXT : messagePartCoreData.bD() ? esjm.VIDEO : messagePartCoreData.ba() ? esjm.AUDIO : (le.v(messagePartCoreData.V()) || le.z(messagePartCoreData.V())) ? esjm.ATTACHMENT : messagePartCoreData.bp() ? esjm.LOCATION : messagePartCoreData.bv() ? esjm.RICH_CARD : esjm.PART_TYPE_UNKNOWN;
                    esjkVar.copyOnWrite();
                    ((esjl) esjkVar.instance).e = esjmVar.a();
                    switch (csbp.c[esjmVar.ordinal()]) {
                        case 1:
                            emxf.l(!efbd.g());
                            esjs esjsVar = (esjs) esjt.a.createBuilder();
                            String ae = messagePartCoreData.ae();
                            if (ae != null) {
                                esjsVar.copyOnWrite();
                                ((esjt) esjsVar.instance).c = ae;
                            }
                            emxf.l(!efbd.g());
                            esja esjaVar = (esja) esjb.a.createBuilder();
                            bton btonVar = this.s;
                            if (btonVar != null) {
                                String s = btonVar.s();
                                if (s != null) {
                                    esjaVar.copyOnWrite();
                                    ((esjb) esjaVar.instance).b = s;
                                }
                                String r2 = this.s.r();
                                if (r2 != null) {
                                    esjaVar.copyOnWrite();
                                    ((esjb) esjaVar.instance).d = r2;
                                }
                                String n = this.s.n();
                                if (n != null) {
                                    esjaVar.copyOnWrite();
                                    ((esjb) esjaVar.instance).e = n;
                                }
                                String q = this.s.q();
                                if (q != null) {
                                    esjaVar.copyOnWrite();
                                    ((esjb) esjaVar.instance).f = q;
                                }
                                String o2 = this.s.o();
                                if (o2 != null) {
                                    esjaVar.copyOnWrite();
                                    ((esjb) esjaVar.instance).g = o2;
                                }
                                long k = this.s.k();
                                esjaVar.copyOnWrite();
                                ((esjb) esjaVar.instance).c = k;
                            }
                            esjb esjbVar = (esjb) esjaVar.build();
                            esjsVar.copyOnWrite();
                            esjt esjtVar = (esjt) esjsVar.instance;
                            esjbVar.getClass();
                            esjtVar.d = esjbVar;
                            esjtVar.b |= 1;
                            esjt esjtVar2 = (esjt) esjsVar.build();
                            esjkVar.copyOnWrite();
                            esjl esjlVar = (esjl) esjkVar.instance;
                            esjtVar2.getClass();
                            esjlVar.c = esjtVar2;
                            esjlVar.b = 3;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            Optional optional = this.r;
                            emxf.l(!efbd.g());
                            esin esinVar = (esin) esio.a.createBuilder();
                            Uri t = messagePartCoreData.t();
                            if (t != null) {
                                try {
                                    long b3 = this.i.b(t);
                                    esinVar.copyOnWrite();
                                    ((esio) esinVar.instance).e = b3;
                                } catch (SecurityException e2) {
                                    ((ensz) ((ensz) ((ensz) this.g.j()).g(e2)).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsObjectBuilderImpl", "getAttachmentModelPartFromData", (char) 709, "CmsObjectBuilderImpl.java")).q("Unable to access URI");
                                }
                            }
                            if (esjmVar.equals(esjm.IMAGE)) {
                                if (optional.isPresent()) {
                                    csbg csbgVar = (csbg) optional.get();
                                    if (csbgVar.a().containsKey(messagePartCoreData.aa())) {
                                        csbi csbiVar = (csbi) csbgVar.a().get(messagePartCoreData.aa());
                                        csbiVar.getClass();
                                        u = csbiVar.a();
                                    } else {
                                        u = null;
                                    }
                                } else {
                                    u = this.h.u(messagePartCoreData);
                                }
                                if (u != null) {
                                    esinVar.copyOnWrite();
                                    ((esio) esinVar.instance).i = u;
                                    int i = csbp.d[this.h.y.ordinal()];
                                    esip esipVar = i != 1 ? i != 2 ? i != 3 ? esip.ATTACHMENT_TYPE_UNKNOWN : esip.IMAGE_WEBP : esip.IMAGE_JPEG : esip.IMAGE_PNG;
                                    esinVar.copyOnWrite();
                                    ((esio) esinVar.instance).j = esipVar.a();
                                }
                            }
                            String V = messagePartCoreData.V();
                            if (V != null) {
                                esip esipVar2 = (esip) ((enot) csbr.i).d.get(V);
                                if (esipVar2 == null) {
                                    esipVar2 = esip.ATTACHMENT_TYPE_UNKNOWN;
                                }
                                esinVar.copyOnWrite();
                                ((esio) esinVar.instance).f = esipVar2.a();
                            }
                            String S = messagePartCoreData.S();
                            if (!TextUtils.isEmpty(S)) {
                                esinVar.copyOnWrite();
                                esio esioVar = (esio) esinVar.instance;
                                S.getClass();
                                esioVar.d = S;
                            }
                            byte[] bJ = messagePartCoreData.bJ();
                            if (bJ != null) {
                                eyee x = eyee.x(bJ);
                                esinVar.copyOnWrite();
                                ((esio) esinVar.instance).b = x;
                            }
                            String R2 = messagePartCoreData.R();
                            if (!TextUtils.isEmpty(R2)) {
                                esinVar.copyOnWrite();
                                esio esioVar2 = (esio) esinVar.instance;
                                R2.getClass();
                                esioVar2.g = R2;
                            }
                            byte[] bI = messagePartCoreData.bI();
                            if (bI != null) {
                                eyee x2 = eyee.x(bI);
                                esinVar.copyOnWrite();
                                ((esio) esinVar.instance).c = x2;
                            }
                            String Y = messagePartCoreData.Y();
                            if (Y != null) {
                                esinVar.copyOnWrite();
                                ((esio) esinVar.instance).h = Y;
                            }
                            long k2 = messagePartCoreData.k();
                            esinVar.copyOnWrite();
                            ((esio) esinVar.instance).m = k2;
                            long c2 = messagePartCoreData.c();
                            long b4 = messagePartCoreData.b();
                            esinVar.copyOnWrite();
                            ((esio) esinVar.instance).l = c2;
                            esinVar.copyOnWrite();
                            ((esio) esinVar.instance).k = b4;
                            esio esioVar3 = (esio) esinVar.build();
                            esjkVar.copyOnWrite();
                            esjl esjlVar2 = (esjl) esjkVar.instance;
                            esioVar3.getClass();
                            esjlVar2.c = esioVar3;
                            esjlVar2.b = 4;
                            break;
                        case 7:
                        case 8:
                            esjc esjcVar = (esjc) esjd.a.createBuilder();
                            LocationInformation K = messagePartCoreData.K();
                            if (K != null) {
                                double d2 = K.d;
                                esjcVar.copyOnWrite();
                                ((esjd) esjcVar.instance).b = d2;
                                double d3 = K.c;
                                esjcVar.copyOnWrite();
                                ((esjd) esjcVar.instance).c = d3;
                                String str = K.a;
                                if (str != null) {
                                    esjcVar.copyOnWrite();
                                    ((esjd) esjcVar.instance).d = str;
                                }
                            }
                            esjd esjdVar = (esjd) esjcVar.build();
                            esjkVar.copyOnWrite();
                            esjl esjlVar3 = (esjl) esjkVar.instance;
                            esjdVar.getClass();
                            esjlVar3.c = esjdVar;
                            esjlVar3.b = 5;
                            break;
                    }
                    arrayList.add((esjl) esjkVar.build());
                }
                esjgVar.copyOnWrite();
                esjh esjhVar12 = (esjh) esjgVar.instance;
                eygr eygrVar3 = esjhVar12.p;
                if (!eygrVar3.c()) {
                    esjhVar12.p = eyfy.mutableCopy(eygrVar3);
                }
                eydl.addAll(arrayList, esjhVar12.p);
            }
        }
        boolean cF = this.b.cF();
        esjgVar.copyOnWrite();
        ((esjh) esjgVar.instance).u = cF;
        String d4 = bdhg.d(this.b.E());
        if (d4 != null) {
            esjgVar.copyOnWrite();
            esjh esjhVar13 = (esjh) esjgVar.instance;
            esjhVar13.b |= 32;
            esjhVar13.v = d4;
        }
        if (((Boolean) ((cfup) csgj.W.get()).e()).booleanValue() && (ad = this.b.ad()) != null && ad.isPresent()) {
            String uuid = ((UUID) ad.get()).toString();
            esjgVar.copyOnWrite();
            esjh esjhVar14 = (esjh) esjgVar.instance;
            uuid.getClass();
            esjhVar14.x = uuid;
        }
        String d5 = bdhg.d(this.b.D());
        if (!emxe.c(d5)) {
            esjgVar.copyOnWrite();
            esjh esjhVar15 = (esjh) esjgVar.instance;
            d5.getClass();
            esjhVar15.b |= 64;
            esjhVar15.w = d5;
        }
        esjh esjhVar16 = (esjh) esjgVar.build();
        esii esiiVar = (esii) esij.a.createBuilder();
        l(esjhVar16.toByteArray(), this.o, esiiVar);
        etap etapVar = (etap) etaq.a.createBuilder();
        String str2 = csbj.OBJECT_PAYLOAD_PART_ENCRYPTED_RARELY_CHANGED.d;
        etapVar.copyOnWrite();
        etaq etaqVar = (etaq) etapVar.instance;
        str2.getClass();
        etaqVar.f = str2;
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
        eyee byteString = ((esij) esiiVar.build()).toByteString();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = byteString;
        etapVar.copyOnWrite();
        etaq etaqVar2 = (etaq) etapVar.instance;
        eydq eydqVar = (eydq) eydpVar.build();
        eydqVar.getClass();
        etaqVar2.g = eydqVar;
        etaqVar2.b = 1 | etaqVar2.b;
        return (etaq) etapVar.build();
    }
}
