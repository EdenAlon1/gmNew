package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csbe implements csak {
    public static final cskc a = cskc.g("BugleCms", "CmsMessagesFactoryImpl");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsMessagesFactoryImpl");
    public final eszz c;
    public final csbt e;
    private final bdtd j;
    private final String k;
    private final Optional l;
    private final akzt m;
    private final ashs n;
    private final ashx o;
    private final ataa p;
    private final asyh q;
    private final aszy r;
    public boolean f = false;
    public Optional g = null;
    private ConversationIdType s = null;
    public final Supplier d = new csbc(this);
    private final Supplier h = new csaz(this);
    private final emyl i = emys.a(new emyl() { // from class: csau
        @Override // defpackage.emyl
        public final Object get() {
            csbe csbeVar = csbe.this;
            try {
                csbt csbtVar = csbeVar.e;
                Optional b2 = csbt.b(csbeVar.c, csbj.OBJECT_PAYLOAD_PART_ADDITIONAL_FIELDS.d);
                if (b2.isEmpty()) {
                    return eshh.a;
                }
                eydq eydqVar = ((etaq) b2.get()).g;
                if (eydqVar == null) {
                    eydqVar = eydq.a;
                }
                return (eshh) csbtVar.a.a((esij) eyfy.parseFrom(esij.a, eydqVar.c, eyfc.a()), eshh.a);
            } catch (cryh e) {
                csjb e2 = csbe.a.e();
                e2.I("Message AdditionalFields decryption succeeded. Original exception is logged below.");
                e2.A("object_cms_id", csbeVar.c.c);
                e2.s(e);
                csbeVar.f = true;
                return (eshh) e.a;
            } catch (eygu e3) {
                csjb e4 = csbe.a.e();
                e4.I("Failed to create AdditionalFields.");
                e4.A("object_cms_id", csbeVar.c.c);
                e4.s(e3);
                throw new csaw(e3);
            }
        }
    });

    public csbe(bdtd bdtdVar, csbt csbtVar, akzt akztVar, ashs ashsVar, ashx ashxVar, ataa ataaVar, asyh asyhVar, aszy aszyVar, eszz eszzVar, String str, Optional optional) {
        this.e = csbtVar;
        this.j = bdtdVar;
        this.m = akztVar;
        this.k = str;
        this.l = optional;
        this.n = ashsVar;
        this.o = ashxVar;
        this.p = ataaVar;
        this.q = asyhVar;
        this.r = aszyVar;
        this.c = eszzVar;
    }

    public static bton e(esjb esjbVar) {
        String[] strArr = btqq.a;
        btos btosVar = new btos();
        btosVar.n(esjbVar.b);
        btosVar.e(esjbVar.c);
        btosVar.l(esjbVar.d);
        btosVar.g(esjbVar.e);
        btosVar.h(esjbVar.g);
        btosVar.i(esjbVar.f);
        return btosVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ConversationIdType g(final String str) {
        ConversationIdType conversationIdType;
        ConversationIdType conversationIdType2;
        boolean a2 = this.r.a();
        if (a2 && (conversationIdType2 = this.s) != null) {
            return conversationIdType2;
        }
        ekzz f = eleg.f("CmsMessagesFactoryImpl#getBugleConversationId");
        try {
            if (a2) {
                bsob e = bsom.e();
                e.z("CmsMessagesFactoryImpl#getBugleConversationId");
                e.i(new Function() { // from class: csam
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        bsolVar.e(str);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                e.g(new Function() { // from class: csan
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bskp) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                engw y = e.b().y();
                if (((enou) y).c != 1) {
                    throw new csav(String.format("Unable to get Conversation data for conversation_cms_id: %s, object_cms_id: %s", str, this.c.c));
                }
                conversationIdType = ((bseh) y.get(0)).C();
                this.s = conversationIdType;
            } else {
                conversationIdType = (ConversationIdType) bsom.h(str, new Function() { // from class: csao
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bseh) obj).C();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Supplier() { // from class: csap
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        throw new csav(String.format("Unable to get Conversation data for conversation_cms_id: %s, object_cms_id: %s", str, csbe.this.c.c));
                    }
                });
            }
            f.close();
            return conversationIdType;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0456, code lost:
    
        if (r6.equals(defpackage.esjj.RCS) != false) goto L244;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v8, types: [aoku, java.lang.Object] */
    @Override // defpackage.csak
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData a() {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csbe.a():com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData");
    }

    @Override // defpackage.csak
    public final eshh b() {
        eshh eshhVar;
        ekzz f = eleg.f("CmsMessagesFactoryImpl#getAdditionalFields");
        try {
            if (this.n.a() && csgj.a()) {
                emxf.l(!efbd.g());
                eshhVar = (eshh) this.i.get();
            } else {
                eshhVar = eshh.a;
            }
            f.close();
            return eshhVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.csak
    public final List c() {
        esip esipVar;
        ekzz f = eleg.f("CmsMessagesFactoryImpl#getMessagePartsList");
        try {
            emxf.l(!efbd.g());
            int i = engw.d;
            engr engrVar = new engr();
            for (esjl esjlVar : ((csbc) this.d).a().p) {
                String str = this.c.m;
                ekzz f2 = eleg.f("CmsMessagesFactoryImpl#restorePartsForMessagePartModel");
                try {
                    String[] strArr = PartsTable.a;
                    bvwq bvwqVar = new bvwq();
                    if (!str.isEmpty()) {
                        bvwqVar.u(g(str));
                    }
                    esjm b2 = esjm.b(esjlVar.e);
                    if (b2 == null) {
                        b2 = esjm.UNRECOGNIZED;
                    }
                    switch (b2.ordinal()) {
                        case 1:
                            esjt esjtVar = esjlVar.b == 3 ? (esjt) esjlVar.c : esjt.a;
                            bvwqVar.Y(esjtVar.c);
                            bvwqVar.t("text/plain");
                            esjb esjbVar = esjtVar.d;
                            if (esjbVar == null) {
                                esjbVar = esjb.a;
                            }
                            if (esjbVar.equals(esjb.a)) {
                                this.g = Optional.empty();
                                break;
                            } else {
                                esjb esjbVar2 = esjtVar.d;
                                if (esjbVar2 == null) {
                                    esjbVar2 = esjb.a;
                                }
                                this.g = Optional.of(e(esjbVar2));
                                break;
                            }
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                            esio esioVar = esjlVar.b == 4 ? (esio) esjlVar.c : esio.a;
                            bvwqVar.n(esioVar.d);
                            bvwqVar.l(esioVar.g);
                            bvwqVar.y(esioVar.h);
                            bvwqVar.v(esioVar.m);
                            bvwqVar.ad((int) esioVar.l);
                            bvwqVar.A((int) esioVar.k);
                            bvwqVar.X(esioVar.e);
                            bvwqVar.o(esioVar.b.I());
                            bvwqVar.m(esioVar.c.I());
                            bvwqVar.k(byyu.CMS_MEDIA_DOWNLOAD_NOT_STARTED);
                            switch (esioVar.f) {
                                case 0:
                                    esipVar = esip.ATTACHMENT_TYPE_UNKNOWN;
                                    break;
                                case 1:
                                    esipVar = esip.IMAGE_JPEG;
                                    break;
                                case 2:
                                    esipVar = esip.IMAGE_JPG;
                                    break;
                                case 3:
                                    esipVar = esip.IMAGE_PNG;
                                    break;
                                case 4:
                                    esipVar = esip.IMAGE_GIF;
                                    break;
                                case 5:
                                    esipVar = esip.IMAGE_WEBP;
                                    break;
                                case 6:
                                    esipVar = esip.IMAGE_HEIF;
                                    break;
                                case 7:
                                    esipVar = esip.IMAGE_WBMP;
                                    break;
                                case 8:
                                    esipVar = esip.IMAGE_X_MS_BMP;
                                    break;
                                case 9:
                                    esipVar = esip.VIDEO_MP4;
                                    break;
                                case 10:
                                    esipVar = esip.VIDEO_3G2;
                                    break;
                                case 11:
                                    esipVar = esip.VIDEO_3GPP;
                                    break;
                                case 12:
                                    esipVar = esip.VIDEO_WEBM;
                                    break;
                                case 13:
                                    esipVar = esip.VIDEO_MKV;
                                    break;
                                case 14:
                                    esipVar = esip.AUDIO_AAC;
                                    break;
                                case 15:
                                    esipVar = esip.AUDIO_AMR;
                                    break;
                                case 16:
                                    esipVar = esip.AUDIO_MP3;
                                    break;
                                case 17:
                                    esipVar = esip.AUDIO_MPEG;
                                    break;
                                case 18:
                                    esipVar = esip.AUDIO_MPG;
                                    break;
                                case 19:
                                    esipVar = esip.AUDIO_MP4;
                                    break;
                                case 20:
                                    esipVar = esip.AUDIO_MP4_LATM;
                                    break;
                                case 21:
                                    esipVar = esip.AUDIO_3GPP;
                                    break;
                                case 22:
                                    esipVar = esip.AUDIO_OGG;
                                    break;
                                case 23:
                                    esipVar = esip.TEXT_VCARD;
                                    break;
                                case 24:
                                    esipVar = esip.VIDEO_M4V;
                                    break;
                                case 25:
                                    esipVar = esip.VIDEO_MPEG4;
                                    break;
                                case 26:
                                    esipVar = esip.VIDEO_MPEG;
                                    break;
                                case 27:
                                    esipVar = esip.VIDEO_3GP;
                                    break;
                                case 28:
                                    esipVar = esip.APP_PDF;
                                    break;
                                case 29:
                                    esipVar = esip.APP_TXT;
                                    break;
                                case 30:
                                    esipVar = esip.APP_HTML;
                                    break;
                                case 31:
                                    esipVar = esip.AUDIO_OGG2;
                                    break;
                                case 32:
                                    esipVar = esip.APP_SMIL;
                                    break;
                                case 33:
                                    esipVar = esip.IMAGE_HEIC;
                                    break;
                                case 34:
                                    esipVar = esip.TEXT_VCARD_RECEIVE;
                                    break;
                                default:
                                    esipVar = null;
                                    break;
                            }
                            if (esipVar == null) {
                                esipVar = esip.UNRECOGNIZED;
                            }
                            String str2 = (String) csbr.i.get(esipVar);
                            if (str2 != null) {
                                bvwqVar.t(str2);
                                break;
                            }
                            break;
                        case 6:
                        case 8:
                            esjd esjdVar = esjlVar.b == 5 ? (esjd) esjlVar.c : esjd.a;
                            esjm b3 = esjm.b(esjlVar.e);
                            if (b3 == null) {
                                b3 = esjm.UNRECOGNIZED;
                            }
                            boolean a2 = this.q.a();
                            bvwqVar.D(esjdVar.b);
                            bvwqVar.F(esjdVar.c);
                            bvwqVar.Y(esjdVar.d);
                            if (a2 && b3.equals(esjm.RCS_LOCATION)) {
                                bvwqVar.t("application/vnd.gsma.rcspushlocation+xml");
                                break;
                            }
                            break;
                    }
                    PartsTable.BindData a3 = bvwqVar.a();
                    f2.close();
                    engrVar.h(a3);
                } finally {
                }
            }
            engw g = engrVar.g();
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.csak
    public final boolean d() {
        return this.f;
    }
}
