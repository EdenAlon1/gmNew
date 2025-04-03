package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpvp implements cptb {
    private final Optional A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    private final ffbr F;
    private final ffbr G;
    private final ffbr H;
    private final asmj I;
    private final ffbr J;
    public final cqoh c;
    public final errl d;
    public final ffbr e;
    public final ffbr f;
    private final Context h;
    private final dtuu i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final coxk n;
    private final byzp o;
    private final bcwz p;
    private final ccpr q;
    private final comc r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;
    private final ffbr x;
    private final ffbr y;
    private final ffbr z;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync");
    private static final cfup g = cfvl.e(cfvl.b, "reverse_telephony_sync__max_retries", 30);
    public static final cfup b = cfvl.e(cfvl.b, "reverse_telephony_sync__max_number_of_entries_in_start_times_history", 10);

    public cpvp(Context context, dtuu dtuuVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, coxk coxkVar, byzp byzpVar, bcwz bcwzVar, ccpr ccprVar, comy comyVar, cqoh cqohVar, errl errlVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, Optional optional, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, asmj asmjVar, ffbr ffbrVar22) {
        this.h = context;
        this.i = dtuuVar;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.l = ffbrVar3;
        this.m = ffbrVar4;
        this.n = coxkVar;
        this.o = byzpVar;
        this.p = bcwzVar;
        this.q = ccprVar;
        this.c = cqohVar;
        this.d = errlVar;
        comu c = comv.c();
        c.d(comb.REVERSE_TELEPHONY_SYNC_STATE);
        c.f(cpvu.a);
        this.r = comyVar.a(c.a());
        this.s = ffbrVar5;
        this.t = ffbrVar6;
        this.u = ffbrVar7;
        this.v = ffbrVar8;
        this.w = ffbrVar9;
        this.x = ffbrVar10;
        this.y = ffbrVar11;
        this.e = ffbrVar12;
        this.z = ffbrVar13;
        this.A = optional;
        this.B = ffbrVar14;
        this.C = ffbrVar15;
        this.D = ffbrVar16;
        this.E = ffbrVar17;
        this.F = ffbrVar18;
        this.G = ffbrVar19;
        this.H = ffbrVar20;
        this.f = ffbrVar21;
        this.I = asmjVar;
        this.J = ffbrVar22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MessageCoreData e(final buuo buuoVar) {
        MessageCoreData a2 = this.o.a();
        a2.bZ((MessagesTable.BindData) buuoVar.cO());
        bwdf c = PartsTable.c();
        c.z("getMessageCoreData");
        c.h(new Function() { // from class: cptx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                enru enruVar = cpvp.a;
                bwdmVar.n(buuo.this.q());
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = c.b().y();
        int i = ((enou) y).c;
        for (int i2 = 0; i2 < i; i2++) {
            a2.aL(this.p.e((PartsTable.BindData) y.get(i2)));
        }
        return a2;
    }

    private static eyee f(UUID uuid) {
        return eyee.x(ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
    }

    private final void g() {
        Intent registerReceiver = this.h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            throw new cpwr("Unable to get device charging state because battery status intent of the device is null.");
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra != 2 && intExtra != 5) {
            throw new cpwr("Device is not charging.");
        }
    }

    private final void h(final Function function, final BiFunction biFunction) {
        this.r.m(new emwl() { // from class: cpvm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Object apply;
                Object apply2;
                cpvu cpvuVar = (cpvu) obj;
                enru enruVar = cpvp.a;
                cpvr cpvrVar = (cpvr) cpvuVar.toBuilder();
                cpvs cpvsVar = (cpvs) cpvt.a.createBuilder();
                cpvt cpvtVar = cpvuVar.c;
                if (cpvtVar == null) {
                    cpvtVar = cpvt.a;
                }
                Function function2 = function;
                BiFunction biFunction2 = BiFunction.this;
                apply = function2.apply(cpvtVar);
                apply2 = biFunction2.apply(cpvsVar, Integer.valueOf(((Integer) apply).intValue() + 1));
                cpvrVar.a((cpvt) ((cpvs) apply2).build());
                return (cpvu) cpvrVar.build();
            }
        });
    }

    private final void i() {
        h(new Function() { // from class: cpvn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cpvt) obj).e);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BiFunction() { // from class: cpvo
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                cpvs cpvsVar = (cpvs) obj;
                int intValue = ((Integer) obj2).intValue();
                cpvsVar.copyOnWrite();
                cpvt cpvtVar = (cpvt) cpvsVar.instance;
                cpvt cpvtVar2 = cpvt.a;
                cpvtVar.e = intValue;
                return cpvsVar;
            }
        });
    }

    private static void j(final buuo buuoVar) {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("markMessageAsDone");
        buxrVar.g(false);
        buxrVar.Y(new Function() { // from class: cpvj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                enru enruVar = cpvp.a;
                buxzVar.q(buuo.this.q());
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxrVar.b().e();
    }

    private final void k() {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "resetDataStoreStatus", 530, "ReverseTelephonySync.java")).q("Resetting in progress state");
        this.r.m(new emwl() { // from class: cpui
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enru enruVar = cpvp.a;
                cpvr cpvrVar = (cpvr) ((cpvu) obj).toBuilder();
                cpvs cpvsVar = (cpvs) cpvt.a.createBuilder();
                cpvsVar.copyOnWrite();
                ((cpvt) cpvsVar.instance).b = false;
                cpvt cpvtVar = (cpvt) cpvsVar.build();
                cpvrVar.copyOnWrite();
                cpvu cpvuVar = (cpvu) cpvrVar.instance;
                cpvtVar.getClass();
                cpvuVar.c = cpvtVar;
                cpvuVar.b |= 1;
                return (cpvu) cpvrVar.build();
            }
        });
    }

    private final void l() {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "resumeForwardSync", 408, "ReverseTelephonySync.java")).q("Reverse Telephony Sync complete. Resuming forward sync.");
        elfo.h(new erog() { // from class: cpuc
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl c;
                cqiy cqiyVar = (cqiy) cpvp.this.f.b();
                if (cqiyVar.d.a()) {
                    return axol.a(emau.a(cqiyVar.f, cqiyVar.g, new cqiw(cqiyVar, null)));
                }
                c = axol.c(cqiyVar.f, ffhe.a, ffsm.a, new cqix(cqiyVar, null));
                return c;
            }
        }, this.d).k(axnw.b(), erpp.a);
    }

    private final int m(MessageCoreData messageCoreData, int i) {
        aztg f = ((bdtd) this.x.b()).f(messageCoreData.v());
        if (f == null) {
            ensk j = a.j();
            j.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "getSubId", 1312, "ReverseTelephonySync.java")).D("Self id was not found. messageData.getSelfId: %s, MessageId: %s", messageCoreData.v(), messageCoreData.B());
            return ((ctwb) this.v.b()).c();
        }
        int e = f.e();
        if (i != 2 || e <= 1073745920) {
            return e;
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) h;
        enrrVar.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "getSubId", 1329, "ReverseTelephonySync.java")).q("D2D message detected. Returning DEFAULT_SUB_ID for Reverse Sync");
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void n(eolu eoluVar, int i, Optional optional) {
        try {
            cpvu cpvuVar = (cpvu) this.r.l();
            cpvt cpvtVar = cpvuVar.c;
            if (cpvtVar == null) {
                cpvtVar = cpvt.a;
            }
            ephy ephyVar = (ephy) ephz.a.createBuilder();
            ephyVar.copyOnWrite();
            ephz ephzVar = (ephz) ephyVar.instance;
            ephzVar.k = i - 1;
            ephzVar.b |= 256;
            eyev d = eyki.d(this.c.f().toEpochMilli() - eykm.b((eyja) cpvuVar.d.get(cpvuVar.d.size() - 1)));
            ephyVar.copyOnWrite();
            ephz ephzVar2 = (ephz) ephyVar.instance;
            d.getClass();
            ephzVar2.c = d;
            ephzVar2.b |= 1;
            int a2 = cptn.a(cpvtVar.f);
            ephyVar.copyOnWrite();
            ephz ephzVar3 = (ephz) ephyVar.instance;
            ephzVar3.f = a2 - 1;
            ephzVar3.b |= 8;
            int a3 = cptn.a(cpvtVar.e);
            ephyVar.copyOnWrite();
            ephz ephzVar4 = (ephz) ephyVar.instance;
            ephzVar4.g = a3 - 1;
            ephzVar4.b |= 16;
            int a4 = cptn.a(cpvtVar.d);
            ephyVar.copyOnWrite();
            ephz ephzVar5 = (ephz) ephyVar.instance;
            ephzVar5.h = a4 - 1;
            ephzVar5.b |= 32;
            int a5 = cptn.a(cpvtVar.g);
            ephyVar.copyOnWrite();
            ephz ephzVar6 = (ephz) ephyVar.instance;
            ephzVar6.e = a5 - 1;
            ephzVar6.b |= 4;
            int a6 = cptn.a(cpvtVar.h);
            ephyVar.copyOnWrite();
            ephz ephzVar7 = (ephz) ephyVar.instance;
            ephzVar7.d = a6 - 1;
            ephzVar7.b |= 2;
            int i2 = cpvtVar.c;
            ephyVar.copyOnWrite();
            ephz ephzVar8 = (ephz) ephyVar.instance;
            ephzVar8.b |= 64;
            ephzVar8.i = i2;
            int i3 = cpvtVar.i;
            ephyVar.copyOnWrite();
            ephz ephzVar9 = (ephz) ephyVar.instance;
            ephzVar9.b |= 128;
            ephzVar9.j = i3;
            if (optional.isPresent()) {
                eyee f = f((UUID) optional.get());
                ephyVar.copyOnWrite();
                ephz ephzVar10 = (ephz) ephyVar.instance;
                ephzVar10.b |= 512;
                ephzVar10.l = f;
            }
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            ephz ephzVar11 = (ephz) ephyVar.build();
            eolv eolvVar2 = eolv.a;
            ephzVar11.getClass();
            eolvVar.ax = ephzVar11;
            eolvVar.d |= 262144;
        } catch (eygu e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fillInSyncDetails", (char) 577, "ReverseTelephonySync.java")).q("Unable to get state from data store");
        }
    }

    private final void o(final MessageCoreData messageCoreData, Uri uri, int i) {
        BiConsumer biConsumer;
        lt ltVar;
        for (final MessagePartCoreData messagePartCoreData : ((MessageData) messageCoreData).i) {
            emyw.a(messageCoreData.B().equals(messagePartCoreData.B()));
            if (!messagePartCoreData.br()) {
                ensk h = a.h();
                h.Y(ente.a, "BugleBackup");
                enrr enrrVar = (enrr) h;
                enrrVar.W(10, TimeUnit.SECONDS);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1091, "ReverseTelephonySync.java")).q("Part is not missing in telephony, ignoring");
            } else if (messagePartCoreData.bb()) {
                HashMap hashMap = new HashMap();
                try {
                    try {
                        ltVar = new lt();
                        String V = messagePartCoreData.V();
                        if (V != null) {
                            ltVar.h(V.getBytes(StandardCharsets.US_ASCII));
                        }
                        String Y = messagePartCoreData.Y();
                        if (Y != null) {
                            ltVar.k(Y.getBytes());
                        }
                    } catch (Throwable th) {
                        Map.EL.forEach(hashMap, new BiConsumer() { // from class: cpuo
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                Uri uri2 = (Uri) obj;
                                InputStream inputStream = (InputStream) obj2;
                                enru enruVar = cpvp.a;
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    ensk j = cpvp.a.j();
                                    j.Y(ente.a, "BugleBackup");
                                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1190, "ReverseTelephonySync.java")).t("Error when closing file. URI: %s", uri2);
                                }
                            }

                            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                                return BiConsumer$CC.$default$andThen(this, biConsumer2);
                            }
                        });
                        throw th;
                    }
                } catch (IOException | lj e) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleBackup");
                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1180, "ReverseTelephonySync.java")).D("Unable to open input stream. MessageId: %s, PartId: %s", messageCoreData.B(), messagePartCoreData.aa());
                    biConsumer = new BiConsumer() { // from class: cpuo
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            Uri uri2 = (Uri) obj;
                            InputStream inputStream = (InputStream) obj2;
                            enru enruVar = cpvp.a;
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                ensk j2 = cpvp.a.j();
                                j2.Y(ente.a, "BugleBackup");
                                ((enrr) ((enrr) ((enrr) j2).g(e2)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1190, "ReverseTelephonySync.java")).t("Error when closing file. URI: %s", uri2);
                            }
                        }

                        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                            return BiConsumer$CC.$default$andThen(this, biConsumer2);
                        }
                    };
                }
                if (messagePartCoreData.t() == null) {
                    String ae = messagePartCoreData.ae();
                    if (ae == null) {
                        ae = "";
                    }
                    ltVar.i(ae.getBytes());
                    ltVar.d(106);
                    ltVar.k("text.txt".getBytes(StandardCharsets.US_ASCII));
                } else {
                    if (messagePartCoreData.Z() != null) {
                        String Z = messagePartCoreData.Z();
                        emyw.e(Z);
                        File file = new File(Z);
                        Uri parse = Uri.parse("fake://uri/because/it/is/unused");
                        if (file.exists()) {
                            hashMap.put(parse, new FileInputStream(file));
                            ltVar.e = parse;
                        } else {
                            biConsumer = new BiConsumer() { // from class: cpuo
                                @Override // java.util.function.BiConsumer
                                public final void accept(Object obj, Object obj2) {
                                    Uri uri2 = (Uri) obj;
                                    InputStream inputStream = (InputStream) obj2;
                                    enru enruVar = cpvp.a;
                                    try {
                                        inputStream.close();
                                    } catch (IOException e2) {
                                        ensk j2 = cpvp.a.j();
                                        j2.Y(ente.a, "BugleBackup");
                                        ((enrr) ((enrr) ((enrr) j2).g(e2)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1190, "ReverseTelephonySync.java")).t("Error when closing file. URI: %s", uri2);
                                    }
                                }

                                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                                    return BiConsumer$CC.$default$andThen(this, biConsumer2);
                                }
                            };
                        }
                    } else {
                        ensk h2 = a.h();
                        h2.Y(ente.a, "BugleBackup");
                        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1145, "ReverseTelephonySync.java")).D("Local copy of part does not exist. MessageId: %s, PartId: %s", messageCoreData.B(), messagePartCoreData.aa());
                        biConsumer = new BiConsumer() { // from class: cpuo
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                Uri uri2 = (Uri) obj;
                                InputStream inputStream = (InputStream) obj2;
                                enru enruVar = cpvp.a;
                                try {
                                    inputStream.close();
                                } catch (IOException e2) {
                                    ensk j2 = cpvp.a.j();
                                    j2.Y(ente.a, "BugleBackup");
                                    ((enrr) ((enrr) ((enrr) j2).g(e2)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1190, "ReverseTelephonySync.java")).t("Error when closing file. URI: %s", uri2);
                                }
                            }

                            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                                return BiConsumer$CC.$default$andThen(this, biConsumer2);
                            }
                        };
                    }
                    Map.EL.forEach(hashMap, biConsumer);
                }
                Uri b2 = ((cgtc) this.w.b()).b(ltVar, ContentUris.parseId(uri), hashMap);
                ensk e2 = a.e();
                e2.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1160, "ReverseTelephonySync.java")).J("New uri for part. PartId: %s, URI: %s, part.isText: %s", messagePartCoreData.aa(), b2, Boolean.valueOf(messagePartCoreData.bA()));
                String[] strArr = PartsTable.a;
                bwdi bwdiVar = new bwdi();
                bwdiVar.ap("insertPartIfNotAlreadyInserted");
                bwdiVar.t(false);
                bwdiVar.d(false);
                bwdiVar.D(new Function() { // from class: cpup
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwdm bwdmVar = (bwdm) obj;
                        enru enruVar = cpvp.a;
                        bwdmVar.j(MessagePartCoreData.this.aa());
                        return bwdmVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (messagePartCoreData.t() != null) {
                    bwdiVar.z(b2);
                }
                bwdiVar.b().e();
                biConsumer = new BiConsumer() { // from class: cpuo
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        Uri uri2 = (Uri) obj;
                        InputStream inputStream = (InputStream) obj2;
                        enru enruVar = cpvp.a;
                        try {
                            inputStream.close();
                        } catch (IOException e22) {
                            ensk j2 = cpvp.a.j();
                            j2.Y(ente.a, "BugleBackup");
                            ((enrr) ((enrr) ((enrr) j2).g(e22)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1190, "ReverseTelephonySync.java")).t("Error when closing file. URI: %s", uri2);
                        }
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer2);
                    }
                };
                Map.EL.forEach(hashMap, biConsumer);
            } else {
                ensk e3 = a.e();
                e3.Y(ente.a, "BugleBackup");
                enrr enrrVar2 = (enrr) e3;
                enrrVar2.W(10, TimeUnit.SECONDS);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1097, "ReverseTelephonySync.java")).D("Part was already synced, ignoring. Part Id: %s, MessageId: %s", messagePartCoreData.aa(), messageCoreData.B());
            }
            if (i == 2 && messagePartCoreData.aZ()) {
                enru enruVar = a;
                ensk h3 = enruVar.h();
                h3.Y(ente.a, "BugleBackup");
                enrr enrrVar3 = (enrr) h3;
                enrrVar3.W(10, TimeUnit.SECONDS);
                ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "deleteCachedFile", 1197, "ReverseTelephonySync.java")).q("Removing local file copy");
                String Z2 = messagePartCoreData.Z();
                if (Z2 == null || Z2.isEmpty()) {
                    ensk h4 = enruVar.h();
                    h4.Y(ente.a, "BugleBackup");
                    ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "deleteCachedFile", 1201, "ReverseTelephonySync.java")).D("Part does not have a local file copy. Skipping cache file deletion. PartId: %s, ContentType: %s", messagePartCoreData.aa(), messagePartCoreData.V());
                } else {
                    if (Z2.length() == 0) {
                        ((enrr) cpto.a.j().h("com/google/android/apps/messaging/shared/telephony/ReverseSyncAttachmentsHandler", "removeLocalAttachment", 23, "ReverseSyncAttachmentsHandler.kt")).q("Provided uri is null or empty. Skipping deletion for Bugle attachment copy.");
                    } else {
                        File file2 = new File(Z2);
                        if (!file2.exists()) {
                            ((enrr) cpto.a.h().h("com/google/android/apps/messaging/shared/telephony/ReverseSyncAttachmentsHandler", "removeLocalAttachment", 31, "ReverseSyncAttachmentsHandler.kt")).t("File does not exist in directory. Skipping deletion for Bugle attachment copy. uri: %s", Z2);
                        } else if (file2.delete()) {
                            String[] strArr2 = PartsTable.a;
                            bwdi bwdiVar2 = new bwdi();
                            bwdiVar2.ap("updateLocalCachePathAfterLocalCopyDeletion");
                            bwdiVar2.s();
                            bwdiVar2.D(new Function() { // from class: cpuz
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bwdm bwdmVar = (bwdm) obj;
                                    enru enruVar2 = cpvp.a;
                                    bwdmVar.j(MessagePartCoreData.this.aa());
                                    return bwdmVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bwdiVar2.b().e();
                        }
                    }
                    ensk j2 = enruVar.j();
                    j2.Y(ente.a, "BugleBackup");
                    ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "deleteCachedFile", 1220, "ReverseTelephonySync.java")).t("Failed to remove attachment copy. localCachePath: %s", Z2);
                }
            }
        }
        String[] strArr3 = PartsTable.a;
        bwdi bwdiVar3 = new bwdi();
        bwdiVar3.ap("insertRemainingParts");
        bwdiVar3.D(new Function() { // from class: cpvi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                enru enruVar2 = cpvp.a;
                bwdmVar.n(MessageCoreData.this.B());
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwdiVar3.d(false);
        bwdiVar3.b().e();
    }

    private final void p(int i, int i2, Optional optional) {
        ensk j = a.j();
        j.Y(ente.a, "BugleBackup");
        int i3 = i - 1;
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "logSyncFailed", 486, "ReverseTelephonySync.java")).r("Sync throttled or failed. Reason %d", i3);
        epia epiaVar = (epia) epic.a.createBuilder();
        epiaVar.copyOnWrite();
        epic epicVar = (epic) epiaVar.instance;
        epicVar.c = i3;
        epicVar.b |= 1;
        epiaVar.copyOnWrite();
        epic epicVar2 = (epic) epiaVar.instance;
        epicVar2.d = i2 - 1;
        epicVar2.b |= 2;
        if (optional.isPresent()) {
            eyee f = f((UUID) optional.get());
            epiaVar.copyOnWrite();
            epic epicVar3 = (epic) epiaVar.instance;
            epicVar3.b |= 4;
            epicVar3.e = f;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.TELEPHONY_REVERSE_SYNC_FAILED_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epic epicVar4 = (epic) epiaVar.build();
        epicVar4.getClass();
        eolvVar2.ay = epicVar4;
        eolvVar2.d |= 524288;
        ((akyb) this.s.b()).a().j(eoluVar, alal.LOG_SPEC_REVERSE_TELEPHONY_SYNC_EVENTS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x00b2, code lost:
    
        if (r12.getLong(0) == (r34.l() / r16)) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean q(final defpackage.buuo r34, int r35) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpvp.q(buuo, int):boolean");
    }

    @Override // defpackage.cptb
    public final cpxu a(final ConversationIdType conversationIdType) {
        return (cpxu) this.i.c("fixThread", new emyl() { // from class: cpum
            @Override // defpackage.emyl
            public final Object get() {
                cpxu b2;
                bsob e = bsom.e();
                e.z("fixThread");
                final ConversationIdType conversationIdType2 = conversationIdType;
                e.i(new Function() { // from class: cptr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        enru enruVar = cpvp.a;
                        bsolVar.q(ConversationIdType.this);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bskr bskrVar = (bskr) e.b().o();
                cpvp cpvpVar = cpvp.this;
                try {
                    if (!bskrVar.moveToFirst()) {
                        ensk j = cpvp.a.j();
                        j.Y(ente.a, "BugleBackup");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1617, "ReverseTelephonySync.java")).t("Conversation was removed before it was fixed. ConversationId: %s", conversationIdType2);
                        b2 = new cpxu();
                    } else if (!((cptp) cpvpVar.e.b()).a()) {
                        ensk j2 = cpvp.a.j();
                        j2.Y(ente.a, "BugleBackup");
                        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1623, "ReverseTelephonySync.java")).t("No sync permissions to fix conversation. ConversationId: %s", conversationIdType2);
                        b2 = bskrVar.k();
                    } else if (bskrVar.v()) {
                        Optional c = cpvpVar.c(bskrVar, 1);
                        if (c.isEmpty()) {
                            ensk j3 = cpvp.a.j();
                            j3.Y(ente.a, "BugleBackup");
                            ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1637, "ReverseTelephonySync.java")).t("Unable to create thread id for conversation. ConversationId: %s", conversationIdType2);
                            b2 = bskrVar.k();
                        } else {
                            b2 = cpxu.b(((Long) c.get()).longValue());
                        }
                    } else {
                        ensk j4 = cpvp.a.j();
                        j4.Y(ente.a, "BugleBackup");
                        ((enrr) ((enrr) j4).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1629, "ReverseTelephonySync.java")).t("Conversation is not awaiting reverse sync. ConversationId: %s", conversationIdType2);
                        b2 = bskrVar.k();
                    }
                    bskrVar.close();
                    return b2;
                } catch (Throwable th) {
                    try {
                        bskrVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
    }

    public final void b() {
        this.r.m(new emwl() { // from class: cpud
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cpvu cpvuVar = (cpvu) obj;
                cpvr cpvrVar = (cpvr) cpvuVar.toBuilder();
                if (cpvuVar.d.size() >= Math.max(((Integer) cpvp.b.e()).intValue(), ((Integer) cpvw.a.e()).intValue())) {
                    cpvrVar.copyOnWrite();
                    cpvu cpvuVar2 = (cpvu) cpvrVar.instance;
                    cpvuVar2.a();
                    cpvuVar2.d.remove(0);
                }
                eyja d = eykm.d(cpvp.this.c.f().toEpochMilli());
                cpvrVar.copyOnWrite();
                cpvu cpvuVar3 = (cpvu) cpvrVar.instance;
                d.getClass();
                cpvuVar3.a();
                cpvuVar3.d.add(d);
                cpvs cpvsVar = (cpvs) cpvt.a.createBuilder();
                cpvsVar.copyOnWrite();
                ((cpvt) cpvsVar.instance).b = true;
                cpvsVar.copyOnWrite();
                ((cpvt) cpvsVar.instance).c = 0;
                cpvt cpvtVar = (cpvt) cpvsVar.build();
                cpvrVar.copyOnWrite();
                cpvu cpvuVar4 = (cpvu) cpvrVar.instance;
                cpvtVar.getClass();
                cpvuVar4.c = cpvtVar;
                cpvuVar4.b |= 1;
                return (cpvu) cpvrVar.build();
            }
        });
    }

    public final Optional c(final bskr bskrVar, int i) {
        cpxu b2 = ((ayfi) this.E.b()).b((bseh) bskrVar.cO());
        Optional empty = b2.d() ? Optional.empty() : Optional.of(Long.valueOf(b2.a()));
        if (empty.isEmpty()) {
            return empty;
        }
        Long l = (Long) empty.get();
        long longValue = l.longValue();
        emyw.a(longValue != -1);
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("createThreadForConversationAndSyncOneMessage-conversations");
        bsoeVar.X(new cpxu(longValue));
        bsoeVar.i(false);
        bsoeVar.f(bskrVar.h());
        buxo d = MessagesTable.d();
        d.z("createThreadForConversationAndSyncOneMessage");
        d.h(new Function() { // from class: cpty
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                enru enruVar = cpvp.a;
                buxzVar.c();
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: cptz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                enru enruVar = cpvp.a;
                buxzVar.m(bskr.this.h());
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buuo buuoVar = (buuo) d.b().o();
        while (buuoVar.moveToNext()) {
            try {
                final MessageCoreData e = e(buuoVar);
                if (!e.cY()) {
                    Iterator it = ((MessageData) e).i.iterator();
                    boolean z = true;
                    while (it.hasNext()) {
                        z &= ((MessagePartCoreData) it.next()).bA();
                    }
                    if (z) {
                        if (q(buuoVar, i)) {
                            break;
                        }
                    }
                }
                String[] strArr2 = PartsTable.a;
                bwdi bwdiVar = new bwdi();
                bwdiVar.ap("markAllPartsAsMissing");
                bwdiVar.t(true);
                bwdiVar.D(new Function() { // from class: cpub
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwdm bwdmVar = (bwdm) obj;
                        enru enruVar = cpvp.a;
                        bwdmVar.n(MessageCoreData.this.B());
                        return bwdmVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bwdiVar.b().e();
            } catch (Throwable th) {
                try {
                    buuoVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        buuoVar.close();
        return Optional.of(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01dc A[Catch: all -> 0x050e, TryCatch #6 {all -> 0x050e, blocks: (B:3:0x0016, B:5:0x0043, B:11:0x0065, B:13:0x0071, B:14:0x0073, B:16:0x0077, B:17:0x019f, B:19:0x01dc, B:20:0x01de, B:22:0x01e6, B:24:0x0209, B:26:0x0256, B:27:0x026f, B:30:0x02c0, B:31:0x02c5, B:33:0x01f6, B:36:0x02c6, B:56:0x050d, B:55:0x050a, B:86:0x0434, B:92:0x0492, B:102:0x0500, B:101:0x04fd, B:106:0x00b4, B:108:0x00c3, B:110:0x00ca, B:112:0x00d8, B:113:0x00f0, B:115:0x0183, B:116:0x018e, B:117:0x0189, B:118:0x00ed, B:121:0x0098, B:88:0x0488, B:90:0x048e, B:51:0x0505, B:97:0x04f8), top: B:2:0x0016, inners: #0, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0256 A[Catch: all -> 0x050e, TryCatch #6 {all -> 0x050e, blocks: (B:3:0x0016, B:5:0x0043, B:11:0x0065, B:13:0x0071, B:14:0x0073, B:16:0x0077, B:17:0x019f, B:19:0x01dc, B:20:0x01de, B:22:0x01e6, B:24:0x0209, B:26:0x0256, B:27:0x026f, B:30:0x02c0, B:31:0x02c5, B:33:0x01f6, B:36:0x02c6, B:56:0x050d, B:55:0x050a, B:86:0x0434, B:92:0x0492, B:102:0x0500, B:101:0x04fd, B:106:0x00b4, B:108:0x00c3, B:110:0x00ca, B:112:0x00d8, B:113:0x00f0, B:115:0x0183, B:116:0x018e, B:117:0x0189, B:118:0x00ed, B:121:0x0098, B:88:0x0488, B:90:0x048e, B:51:0x0505, B:97:0x04f8), top: B:2:0x0016, inners: #0, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02c0 A[Catch: all -> 0x050e, TryCatch #6 {all -> 0x050e, blocks: (B:3:0x0016, B:5:0x0043, B:11:0x0065, B:13:0x0071, B:14:0x0073, B:16:0x0077, B:17:0x019f, B:19:0x01dc, B:20:0x01de, B:22:0x01e6, B:24:0x0209, B:26:0x0256, B:27:0x026f, B:30:0x02c0, B:31:0x02c5, B:33:0x01f6, B:36:0x02c6, B:56:0x050d, B:55:0x050a, B:86:0x0434, B:92:0x0492, B:102:0x0500, B:101:0x04fd, B:106:0x00b4, B:108:0x00c3, B:110:0x00ca, B:112:0x00d8, B:113:0x00f0, B:115:0x0183, B:116:0x018e, B:117:0x0189, B:118:0x00ed, B:121:0x0098, B:88:0x0488, B:90:0x048e, B:51:0x0505, B:97:0x04f8), top: B:2:0x0016, inners: #0, #2, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r27, j$.util.Optional r28) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpvp.d(int, j$.util.Optional):void");
    }
}
