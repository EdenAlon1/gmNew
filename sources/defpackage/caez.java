package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.communication.synapse.security.scytale.DecryptResult;
import com.google.communication.synapse.security.scytale.DecryptState;
import com.google.communication.synapse.security.scytale.EncryptResult;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.PlaintextMessage;
import com.google.communication.synapse.security.scytale.ReceiptError;
import com.google.communication.synapse.security.scytale.ReceiptInfo;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.SecureMessage;
import com.google.communication.synapse.security.scytale.UserDevice;
import com.google.communication.synapse.security.scytale.UserDevices;
import j$.time.Instant;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caez implements caet {
    public static final cskc a = cskc.g("BugleEtouffee", "ScytaleCrypto");
    public final chef b;
    private final Context c;
    private final ffbr d;
    private final ffbr e;
    private final cacb f;
    private final ffbr g;
    private final cafi h;
    private final ffbr i;
    private final ffbr j;
    private final akzt k;
    private final ffbr l;
    private final fazb m;
    private final bzqa n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final errl s;

    public caez(Context context, ffbr ffbrVar, ffbr ffbrVar2, chef chefVar, cacb cacbVar, ffbr ffbrVar3, cafi cafiVar, ffbr ffbrVar4, ffbr ffbrVar5, akzt akztVar, ffbr ffbrVar6, fazb fazbVar, bzqa bzqaVar, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, errl errlVar) {
        this.c = context;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.b = chefVar;
        this.f = cacbVar;
        this.g = ffbrVar3;
        this.h = cafiVar;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.k = akztVar;
        this.l = ffbrVar6;
        this.m = fazbVar;
        this.n = bzqaVar;
        this.o = ffbrVar7;
        this.p = ffbrVar8;
        this.q = ffbrVar9;
        this.r = ffbrVar10;
        this.s = errlVar;
        ContentType contentType = eijw.a;
    }

    private static bzwg g(eozj eozjVar) {
        DecryptState decryptState = DecryptState.UNTRUSTED_IDENTITY_KEY;
        ReceiptError receiptError = ReceiptError.UNKNOWN;
        int ordinal = eozjVar.ordinal();
        if (ordinal == 1) {
            return bzwg.SENDERS_IDENTITY_INCORRECT;
        }
        if (ordinal == 2) {
            return bzwg.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED;
        }
        if (ordinal == 3) {
            return bzwg.SENDERS_USER_ID_INCORRECT;
        }
        throw new IllegalStateException("Invalid failed identity verification reason");
    }

    private final caes h(ckep ckepVar, eozj eozjVar, Optional optional, bxgq bxgqVar) {
        if (bxgqVar != null) {
            ckaz ckazVar = (ckaz) ckepVar;
            long intValue = ckazVar.h - ((Integer) bzwd.z.e()).intValue();
            if (intValue <= bxgqVar.k().toEpochMilli() && intValue <= ((bxeu) optional.get()).k().toEpochMilli()) {
                csjb e = a.e();
                n(e, ckepVar, optional);
                e.I("Message's identity wasn't successfully verified, dropping message.");
                e.B("remoteUser != null", true);
                e.z("messageMetadata.getReceivedTimestamp", ckazVar.h);
                e.A("remoteUser.getGuaranteedFreshAsOfTimestamp()", bxgqVar.k());
                e.A("remoteInstance.get().getGuaranteedFreshAsOfTimestamp", ((bxeu) optional.get()).k());
                e.r();
                m(ckepVar, eozjVar);
                return caes.e(g(eozjVar));
            }
        }
        ckaz ckazVar2 = (ckaz) ckepVar;
        if (!((cabj) this.o.b()).a(ckazVar2.a)) {
            csjb c = a.c();
            c.I("Exceeded max retry count for identity verification");
            c.h(ckazVar2.a);
            c.r();
            return caes.e(bzwg.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED);
        }
        csjb c2 = a.c();
        n(c2, ckepVar, optional);
        c2.I("Received message from a new identity. Performing extra check");
        c2.A("reason", eozjVar);
        c2.r();
        this.f.b(ckepVar, ckazVar2.b.d);
        return caes.e(bzwg.DECRYPTION_POSTPONED_FOR_IDENTITY_CHECK);
    }

    private final caes i(String str, ckep ckepVar, NativeMessageEncryptorV2 nativeMessageEncryptorV2, bdhg bdhgVar, String str2, DecryptResult decryptResult, fays faysVar) {
        fayp faypVar;
        boolean z;
        ChatMessage chatMessage;
        ReceiptInfo receipt = decryptResult.getReceipt();
        if (receipt == null) {
            return caes.d(faysVar, null);
        }
        if (TextUtils.isEmpty(str)) {
            a.r("Can't send message receipt, unknown local registration id");
            return faysVar == null ? caes.e(bzwg.LOCAL_REGISTRATION_ID_NOT_FOUND) : caes.d(faysVar, null);
        }
        try {
            ekzz f = eleg.f("ScytaleCryptoImpl#createReceiptMessage");
            try {
                awui awuiVar = ((ckaz) ckepVar).b;
                String str3 = awuiVar.d;
                Instant ofEpochMilli = Instant.ofEpochMilli(((ckaz) ckepVar).g);
                boolean z2 = ((ckaz) ckepVar).d;
                fayn faynVar = (fayn) fayq.a.createBuilder();
                String messageId = receipt.getMessageId();
                faynVar.copyOnWrite();
                fayq fayqVar = (fayq) faynVar.instance;
                messageId.getClass();
                fayqVar.b |= 1;
                fayqVar.c = messageId;
                ReceiptError error = receipt.getError();
                DecryptState decryptState = DecryptState.UNTRUSTED_IDENTITY_KEY;
                ReceiptError receiptError = ReceiptError.UNKNOWN;
                int ordinal = error.ordinal();
                if (ordinal == 0) {
                    faypVar = fayp.UNKNOWN;
                } else if (ordinal == 1) {
                    faypVar = fayp.SUCCESS;
                } else if (ordinal == 2) {
                    faypVar = fayp.FAILED_TO_DECRYPT;
                } else {
                    if (ordinal != 3) {
                        throw new AssertionError("Unknown enum value");
                    }
                    faypVar = fayp.NOT_INTENDED_RECIPIENT;
                }
                faynVar.copyOnWrite();
                fayq fayqVar2 = (fayq) faynVar.instance;
                fayqVar2.d = faypVar.f;
                fayqVar2.b |= 2;
                byte[] signature = receipt.getSignature();
                if (signature != null) {
                    eyee x = eyee.x(signature);
                    faynVar.copyOnWrite();
                    fayq fayqVar3 = (fayq) faynVar.instance;
                    fayqVar3.b |= 4;
                    fayqVar3.e = x;
                }
                byte[] byteArray = ((fayq) faynVar.build()).toByteArray();
                if (receipt.getError() == ReceiptError.SUCCESS) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str2);
                    UserDevices[] userDevicesArr = new UserDevices[1];
                    z = false;
                    cfva cfvaVar = aoqm.a;
                    if (((Boolean) new aopf().get()).booleanValue()) {
                        str3 = awuiVar.d;
                    }
                    userDevicesArr[0] = new UserDevices(str3, arrayList);
                    ArrayList<UserDevices> arrayList2 = new ArrayList<>(Arrays.asList(userDevicesArr));
                    caff a2 = this.h.a();
                    a2.b(eote.SUCCESS_RECEIPT);
                    cafh a3 = a2.a();
                    fayr fayrVar = (fayr) fays.a.createBuilder();
                    fayrVar.copyOnWrite();
                    fays faysVar2 = (fays) fayrVar.instance;
                    faysVar2.b |= 1;
                    faysVar2.c = "application/vnd.google.rcs.success";
                    eyee x2 = eyee.x(byteArray);
                    fayrVar.copyOnWrite();
                    fays faysVar3 = (fays) fayrVar.instance;
                    faysVar3.b |= 4;
                    faysVar3.e = x2;
                    fayrVar.copyOnWrite();
                    fays faysVar4 = (fays) fayrVar.instance;
                    str.getClass();
                    faysVar4.b |= 2;
                    faysVar4.d = str;
                    EncryptResult encryptResult = (EncryptResult) cafo.a(nativeMessageEncryptorV2.encrypt(Scope.create(a3), arrayList2, true, "", false, new PlaintextMessage(bdhg.e(bdhgVar), ((fays) fayrVar.build()).toByteArray())));
                    emyw.a(encryptResult.getMissingSessions().isEmpty());
                    SecureMessage encryptedData = encryptResult.getEncryptedData();
                    emyw.e(encryptedData);
                    byteArray = encryptedData.getCipherText();
                } else {
                    z = false;
                }
                boolean z3 = (bzwf.h() && (receipt.getError().equals(ReceiptError.FAILED_TO_DECRYPT) || ((!bzwf.g() || !receipt.getError().equals(ReceiptError.OTK_NOT_TARGETED_TO_ME)) ? z : true)) && z2) ? true : z;
                fayl faylVar = (fayl) faym.a.createBuilder();
                eyee x3 = eyee.x(byteArray);
                faylVar.copyOnWrite();
                faym faymVar = (faym) faylVar.instance;
                faymVar.b |= 1;
                faymVar.c = x3;
                faylVar.copyOnWrite();
                faym faymVar2 = (faym) faylVar.instance;
                str.getClass();
                faymVar2.b |= 2;
                faymVar2.d = str;
                if (z3) {
                    faylVar.copyOnWrite();
                    faym faymVar3 = (faym) faylVar.instance;
                    faymVar3.b |= 4;
                    faymVar3.e = true;
                }
                faym faymVar4 = (faym) faylVar.build();
                String uuid = UUID.randomUUID().toString();
                if (this.n.s() && (receipt.getError().equals(ReceiptError.SUCCESS) || z3)) {
                    eigx eigxVar = eigx.DELIVERY;
                    eies eiesVar = new eies();
                    eiesVar.g(bdhg.e(bdhgVar));
                    eiesVar.j(eigxVar);
                    eiesVar.h(eigxVar.f);
                    eiesVar.i(ofEpochMilli);
                    eiesVar.e(faymVar4.toByteString());
                    chatMessage = new ChatMessage(ChatMessage.Type.MESSAGE_RECEIPT, ((eijk) eijw.d(eiesVar.k())).a.I(), uuid);
                } else {
                    chatMessage = new ChatMessage(receipt.getError() == ReceiptError.SUCCESS ? b() : (f() && bzwd.g()) ? ChatMessage.Type.ENCRYPTION_FTD : ChatMessage.Type.TEST_FAILURE, cadi.b(faymVar4, ((Boolean) bzwd.m.e()).booleanValue() ? (String) bzwd.n.e() : ""), uuid);
                }
                f.close();
                return caes.d(faysVar, chatMessage);
            } finally {
            }
        } catch (eikm e) {
            a.s("Failed to serialize a message receipt.", e);
            return faysVar == null ? caes.e(bzwg.INVALID_FTD_RECEIPT) : caes.d(faysVar, null);
        }
    }

    private static fays j(DecryptResult decryptResult) {
        byte[] decryptedMessage = decryptResult.getDecryptedMessage();
        emyw.e(decryptedMessage);
        return (fays) eyfy.parseFrom(fays.a, decryptedMessage, eyfc.a());
    }

    private static ArrayList k(enpj enpjVar, boolean z) {
        final ArrayList arrayList = new ArrayList();
        final int a2 = bzwf.a(enpjVar.i(), z);
        Map.EL.forEach(enpjVar.w(), new BiConsumer() { // from class: caeu
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i = a2;
                ArrayList arrayList2 = arrayList;
                String str = (String) obj;
                Collection collection = (Collection) obj2;
                if (i == 1) {
                    arrayList2.add(new UserDevices(str, new ArrayList(collection)));
                    return;
                }
                csjb c = caez.a.c();
                c.I("Expanding the recipient.");
                c.y("multiplier", i);
                c.r();
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList2.add(new UserDevices(str, new ArrayList(collection)));
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        return arrayList;
    }

    private static ArrayList l(final String str) {
        String[] strArr = bxiv.a;
        bxis bxisVar = new bxis(bxiv.a);
        bxisVar.z("getKnownUserIdRepresentations");
        bxiu bxiuVar = new bxiu();
        bxiuVar.c(str);
        bxisVar.k(new bxit(bxiuVar));
        return (ArrayList) bxisVar.b().D().map(new Function() { // from class: caew
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxhy bxhyVar = (bxhy) obj;
                bxhyVar.az(0, "remote_user_id");
                return new UserDevice(bxhyVar.a, str);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: caex
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
    }

    private final void m(ckep ckepVar, eozj eozjVar) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_E2EE_IDENTITY_VERIFICATION_MESSAGE_DROPPED;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eozh eozhVar = (eozh) eozk.a.createBuilder();
        String e = bdhg.e(((ckaz) ckepVar).a);
        eozhVar.copyOnWrite();
        eozk eozkVar = (eozk) eozhVar.instance;
        eozkVar.b |= 1;
        eozkVar.c = e;
        eozhVar.copyOnWrite();
        eozk eozkVar2 = (eozk) eozhVar.instance;
        eozkVar2.d = eozjVar.i;
        eozkVar2.b |= 2;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eozk eozkVar3 = (eozk) eozhVar.build();
        eozkVar3.getClass();
        eolvVar2.ae = eozkVar3;
        eolvVar2.c |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        ((akxl) this.j.b()).j(eoluVar);
    }

    private static void n(csjb csjbVar, ckep ckepVar, Optional optional) {
        ckaz ckazVar = (ckaz) ckepVar;
        csjbVar.M("remoteUserId", ckazVar.b.d);
        csjbVar.A("rcsMessageId", ckazVar.a);
        csjbVar.z("receivedTimestamp", ckazVar.h);
        if (!optional.isPresent()) {
            csjbVar.A("remoteInstance", "empty");
            return;
        }
        csjbVar.A("remoteInstance.lastModifiedTimestamp", ((bxeu) optional.get()).l());
        csjbVar.A("remoteInstance.guaranteedFreshAsOfTimestamp", ((bxeu) optional.get()).k());
        csjbVar.A("remoteIdentityKey", ((bxeu) optional.get()).q());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x016c A[Catch: all -> 0x06ae, TRY_LEAVE, TryCatch #12 {, blocks: (B:4:0x0005, B:6:0x001c, B:8:0x0021, B:12:0x0029, B:15:0x0031, B:18:0x0074, B:22:0x016c, B:26:0x017e, B:29:0x01bb, B:31:0x01c4, B:34:0x01d2, B:37:0x020c, B:39:0x0211, B:41:0x0235, B:44:0x024c, B:46:0x0291, B:47:0x02d9, B:50:0x02b4, B:52:0x02c8, B:53:0x02d6, B:54:0x02e1, B:56:0x02f7, B:62:0x0376, B:63:0x0379, B:71:0x057f, B:74:0x0396, B:78:0x03b1, B:79:0x03be, B:83:0x03c5, B:87:0x03dd, B:89:0x03e3, B:97:0x047c, B:111:0x048e, B:110:0x048b, B:116:0x0496, B:122:0x049f, B:132:0x04aa, B:131:0x04a7, B:133:0x04ab, B:135:0x04c1, B:138:0x04c9, B:140:0x04cf, B:142:0x04d7, B:144:0x04f5, B:146:0x04fb, B:148:0x0502, B:151:0x0551, B:152:0x0540, B:154:0x0548, B:157:0x056a, B:159:0x0588, B:163:0x0593, B:180:0x05a6, B:179:0x05a3, B:183:0x05ab, B:199:0x05d7, B:198:0x05d4, B:202:0x05de, B:205:0x05fe, B:208:0x0638, B:210:0x0646, B:213:0x065f, B:225:0x06a2, B:224:0x069f, B:226:0x0081, B:228:0x00a2, B:231:0x00a9, B:233:0x00c9, B:234:0x00d1, B:236:0x00d6, B:238:0x00da, B:239:0x00dc, B:241:0x00e1, B:243:0x00e5, B:244:0x00e7, B:245:0x00f2, B:247:0x00f8, B:248:0x00fc, B:250:0x0100, B:251:0x0102, B:253:0x010e, B:254:0x0110, B:261:0x0129, B:262:0x012b, B:263:0x0138, B:272:0x015f, B:273:0x0161, B:274:0x014f, B:275:0x0152, B:276:0x0155, B:277:0x0158, B:278:0x015b, B:279:0x011c, B:280:0x011f, B:281:0x0122, B:282:0x0125, B:296:0x06ad, B:295:0x06aa, B:77:0x039d, B:17:0x0070, B:127:0x04a2, B:291:0x06a5, B:106:0x0486, B:36:0x01e5, B:194:0x05cf, B:28:0x0184, B:81:0x03bf, B:82:0x03c4, B:220:0x069a), top: B:3:0x0005, inners: #1, #5, #6, #7, #8, #10, #13, #14, #16, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017c  */
    @Override // defpackage.caet
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.caes a(java.lang.String r24, defpackage.faym r25, defpackage.ckep r26, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2 r27) {
        /*
            Method dump skipped, instructions count: 1713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caez.a(java.lang.String, faym, ckep, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2):caes");
    }

    @Override // defpackage.caet
    public final ChatMessage.Type b() {
        return (f() && bzwd.g()) ? ChatMessage.Type.ENCRYPTED_MESSAGE : ChatMessage.Type.TEST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027b A[Catch: RuntimeException -> 0x0327, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0327, blocks: (B:89:0x0113, B:91:0x011b, B:94:0x012b, B:41:0x0248, B:43:0x026a, B:47:0x0275, B:50:0x027b, B:103:0x0197, B:105:0x01c3, B:107:0x01db, B:108:0x0233, B:109:0x0238, B:110:0x0239, B:111:0x0240), top: B:88:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02cf A[Catch: RuntimeException -> 0x0325, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0325, blocks: (B:52:0x02a9, B:53:0x02c5, B:55:0x02cf, B:65:0x0286), top: B:48:0x0279 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0318 A[Catch: RuntimeException -> 0x034a, TryCatch #4 {RuntimeException -> 0x034a, blocks: (B:57:0x02f3, B:60:0x0318, B:61:0x0324, B:130:0x0338, B:129:0x0335, B:131:0x0339, B:132:0x0349, B:125:0x0330, B:116:0x00c8), top: B:30:0x007f, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0375  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // defpackage.caet
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.faym c(defpackage.fays r27, final defpackage.bdhg r28, java.lang.String r29, defpackage.enpj r30, boolean r31, boolean r32, defpackage.eote r33, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2 r34) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caez.c(fays, bdhg, java.lang.String, enpj, boolean, boolean, eote, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2):faym");
    }

    public final void d(bxgq bxgqVar) {
        bseh b = ((bdga) this.d.b()).b(bxgqVar.l());
        if (b == null || b.l() == 1) {
            return;
        }
        ((bbab) this.i.b()).a(b.C()).t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(final ckep ckepVar, caqc caqcVar) {
        bsob e = bsom.e();
        e.z("updateGroupConversationEncryptionStatusIfNeeded");
        e.i(new Function() { // from class: caev
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                bsolVar.E(((ckaz) ckep.this).f);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = e.b().y();
        int i = ((enou) y).c;
        for (int i2 = 0; i2 < i; i2++) {
            bseh bsehVar = (bseh) y.get(i2);
            if (bsehVar.l() != 1) {
                this.k.e("Bugle.Etouffee.Conversation.Encryption.Update", caqcVar.u);
                caih caihVar = (caih) caii.a.createBuilder();
                String conversationIdType = bsehVar.C().toString();
                caihVar.copyOnWrite();
                caii caiiVar = (caii) caihVar.instance;
                conversationIdType.getClass();
                caiiVar.c = conversationIdType;
                String b = emxe.b(bsehVar.ad());
                caihVar.copyOnWrite();
                ((caii) caihVar.instance).d = b;
                String b2 = emxe.b(bsehVar.S());
                caihVar.copyOnWrite();
                ((caii) caihVar.instance).e = b2;
                awui awuiVar = ((ckaz) ckepVar).c;
                caihVar.copyOnWrite();
                caii caiiVar2 = (caii) caihVar.instance;
                caiiVar2.f = awuiVar;
                caiiVar2.b |= 1;
                ((cevh) ((caij) this.r.b()).a.b()).g(ceyr.g("sync_group_then_encryption_status", (caii) caihVar.build()));
            }
        }
    }

    final boolean f() {
        Context context = this.c;
        return !dkuy.k(context) || dkuy.g(context, "ChatSessionServiceVersions", 3);
    }
}
