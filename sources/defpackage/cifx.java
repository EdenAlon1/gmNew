package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cifx implements cifg {
    public final bbfb a;
    public final ffbr b;
    public final ffbr c;
    public final errl d;
    public final errl e;
    public final cgzv f;
    public final akzt g;
    public final cqoh h;
    public final bcvw i;
    public final bcwz j;
    public final byzp k;
    public final aolr l;
    public final chdj m;
    public final bdtd n;
    public final Optional o;
    public final ffbr p;
    private final Context q;
    private final ctvb r;
    private final albq s;

    public cifx(Context context, bbfb bbfbVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, cgzv cgzvVar, akzt akztVar, cqoh cqohVar, bcvw bcvwVar, bcwz bcwzVar, byzp byzpVar, ctvb ctvbVar, albq albqVar, aolr aolrVar, chdj chdjVar, bdtd bdtdVar, Optional optional, ffbr ffbrVar3) {
        this.q = context;
        this.a = bbfbVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = errlVar;
        this.e = errlVar2;
        this.f = cgzvVar;
        this.g = akztVar;
        this.h = cqohVar;
        this.i = bcvwVar;
        this.j = bcwzVar;
        this.k = byzpVar;
        this.r = ctvbVar;
        this.s = albqVar;
        this.l = aolrVar;
        this.m = chdjVar;
        this.n = bdtdVar;
        this.o = optional;
        this.p = ffbrVar3;
    }

    public static boolean e(eyee eyeeVar) {
        return eyeeVar != null && bcyf.c(eyeeVar.I());
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        final esbu esbuVar = (esbu) eyhsVar;
        if (this.r.G()) {
            return elfo.h(new erog() { // from class: cifh
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    final esbu esbuVar2 = esbuVar;
                    if (!esbuVar2.f.isEmpty()) {
                        final String str = esbuVar2.f;
                        ekzz f = eleg.f("SendMessageDelegate#hasMessageWithWebId");
                        try {
                            csix.h();
                            buxo d = MessagesTable.d();
                            d.z("hasMessageWithWebId");
                            d.h(new Function() { // from class: cifk
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    buxz buxzVar = (buxz) obj;
                                    int intValue = MessagesTable.g().intValue();
                                    if (intValue < 19020) {
                                        dtub.w("web_id", intValue);
                                    }
                                    buxzVar.aq(new dtrt("messages.web_id", 1, String.valueOf(str)));
                                    return buxzVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            d.f(new Function() { // from class: cifl
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((buum) obj).a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            boolean T = d.b().T();
                            f.close();
                            if (T) {
                                esbv esbvVar = (esbv) esbx.a.createBuilder();
                                esbvVar.copyOnWrite();
                                ((esbx) esbvVar.instance).b = esbw.a(4);
                                return elfo.e((esbx) esbvVar.build());
                            }
                        } catch (Throwable th) {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    final cifx cifxVar = cifx.this;
                    csta cstaVar = (csta) cifxVar.p.b();
                    escu escuVar = esbuVar2.e;
                    if (escuVar == null) {
                        escuVar = escu.a;
                    }
                    Optional a = cstaVar.a(escuVar);
                    if (a.isEmpty()) {
                        cifxVar.g.c("Bugle.Ditto.SendMessage.MultiSim.InvalidSubscriptionId.Count");
                        esbv esbvVar2 = (esbv) esbx.a.createBuilder();
                        esbvVar2.copyOnWrite();
                        ((esbx) esbvVar2.instance).b = esbw.a(4);
                        return elfo.e((esbx) esbvVar2.build());
                    }
                    final int intValue = ((Integer) a.get()).intValue();
                    final SelfIdentityId g = cifxVar.n.g(intValue).g();
                    final erzn erznVar = esbuVar2.d;
                    if (erznVar == null) {
                        erznVar = erzn.a;
                    }
                    eygr eygrVar = erznVar.k;
                    emwl emwlVar = new emwl() { // from class: cifp
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            erzk erzkVar = (erzk) obj;
                            int i = erzkVar.b;
                            final cifx cifxVar2 = cifx.this;
                            if (i != 3) {
                                return i == 4 ? elfo.d(new IllegalStateException("Legacy sticker is no longer supported!")) : i == 2 ? elfo.e(new cifw(cifxVar2.j.i(((esas) erzkVar.c).b))) : elfo.d(new IllegalStateException("The part doesn't have any content!"));
                            }
                            final erzg erzgVar = (erzg) erzkVar.c;
                            final cgzv cgzvVar = cifxVar2.f;
                            final String str2 = erzgVar.d;
                            erzf b = erzf.b(erzgVar.c);
                            if (b == null) {
                                b = erzf.UNRECOGNIZED;
                            }
                            chdj chdjVar = cifxVar2.m;
                            final Optional empty = ((Boolean) cgcv.a.e()).booleanValue() ? cifxVar2.o : Optional.empty();
                            final String d2 = le.d((String) ((enot) cgzv.h).d.get(b));
                            return elfl.g(chdjVar != null ? elfr.k(chdjVar.k(), new eroh() { // from class: cgyk
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    return ((chgr) cgzv.this.m.b()).b((fcdu) obj2, empty, str2, d2);
                                }
                            }, (Executor) cgzvVar.w.get()) : erny.g(((cgwk) cgzvVar.k.b()).s(), new eroh() { // from class: cgyu
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    return ((chgr) cgzv.this.m.b()).b((fcdu) obj2, empty, str2, d2);
                                }
                            }, (Executor) cgzvVar.w.get())).i(new eroh() { // from class: cifj
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    String str3;
                                    cifx cifxVar3 = cifx.this;
                                    akzt akztVar = cifxVar3.g;
                                    erzg erzgVar2 = erzgVar;
                                    Uri uri = (Uri) obj2;
                                    akztVar.g("Bugle.Ditto.Blobstore.Attachment.Downloaded.Bytes", erzgVar2.f);
                                    if (cifx.e(erzgVar2.l)) {
                                        uri = cifxVar3.d(erzgVar2, uri);
                                    }
                                    cqoh cqohVar = cifxVar3.h;
                                    if (erzgVar2.o.isEmpty()) {
                                        csjy.i("BugleNetwork", "Mime type not set, falling back to content type");
                                        enot enotVar = ((enot) cgzv.h).d;
                                        erzf b2 = erzf.b(erzgVar2.c);
                                        if (b2 == null) {
                                            b2 = erzf.UNRECOGNIZED;
                                        }
                                        str3 = (String) enotVar.get(b2);
                                        str3.getClass();
                                    } else {
                                        str3 = erzgVar2.o;
                                    }
                                    bcwz bcwzVar = cifxVar3.j;
                                    String c = le.c(str3);
                                    bcxb C = bcxc.C();
                                    bcqk bcqkVar = (bcqk) C;
                                    bcqkVar.c = c;
                                    bcqkVar.d = uri;
                                    C.o(eohh.BLOBSTORE);
                                    MessagePartData c2 = bcwzVar.c(C.r());
                                    if (!erzgVar2.e.isEmpty()) {
                                        c2.az(erzgVar2.e);
                                    }
                                    if (!erzgVar2.d.isEmpty()) {
                                        c2.ao(erzgVar2.d);
                                        c2.ap(cqohVar.f().toEpochMilli());
                                    }
                                    if (cifx.e(erzgVar2.l)) {
                                        c2.aA(erzgVar2.l.I());
                                    }
                                    return elfo.e(new cifw(c2));
                                }
                            }, cifxVar2.d);
                        }
                    };
                    enhd enhdVar = new enhd();
                    for (Object obj : eygrVar) {
                        enhdVar.k(obj, emwlVar.apply(obj));
                    }
                    final enhk b = enhdVar.b();
                    return elfo.l(b.values()).b(new erog() { // from class: cifq
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            Stream stream = Collection.EL.stream(erzn.this.k);
                            final Map map = b;
                            return elfo.a((ArrayList) stream.map(new Function() { // from class: cifv
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    elfl elflVar = (elfl) map.get((erzk) obj2);
                                    elflVar.getClass();
                                    return elflVar.h(new emwl() { // from class: cifm
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            return ((cifw) obj3).a;
                                        }
                                    }, erpp.a);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new Supplier() { // from class: cifi
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new ArrayList();
                                }
                            })));
                        }
                    }, cifxVar.e).i(new eroh() { // from class: cifr
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            List list;
                            elfl b2;
                            List list2 = (List) obj2;
                            final esbu esbuVar3 = esbuVar2;
                            final ConversationIdType b3 = bdgq.b(esbuVar3.c);
                            final cifx cifxVar2 = cifx.this;
                            Stream stream = Collection.EL.stream(((bdfw) cifxVar2.c.b()).a(b3, true));
                            final aolr aolrVar = cifxVar2.l;
                            aolrVar.getClass();
                            Stream map = stream.map(new Function() { // from class: cifn
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return aolr.this.r((String) obj3);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = engw.d;
                            engw engwVar = (engw) map.collect(endq.a);
                            boolean z = false;
                            if ((esbuVar3.b & 2) != 0) {
                                escu escuVar2 = esbuVar3.e;
                                if (escuVar2 == null) {
                                    escuVar2 = escu.a;
                                }
                                int b4 = esct.b(escuVar2.b);
                                emxf.l(!(b4 != 0 && b4 == 3));
                            }
                            bcyk a2 = ((azwh) cifxVar2.b.b()).a(b3);
                            if (a2 != null && (a2.d() == 2 || a2.d() == 1)) {
                                z = true;
                            }
                            if (!esbuVar3.g || z) {
                                bcvw bcvwVar = cifxVar2.i;
                                erzn erznVar2 = esbuVar3.d;
                                if (erznVar2 == null) {
                                    erznVar2 = erzn.a;
                                }
                                erzp erzpVar = erznVar2.i;
                                if (erzpVar == null) {
                                    erzpVar = erzp.a;
                                }
                                String str2 = (erzpVar.b == 1 ? (esas) erzpVar.c : esas.a).b;
                                if (TextUtils.isEmpty(str2)) {
                                    erzn erznVar3 = esbuVar3.d;
                                    if (erznVar3 == null) {
                                        erznVar3 = erzn.a;
                                    }
                                    Iterator<E> it = erznVar3.k.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        erzk erzkVar = (erzk) it.next();
                                        if (erzkVar.b == 2) {
                                            str2 = ((esas) erzkVar.c).b;
                                            break;
                                        }
                                    }
                                }
                                list = list2;
                                b2 = bcvwVar.b(b3, engwVar, null, str2, list, intValue, false, false);
                            } else {
                                b2 = elfo.e(3);
                                list = list2;
                            }
                            elfl elflVar = b2;
                            final SelfIdentityId selfIdentityId = g;
                            final List list3 = list;
                            return elflVar.h(new emwl() { // from class: cifo
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    MessageCoreData j = cifx.this.k.j(((Integer) obj3).intValue(), b3, selfIdentityId);
                                    ((MessageData) j).i.addAll(list3);
                                    j.ca(esbuVar3.f);
                                    return j;
                                }
                            }, cifxVar2.d);
                        }
                    }, cifxVar.d).h(new emwl() { // from class: cifs
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            MessageCoreData messageCoreData = (MessageCoreData) obj2;
                            esbk esbkVar = esbu.this.h;
                            if (esbkVar == null) {
                                esbkVar = esbk.a;
                            }
                            String str2 = esbkVar.b;
                            if (!emxe.c(str2)) {
                                messageCoreData.bO(cnmc.a(bdhb.b(str2)));
                            }
                            return messageCoreData;
                        }
                    }, cifxVar.e).h(new emwl() { // from class: cift
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            MessageCoreData messageCoreData = (MessageCoreData) obj2;
                            cifx.this.a.f(messageCoreData, intValue, false).A();
                            csjy.i("BugleNetwork", "Inserted new message ".concat(String.valueOf(String.valueOf(messageCoreData))));
                            esbv esbvVar3 = (esbv) esbx.a.createBuilder();
                            esbvVar3.copyOnWrite();
                            ((esbx) esbvVar3.instance).b = esbw.a(3);
                            return (esbx) esbvVar3.build();
                        }
                    }, cifxVar.d).e(Throwable.class, new emwl() { // from class: cifu
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Throwable th3 = (Throwable) obj2;
                            csjy.k("BugleNetwork", th3, "Failed to send message");
                            int i = true != (th3 instanceof IllegalArgumentException) ? 5 : 4;
                            esbv esbvVar3 = (esbv) esbx.a.createBuilder();
                            esbvVar3.copyOnWrite();
                            ((esbx) esbvVar3.instance).b = esbw.a(i);
                            return (esbx) esbvVar3.build();
                        }
                    }, erpp.a);
                }
            }, this.d);
        }
        esbv esbvVar = (esbv) esbx.a.createBuilder();
        esbvVar.copyOnWrite();
        ((esbx) esbvVar.instance).b = esbw.a(6);
        return elfo.e((esbx) esbvVar.build());
    }

    @Override // defpackage.cifg
    public final /* synthetic */ eyhs c(eyee eyeeVar) {
        return (esbu) eyfy.parseFrom(esbu.a, eyeeVar);
    }

    final Uri d(erzg erzgVar, Uri uri) {
        String str;
        bcyf bcyfVar = new bcyf(erzgVar.l.I());
        if (erzgVar.o.isEmpty()) {
            csjy.i("BugleNetwork", "Mime type not set, falling back to content type");
            enot enotVar = ((enot) cgzv.h).d;
            erzf b = erzf.b(erzgVar.c);
            if (b == null) {
                b = erzf.UNRECOGNIZED;
            }
            String str2 = (String) enotVar.get(b);
            str2.getClass();
            str = le.d(str2);
        } else {
            str = erzgVar.o;
        }
        Context context = this.q;
        String c = le.c(str);
        File i = cbgi.i(uri, context);
        Uri d = cbgi.d(c, this.q);
        File i2 = cbgi.i(d, this.q);
        String uuid = UUID.randomUUID().toString();
        this.s.c("Bugle.Ditto.Attachment.Decrypt.Latency", uuid);
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(i);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(i2);
                    try {
                        this.f.A(fileInputStream, fileOutputStream, bcyfVar);
                        cbgi.j(this.q, uri);
                        fileOutputStream.close();
                        fileInputStream.close();
                        return d == null ? uri : d;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.s.p("Bugle.Ditto.Attachment.Decrypt.Latency", uuid);
            }
        } catch (IOException | GeneralSecurityException e) {
            csjy.p("BugleNetwork", e, "Failed to decrypt attachment");
            cbgi.j(this.q, uri);
            cbgi.j(this.q, d);
            throw e;
        }
    }
}
