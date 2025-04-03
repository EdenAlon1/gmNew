package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.akzt;
import defpackage.amdh;
import defpackage.baen;
import defpackage.baeo;
import defpackage.bajq;
import defpackage.cbia;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emyl;
import defpackage.eogt;
import defpackage.ffbr;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class FixupMessageStatusOnStartupAction extends Action<Void> implements Parcelable {
    public final ffbr b;
    public final cbia c;
    public final dtuu d;
    public final cqoh e;
    public final ffbr f;
    private final ffbr g;
    public static final cskc a = cskc.g("BugleDataModel", "FixupMessageStatusOnStartupAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baen();

    /* compiled from: PG */
    public interface a {
        baeo hL();
    }

    public FixupMessageStatusOnStartupAction(cbia cbiaVar, dtuu dtuuVar, Parcel parcel, ffbr<akzt> ffbrVar, cqoh cqohVar, ffbr<amdh> ffbrVar2, ffbr<Long> ffbrVar3) {
        super(parcel, eogt.FIXUP_MESSAGES_ON_STARTUP_ACTION);
        this.c = cbiaVar;
        this.d = dtuuVar;
        this.g = ffbrVar;
        this.e = cqohVar;
        this.f = ffbrVar2;
        this.b = ffbrVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("FixupMessageStatusOnStartupAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        ekzz f = eleg.f("FixupMessageStatusOnStartupAction#executeAction");
        try {
            int intValue = ((Integer) this.d.c("FixupMessageStatusOnStartupAction#executeAction", new emyl() { // from class: baei
                @Override // defpackage.emyl
                public final Object get() {
                    final FixupMessageStatusOnStartupAction fixupMessageStatusOnStartupAction = FixupMessageStatusOnStartupAction.this;
                    final Instant minus = fixupMessageStatusOnStartupAction.e.f().minus(Duration.ofHours(((Long) fixupMessageStatusOnStartupAction.b.b()).longValue()));
                    String[] strArr = MessagesTable.a;
                    buxr buxrVar = new buxr();
                    buxrVar.ap("FixupMessageStatusOnStartupAction#executeAction-messages0");
                    buxrVar.U(7);
                    buxrVar.Y(new Function() { // from class: baej
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            cskc cskcVar = FixupMessageStatusOnStartupAction.a;
                            buxzVar.aj(5, 6);
                            buxzVar.L(3);
                            int intValue2 = MessagesTable.g().intValue();
                            if (intValue2 < 17030) {
                                dtub.w("queue_insert_timestamp", intValue2);
                            }
                            buxzVar.aq(new dtrt("messages.queue_insert_timestamp", 7, Long.valueOf(bdgw.a(Instant.this))));
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int e = buxrVar.b().e();
                    buxr buxrVar2 = new buxr();
                    buxrVar2.ap("FixupMessageStatusOnStartupAction#executeAction-messages1");
                    buxrVar2.U(106);
                    buxrVar2.Y(new Function() { // from class: baek
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            cskc cskcVar = FixupMessageStatusOnStartupAction.a;
                            buxzVar.aj(105, 103);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final int e2 = buxrVar2.b().e();
                    final int a2 = ((amdh) fixupMessageStatusOnStartupAction.f.b()).a(epdh.APP_RESTART);
                    int i = engw.d;
                    engr engrVar = new engr();
                    bwdf c = PartsTable.c();
                    c.z("getOutputUriForAllProcessingParts");
                    c.h(new Function() { // from class: cbht
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bwdm bwdmVar = (bwdm) obj;
                            bwdmVar.s();
                            return bwdmVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    c.e(new Function() { // from class: cbhu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bwat bwatVar = (bwat) obj;
                            return new bwau[]{bwatVar.k, bwatVar.a};
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bwav bwavVar = (bwav) c.b().o();
                    while (bwavVar.moveToNext()) {
                        try {
                            engrVar.h(new Pair(bwavVar.h(), bwavVar.q()));
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
                    final engw g = engrVar.g();
                    fixupMessageStatusOnStartupAction.d.g(new dtut() { // from class: bael
                        @Override // defpackage.dtut
                        public final ekzz a() {
                            cskc cskcVar = FixupMessageStatusOnStartupAction.a;
                            return eleg.f("FMSOSA::deleteOutputUriForAllProcessingPartsAndMarkAsNull::runAfterCommit");
                        }
                    }, null, new Runnable() { // from class: baem
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = 0;
                            while (true) {
                                engw engwVar = g;
                                if (i2 >= ((enou) engwVar).c) {
                                    int i3 = e2;
                                    int i4 = a2;
                                    final Collection collection = (Collection) Collection.EL.stream(engwVar).map(new Function() { // from class: cbhq
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return (String) ((Pair) obj).second;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).collect(Collectors.toCollection(new Supplier() { // from class: cbhr
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            return new ArrayList();
                                        }
                                    }));
                                    String[] strArr2 = PartsTable.a;
                                    bwdi bwdiVar = new bwdi();
                                    bwdiVar.ap("deleteOutputUriForAllProcessingPartsAndMarkAsNull");
                                    bwdiVar.w(byzc.FAILED);
                                    bwdiVar.v();
                                    bwdiVar.D(new Function() { // from class: cbhs
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            bwdm bwdmVar = (bwdm) obj;
                                            bwdmVar.k(collection);
                                            return bwdmVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int e3 = bwdiVar.b().e();
                                    csjb c2 = FixupMessageStatusOnStartupAction.a.c();
                                    c2.y("sendFailedCnt", i4);
                                    c2.y("downloadFailedCnt", i3);
                                    c2.y("partsProcessingFailedCnt", e3);
                                    c2.r();
                                    return;
                                }
                                cbgi.j(FixupMessageStatusOnStartupAction.this.c.a, (Uri) ((Pair) engwVar.get(i2)).first);
                                i2++;
                            }
                        }
                    });
                    return Integer.valueOf(e);
                }
            })).intValue();
            if (intValue > 0) {
                csjb c = a.c();
                c.y("retryRcsMessageCnt", intValue);
                c.r();
                ((akzt) this.g.b()).d("Bugle.DataModel.Action.FixupMessageStatus.RcsMessages.Retry", intValue);
                bajq.d(10, this);
            } else {
                bajq.d(1, this);
            }
            f.close();
            return null;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.FixupMessageStatusOnStartup.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public FixupMessageStatusOnStartupAction(cbia cbiaVar, dtuu dtuuVar, ffbr<akzt> ffbrVar, cqoh cqohVar, ffbr<amdh> ffbrVar2, ffbr<Long> ffbrVar3) {
        super(eogt.FIXUP_MESSAGES_ON_STARTUP_ACTION);
        this.c = cbiaVar;
        this.d = dtuuVar;
        this.g = ffbrVar;
        this.e = cqohVar;
        this.f = ffbrVar2;
        this.b = ffbrVar3;
    }
}
