package com.google.android.apps.messaging.shared.datamodel.database.upgrade;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.a;
import defpackage.akzw;
import defpackage.albq;
import defpackage.aoku;
import defpackage.aoqj;
import defpackage.aoqm;
import defpackage.aqky;
import defpackage.awwp;
import defpackage.axnw;
import defpackage.azof;
import defpackage.azoi;
import defpackage.azon;
import defpackage.azyd;
import defpackage.azze;
import defpackage.azzp;
import defpackage.azzq;
import defpackage.bbfd;
import defpackage.bbgd;
import defpackage.bczy;
import defpackage.bdgq;
import defpackage.bdgr;
import defpackage.bdgs;
import defpackage.bdhb;
import defpackage.bdmq;
import defpackage.bdqu;
import defpackage.bdrr;
import defpackage.beaw;
import defpackage.beax;
import defpackage.beay;
import defpackage.beaz;
import defpackage.bece;
import defpackage.becg;
import defpackage.brsd;
import defpackage.brvg;
import defpackage.brwa;
import defpackage.brwp;
import defpackage.brwt;
import defpackage.brwv;
import defpackage.brww;
import defpackage.bsaj;
import defpackage.bsam;
import defpackage.bscj;
import defpackage.bsco;
import defpackage.bsdi;
import defpackage.bsdr;
import defpackage.bseh;
import defpackage.bskp;
import defpackage.bskq;
import defpackage.bskr;
import defpackage.bsnt;
import defpackage.bsob;
import defpackage.bsoe;
import defpackage.bsof;
import defpackage.bsol;
import defpackage.bsom;
import defpackage.bsut;
import defpackage.bsvd;
import defpackage.bsve;
import defpackage.bsvm;
import defpackage.bsvy;
import defpackage.bswd;
import defpackage.bswe;
import defpackage.bswf;
import defpackage.btki;
import defpackage.btqq;
import defpackage.bttf;
import defpackage.bueg;
import defpackage.buld;
import defpackage.buum;
import defpackage.buun;
import defpackage.buuo;
import defpackage.buxl;
import defpackage.buxm;
import defpackage.buxo;
import defpackage.buxr;
import defpackage.buxs;
import defpackage.buxz;
import defpackage.bvbu;
import defpackage.bvpo;
import defpackage.bvtg;
import defpackage.bvth;
import defpackage.bvti;
import defpackage.bvvn;
import defpackage.bvvr;
import defpackage.bvvw;
import defpackage.bwat;
import defpackage.bwau;
import defpackage.bwav;
import defpackage.bwcy;
import defpackage.bwdd;
import defpackage.bwdf;
import defpackage.bwdi;
import defpackage.bwdm;
import defpackage.bwom;
import defpackage.bwon;
import defpackage.bwqg;
import defpackage.bwsf;
import defpackage.bwso;
import defpackage.bwtp;
import defpackage.bwty;
import defpackage.bxba;
import defpackage.bxcq;
import defpackage.bxct;
import defpackage.bxdu;
import defpackage.bxeg;
import defpackage.bxek;
import defpackage.bxen;
import defpackage.bxeu;
import defpackage.bxex;
import defpackage.bxgl;
import defpackage.bxgt;
import defpackage.bxhr;
import defpackage.bxhy;
import defpackage.bxib;
import defpackage.bxiv;
import defpackage.bxro;
import defpackage.bxsm;
import defpackage.bxso;
import defpackage.bxtc;
import defpackage.bxtg;
import defpackage.bxth;
import defpackage.bxxt;
import defpackage.bxxu;
import defpackage.bxxv;
import defpackage.bxxw;
import defpackage.bxzt;
import defpackage.bybl;
import defpackage.bycq;
import defpackage.byea;
import defpackage.byek;
import defpackage.byez;
import defpackage.byfg;
import defpackage.byfh;
import defpackage.byfi;
import defpackage.byfj;
import defpackage.bysz;
import defpackage.byti;
import defpackage.bytj;
import defpackage.bytk;
import defpackage.byxc;
import defpackage.byyt;
import defpackage.byzd;
import defpackage.byzi;
import defpackage.cdwu;
import defpackage.cetp;
import defpackage.cetw;
import defpackage.cevh;
import defpackage.ceyr;
import defpackage.cfbc;
import defpackage.cfbf;
import defpackage.cfkl;
import defpackage.cful;
import defpackage.cfup;
import defpackage.cfva;
import defpackage.cjze;
import defpackage.ckch;
import defpackage.ckdn;
import defpackage.ckds;
import defpackage.clwy;
import defpackage.clwz;
import defpackage.clxa;
import defpackage.coir;
import defpackage.coxg;
import defpackage.coxk;
import defpackage.cpbd;
import defpackage.cpxu;
import defpackage.cpxv;
import defpackage.csix;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.csld;
import defpackage.ctid;
import defpackage.ctud;
import defpackage.ctvb;
import defpackage.cuky;
import defpackage.cuwz;
import defpackage.dkqd;
import defpackage.dkuy;
import defpackage.dtrd;
import defpackage.dtrt;
import defpackage.dtru;
import defpackage.dtrx;
import defpackage.dtub;
import defpackage.dtve;
import defpackage.dtvx;
import defpackage.dtvy;
import defpackage.dtvz;
import defpackage.dtwe;
import defpackage.dtym;
import defpackage.dtzq;
import defpackage.dtzr;
import defpackage.duav;
import defpackage.dvak;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emxe;
import defpackage.emxf;
import defpackage.endq;
import defpackage.engw;
import defpackage.enhk;
import defpackage.enou;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eqqh;
import defpackage.fbqt;
import defpackage.ffbr;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class CustomUpgradeSteps {
    private static final String CREATE_CONVERSATION_SUGGESTIONS_INDEX_11000 = "CREATE INDEX index_conversation_suggestions_message_id ON conversation_suggestions(message_id);";
    private static final String CREATE_CONVERSATION_SUGGESTIONS_TABLE_11000 = "CREATE TABLE conversation_suggestions(_id INTEGER PRIMARY KEY AUTOINCREMENT, message_id STRING, conversation_suggestion_type INT DEFAULT(0), properties TEXT, post_back_data TEXT, post_back_encoding TEXT, FOREIGN KEY (message_id) REFERENCES  messages(_id) ON DELETE CASCADE);";
    private static final String CREATE_PROXY_TABLE_SQL = "CREATE TABLE proxy_state_table(_id INTEGER PRIMARY KEY AUTOINCREMENT, participant_id STRING UNIQUE, disabled_reports_timestamp INT DEFAULT(0), FOREIGN KEY (participant_id) REFERENCES participants(_id) ON DELETE CASCADE);";
    private static final String HUAWEI_MANUFACTURER = "HUAWEI";
    private static final int MARK_RCS_IN_TELEPHONY_BATCH_SIZE = 100;
    private static final String PROXY_DISABLED_REPORTS_TIMESTAMP = "disabled_reports_timestamp";
    private static final String PROXY_INDEX = "index_proxy_state_table_participant_id";
    private static final String PROXY_PARTICIPANT_ID = "participant_id";
    private static final String PROXY_TABLE = "proxy_state_table";
    private static final String PROXY_TABLE_PARTICIPANT_ID_INDEX_SQL = "CREATE INDEX index_proxy_state_table_participant_id ON proxy_state_table(participant_id)";
    private final cuwz base32Utils;
    private final ctvb buglePhoneNumberUtils;
    private final cdwu cmsBackFillBnrStateForFiMdQueue;
    private final Context context;
    private final ffbr<bczy> conversationDatabaseOperations;
    private final bbfd markAsReadActionFactory;
    private final clxa markRcsMessagesInTelephonyQueue;
    private final ffbr<bdmq> messageDatabaseOperations;
    private final azze participantAvatarUriGenerator;
    private final ffbr<bdrr> participantDatabaseOperations;
    private final aqky participantRowFactory;
    private final ctud permissionChecker;
    private final ffbr<ckch> rcsTelephonyAccess;
    private final ckdn rcsTelephonyStrings;
    private final ckds rcsUtils;
    private final bbgd sanitizeParticipantsActionFactory;
    private final ffbr<coxg> syncManager;
    private final ffbr<coxk> telephonyManagerInterface;
    private final albq timerEventLogger;
    private static final cskc log = cskc.g("BugleDataModel", "OnDeviceDatabaseUpgradeHandler");
    private static final enru logger = enru.c("com/google/android/apps/messaging/shared/datamodel/database/upgrade/CustomUpgradeSteps");
    private static final String[] HUAWEI_MATE_20_MODEL_NAMES = {"LYA-L09", "LYA-L29", "LYA-L0C", "HMA-L09", "HMA-L29", "EVR-L29"};

    public CustomUpgradeSteps(Context context, ffbr<coxg> ffbrVar, ctud ctudVar, ffbr<bdrr> ffbrVar2, ffbr<bczy> ffbrVar3, ffbr<bdmq> ffbrVar4, ckds ckdsVar, ckdn ckdnVar, ffbr<ckch> ffbrVar5, cuwz cuwzVar, ffbr<coxk> ffbrVar6, albq albqVar, ctvb ctvbVar, bbgd bbgdVar, azze azzeVar, bbfd bbfdVar, clxa clxaVar, cdwu cdwuVar, aqky aqkyVar) {
        this.context = context;
        this.syncManager = ffbrVar;
        this.permissionChecker = ctudVar;
        this.participantDatabaseOperations = ffbrVar2;
        this.conversationDatabaseOperations = ffbrVar3;
        this.messageDatabaseOperations = ffbrVar4;
        this.rcsUtils = ckdsVar;
        this.rcsTelephonyStrings = ckdnVar;
        this.rcsTelephonyAccess = ffbrVar5;
        this.base32Utils = cuwzVar;
        this.telephonyManagerInterface = ffbrVar6;
        this.timerEventLogger = albqVar;
        this.buglePhoneNumberUtils = ctvbVar;
        this.sanitizeParticipantsActionFactory = bbgdVar;
        this.participantAvatarUriGenerator = azzeVar;
        this.markAsReadActionFactory = bbfdVar;
        this.markRcsMessagesInTelephonyQueue = clxaVar;
        this.cmsBackFillBnrStateForFiMdQueue = cdwuVar;
        this.participantRowFactory = aqkyVar;
    }

    private static bscj[] applyDeduplicationAndConvert(engw<brvg> engwVar) {
        return (bscj[]) Collection.EL.stream(((enhk) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: bdze
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$0((brvg) obj);
            }
        }).filter(new Predicate() { // from class: bdzf
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$1((brvg) obj);
            }
        }).collect(endq.b(new Function() { // from class: bdzh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String conversationParticipantsDeduplicationKey;
                conversationParticipantsDeduplicationKey = CustomUpgradeSteps.toConversationParticipantsDeduplicationKey((brvg) obj);
                return conversationParticipantsDeduplicationKey;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Function$CC.identity(), new BinaryOperator() { // from class: bdzi
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$2((brvg) obj, (brvg) obj2);
            }
        }))).values()).map(new Function() { // from class: bdzj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bscj conversationToParticipants;
                conversationToParticipants = CustomUpgradeSteps.toConversationToParticipants((brvg) obj);
                return conversationToParticipants;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: bdzk
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$3(i);
            }
        });
    }

    private void broadcastIncreaseSessionIdIntent() {
        Intent intent = new Intent(RcsIntents.ACTION_DEBUG_OPTION_INCREASE_SESSION_ID);
        dkuy.c(this.context, intent);
        dkqd.c(this.context, intent);
        this.context.sendBroadcast(intent);
    }

    private static void copyBlobIdIntoCompressedBlobId() {
        cskc cskcVar = log;
        cskcVar.p("begin copyBlobIdIntoCompressedBlobId.");
        String[] strArr = PartsTable.a;
        bwdi bwdiVar = new bwdi();
        bwdiVar.ap("copyBlobIdIntoCompressedBlobId-parts1");
        bwdiVar.ag("compressed_blob_id", PartsTable.d.z);
        bwdiVar.b().e();
        bwdi bwdiVar2 = new bwdi();
        bwdiVar2.ap("copyBlobIdIntoCompressedBlobIdparts2");
        bwdiVar2.ag("compressed_blob_upload_permanent_failure", PartsTable.d.E);
        bwdiVar2.b().e();
        bwdi bwdiVar3 = new bwdi();
        bwdiVar3.ap("copyBlobIdIntoCompressedBlobId-parts3");
        bwdiVar3.ag("compressed_blob_upload_timestamp", PartsTable.d.F);
        bwdiVar3.b().e();
        cskcVar.p("completed copyBlobIdIntoCompressedBlobId.");
    }

    private static void fixLegacyResourceUris() {
        fixLegacyResourceUrisInConversations();
        fixLegacyResourceUrisInDrafts();
    }

    private static void fixLegacyResourceUrisInConversations() {
        bsob e = bsom.e();
        e.z("fixLegacyResourceUrisInConversations1");
        e.r();
        e.f(new Function() { // from class: bdyo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$fixLegacyResourceUrisInConversations$0((bskp) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.i(new Function() { // from class: bdyp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInConversations$1(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bskr bskrVar = (bskr) e.b().o();
        try {
            if (bskrVar.moveToFirst()) {
                do {
                    Uri updatedLegacyStickerUri = getUpdatedLegacyStickerUri(bskrVar.g());
                    if (updatedLegacyStickerUri != null) {
                        bsoe bsoeVar = new bsoe();
                        bsoeVar.ap("fixLegacyResourceUrisInConversations2");
                        bsoeVar.s(updatedLegacyStickerUri);
                        bsol bsolVar = new bsol();
                        bsolVar.q(bskrVar.h());
                        bsoeVar.ac(bsolVar);
                        bsoeVar.b().e();
                    }
                } while (bskrVar.moveToNext());
            }
            bskrVar.close();
        } catch (Throwable th) {
            try {
                bskrVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void fixLegacyResourceUrisInDrafts() {
        boolean z;
        bwdf c = PartsTable.c();
        c.z("fixLegacyResourceUrisInDrafts");
        c.r();
        c.e(new Function() { // from class: bdyj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$0((bwat) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c.h(new Function() { // from class: bdyl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$1(bwdmVar);
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwav bwavVar = (bwav) c.b().o();
        while (bwavVar.moveToNext()) {
            try {
                Uri updatedLegacyStickerUri = getUpdatedLegacyStickerUri(bwavVar.i());
                Uri updatedLegacyStickerUri2 = getUpdatedLegacyStickerUri(bwavVar.g());
                Uri updatedLegacyStickerUri3 = getUpdatedLegacyStickerUri(bwavVar.f());
                bwdi bwdiVar = new bwdi();
                bwdiVar.ap("fixLegacyResourceUrisInDrafts-parts");
                boolean z2 = true;
                if (updatedLegacyStickerUri != null) {
                    bwdiVar.z(updatedLegacyStickerUri);
                    z = true;
                } else {
                    z = false;
                }
                if (updatedLegacyStickerUri2 != null) {
                    bwdiVar.u(updatedLegacyStickerUri2);
                } else {
                    z2 = z;
                }
                if (updatedLegacyStickerUri3 != null) {
                    bwdiVar.m(updatedLegacyStickerUri3);
                } else if (z2) {
                }
                bwdiVar.c(bwavVar.q());
            } catch (Throwable th) {
                try {
                    bwavVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bwavVar.close();
    }

    private void fixRcsGroupConversation(dtve dtveVar, final ConversationIdType conversationIdType, cpxu cpxuVar, final String str, String str2) {
        emxf.m(str2 != null, "lastUri cannot be null");
        csjb a = log.a();
        a.I("Promoting to an Rcs group.");
        a.c(conversationIdType);
        a.r();
        final cpbd c = ((Boolean) ((cfup) ckds.a.get()).e()).booleanValue() ? ((ckch) this.rcsTelephonyAccess.b()).c(cpxuVar, str, str2) : this.rcsUtils.l(cpxuVar, str, str2);
        dtveVar.A("OnDeviceDatabaseUpgradeHandler#fixRcsGroupConversation", new Runnable() { // from class: bdzv
            @Override // java.lang.Runnable
            public final void run() {
                CustomUpgradeSteps.this.lambda$fixRcsGroupConversation$0(str, c, conversationIdType);
            }
        });
    }

    private static void fixSpamWarningForOlderReports() {
        cskc cskcVar = log;
        cskcVar.p("begin fixSpamWarningForOlderReports.");
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("fixSpamWarningForOlderReports");
        bsoeVar.ak();
        bsoeVar.aa(false);
        bsol bsolVar = new bsol();
        int intValue = bsom.g().intValue();
        if (intValue < 23000) {
            dtub.w("spam_warning_dismiss_status", intValue);
        }
        bsolVar.aq(new dtwe("conversations.spam_warning_dismiss_status", 1, 1));
        bsoeVar.ac(bsolVar);
        bsoeVar.b().e();
        cskcVar.p("completed fixSpamWarningForOlderReports.");
    }

    private static engw<bseh> getAllRcsGroupConversationsWithJoinedStatus() {
        bsob e = bsom.e();
        e.z("CustomUpgradeSteps#getAllRcsGroupConversations");
        e.r();
        e.i(new Function() { // from class: beak
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$getAllRcsGroupConversationsWithJoinedStatus$0(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bskp bskpVar = bsom.c;
        e.c(bskpVar.a, bskpVar.am);
        return e.b().y();
    }

    private static Uri getUpdatedLegacyStickerUri(Uri uri) {
        String str;
        if (uri == null) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 1) {
            return null;
        }
        switch (Integer.parseInt(pathSegments.get(0))) {
            case 2130837661:
                str = "foodies_animated_angry";
                break;
            case 2130837662:
                str = "foodies_animated_bye";
                break;
            case 2130837663:
                str = "foodies_animated_confused";
                break;
            case 2130837664:
                str = "foodies_animated_congratulations";
                break;
            default:
                return null;
        }
        Uri build = new Uri.Builder().scheme("android.resource").authority(emxe.b(uri.getAuthority())).appendPath("drawable").appendPath(str).build();
        csjb a = log.a();
        a.I("Convert sticker.");
        a.A("oldUri", uri.toString());
        a.A("updatedUri", build.toString());
        a.r();
        return build;
    }

    private void huaweiMate20UpgradeCleardata() {
        if (((Boolean) cful.Z.e()).booleanValue() && HUAWEI_MANUFACTURER.equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            for (String str2 : HUAWEI_MATE_20_MODEL_NAMES) {
                if (str.equalsIgnoreCase(str2)) {
                    cskc cskcVar = log;
                    cskcVar.r("Huawei Mate-20 phone detected");
                    Context context = this.context;
                    if (context == null) {
                        cskcVar.r("huaweiMate20UpgradeClearData - unable to retrieve context");
                        return;
                    }
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    if (activityManager == null) {
                        cskcVar.r("huaweiMate20UpgradeClearData - unable to retrieve activity service");
                        return;
                    }
                    cskcVar.r("huaweiMate20UpgradeClearData - Wiping data.");
                    activityManager.clearApplicationUserData();
                    cskcVar.r("huaweiMate20UpgradeClearData - Wiped data.  Forcing exit.");
                    System.exit(0);
                    return;
                }
            }
        }
    }

    private static void invalidateRcsSessionIdsForOneToOne() {
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("invalidateRcsSessionIdsForOneToOne");
        bsoeVar.ak();
        bsoeVar.T(-1L);
        bsoeVar.ad(new Function() { // from class: bdyh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$invalidateRcsSessionIdsForOneToOne$0(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsoeVar.b().e();
    }

    public static /* synthetic */ boolean lambda$applyDeduplicationAndConvert$0(brvg brvgVar) {
        return (brvgVar.l() == null || emxe.c(brvgVar.l().toString())) ? false : true;
    }

    public static /* synthetic */ boolean lambda$applyDeduplicationAndConvert$1(brvg brvgVar) {
        return brvgVar.k() > 0;
    }

    public static /* synthetic */ brvg lambda$applyDeduplicationAndConvert$2(brvg brvgVar, brvg brvgVar2) {
        brvgVar.az(3, "is_normalized");
        return brvgVar.d ? brvgVar : brvgVar2;
    }

    public static /* synthetic */ bscj[] lambda$applyDeduplicationAndConvert$3(int i) {
        return new bscj[i];
    }

    public static /* synthetic */ bskq[] lambda$fixLegacyResourceUrisInConversations$0(bskp bskpVar) {
        return new bskq[]{bskpVar.a, bskpVar.n};
    }

    public static /* synthetic */ bsol lambda$fixLegacyResourceUrisInConversations$1(bsol bsolVar) {
        bsolVar.n();
        return bsolVar;
    }

    public static /* synthetic */ bwau[] lambda$fixLegacyResourceUrisInDrafts$0(bwat bwatVar) {
        return new bwau[]{bwatVar.a, bwatVar.d, bwatVar.u, bwatVar.w};
    }

    public static /* synthetic */ bwdm lambda$fixLegacyResourceUrisInDrafts$1(bwdm bwdmVar) {
        bwdmVar.b(new Function() { // from class: bdzq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar2 = (bwdm) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$2(bwdmVar2);
                return bwdmVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bdzs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar2 = (bwdm) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$3(bwdmVar2);
                return bwdmVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bdzt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar2 = (bwdm) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$4(bwdmVar2);
                return bwdmVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bwdmVar;
    }

    public static /* synthetic */ bwdm lambda$fixLegacyResourceUrisInDrafts$2(bwdm bwdmVar) {
        bwdmVar.w();
        return bwdmVar;
    }

    public static /* synthetic */ bwdm lambda$fixLegacyResourceUrisInDrafts$3(bwdm bwdmVar) {
        int intValue = PartsTable.e().intValue();
        if (intValue < 10017) {
            dtub.w("preview_content_uri", intValue);
        }
        bwdmVar.aq(new dtrt("parts.preview_content_uri", 11, "android.resource%"));
        return bwdmVar;
    }

    public static /* synthetic */ bwdm lambda$fixLegacyResourceUrisInDrafts$4(bwdm bwdmVar) {
        int intValue = PartsTable.e().intValue();
        if (intValue < 13000) {
            dtub.w("fallback_uri", intValue);
        }
        bwdmVar.aq(new dtrt("parts.fallback_uri", 11, "android.resource%"));
        return bwdmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fixRcsGroupConversation$0(String str, cpbd cpbdVar, ConversationIdType conversationIdType) {
        ParticipantsTable.BindData a;
        bvpo f = bdqu.f(str);
        ((bdrr) this.participantDatabaseOperations.b()).j(f);
        ParticipantsTable.BindData a2 = f.a();
        ((bdrr) this.participantDatabaseOperations.b()).j(bdqu.f(cpbdVar.d));
        ArrayList arrayList = new ArrayList();
        if (cpbdVar.b.isEmpty()) {
            arrayList.add(a2);
        } else {
            for (aoku aokuVar : cpbdVar.b) {
                cfva cfvaVar = aoqm.a;
                String k = aokuVar.k(((Boolean) new aoqj().get()).booleanValue());
                k.getClass();
                if (((Boolean) new aoqj().get()).booleanValue()) {
                    bvpo f2 = bdqu.f(k);
                    ((bdrr) this.participantDatabaseOperations.b()).j(f2);
                    a = f2.a();
                } else {
                    a = this.participantRowFactory.a(aokuVar);
                    ((bdrr) this.participantDatabaseOperations.b()).i(a);
                }
                arrayList.add(a);
            }
        }
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("fixRcsGroupConversation");
        bsoeVar.C(cpbdVar.c);
        bsoeVar.F(0L);
        bsoeVar.J("");
        bsoeVar.K("");
        bsoeVar.H("");
        bsoeVar.n(cpbdVar.d);
        bsoeVar.G(arrayList.size());
        bsoeVar.I(cpbdVar.b.toString());
        bsoeVar.A(cpbdVar.f);
        bsoeVar.m();
        bsoeVar.z(this.participantAvatarUriGenerator.b(arrayList).toString());
        ((bczy) this.conversationDatabaseOperations.b()).W(conversationIdType, bsoeVar);
        if (cpbdVar.b.isEmpty()) {
            return;
        }
        ((bczy) this.conversationDatabaseOperations.b()).aj(a2, conversationIdType, false);
        ((bczy) this.conversationDatabaseOperations.b()).ao(arrayList, conversationIdType);
    }

    public static /* synthetic */ bsol lambda$getAllRcsGroupConversationsWithJoinedStatus$0(bsol bsolVar) {
        bsolVar.j(2);
        bsolVar.x(0);
        return bsolVar;
    }

    public static /* synthetic */ bskq[] lambda$getAllRcsThreadIdGroupNamePairs$0(bskp bskpVar) {
        return new bskq[]{bskpVar.b, bskpVar.c};
    }

    public static /* synthetic */ bsol lambda$invalidateRcsSessionIdsForOneToOne$0(bsol bsolVar) {
        bsolVar.j(0);
        return bsolVar;
    }

    public static /* synthetic */ List lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$0(Long l) {
        return new ArrayList();
    }

    public static /* synthetic */ void lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$1(List list) {
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("potentiallyInvalidateRcsSessionIdsForRcsGroups#update");
        bsoeVar.A(4);
        bsoeVar.T(-1L);
        bsol bsolVar = new bsol();
        bsolVar.t(list);
        bsoeVar.af(new bsof(bsolVar));
        bsoeVar.b().e();
    }

    public static /* synthetic */ bscj[] lambda$rebuildConversationToParticipantsTable$0(int i) {
        return new bscj[i];
    }

    public static /* synthetic */ brwv lambda$toOtherConversationToParticipants$0(ConversationIdType conversationIdType, long j, brwv brwvVar) {
        brwvVar.b(conversationIdType);
        brwvVar.c(j);
        return brwvVar;
    }

    public static /* synthetic */ buxz lambda$updateNotNeededMessageSendReportStatusInTransactionPre41040$0(buxz buxzVar) {
        buxzVar.as(new dtzq("rcs_message_id NOT NULL AND rcs_message_id <> ''", new Object[0]));
        buxzVar.E(0);
        return buxzVar;
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion10015$1(bsol bsolVar) {
        bsolVar.aq(new dtrx("conversations.participant_lookup_key", 6));
        return bsolVar;
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion10020$0(bsol bsolVar) {
        bsolVar.j(0);
        bsolVar.J();
        return bsolVar;
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion10025$0(bsol bsolVar) {
        bsolVar.j(3);
        return bsolVar;
    }

    public static /* synthetic */ void lambda$upgradeToVersion13030$0() {
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.af(108);
        updateNotNeededMessageSendReportStatusInTransactionPre41040(new buxs(buxzVar), 2);
        buxz buxzVar2 = new buxz();
        buxzVar2.af(109);
        updateNotNeededMessageSendReportStatusInTransactionPre41040(new buxs(buxzVar2), 3);
        buxz buxzVar3 = new buxz();
        int intValue = MessagesTable.g().intValue();
        if (intValue < 13020) {
            dtub.w("message_report_status", intValue);
        }
        buxzVar3.aq(new dtwe("messages.message_report_status", 9, 100));
        updateNotNeededMessageSendReportStatusInTransactionPre41040(new buxs(buxzVar3), 1);
    }

    public static /* synthetic */ bvvw lambda$upgradeToVersion2000$0(int i, bvvw bvvwVar) {
        bvvwVar.w(i);
        return bvvwVar;
    }

    public static /* synthetic */ bvvw lambda$upgradeToVersion2000$1(int i, bvvw bvvwVar) {
        bvvwVar.w(i);
        return bvvwVar;
    }

    public static /* synthetic */ bswe lambda$upgradeToVersion24050$0(bswe bsweVar) {
        bsweVar.aq(new dtrx("disambiguations.normalized_destination", 5));
        return bsweVar;
    }

    public static /* synthetic */ bwdm lambda$upgradeToVersion29000$0(bwdm bwdmVar) {
        bwdmVar.w();
        return bwdmVar;
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion29000$1(bsol bsolVar) {
        bsolVar.n();
        return bsolVar;
    }

    public static /* synthetic */ bvth[] lambda$upgradeToVersion29050$0(bvtg bvtgVar) {
        return new bvth[]{bvtgVar.f, bvtgVar.e, bvtgVar.d, bvtgVar.w, bvtgVar.x, bvtgVar.a};
    }

    public static /* synthetic */ bvvw lambda$upgradeToVersion29050$1(bvvw bvvwVar) {
        bvvwVar.y();
        return bvvwVar;
    }

    public static /* synthetic */ bwdm lambda$upgradeToVersion30030$1(bwdm bwdmVar) {
        int intValue = PartsTable.e().intValue();
        if (intValue < 14010) {
            dtub.w("source", intValue);
        }
        bwdmVar.aq(new dtwe("parts.source", 1, 21));
        return bwdmVar;
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion30030$2(bwdd bwddVar, buxz buxzVar) {
        buxzVar.t(bwddVar);
        return buxzVar;
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion3010$1(buxz buxzVar) {
        buxzVar.r(PartsTable.d.b);
        return buxzVar;
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion35070$1(buxz buxzVar) {
        buxzVar.r(bxct.c.b);
        return buxzVar;
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion4020$0(int i, buxz buxzVar) {
        buxzVar.af(i - 90);
        return buxzVar;
    }

    public static /* synthetic */ bxxv lambda$upgradeToVersion41040$0(bxxv bxxvVar) {
        bxxvVar.aq(new dtrt("sqlite_master.type", 1, "trigger"));
        bxxvVar.aq(new dtrt("sqlite_master.name", 1, "on_messages_update_bkr"));
        return bxxvVar;
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion42040$0(bsol bsolVar) {
        bsolVar.c(byyt.KEEP_ARCHIVED);
        return bsolVar;
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion42040$1(bsol bsolVar) {
        bsolVar.c(byyt.ARCHIVED);
        bsolVar.A();
        return bsolVar;
    }

    public static /* synthetic */ bskq[] lambda$upgradeToVersion42040$2(bskp bskpVar) {
        return new bskq[]{bskpVar.a, bskpVar.y};
    }

    public static /* synthetic */ bvvw lambda$upgradeToVersion42040$3(String str, bvvw bvvwVar) {
        bvvwVar.r(str);
        duav[] duavVarArr = new bvvw[2];
        String[] strArr = ParticipantsTable.a;
        bvvw bvvwVar2 = new bvvw();
        bvvwVar2.c();
        duavVarArr[0] = bvvwVar2;
        duav bvvwVar3 = new bvvw();
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 24060) {
            dtub.w("is_spam", intValue);
        }
        bvvwVar3.aq(new dtwe("participants.is_spam", 1, 1));
        duavVarArr[1] = bvvwVar3;
        bvvwVar.ar(duavVarArr);
        return bvvwVar;
    }

    public static /* synthetic */ bvth[] lambda$upgradeToVersion42040$4(bvtg bvtgVar) {
        return new bvth[]{bvtgVar.v, bvtgVar.C, bvtgVar.D};
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion42040$5(ArrayList arrayList, bsol bsolVar) {
        bsolVar.t(arrayList);
        return bsolVar;
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion42040$6(ArrayList arrayList, bsol bsolVar) {
        bsolVar.t(arrayList);
        return bsolVar;
    }

    public static /* synthetic */ void lambda$upgradeToVersion45000$0() {
        bxek a = bxen.a();
        a.z("upgradeToVersion45000");
        a.r();
        bxdu bxduVar = (bxdu) a.b().o();
        while (bxduVar.moveToNext()) {
            try {
                String h = bxduVar.h();
                if (h != null) {
                    String[] strArr = bxgl.a;
                    bxex bxexVar = new bxex();
                    bxexVar.i(h);
                    bxexVar.b(bxduVar.e());
                    bxexVar.c(bxduVar.i());
                    bxexVar.e(bxduVar.k());
                    bxexVar.f(bxduVar.j());
                    bxexVar.g(bxduVar.f());
                    bxexVar.j(bxduVar.c());
                    bxeu a2 = bxexVar.a();
                    final dtve b = bxgl.b();
                    dtub.b(bxgl.b(), "remote_registrations_table", a2, new Function() { // from class: bxeq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dtve.this.R("remote_registrations_table", (ContentValues) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bxer
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    String[] strArr2 = bxiv.a;
                    bxib bxibVar = new bxib();
                    bxibVar.b(bxduVar.g());
                    bxibVar.c(h);
                    bxhy a3 = bxibVar.a();
                    final dtve a4 = bxiv.a();
                    dtub.b(bxiv.a(), "remote_user_id_to_registration_id", a3, new Function() { // from class: bxhu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dtve.this.R("remote_user_id_to_registration_id", (ContentValues) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bxhv
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                String[] strArr3 = bxhr.a;
                bxgt bxgtVar = new bxgt();
                bxgtVar.d(bxduVar.g());
                bxgtVar.c(bxduVar.f());
                bxgtVar.b(bxduVar.e());
                bxgtVar.a().m();
            } catch (Throwable th) {
                try {
                    bxduVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bxeg bxegVar = new bxeg();
        bxegVar.f("upgradeToVersion45000");
        bxegVar.d();
        bxduVar.close();
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion49000$0(bsol bsolVar) {
        bsolVar.x(3);
        bsolVar.j(2);
        return bsolVar;
    }

    public static /* synthetic */ bvth[] lambda$upgradeToVersion52020$0(bvtg bvtgVar) {
        return new bvth[]{bvtgVar.a, bvtgVar.o};
    }

    public static /* synthetic */ bvvw lambda$upgradeToVersion52020$1(bvvw bvvwVar) {
        bvvwVar.p(byzi.VERIFICATION_NA);
        return bvvwVar;
    }

    public static /* synthetic */ buun[] lambda$upgradeToVersion53000$0(buum buumVar) {
        return new buun[]{buumVar.a};
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion53000$1(buxz buxzVar) {
        buxzVar.r(bytk.c.b);
        buxzVar.b(new Function() { // from class: beai
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar2 = (buxz) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion53000$2(buxzVar2);
                return buxzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: beaj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar2 = (buxz) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion53000$3(buxzVar2);
                return buxzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return buxzVar;
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion53000$2(buxz buxzVar) {
        buxzVar.af(217);
        return buxzVar;
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion53000$3(buxz buxzVar) {
        buxzVar.af(211);
        return buxzVar;
    }

    public static /* synthetic */ bytj lambda$upgradeToVersion53000$4(buxm buxmVar, bytj bytjVar) {
        bytjVar.as(new dtym(buxmVar));
        return bytjVar;
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion58020$1(buxz buxzVar) {
        buxzVar.r(ScheduledSendTable.c.b);
        return buxzVar;
    }

    public static /* synthetic */ byfh lambda$upgradeToVersion58650$0(byfh byfhVar) {
        byfhVar.b(6);
        return byfhVar;
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion59320$0(bsol bsolVar) {
        bsolVar.m(1);
        bsolVar.o(false);
        return bsolVar;
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion59480$0(buxz buxzVar) {
        buxzVar.af(232);
        buxzVar.aq(new dtrx("messages.self_id", 5));
        return buxzVar;
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion59500$0(buxz buxzVar) {
        buxzVar.V(new bdgr(""));
        return buxzVar;
    }

    public static /* synthetic */ bsvd lambda$upgradeToVersion59600$0(bsvd bsvdVar) {
        Object apply;
        bsvdVar.d(byzd.GAIA);
        Function[] functionArr = {new Function() { // from class: beap
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsvd bsvdVar2 = (bsvd) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59600$1(bsvdVar2);
                return bsvdVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: beaq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsvd bsvdVar2 = (bsvd) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59600$2(bsvdVar2);
                return bsvdVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }};
        bsvd[] bsvdVarArr = new bsvd[2];
        for (int i = 0; i < 2; i++) {
            Function function = functionArr[i];
            String[] strArr = bsve.a;
            apply = function.apply(new bsvd());
            bsvdVarArr[i] = (bsvd) apply;
        }
        bsvdVar.ar(bsvdVarArr);
        return bsvdVar;
    }

    public static /* synthetic */ bsvd lambda$upgradeToVersion59600$1(bsvd bsvdVar) {
        int intValue = bsve.c().intValue();
        if (intValue < 59560) {
            dtub.w("gaia_email", intValue);
        }
        bsvdVar.aq(new dtrx("desktop.gaia_email", 5));
        return bsvdVar;
    }

    public static /* synthetic */ bsvd lambda$upgradeToVersion59600$2(bsvd bsvdVar) {
        int intValue = bsve.c().intValue();
        if (intValue < 59560) {
            dtub.w("gaia_email", intValue);
        }
        bsvdVar.aq(new dtrt("desktop.gaia_email", 1, ""));
        return bsvdVar;
    }

    public static /* synthetic */ brwv lambda$upgradeToVersion59760$2(bwom bwomVar, brwv brwvVar) {
        brwvVar.aq(new dtru("conversation_participants.participant_id", 1, bwomVar));
        return brwvVar;
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion59760$3(brvg brvgVar, bsol bsolVar) {
        bsolVar.j(0);
        bsolVar.q(brvgVar.l());
        return bsolVar;
    }

    public static /* synthetic */ bvvw lambda$upgradeToVersion59840$0(bvvw bvvwVar) {
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 4000) {
            dtub.w("contact_destination", intValue);
        }
        bvvwVar.aq(new dtrx("participants.contact_destination", 6));
        return bvvwVar;
    }

    public static /* synthetic */ bxtg lambda$upgradeToVersion60270$0(bxtg bxtgVar) {
        bxtgVar.b(-1);
        bxtgVar.aq(new dtwe("self_participants.sim_slot_index", 9, 0));
        return bxtgVar;
    }

    public static /* synthetic */ bxtg lambda$upgradeToVersion60270$1(bxro bxroVar, bxtg bxtgVar) {
        bxtgVar.aq(new dtwe("self_participants.sub_id", 7, -1));
        bxtgVar.aq(new dtwe("self_participants.sim_slot_index", 1, Integer.valueOf(bxroVar.k())));
        return bxtgVar;
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion60370$0(buxz buxzVar) {
        buxzVar.D();
        return buxzVar;
    }

    public static /* synthetic */ bsol lambda$upgradeToVersion60450$0(bsol bsolVar) {
        bsolVar.K(cpxu.b(0L));
        return bsolVar;
    }

    public static /* synthetic */ buxz lambda$upgradeToVersion60480$0(buxz buxzVar) {
        buxzVar.D();
        return buxzVar;
    }

    private void markMessagesAsReadInTelephonyAsync() {
        cskc cskcVar = log;
        cskcVar.p("begin markMessagesAsReadInTelephonyAsync.");
        if (!this.buglePhoneNumberUtils.G()) {
            cskcVar.p("Not default sms app. Cannot mark messages as read in telephony.");
        } else {
            if (!this.permissionChecker.r()) {
                cskcVar.p("No SMS permissions. Cannot mark messages as read in telephony.");
                return;
            }
            csld.a(this.context, new beaw(this));
            cskcVar.p("completed markMessagesAsReadInTelephonyAsync.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void markMessagesAsReadInTelephonySync() {
        buxo d = MessagesTable.d();
        d.z("markMessagesAsReadInTelephonySync");
        buum buumVar = MessagesTable.c;
        d.c(buumVar.o, buumVar.i);
        buxz buxzVar = new buxz();
        buxzVar.P(true);
        buxzVar.ad();
        d.g(buxzVar);
        d.d(new buxl(MessagesTable.c.i, false));
        d.v(MessagesTable.c.b);
        buuo buuoVar = (buuo) d.b().o();
        while (buuoVar.moveToNext()) {
            try {
                ((coxk) this.telephonyManagerInterface.b()).ai(buuoVar.o(), buuoVar.l());
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
    }

    private void potentiallyInvalidateRcsSessionIdsForRcsGroups(dtve dtveVar) {
        final ArrayList arrayList = new ArrayList();
        bsob e = bsom.e();
        e.z("potentiallyInvalidateRcsSessionIdsForRcsGroups");
        e.r();
        bskp bskpVar = bsom.c;
        e.c(bskpVar.a, bskpVar.M);
        bsol bsolVar = new bsol();
        bsolVar.j(2);
        e.k(new bsof(bsolVar));
        bskr bskrVar = (bskr) e.b().o();
        try {
            HashMap hashMap = new HashMap();
            while (bskrVar.moveToNext()) {
                ((List) Map.EL.computeIfAbsent(hashMap, Long.valueOf(bskrVar.f()), new Function() { // from class: bdxw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return CustomUpgradeSteps.lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$0((Long) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).add(bskrVar.h());
            }
            for (List list : hashMap.values()) {
                if (list.size() > 1) {
                    arrayList.addAll(list);
                }
            }
            bskrVar.close();
            if (arrayList.isEmpty()) {
                return;
            }
            dtveVar.A("OnDeviceDatabaseUpgradeHandler#potentiallyInvalidateRcsSessionIdsForRcsGroups", new Runnable() { // from class: bdxx
                @Override // java.lang.Runnable
                public final void run() {
                    CustomUpgradeSteps.lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$1(arrayList);
                }
            });
        } catch (Throwable th) {
            try {
                bskrVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void rebuildConversationToParticipantsTable() {
        String[] strArr = bsdr.a;
        bsdi bsdiVar = new bsdi();
        bsdiVar.f("rebuildConversationToParticipantsTable-1");
        bsdiVar.e();
        bsdiVar.d();
        brwp a = brww.a();
        a.z("rebuildConversationToParticipantsTable-2");
        a.r();
        bsdr.b(0, applyDeduplicationAndConvert(a.b().y()));
        bscj[] bscjVarArr = (bscj[]) Collection.EL.stream(getAllRcsGroupConversationsWithJoinedStatus()).map(new Function() { // from class: bdxo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional otherConversationToParticipants;
                otherConversationToParticipants = CustomUpgradeSteps.this.toOtherConversationToParticipants((bseh) obj);
                return otherConversationToParticipants;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: bdxz
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Optional) obj).isPresent();
            }
        }).map(new Function() { // from class: bdyk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (bscj) ((Optional) obj).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: bdyv
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return CustomUpgradeSteps.lambda$rebuildConversationToParticipantsTable$0(i);
            }
        });
        bsdr.b(0, bscjVarArr);
        if (bscjVarArr.length > 0) {
            upgradeRcsGroupsConversationParticipantCount();
        }
    }

    private void safeRebuildConversationToParticipantsTable() {
        try {
            rebuildConversationToParticipantsTable();
        } catch (Exception e) {
            ensk i = logger.i();
            i.Y(ente.a, "BugleDatabase");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/datamodel/database/upgrade/CustomUpgradeSteps", "safeRebuildConversationToParticipantsTable", (char) 2069, "CustomUpgradeSteps.java")).q("Failed to rebuild ConversationToParticipantsTable");
        }
    }

    private void sanitizeParticipants() {
        cskc cskcVar = log;
        cskcVar.p("begin sanitizeParticipants.");
        this.sanitizeParticipantsActionFactory.b().A();
        cskcVar.p("completed sanitizeParticipants.");
    }

    private void setThreadArchiveStatusInTelephonyAsync(boolean z) {
        cskc cskcVar = log;
        cskcVar.p("begin setThreadArchiveStatusInTelephonyAsync.");
        if (!this.buglePhoneNumberUtils.G()) {
            cskcVar.p("Not default SMS app. Cannot set thread archive status in telephony.");
        } else {
            if (!this.permissionChecker.r()) {
                cskcVar.p("No SMS permissions. Cannot set thread archive status in telephony.");
                return;
            }
            csld.a(this.context, new beax(this, z));
            cskcVar.p("completed setThreadArchiveStatusInTelephonyAsync.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreadArchiveStatusInTelephonySync(boolean z) {
        String[] strArr = bsom.a;
        bsol bsolVar = new bsol();
        if (z) {
            bsolVar.d(byyt.UNARCHIVED);
        } else {
            bsolVar.c(byyt.UNARCHIVED);
        }
        bsob e = bsom.e();
        e.z("setThreadArchiveStatusInTelephonySync");
        e.g(new Function() { // from class: bdyt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bskq bskqVar;
                bskqVar = ((bskp) obj).b;
                return bskqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsolVar.aq(new dtrx("conversations.sms_thread_id", 6));
        e.h(bsolVar);
        bskr bskrVar = (bskr) e.b().o();
        while (bskrVar.moveToNext()) {
            try {
                ((coxk) this.telephonyManagerInterface.b()).T(bskrVar.k(), z);
            } catch (Throwable th) {
                try {
                    bskrVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bskrVar.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toConversationParticipantsDeduplicationKey(brvg brvgVar) {
        return String.valueOf(brvgVar.l()) + "|" + brvgVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static bscj toConversationToParticipants(brvg brvgVar) {
        String[] strArr = bsdr.a;
        bsco bscoVar = new bsco();
        bscoVar.f(brvgVar.k());
        bscoVar.d(brvgVar.l());
        brvgVar.az(4, "rcs_group_join_status");
        bscoVar.g(brvgVar.e);
        brvgVar.az(5, "last_modified_by_key");
        bscoVar.e(brvgVar.f);
        return bscoVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Optional<bscj> toOtherConversationToParticipants(bseh bsehVar) {
        String ae = bsehVar.ae();
        if (ae == null) {
            return Optional.empty();
        }
        final ConversationIdType C = bsehVar.C();
        final long parseLong = Long.parseLong(((bdrr) this.participantDatabaseOperations.b()).i(bdqu.b(ae)));
        brwp a = brww.a();
        a.z("CustomUpgradeSteps#toConversationToParticipants.hasSelfParticipant");
        a.e(new Function() { // from class: bdyy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brwv brwvVar = (brwv) obj;
                CustomUpgradeSteps.lambda$toOtherConversationToParticipants$0(ConversationIdType.this, parseLong, brwvVar);
                return brwvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (a.b().T()) {
            return Optional.empty();
        }
        String[] strArr = bsdr.a;
        bsco bscoVar = new bsco();
        bscoVar.f(parseLong);
        bscoVar.d(C);
        bscoVar.g(awwp.JOINED);
        return Optional.of(bscoVar.a());
    }

    private static void updateNotNeededMessageSendReportStatusInTransactionPre41040(buxs buxsVar, int i) {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("updateNotNeededMessageSendReportStatusInTransactionPre41040");
        buxrVar.s(i);
        buxrVar.Y(new Function() { // from class: beah
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                CustomUpgradeSteps.lambda$updateNotNeededMessageSendReportStatusInTransactionPre41040$0(buxzVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxrVar.af(buxsVar);
        buxrVar.ak();
        buxrVar.b().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void upgradeRcsGroups(dtve dtveVar) {
        dtve dtveVar2;
        log.p("begin upgradeRcsGroups.");
        String[] strArr = bsom.a;
        bsol bsolVar = new bsol();
        int i = 0;
        bsolVar.as(new dtzq("$V{J:convo} like $V", new Object[]{bsom.c.c, "@rcs.google.com"}));
        bsof bsofVar = new bsof(bsolVar);
        String[] strArr2 = MessagesTable.a;
        buxs buxsVar = new buxs(new buxz());
        ekzz f = eleg.f("MessageDatabaseOperations#queryLastMessagesForEachConversation");
        try {
            buxo d = MessagesTable.d();
            d.z("+queryLastMessagesForEachConversation");
            d.e(new Function() { // from class: bdks
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    cskc cskcVar = bdmq.a;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.o};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsob e = bsom.e();
            e.f(new Function() { // from class: bdkt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bskp bskpVar = (bskp) obj;
                    cskc cskcVar = bdmq.a;
                    return new bskq[]{bskpVar.b, bskpVar.c};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.k(bsofVar);
            dtvy i2 = dtvz.i(e.b(), bsom.c.a, MessagesTable.c.b);
            ((dtrd) i2).e = "convo";
            d.G(i2.g());
            d.h(new Function() { // from class: bdku
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    buxzVar.ad();
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.k(buxsVar);
            d.n(new dtzq("MAX($V)", new Object[]{MessagesTable.c.i}), "max_timestamp_expression");
            d.v(MessagesTable.c.b);
            engw y = d.b().y();
            f.close();
            int i3 = ((enou) y).c;
            while (i < i3) {
                MessagesTable.BindData bindData = (MessagesTable.BindData) y.get(i);
                bseh bsehVar = (bseh) bindData.aw("conversation", bseh.class);
                Uri B = bindData.B();
                if (bsehVar == null || B == null) {
                    dtveVar2 = dtveVar;
                } else {
                    dtveVar2 = dtveVar;
                    fixRcsGroupConversation(dtveVar2, bindData.C(), bsehVar.M(), bsehVar.X(), B.toString());
                }
                i++;
                dtveVar = dtveVar2;
            }
            log.p("completed upgradeRcsGroups.");
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void upgradeRcsGroupsConversationParticipantCount() {
        log.p("begin upgradeRcsGroupsParticipantCount.");
        engw u = ((bczy) this.conversationDatabaseOperations.b()).u();
        int i = ((enou) u).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((bczy) this.conversationDatabaseOperations.b()).T((ConversationIdType) u.get(i2));
        }
        log.p("completed upgradeRcsGroupsParticipantCount.");
    }

    private void upgradeRcsTelephonyEncoding() {
        int i;
        log.p("begin upgradeRcsTelephonyEncoding.");
        java.util.Map<Long, String> allRcsThreadIdGroupNamePairs = getAllRcsThreadIdGroupNamePairs();
        SparseArray sparseArray = new SparseArray();
        Iterator<Long> it = allRcsThreadIdGroupNamePairs.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Long next = it.next();
            long longValue = next.longValue();
            String str = allRcsThreadIdGroupNamePairs.get(next);
            String H = ((coxk) this.telephonyManagerInterface.b()).H(longValue);
            if (H != null) {
                if (H.split(" ").length == 1) {
                    String trim = H.trim();
                    aoku aokuVar = (aoku) ((coxk) this.telephonyManagerInterface.b()).K(trim).get(0);
                    cfva cfvaVar = aoqm.a;
                    String b = emxe.b(aokuVar.k(((Boolean) new aoqj().get()).booleanValue()));
                    cuwz cuwzVar = this.base32Utils;
                    StringTokenizer stringTokenizer = new StringTokenizer(b, "@");
                    if (!stringTokenizer.hasMoreTokens() || !cuwzVar.b(stringTokenizer.nextToken())) {
                        sparseArray.put(Integer.parseInt(trim), this.rcsTelephonyStrings.d(b, str));
                    }
                } else {
                    log.n("An RCS group in threads table exists with multiple recipients, which should only happen in MMS groups.");
                }
            }
        }
        ContentResolver contentResolver = this.context.getContentResolver();
        for (i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            String str2 = (String) sparseArray.get(keyAt);
            ContentValues contentValues = new ContentValues(1);
            Uri build = coxk.b.buildUpon().appendPath(Integer.toString(keyAt)).build();
            contentValues.put("address", this.base32Utils.d(str2));
            akzw b2 = this.timerEventLogger.b("Bugle.Telephony.Update.FieldBulk.Latency");
            int update = contentResolver.update(build, contentValues, a.h(keyAt, "_id="), null);
            b2.c();
            if (update <= 0) {
                csjb b3 = log.b();
                b3.I("Updating the backup contact address on canonical addresses table failed.");
                b3.y("numberOfRowsUpdated", update);
                b3.r();
            }
        }
        log.p("completed upgradeRcsTelephonyEncoding.");
    }

    public void clearOneToOneColumnsForRcsGroups(dtve dtveVar) {
        cskc cskcVar = log;
        cskcVar.p("begin clearOneToOneColumnsForRcsGroups.");
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("clearOneToOneColumnsForRcsGroups");
        bsoeVar.ak();
        bsoeVar.F(0L);
        bsoeVar.a.putNull("participant_lookup_key");
        bsoeVar.a.putNull("participant_normalized_destination");
        bsol bsolVar = new bsol();
        bsolVar.j(2);
        bsoeVar.ac(bsolVar);
        int e = bsoeVar.b().e();
        if (e > 0) {
            csjb c = cskcVar.c();
            c.I("cleared 1:1s rcs groups.");
            c.y("count", e);
            c.r();
        }
        cskcVar.p("completed clearOneToOneColumnsForRcsGroups.");
    }

    public void copySuggestionRcsMessageIdIntoTargetRcsMessageId(dtve dtveVar) {
        cskc cskcVar = log;
        cskcVar.p("begin copySuggestionRcsMessageIdIntoTargetRcsMessageId.");
        String[] strArr = bsam.a;
        bsaj bsajVar = new bsaj();
        bsajVar.ap("copySuggestionRcsMessageIdIntoTargetRcsMessageId");
        bsajVar.ag("target_rcs_message_id", bsam.b.g);
        bsajVar.b().e();
        cskcVar.p("completed copySuggestionRcsMessageIdIntoTargetRcsMessageId.");
    }

    public java.util.Map<Long, String> getAllRcsThreadIdGroupNamePairs() {
        ekzz f = eleg.f("CustomUpgradeSteps#getAllRcsThreadIdGroupNamePairs");
        try {
            csix.h();
            HashMap hashMap = new HashMap();
            bsob e = bsom.e();
            e.z("getAllRcsThreadIdGroupNamePairs");
            e.r();
            bsol bsolVar = new bsol();
            bsolVar.j(2);
            e.h(bsolVar);
            e.f(new Function() { // from class: bdxy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return CustomUpgradeSteps.lambda$getAllRcsThreadIdGroupNamePairs$0((bskp) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bskr bskrVar = (bskr) e.b().o();
            while (bskrVar.moveToNext()) {
                try {
                    long a = cpxv.a(bskrVar.k());
                    String q = bskrVar.q();
                    if (q != null) {
                        hashMap.put(Long.valueOf(a), q);
                    }
                } finally {
                }
            }
            bskrVar.close();
            f.close();
            return hashMap;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void markUnreadMessagesInReadConversationsAsRead(dtve dtveVar) {
        cskc cskcVar = log;
        cskcVar.p("begin markUnreadMessagesInReadConversationsAsRead.");
        String obj = MessagesTable.c.b.toString();
        buum buumVar = MessagesTable.c;
        String obj2 = buumVar.n.toString();
        buun buunVar = buumVar.b;
        String obj3 = buunVar.toString();
        String obj4 = buunVar.toString();
        String[] strArr = bsom.a;
        buum buumVar2 = MessagesTable.c;
        Cursor cursor = null;
        try {
            try {
                cursor = dtveVar.g("/*EXEMPT-FROM-QUERY-PLAN-CHECK*/SELECT DISTINCT " + obj + " FROM messages WHERE " + obj2 + "=0 AND " + obj3 + " IN ( SELECT " + obj4 + " FROM conversations LEFT JOIN messages ON conversations.latest_message_id = " + buumVar2.a.toString() + " WHERE " + buumVar2.n.toString() + "=1)", null);
                int count = cursor.getCount();
                csjb c = cskcVar.c();
                c.I("Found read conversations with unread messages.");
                c.y("countOfConversationIds", count);
                c.r();
                if (count > 0) {
                    ConversationIdType[] conversationIdTypeArr = new ConversationIdType[count];
                    int i = 0;
                    while (cursor.moveToNext()) {
                        conversationIdTypeArr[i] = bdgq.b(cursor.getString(0));
                        i++;
                    }
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.markAsReadActionFactory.g(conversationIdTypeArr, bdhb.a).p(new beay(countDownLatch));
                    if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
                        log.p("Latch timed out waiting for actions.");
                    }
                }
            } catch (InterruptedException e) {
                log.s("Latch await has been interrupted.", e);
            }
            log.p("completed markUnreadMessagesInReadConversationsAsRead.");
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public void potentiallyInvalidateRcsSessionIds(dtve dtveVar) {
        invalidateRcsSessionIdsForOneToOne();
        potentiallyInvalidateRcsSessionIdsForRcsGroups(dtveVar);
        broadcastIncreaseSessionIdIntent();
    }

    public void removeIncompletePaymentMetadataRows(dtve dtveVar) {
        cskc cskcVar = log;
        cskcVar.p("begin removeIncompletePaymentMetadataRows.");
        dtveVar.y("DELETE FROM rbm_payment_request_metadata WHERE conversation_id IS NULL;");
        cskcVar.p("completed removeIncompletePaymentMetadataRows.");
    }

    public void updateConversationOtherParticipantDisplayDestination(dtve dtveVar) {
        cskc cskcVar = log;
        cskcVar.p("begin updateConversationOtherParticipantDisplayDestination.");
        String[] strArr = bsom.a;
        dtveVar.y(" UPDATE conversations SET participant_display_destination= ( SELECT display_destination FROM conversations AS c  INNER JOIN participants AS p  ON c.participant_normalized_destination = p.normalized_destination WHERE conversations.participant_normalized_destination = p.normalized_destination)  WHERE " + bsom.c.O.toString() + " = 0");
        cskcVar.p("completed updateConversationOtherParticipantDisplayDestination.");
    }

    @beaz(a = true)
    void upgradeToVersion10007(dtve dtveVar) {
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("upgradeToVersion10007");
        bskp bskpVar = bsom.c;
        bsoeVar.ag("conv_type", new dtzq("CASE WHEN $V > 1 THEN CASE WHEN $V = $V THEN $V ELSE $V END ELSE $V END", new Object[]{bskpVar.D, bskpVar.M, -1L, 1, 2, 0}));
        bsoeVar.b().e();
    }

    @beaz(a = true)
    void upgradeToVersion10008(dtve dtveVar) {
        upgradeRcsGroups(dtveVar);
    }

    @beaz(a = true)
    void upgradeToVersion10015(dtve dtveVar) {
        ekzz f = eleg.f("CustomUpgradeSteps#prefillDisambiguationTable");
        try {
            bsob e = bsom.e();
            e.z("upgradeToVersion10015");
            e.r();
            e.g(new Function() { // from class: bdym
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bskq bskqVar;
                    bskqVar = ((bskp) obj).w;
                    return bskqVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.n(new dtzq("MIN($V)", new Object[]{bsom.c.y}), "min_normalized_destination_expression");
            e.n(new dtzr("COUNT(*)"), "row_count_expression");
            e.i(new Function() { // from class: bdyn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    CustomUpgradeSteps.lambda$upgradeToVersion10015$1(bsolVar);
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.v(bsom.c.w);
            bskr bskrVar = (bskr) e.b().o();
            while (bskrVar.moveToNext()) {
                try {
                    if (Long.parseLong(bskrVar.dd("row_count_expression")) == 1) {
                        String[] strArr = bswf.a;
                        bsvm bsvmVar = new bsvm();
                        bsvmVar.b(bskrVar.s());
                        bsvmVar.c(bskrVar.dd("min_normalized_destination_expression"));
                        bsvmVar.a().k();
                    }
                } finally {
                }
            }
            bskrVar.close();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @beaz
    void upgradeToVersion10020(dtve dtveVar) {
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("upgradeToVersion10020");
        bsoeVar.ak();
        bsoeVar.T(-1L);
        bsoeVar.ad(new Function() { // from class: bdyx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion10020$0(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int e = bsoeVar.b().e();
        csjb d = log.d();
        d.I("Cleared rcs 1:1 conversations.");
        d.y("sessionsCount", e);
        d.r();
    }

    @beaz
    void upgradeToVersion10024(dtve dtveVar) {
        upgradeRcsTelephonyEncoding();
    }

    @beaz
    void upgradeToVersion10025(dtve dtveVar) {
        String[] strArr = bsom.a;
        bsnt bsntVar = new bsnt();
        bsntVar.f("upgradeToVersion10025");
        bsntVar.a(new Function() { // from class: bdyi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion10025$0(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsntVar.d();
    }

    @beaz
    void upgradeToVersion10028(dtve dtveVar) {
        log.p("Will soon update database data for version 10028.");
        clearOneToOneColumnsForRcsGroups(dtveVar);
    }

    @beaz
    void upgradeToVersion10029(dtve dtveVar) {
        dtveVar.y(CREATE_PROXY_TABLE_SQL);
        dtveVar.y(PROXY_TABLE_PARTICIPANT_ID_INDEX_SQL);
    }

    @beaz
    void upgradeToVersion11000(dtve dtveVar) {
        dtveVar.y(CREATE_CONVERSATION_SUGGESTIONS_TABLE_11000);
        dtveVar.y(CREATE_CONVERSATION_SUGGESTIONS_INDEX_11000);
    }

    @beaz(a = true)
    void upgradeToVersion12000(dtve dtveVar) {
        copySuggestionRcsMessageIdIntoTargetRcsMessageId(dtveVar);
    }

    @beaz
    void upgradeToVersion12002(dtve dtveVar) {
        dtveVar.y("DROP INDEX index_proxy_state_table_participant_id");
        dtveVar.y("DROP TABLE proxy_state_table");
    }

    @beaz
    void upgradeToVersion12003(dtve dtveVar) {
        log.p("Launching full sync as upgrade to version 12003.");
        ((coxg) this.syncManager.b()).k(eqqh.CUSTOM_UPGRADE_STEP_UPGRADE_TO_VERSION_12003);
    }

    @beaz
    void upgradeToVersion12004(dtve dtveVar) {
        log.p("Will mark messages read in telephony for version 12004.");
        markMessagesAsReadInTelephonyAsync();
    }

    @beaz
    void upgradeToVersion12005(dtve dtveVar) {
        log.p("Will mark threads archived in telephony for version 12005.");
        setThreadArchiveStatusInTelephonyAsync(true);
    }

    @beaz
    void upgradeToVersion13001(dtve dtveVar) {
        log.p("Will mark threads unarchived in telephony for version 13001.");
        setThreadArchiveStatusInTelephonyAsync(false);
    }

    @beaz
    void upgradeToVersion13030(dtve dtveVar) {
        dtveVar.A("OnDeviceDatabaseUpgradeHandler#upgradeToVersion13030", new Runnable() { // from class: bdxv
            @Override // java.lang.Runnable
            public final void run() {
                CustomUpgradeSteps.lambda$upgradeToVersion13030$0();
            }
        });
    }

    @beaz
    void upgradeToVersion13060(dtve dtveVar) {
        log.p("Will sanitize participants table for version 13060.");
        sanitizeParticipants();
    }

    @beaz(a = true)
    void upgradeToVersion15010(dtve dtveVar) {
        updateConversationOtherParticipantDisplayDestination(dtveVar);
    }

    @beaz
    void upgradeToVersion17000(dtve dtveVar) {
        String[] strArr = bsam.a;
        dtub.v(dtveVar, "index_conversation_suggestions_target_rcs_message_id", "CREATE INDEX index_conversation_suggestions_target_rcs_message_id ON conversation_suggestions(target_rcs_message_id);");
    }

    @beaz
    void upgradeToVersion19000(dtve dtveVar) {
        dtveVar.y("CREATE TABLE rbm_payment_request_metadata(_id INTEGER PRIMARY KEY AUTOINCREMENT, request_id TEXT NOT NULL, rbm_bot_id TEXT NOT NULL, expiration_time_millis INT DEFAULT(0), is_expired INT DEFAULT(0));");
    }

    @beaz
    void upgradeToVersion19010(dtve dtveVar) {
        dtveVar.y("ALTER TABLE rbm_payment_request_metadata ADD COLUMN conversation_id INT REFERENCES conversations(_id) ON DELETE CASCADE;");
    }

    @beaz
    void upgradeToVersion19030(dtve dtveVar) {
        String[] strArr = PartsTable.a;
        bwdi bwdiVar = new bwdi();
        bwdiVar.ap("upgradeToVersion19030");
        bwdiVar.ak();
        bwdiVar.e();
        bwdiVar.b().e();
        PartsTable.f(dtveVar);
        dtveVar.y(azyd.b);
    }

    @beaz(a = true)
    void upgradeToVersion2000(dtve dtveVar) {
        bvvr f = ParticipantsTable.f();
        f.ap("upgradeToVersion2000-participants1");
        f.Q(-1);
        f.V(new Function() { // from class: bdyc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion2000$0(-1, bvvwVar);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f.b().e();
        bvvr f2 = ParticipantsTable.f();
        f2.ap("upgradeToVersion2000-participants2");
        f2.Q(-2);
        f2.V(new Function() { // from class: bdyd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion2000$1(-2, bvvwVar);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f2.b().e();
    }

    @beaz
    void upgradeToVersion20000(dtve dtveVar) {
        dtveVar.y("CREATE TABLE link_preview (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_id TEXT NOT NULL REFERENCES messages(_id) ON DELETE CASCADE, trigger_url TEXT NOT NULL, expiration_time_millis INT DEFAULT(0), link_title TEXT, link_description TEXT, link_image_url TEXT, link_domain TEXT, link_canonical_url TEXT);");
    }

    @beaz
    void upgradeToVersion20040(dtve dtveVar) {
        String[] strArr = bttf.a;
        dtveVar.y("DROP TABLE messages_annotations");
        dtveVar.y("DROP INDEX IF EXISTS index_messages_annotations_message_id");
        bttf.f(dtveVar, 20040);
    }

    @beaz
    void upgradeToVersion20050(dtve dtveVar) {
        markUnreadMessagesInReadConversationsAsRead(dtveVar);
    }

    @beaz(b = true)
    void upgradeToVersion21000(dtve dtveVar) {
        btqq.f(dtveVar, 21000);
    }

    @beaz
    void upgradeToVersion22030(dtve dtveVar) {
        dtveVar.y(azyd.i);
    }

    @beaz
    void upgradeToVersion24000(dtve dtveVar) {
        cskc cskcVar = log;
        cskcVar.p("version 24000 start schema upgrade.");
        btki.d(dtveVar, 24000);
        dtveVar.y("CREATE INDEX index_generic_worker_queue_inflight_retries ON generic_worker_queue(in_flight,retry_count)");
        cskcVar.p("version 24000 apply triggers to schema.");
        dtveVar.y("CREATE TRIGGER on_conversations_insert AFTER INSERT ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,NEW._id); END");
        dtveVar.y("CREATE TRIGGER on_messages_insert AFTER INSERT ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,1,NEW._id); END");
        dtveVar.y("CREATE TRIGGER on_participants_insert AFTER INSERT ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,NEW._id); END");
        cskcVar.p("version 24000 OnPostInsert triggers done.");
        dtveVar.y("CREATE TRIGGER on_conversations_update AFTER UPDATE ON conversations WHEN OLD.name != NEW.name BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,OLD._id); END");
        dtveVar.y("CREATE TRIGGER on_messages_update AFTER UPDATE ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,1,OLD._id); END");
        dtveVar.y("CREATE TRIGGER on_participants_update AFTER UPDATE ON participants WHEN OLD.full_name != NEW.full_name OR OLD.lookup_key != NEW.lookup_key OR OLD.display_destination != NEW.display_destination OR OLD.normalized_destination != NEW.normalized_destination BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,OLD._id); END");
        cskcVar.p("version 24000 OnPostUpdate triggers done.");
        dtveVar.y("CREATE TRIGGER on_conversations_delete AFTER DELETE ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,OLD._id); END");
        dtveVar.y("CREATE TRIGGER on_messages_delete AFTER DELETE ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,1,OLD._id); END");
        dtveVar.y("CREATE TRIGGER on_participants_delete AFTER DELETE ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,OLD._id); END");
        removeIncompletePaymentMetadataRows(dtveVar);
    }

    @beaz(b = true)
    void upgradeToVersion24050(dtve dtveVar) {
        Object apply;
        String[] strArr = bswf.a;
        bsvy bsvyVar = new bsvy();
        bsvyVar.f("upgradeToVersion24050");
        apply = new Function() { // from class: bdzp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bswe bsweVar = (bswe) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion24050$0(bsweVar);
                return bsweVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bswe());
        bsvyVar.b = new bswd((bswe) apply);
        bsvyVar.d();
        dtub.J(dtveVar, "disambiguations", bswf.b("TEMP___disambiguations"), bswf.a, bswf.c());
    }

    @beaz
    void upgradeToVersion24100(dtve dtveVar) {
        dtveVar.y(azyd.h);
    }

    @beaz
    void upgradeToVersion25000(dtve dtveVar) {
        cskc cskcVar = log;
        cskcVar.p("begin enqueueRcsLocationsForAnnotations.");
        String[] strArr = btki.a;
        dtveVar.y("INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT DISTINCT 2,1," + PartsTable.d.b.toString() + " FROM parts WHERE " + PartsTable.d.e.toString() + " = 'application/vnd.gsma.rcspushlocation+xml';");
        cskcVar.p("begin enqueueRcsLocationsForAnnotations.");
    }

    @beaz
    void upgradeToVersion25020(dtve dtveVar) {
        dtveVar.y("DROP TRIGGER IF EXISTS ".concat(bece.e(1, becg.UPDATE.name())));
        dtveVar.y("DROP TRIGGER IF EXISTS ".concat(bece.e(3, becg.UPDATE.name())));
        dtveVar.y("DROP TRIGGER IF EXISTS ".concat(bece.e(2, becg.UPDATE.name())));
        dtveVar.y("CREATE TRIGGER on_participants_update AFTER UPDATE ON participants WHEN OLD.full_name != NEW.full_name OR OLD.lookup_key != NEW.lookup_key OR OLD.display_destination != NEW.display_destination OR OLD.normalized_destination != NEW.normalized_destination BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,OLD._id); END");
        dtveVar.y("CREATE TRIGGER on_conversations_update AFTER UPDATE ON conversations WHEN OLD.name != NEW.name BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,OLD._id); END");
    }

    @beaz
    void upgradeToVersion25030(dtve dtveVar) {
        dtveVar.y("DROP TRIGGER IF EXISTS ".concat(bece.e(1, becg.UPDATE.name())));
    }

    @beaz
    void upgradeToVersion26060(dtve dtveVar) {
        huaweiMate20UpgradeCleardata();
        fixLegacyResourceUris();
    }

    @beaz(a = true)
    void upgradeToVersion27000(dtve dtveVar) {
        dtveVar.y(azyd.c);
        copyBlobIdIntoCompressedBlobId();
    }

    @beaz
    void upgradeToVersion27010(dtve dtveVar) {
        dtveVar.y("CREATE TRIGGER on_messages_annotations_insert AFTER INSERT ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (1,4,NEW._id); END");
        dtveVar.y("CREATE TRIGGER on_messages_annotations_update AFTER UPDATE ON messages_annotations WHEN OLD.message_id != NEW.message_id OR OLD.annotation_details != NEW.annotation_details OR OLD.annotation_type != NEW.annotation_type BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (1,4,OLD._id); END");
        dtveVar.y("CREATE TRIGGER on_messages_annotations_delete AFTER DELETE ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (1,4,OLD._id); END");
        String[] strArr = btki.a;
        dtveVar.y("INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT DISTINCT 1,4," + bttf.c.a.toString() + " FROM messages_annotations WHERE " + bttf.c.d.toString() + " = " + fbqt.LINK_ANNOTATION.a() + " OR " + bttf.c.d.toString() + " = " + fbqt.ADDRESS_ANNOTATION.a() + ";");
    }

    @beaz
    void upgradeToVersion29000(dtve dtveVar) {
        String[] strArr = bxba.a;
        dtveVar.y("DROP TABLE IF EXISTS recent_stickers");
        String[] strArr2 = bxzt.a;
        dtveVar.y("DROP TABLE IF EXISTS sticker_sets_localization");
        String[] strArr3 = bycq.a;
        dtveVar.y("DROP TABLE IF EXISTS stickers_localization");
        String[] strArr4 = bybl.a;
        dtveVar.y("DROP TABLE IF EXISTS sticker_sets");
        String[] strArr5 = byea.a;
        dtveVar.y("DROP TABLE IF EXISTS stickers");
        dtveVar.y("DROP INDEX IF EXISTS index_stickers_sticker_set_id");
        String[] strArr6 = PartsTable.a;
        bwcy bwcyVar = new bwcy();
        bwcyVar.e();
        bwcyVar.f("upgradeToVersion29000");
        bwcyVar.a(new Function() { // from class: beaf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion29000$0(bwdmVar);
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwcyVar.d();
        String[] strArr7 = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("upgradeToVersion29000");
        bsoeVar.ak();
        bsoeVar.t();
        bsoeVar.ad(new Function() { // from class: beag
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion29000$1(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsoeVar.b().e();
    }

    @beaz
    void upgradeToVersion29010(dtve dtveVar) {
        dtveVar.y("DROP TRIGGER IF EXISTS participantsCorpus_delete_trigger_appdatasearch;");
        dtveVar.y("DROP TRIGGER IF EXISTS participantsCorpus_insert_trigger_appdatasearch;");
        dtveVar.y("DROP TRIGGER IF EXISTS participantsCorpus_update_trigger_appdatasearch;");
        dtveVar.y("DROP TRIGGER IF EXISTS partsCorpus_delete_trigger_appdatasearch;");
        dtveVar.y("DROP TRIGGER IF EXISTS partsCorpus_insert_trigger_appdatasearch;");
        dtveVar.y("DROP TRIGGER IF EXISTS partsCorpus_update_trigger_appdatasearch;");
        dtveVar.y("DROP TRIGGER IF EXISTS messagesCorpus_delete_trigger_appdatasearch;");
        dtveVar.y("DROP TRIGGER IF EXISTS messagesCorpus_insert_trigger_appdatasearch;");
        dtveVar.y("DROP TRIGGER IF EXISTS messagesCorpus_update_trigger_appdatasearch;");
        dtveVar.y("DROP TABLE IF EXISTS partsCorpus_seqno_table_appdatasearch;");
        dtveVar.y("DROP TABLE IF EXISTS messagesCorpus_seqno_table_appdatasearch;");
        dtveVar.y("DROP TABLE IF EXISTS participantsCorpus_seqno_table_appdatasearch;");
    }

    @beaz(a = true)
    void upgradeToVersion29050(dtve dtveVar) {
        String[] strArr = bxth.a;
        dtvx dtvxVar = new dtvx("self_participants", "$primary");
        bxsm bxsmVar = bxth.c;
        dtvxVar.b(bxsmVar.b, bxsmVar.d, bxsmVar.e, bxsmVar.f, bxsmVar.g, bxsmVar.h);
        bvvn e = ParticipantsTable.e();
        e.z("upgradeToVersion29050");
        e.e(new Function() { // from class: bdya
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$upgradeToVersion29050$0((bvtg) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.h(new Function() { // from class: bdyb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion29050$1(bvvwVar);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvxVar.c = e.b();
        dtvxVar.a().a();
    }

    @beaz(a = true)
    void upgradeToVersion29060(dtve dtveVar) {
        String[] strArr = PartsTable.a;
        bwdi bwdiVar = new bwdi();
        bwdiVar.ap("upgradeToVersion29060");
        bwdiVar.ag("storage_uri", PartsTable.d.d);
        bwdiVar.b().e();
    }

    @beaz
    void upgradeToVersion29070(dtve dtveVar) {
        dtveVar.y("DROP TRIGGER IF EXISTS on_messages_update_enqueue_worker");
        dtveVar.y("DROP TRIGGER IF EXISTS on_conversations_update_enqueue_worker");
        dtveVar.y("DROP TRIGGER IF EXISTS on_participants_update_enqueue_worker");
    }

    @beaz
    void upgradeToVersion30030(dtve dtveVar) {
        bwdf c = PartsTable.c();
        c.z("upgradeToVersion30030-parts");
        c.f(new Function() { // from class: beal
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwau bwauVar;
                bwauVar = ((bwat) obj).b;
                return bwauVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c.h(new Function() { // from class: beam
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion30030$1(bwdmVar);
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bwdd b = c.b();
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("upgradeToVersion30030-messages");
        buxrVar.q(true);
        buxrVar.Y(new Function() { // from class: beao
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion30030$2(bwdd.this, buxzVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxrVar.ak();
        buxrVar.b().e();
    }

    @beaz(b = true)
    void upgradeToVersion30050(dtve dtveVar) {
        dtub.J(dtveVar, "verified_sms_senders", byxc.c("TEMP___verified_sms_senders"), byxc.a, byxc.d());
    }

    @beaz(a = true)
    void upgradeToVersion3010(dtve dtveVar) {
        String[] strArr = PartsTable.a;
        bwdi bwdiVar = new bwdi();
        bwdiVar.ap("upgradeToVersion3010");
        buxo d = MessagesTable.d();
        d.f(new Function() { // from class: beas
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buun buunVar;
                buunVar = ((buum) obj).i;
                return buunVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: beat
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion3010$1(buxzVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwdiVar.ag("timestamp", d.b());
        bwdiVar.b().e();
        dtveVar.y(azyd.a);
        dtveVar.y(azyd.d);
    }

    @beaz
    void upgradeToVersion32040(dtve dtveVar) {
        String[] strArr = btki.a;
        dtveVar.y("CREATE INDEX index_generic_worker_queue_worker_table_itemId ON generic_worker_queue(worker_type,item_table_type,item_id)");
        dtveVar.y("UPDATE generic_worker_queue SET in_flight = 0 WHERE in_flight = 'false'");
        dtveVar.y("UPDATE generic_worker_queue SET in_flight = 1 WHERE in_flight = 'true'");
    }

    @beaz
    void upgradeToVersion33050(dtve dtveVar) {
        dtveVar.y("DROP VIEW IF EXISTS conversation_list_view");
    }

    @beaz
    void upgradeToVersion34010(dtve dtveVar) {
        String[] strArr = bxen.a;
        dtveVar.y("DROP TABLE IF EXISTS remote_instances");
        bxen.d(dtveVar, 34010);
    }

    @beaz
    void upgradeToVersion35000(dtve dtveVar) {
        String[] strArr = MessagesTable.a;
        dtub.v(dtveVar, "index_messages_cms_id", "CREATE UNIQUE INDEX index_messages_cms_id ON messages(cms_id);");
        String[] strArr2 = ParticipantsTable.a;
        dtub.v(dtveVar, "index_participants_cms_id", "CREATE UNIQUE INDEX index_participants_cms_id ON participants(cms_id);");
        fixSpamWarningForOlderReports();
    }

    @beaz(a = true)
    void upgradeToVersion35070(dtve dtveVar) {
        String[] strArr = bxct.a;
        bxcq bxcqVar = new bxcq();
        bxcqVar.ap("upgradeToVersion35070");
        buxo d = MessagesTable.d();
        d.f(new Function() { // from class: bdyz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buun buunVar;
                buunVar = ((buum) obj).b;
                return buunVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: bdza
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion35070$1(buxzVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bxcqVar.ag("conversation_id", d.b());
        bxcqVar.b().e();
    }

    @beaz
    void upgradeToVersion37050(dtve dtveVar) {
        potentiallyInvalidateRcsSessionIds(dtveVar);
    }

    @beaz(a = true)
    void upgradeToVersion39020(dtve dtveVar) {
        dtveVar.y("DROP TRIGGER IF EXISTS on_conversations_insert");
        dtveVar.y("DROP TRIGGER IF EXISTS on_messages_insert");
        dtveVar.y("DROP TRIGGER IF EXISTS on_participants_insert");
        dtveVar.y("DROP TRIGGER IF EXISTS on_messages_annotations_insert");
        dtveVar.y("DROP TRIGGER IF EXISTS on_conversations_update");
        dtveVar.y("DROP TRIGGER IF EXISTS on_participants_update");
        dtveVar.y("DROP TRIGGER IF EXISTS on_messages_annotations_update");
        dtveVar.y("DROP TRIGGER IF EXISTS on_conversations_delete");
        dtveVar.y("DROP TRIGGER IF EXISTS on_messages_delete");
        dtveVar.y("DROP TRIGGER IF EXISTS on_participants_delete");
        dtveVar.y("DROP TRIGGER IF EXISTS on_messages_annotations_delete");
        dtveVar.y("CREATE TRIGGER on_conversations_insert AFTER INSERT ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,2,NEW._id; END");
        dtveVar.y("CREATE TRIGGER on_messages_insert AFTER INSERT ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,1,NEW._id; END");
        dtveVar.y("CREATE TRIGGER on_participants_insert AFTER INSERT ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,3,NEW._id; END");
        dtveVar.y("CREATE TRIGGER on_messages_annotations_insert AFTER INSERT ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 1,4,NEW._id; END");
        dtveVar.y("CREATE TRIGGER on_conversations_update AFTER UPDATE ON conversations WHEN OLD.name != NEW.name BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,2,OLD._id; END");
        dtveVar.y("CREATE TRIGGER on_participants_update AFTER UPDATE ON participants WHEN OLD.full_name != NEW.full_name OR OLD.lookup_key != NEW.lookup_key OR OLD.display_destination != NEW.display_destination OR OLD.normalized_destination != NEW.normalized_destination BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,3,OLD._id; END");
        dtveVar.y("CREATE TRIGGER on_messages_annotations_update AFTER UPDATE ON messages_annotations WHEN OLD.message_id != NEW.message_id OR OLD.annotation_details != NEW.annotation_details OR OLD.annotation_type != NEW.annotation_type BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 1,4,OLD._id; END");
        dtveVar.y("CREATE TRIGGER on_conversations_delete AFTER DELETE ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,2,OLD._id; END");
        dtveVar.y("CREATE TRIGGER on_messages_delete AFTER DELETE ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,1,OLD._id; END");
        dtveVar.y("CREATE TRIGGER on_participants_delete AFTER DELETE ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,3,OLD._id; END");
        dtveVar.y("CREATE TRIGGER on_messages_annotations_delete AFTER DELETE ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 1,4,OLD._id; END");
    }

    @beaz
    void upgradeToVersion39035(dtve dtveVar) {
        potentiallyInvalidateRcsSessionIds(dtveVar);
    }

    @beaz
    void upgradeToVersion40000(dtve dtveVar) {
        potentiallyInvalidateRcsSessionIds(dtveVar);
    }

    @beaz(a = true)
    void upgradeToVersion4020(dtve dtveVar) {
        int[] iArr = {100, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 102, 103, 104, 105, 106, 107};
        for (int i = 0; i < 8; i++) {
            final int i2 = iArr[i];
            String[] strArr = MessagesTable.a;
            buxr buxrVar = new buxr();
            buxrVar.ap("upgradeToVersion4020");
            buxrVar.U(i2);
            buxrVar.Y(new Function() { // from class: bdye
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    CustomUpgradeSteps.lambda$upgradeToVersion4020$0(i2, buxzVar);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            buxrVar.b().e();
        }
    }

    @beaz(a = true)
    void upgradeToVersion41040(dtve dtveVar) {
        Object apply;
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("upgradeToVersion41040");
        buxrVar.ag("rcs_message_id_with_text_type", new dtzq("rcs_message_id", new Object[0]));
        buxrVar.b().e();
        dtveVar.y("UPDATE messages SET rcs_message_id = NULL");
        String[] strArr2 = bxxw.a;
        bxxt bxxtVar = new bxxt(bxxw.a);
        bxxtVar.z("upgradeToVersion41040");
        apply = new Function() { // from class: bdyr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxxv bxxvVar = (bxxv) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion41040$0(bxxvVar);
                return bxxvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bxxv());
        bxxtVar.k(new bxxu((bxxv) apply));
        if (bxxtVar.b().T()) {
            dtveVar.y("DROP TRIGGER IF EXISTS on_messages_update_bkr");
            dtveVar.y("CREATE TRIGGER on_messages_update_bkr AFTER UPDATE ON messages WHEN (OLD.sender_id IS NOT NEW.sender_id) OR (OLD.message_protocol IS NOT NEW.message_protocol) OR (OLD.mms_subject IS NOT NEW.mms_subject) OR (OLD.mms_transaction_id IS NOT NEW.mms_transaction_id) OR (OLD.mms_expiry IS NOT NEW.mms_expiry) OR (OLD.mms_retrieve_text IS NOT NEW.mms_retrieve_text) OR (OLD.cloud_sync_id IS NOT NEW.cloud_sync_id) OR (OLD.rcs_message_id_with_text_type IS NOT NEW.rcs_message_id_with_text_type) OR (OLD.etouffee_status IS NOT NEW.etouffee_status) OR (OLD.rcs_file_transfer_session_id IS NOT NEW.rcs_file_transfer_session_id) OR (OLD.sms_error_code IS NOT NEW.sms_error_code) OR (OLD.correlation_id IS NOT NEW.correlation_id) BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id,account_id,flags) SELECT 32,5,OLD._id,IFNULL((SELECT linked_account.account_id FROM linked_account WHERE linked_account.account_id IS NOT NULL LIMIT 1),-1),4; END");
        }
    }

    @beaz
    void upgradeToVersion42040(dtve dtveVar) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("upgradeToVersion42040#update");
        bsoeVar.ad(new Function() { // from class: beac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion42040$0(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsoeVar.h(byyt.BLOCKED_FOLDER);
        bsoeVar.b().e();
        bsob e = bsom.e();
        e.z("upgradeToVersion42040");
        e.i(new Function() { // from class: bean
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion42040$1(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.f(new Function() { // from class: beau
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$upgradeToVersion42040$2((bskp) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bskr bskrVar = (bskr) e.b().o();
        while (bskrVar.moveToNext()) {
            try {
                try {
                    ConversationIdType h = bskrVar.h();
                    final String t = bskrVar.t();
                    if (!h.b() && !TextUtils.isEmpty(t)) {
                        bvvn e2 = ParticipantsTable.e();
                        e2.z("upgradeToVersion42040-participants");
                        e2.h(new Function() { // from class: beav
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bvvw bvvwVar = (bvvw) obj;
                                CustomUpgradeSteps.lambda$upgradeToVersion42040$3(t, bvvwVar);
                                return bvvwVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        e2.e(new Function() { // from class: bdxp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return CustomUpgradeSteps.lambda$upgradeToVersion42040$4((bvtg) obj);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bvti bvtiVar = (bvti) e2.b().o();
                        try {
                            if (bvtiVar.moveToNext()) {
                                if (bvtiVar.u() && cuky.a(bvtiVar.c()).c()) {
                                    arrayList2.add(h);
                                } else if (bvtiVar.t()) {
                                    arrayList.add(h);
                                }
                            }
                            bvtiVar.close();
                        } catch (Throwable th) {
                            try {
                                bvtiVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (Exception unused) {
                    log.n("Failed to determine if participant's conversation should be moved");
                }
            } catch (Throwable th3) {
                try {
                    bskrVar.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        bskrVar.close();
        bsoe bsoeVar2 = new bsoe();
        bsoeVar2.ap("upgradeToVersion42040#update2");
        bsoeVar2.ad(new Function() { // from class: bdxq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion42040$5(arrayList, bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsoeVar2.h(byyt.BLOCKED_FOLDER);
        bsoeVar2.b().e();
        bsoe bsoeVar3 = new bsoe();
        bsoeVar3.ap("upgradeToVersion42040-conversations#update");
        bsoeVar3.ad(new Function() { // from class: bdxr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion42040$6(arrayList2, bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsoeVar3.h(byyt.SPAM_FOLDER);
        bsoeVar3.b().e();
    }

    @beaz(a = true)
    void upgradeToVersion45000(dtve dtveVar) {
        dtveVar.A("OnDeviceDatabaseUpgradeHandler#upgradeToVersion45000", new Runnable() { // from class: bdzb
            @Override // java.lang.Runnable
            public final void run() {
                CustomUpgradeSteps.lambda$upgradeToVersion45000$0();
            }
        });
    }

    @beaz(a = true)
    void upgradeToVersion46070(dtve dtveVar) {
        String[] strArr = cfbf.a;
        cfbc cfbcVar = new cfbc();
        cfbcVar.al();
        cfbcVar.ap("upgradeToVersion46070");
        cfbcVar.ak();
        Date date = new Date(0L);
        int intValue = cfbf.c().intValue();
        int intValue2 = cfbf.c().intValue();
        if (intValue2 < 46070) {
            dtub.w("minimum_start_time", intValue2);
        }
        if (intValue >= 46070) {
            cfbcVar.a.put("minimum_start_time", Long.valueOf(bdgs.a(date)));
        }
        cfbcVar.b().e();
    }

    @beaz(a = true)
    void upgradeToVersion49000(dtve dtveVar) {
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("upgradeToVersion49000");
        bsoeVar.ak();
        bsoeVar.ad(new Function() { // from class: bdyu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion49000$0(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsoeVar.A(4);
        bsoeVar.b().e();
    }

    @beaz(a = true)
    void upgradeToVersion5000(dtve dtveVar) {
        dtveVar.y(azyd.j);
    }

    @beaz
    void upgradeToVersion51020(dtve dtveVar) {
        String[] strArr = bwqg.a;
        dtveVar.y("DROP TABLE IF EXISTS rbm_business_info_properties");
        bwqg.d(dtveVar, 51020);
    }

    @beaz(b = true)
    void upgradeToVersion52010(dtve dtveVar) {
        String[] strArr = bwso.a;
        bwsf bwsfVar = new bwsf();
        bwsfVar.f("upgradeToVersion52010-rbmbusinfo");
        bwsfVar.e();
        bwsfVar.d();
        dtub.J(dtveVar, "rbm_business_info", bwso.f(52010, "TEMP___rbm_business_info"), bwso.a, bwso.i());
        String[] strArr2 = bwty.a;
        bwtp bwtpVar = new bwtp();
        bwtpVar.f("upgradeToVersion52010-rbmbusverifier");
        bwtpVar.e();
        bwtpVar.d();
        dtub.J(dtveVar, "rbm_business_verifier_info", bwty.b("TEMP___rbm_business_verifier_info"), bwty.a, bwty.c());
    }

    @beaz
    void upgradeToVersion52020(dtve dtveVar) {
        bvvn e = ParticipantsTable.e();
        e.z("upgradeToVersion52020-participants");
        e.r();
        e.e(new Function() { // from class: bdyf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$upgradeToVersion52020$0((bvtg) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.h(new Function() { // from class: bdyg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion52020$1(bvvwVar);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvti bvtiVar = (bvti) e.b().o();
        while (bvtiVar.moveToNext()) {
            try {
                Uri g = bvtiVar.g();
                if (g != null) {
                    Uri build = g.buildUpon().appendQueryParameter("v", Boolean.TRUE.toString()).build();
                    String p = bvtiVar.p();
                    bvvr f = ParticipantsTable.f();
                    f.ap("upgradeToVersion52020-participants#update");
                    f.M(build);
                    f.e(p);
                }
            } catch (Throwable th) {
                try {
                    bvtiVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bvtiVar.close();
    }

    @beaz
    void upgradeToVersion53000(dtve dtveVar) {
        Object apply;
        buxo d = MessagesTable.d();
        d.z("upgradeToVersion53000");
        d.e(new Function() { // from class: bdxs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$upgradeToVersion53000$0((buum) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: bdxt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion53000$1(buxzVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final buxm b = d.b();
        String[] strArr = bytk.a;
        bysz byszVar = new bysz();
        byszVar.f("upgradeToVersion53000");
        byszVar.e();
        apply = new Function() { // from class: bdxu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bytj bytjVar = (bytj) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion53000$4(buxm.this, bytjVar);
                return bytjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bytj());
        byszVar.b = new byti((bytj) apply);
        int d2 = byszVar.d();
        csjb a = log.a();
        a.I("Deleted");
        a.G(d2);
        a.I("rows from UserReferenceTable for upgrade to 53000");
        a.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @beaz(b = true)
    void upgradeToVersion53020(dtve dtveVar) {
        byfi.b(dtveVar);
        dtub.J(dtveVar, "conversation_labels", brsd.d(53020, "TEMP___conversation_labels"), brsd.a, brsd.f(53020));
        engw u = engw.u(SuperSortLabel.PERSONAL, SuperSortLabel.TRANSACTION, SuperSortLabel.PROMOTION, SuperSortLabel.UPDATE);
        int i = ((enou) u).c;
        for (int i2 = 0; i2 < i; i2++) {
            SuperSortLabel superSortLabel = (SuperSortLabel) u.get(i2);
            int i3 = superSortLabel.i;
            byek byekVar = new byek();
            byekVar.c(i3);
            byekVar.d(superSortLabel.toString());
            byekVar.e(byfj.NO_CHANGE);
            byekVar.b();
        }
    }

    @beaz(a = true)
    void upgradeToVersion53070(dtve dtveVar) {
        String[] strArr = byfi.a;
        byek byekVar = new byek();
        byekVar.c(SuperSortLabel.OTP.i);
        byekVar.d(SuperSortLabel.OTP.toString());
        byekVar.e(byfj.NO_CHANGE);
        byekVar.b();
    }

    @beaz(b = true)
    void upgradeToVersion54030(dtve dtveVar) {
        dtub.J(dtveVar, "message_reactions", bueg.d(54030, "TEMP___message_reactions"), bueg.a, bueg.g(54030));
    }

    @beaz(b = true)
    void upgradeToVersion54050(dtve dtveVar) {
        btqq.f(dtveVar, 54050);
    }

    @beaz(b = true)
    void upgradeToVersion54060(dtve dtveVar) {
        dtub.J(dtveVar, "smarts_personalization_features", bvbu.d(54060, "TEMP___smarts_personalization_features"), bvbu.a, bvbu.f(54060));
    }

    @beaz(b = true)
    void upgradeToVersion55000(dtve dtveVar) {
        dtub.J(dtveVar, "message_spam", buld.d(55000, "TEMP___message_spam"), buld.a, buld.f(55000));
    }

    @beaz(a = true, b = true)
    void upgradeToVersion55010(dtve dtveVar) {
        ParticipantsTable.o(dtveVar, 55010);
        azzp.c();
        dtveVar.y("CREATE TRIGGER participants_IS_NOT_EMPTY_TRIGER AFTER UPDATE ON participants WHEN NOT( OLD.is_valid_phone_number_data ) AND NEW.send_destination IS NOT NULL AND NEW.display_destination IS NOT NULL AND NEW.normalized_destination IS NOT NULL AND length(NEW.send_destination ) > 0  AND length(NEW.display_destination ) > 0  AND length(NEW.normalized_destination) > 0  BEGIN UPDATE participants  SET is_valid_phone_number_data = 1  WHERE rowid=NEW.rowid; END;");
        if (((Boolean) azzq.a.e()).booleanValue()) {
            bvvr f = ParticipantsTable.f();
            f.ap("upgradeToVersion55010");
            f.x(true);
            f.b().e();
        }
    }

    @beaz(b = true)
    void upgradeToVersion56030(dtve dtveVar) {
        dtveVar.y("DROP TABLE IF EXISTS rbm_payment_request_metadata;");
    }

    @beaz(a = true)
    void upgradeToVersion56050(dtve dtveVar) {
        buxo d = MessagesTable.d();
        d.z("upgradeToVersion56050");
        d.r();
        buxz buxzVar = new buxz();
        buxzVar.K(3);
        d.g(buxzVar);
        d.c(MessagesTable.c.a);
        buuo buuoVar = (buuo) d.b().o();
        try {
            ArrayList arrayList = new ArrayList(100);
            cetp cetpVar = new cetp();
            cetpVar.c = Duration.ofSeconds(10L);
            cfkl a = cetpVar.a();
            while (buuoVar.moveToNext()) {
                MessageIdType q = buuoVar.q();
                if (!q.c()) {
                    arrayList.add(q);
                    if (arrayList.size() == 100) {
                        clxa clxaVar = this.markRcsMessagesInTelephonyQueue;
                        clwy clwyVar = (clwy) clwz.a.createBuilder();
                        clwyVar.a((Iterable) Collection.EL.stream(arrayList).map(new Function() { // from class: bdzl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                String b;
                                b = ((MessageIdType) obj).b();
                                return b;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new Supplier() { // from class: bdzm
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new ArrayList();
                            }
                        })));
                        clxaVar.a((clwz) clwyVar.build(), a);
                        arrayList.clear();
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                clxa clxaVar2 = this.markRcsMessagesInTelephonyQueue;
                clwy clwyVar2 = (clwy) clwz.a.createBuilder();
                clwyVar2.a((Iterable) Collection.EL.stream(arrayList).map(new Function() { // from class: bdzn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        String b;
                        b = ((MessageIdType) obj).b();
                        return b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: bdzm
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                })));
                clxaVar2.a((clwz) clwyVar2.build(), a);
            }
            buuoVar.close();
        } catch (Throwable th) {
            try {
                buuoVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @beaz(a = true)
    void upgradeToVersion58020(dtve dtveVar) {
        String[] strArr = ScheduledSendTable.a;
        coir coirVar = new coir();
        coirVar.ap("upgradeToVersion58020");
        buxo d = MessagesTable.d();
        d.f(new Function() { // from class: bdzc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buun buunVar;
                buunVar = ((buum) obj).g;
                return buunVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: bdzd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion58020$1(buxzVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        coirVar.ag("creation_time", d.b());
        coirVar.b().e();
    }

    @beaz
    void upgradeToVersion58260(dtve dtveVar) {
        ((cevh) this.cmsBackFillBnrStateForFiMdQueue.a.b()).a(ceyr.g("cms_back_fill_bnr_state_for_fi_md", cetw.a));
    }

    @beaz(a = true)
    void upgradeToVersion58290(dtve dtveVar) {
        dtveVar.y("DROP INDEX IF EXISTS index_scheduled_send_scheduled_time");
    }

    @beaz(a = true)
    void upgradeToVersion58570(dtve dtveVar) {
        brwt b = brww.b();
        b.ap("upgradeToVersion58570");
        b.ak();
        b.d(awwp.JOINED);
        b.b().e();
    }

    @beaz(a = true)
    void upgradeToVersion58650(dtve dtveVar) {
        Object apply;
        String[] strArr = byfi.a;
        byez byezVar = new byez();
        byezVar.f("upgradeToVersion58650");
        apply = new Function() { // from class: bdzu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                byfh byfhVar = (byfh) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion58650$0(byfhVar);
                return byfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new byfh());
        byezVar.b = new byfg((byfh) apply);
        byezVar.d();
    }

    @beaz(a = true)
    void upgradeToVersion58990(dtve dtveVar) {
        dtveVar.y(new String(Base64.decode("RFJPUCBUQUJMRSBJRiBFWElTVFMgdm9pY2VfdHJhbnNjcmlwdGlvbnM=", 0)));
    }

    @beaz
    void upgradeToVersion59090(dtve dtveVar) {
        if (ctid.g) {
            log.p("Running a one-time sync.");
            axnw.h(((coxg) this.syncManager.b()).f(eqqh.CUSTOM_UPGRADE_STEP_UPGRADE_TO_VERSION_59090));
        }
    }

    @beaz(a = true)
    void upgradeToVersion59130(dtve dtveVar) {
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("upgradeToVersion59130");
        bsoeVar.ag("new_duplicate_of", bsom.c.ai);
        bsoeVar.ag("duplicate_of", new dtzq("null", new Object[0]));
        bsoeVar.b().e();
    }

    @beaz(a = true)
    void upgradeToVersion59320(dtve dtveVar) {
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("upgradeToVersion59320");
        bsoeVar.ad(new Function() { // from class: beae
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59320$0(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsoeVar.ak();
        bsoeVar.y();
        bsoeVar.b().e();
    }

    @beaz(a = true)
    void upgradeToVersion59480(dtve dtveVar) {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("upgradeToVersion59480");
        buxrVar.ag("self_id", new dtzq("sender_id", new Object[0]));
        buxrVar.Y(new Function() { // from class: bdzx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59480$0(buxzVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxrVar.b().e();
    }

    @beaz(a = dvak.a)
    void upgradeToVersion59500(dtve dtveVar) {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("upgradeToVersion59500");
        buxrVar.ak();
        buxrVar.J(new bdgr(null));
        buxrVar.Y(new Function() { // from class: bear
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59500$0(buxzVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxrVar.b().e();
    }

    @beaz(a = dvak.a)
    void upgradeToVersion59600(dtve dtveVar) {
        String[] strArr = bsve.a;
        bsut bsutVar = new bsut();
        bsutVar.f("upgradeToVersion59600");
        bsutVar.c(new Function() { // from class: bdyw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsvd bsvdVar = (bsvd) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59600$0(bsvdVar);
                return bsvdVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsutVar.b().b();
    }

    @beaz
    void upgradeToVersion59680(dtve dtveVar) {
        dtveVar.y("DROP TRIGGER IF EXISTS group_conversation_participants_insert_audit_log;");
        dtveVar.y("DROP TRIGGER IF EXISTS group_conversation_participants_update_audit_log;");
        dtveVar.y("DROP TRIGGER IF EXISTS group_conversation_participants_delete_audit_log;");
        dtveVar.y("DROP TABLE IF EXISTS group_conversation_participants_audit_log;");
    }

    @beaz
    void upgradeToVersion59740(dtve dtveVar) {
        cskc cskcVar = log;
        cskcVar.p("begin removeRowsNeedingUnpairing.");
        dtveVar.y("DELETE FROM desktop WHERE needs_unpairing = 1;");
        cskcVar.p("completed removeRowsNeedingUnpairing.");
    }

    @beaz(a = true)
    void upgradeToVersion59760(dtve dtveVar) {
        bwon a = ProfilesTable.a();
        a.z("upgradeToVersion59760-profiles");
        a.d(new Function() { // from class: bdzy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwnl bwnlVar;
                bwnlVar = ((bwnk) obj).b;
                return bwnlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvvn e = ParticipantsTable.e();
        e.h(new Function() { // from class: bdzz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.q();
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a.E(dtvz.i(e.b(), ParticipantsTable.c.a, ProfilesTable.c.b).g());
        a.z("upgradeToVersion59760");
        final bwom b = a.b();
        brwp a2 = brww.a();
        a2.z("upgradeToVersion59760-conversationparticipants");
        bwon a3 = ProfilesTable.a();
        a3.d(new Function() { // from class: beaa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwnl bwnlVar;
                bwnlVar = ((bwnk) obj).i;
                return bwnlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.E(dtvz.i(a3.b(), ProfilesTable.c.b, brww.c.c).g());
        a2.e(new Function() { // from class: beab
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brwv brwvVar = (brwv) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59760$2(bwom.this, brwvVar);
                return brwvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brwa brwaVar = (brwa) a2.b().o();
        while (brwaVar.moveToNext()) {
            try {
                final brvg brvgVar = (brvg) brwaVar.cO();
                ProfilesTable.BindData bindData = (ProfilesTable.BindData) brvgVar.aw("profiles_table", ProfilesTable.BindData.class);
                if (bindData != null && !TextUtils.isEmpty(bindData.v())) {
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.ap("upgradeToVersion59760-conversations");
                    String v = bindData.v();
                    v.getClass();
                    bsoeVar.ab(cjze.a(v));
                    bsoeVar.ad(new Function() { // from class: bead
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            CustomUpgradeSteps.lambda$upgradeToVersion59760$3(brvg.this, bsolVar);
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsoeVar.b().e();
                }
            } catch (Throwable th) {
                try {
                    brwaVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        brwaVar.close();
    }

    @beaz
    void upgradeToVersion59840(dtve dtveVar) {
        bvvr f = ParticipantsTable.f();
        f.ap("CustomUpgradeSteps#upgradeTo59790");
        f.m();
        f.V(new Function() { // from class: bdyq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59840$0(bvvwVar);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f.ak();
        f.b().e();
    }

    @beaz(a = true)
    void upgradeToVersion59900(dtve dtveVar) {
        upgradeRcsGroupsConversationParticipantCount();
    }

    @beaz(a = true)
    void upgradeToVersion59980(dtve dtveVar) {
        String[] strArr = azoi.a;
        azof azofVar = new azof();
        azofVar.ap("CustomUpgradeSteps#upgradeToVersion59980");
        azon azonVar = azon.a;
        int intValue = azoi.c().intValue();
        if (azoi.c().intValue() >= 59980 && intValue >= 59980) {
            if (azonVar == null) {
                azofVar.a.putNull("address_type");
            } else {
                azofVar.a.put("address_type", Integer.valueOf(azonVar.ordinal()));
            }
        }
        azofVar.b().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @beaz
    void upgradeToVersion60270(dtve dtveVar) {
        try {
            bxtc a = bxth.a();
            a.z("upgradeToVersion60270");
            a.c(new Function() { // from class: bdzg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bxtg bxtgVar = (bxtg) obj;
                    CustomUpgradeSteps.lambda$upgradeToVersion60270$0(bxtgVar);
                    return bxtgVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw y = a.b().y();
            if (((enou) y).c != 1) {
                return;
            }
            final bxro bxroVar = (bxro) y.get(0);
            bxtc a2 = bxth.a();
            a2.c(new Function() { // from class: bdzr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bxtg bxtgVar = (bxtg) obj;
                    CustomUpgradeSteps.lambda$upgradeToVersion60270$1(bxro.this, bxtgVar);
                    return bxtgVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bxso bxsoVar = (bxso) a2.b().p(bxth.c.a);
            try {
                engw c = bxsoVar.c();
                bxsoVar.close();
                if (((enou) c).c == 1) {
                    String str = (String) c.get(0);
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.ak();
                    bsoeVar.n(str);
                    bsoeVar.g(bxroVar.m());
                }
            } finally {
            }
        } catch (Exception e) {
            ensk i = logger.i();
            i.Y(ente.a, "BugleDatabase");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/datamodel/database/upgrade/CustomUpgradeSteps", "upgradeToVersion60270", (char) 1979, "CustomUpgradeSteps.java")).q("Failed to update currentSelfId on legacy conversations");
        }
    }

    @beaz(b = true)
    void upgradeToVersion60350(dtve dtveVar) {
        safeRebuildConversationToParticipantsTable();
    }

    @beaz(a = true)
    void upgradeToVersion60370(dtve dtveVar) {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("upgradeToVersion60370");
        buxrVar.r(new dtzq("lower(hex(randomblob(4)) || '-' || hex( randomblob(2)) || '-' || '4' || substr(hex( randomblob(2)), 2) || '-'\n || substr('AB89', 1 + (abs(random()) % 4) , 1)  || substr(hex(randomblob(2)), 2) || '-' || hex(randomblob(6)))", new Object[0]));
        buxrVar.Y(new Function() { // from class: bdys
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion60370$0(buxzVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxrVar.b().e();
    }

    @beaz
    void upgradeToVersion60380(dtve dtveVar) {
        dtveVar.y("DROP INDEX IF EXISTS contacts_dedupe");
        dtveVar.y("DROP INDEX IF EXISTS contacts_dedupe_custom");
    }

    @beaz
    void upgradeToVersion60450(dtve dtveVar) {
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("upgradeToVersion60450");
        bsoeVar.X(new cpxu());
        bsoeVar.ad(new Function() { // from class: bdzw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion60450$0(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsoeVar.b().e();
    }

    @beaz(a = true)
    void upgradeToVersion60480(dtve dtveVar) {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("upgradeToVersion60480");
        buxrVar.r(new dtzq("lower(hex(randomblob(4)) || '-' || hex( randomblob(2)) || '-' || '4' || substr(hex( randomblob(2)), 2) || '-'\n || substr('AB89', 1 + (abs(random()) % 4) , 1)  || substr(hex(randomblob(2)), 2) || '-' || hex(randomblob(6)))", new Object[0]));
        buxrVar.Y(new Function() { // from class: bdzo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion60480$0(buxzVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxrVar.b().e();
    }

    @beaz
    void upgradeToVersion60500(dtve dtveVar) {
        safeRebuildConversationToParticipantsTable();
    }

    @beaz(a = true)
    void upgradeToVersion22000(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion37010(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion41020(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion53010(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion58000(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion58310(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion58500(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion58560(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion58730(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion58830(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion58860(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion58890(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion58970(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion58980(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion59000(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion59020(dtve dtveVar) {
    }

    @beaz(a = true)
    void upgradeToVersion59280(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion59750(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion59770(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion59790(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion59800(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion60030(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion60100(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion60130(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion60290(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion60300(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion60390(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion60440(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion60470(dtve dtveVar) {
    }

    @beaz
    void upgradeToVersion60490(dtve dtveVar) {
    }
}
