package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentUris;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessTelephonyChangeAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.albq;
import defpackage.baom;
import defpackage.baon;
import defpackage.bbcg;
import defpackage.bbfw;
import defpackage.bdmq;
import defpackage.buxr;
import defpackage.cbgf;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.cisd;
import defpackage.cisg;
import defpackage.cish;
import defpackage.cout;
import defpackage.coux;
import defpackage.covb;
import defpackage.cove;
import defpackage.coxg;
import defpackage.coxk;
import defpackage.cpdg;
import defpackage.cqoh;
import defpackage.csix;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ctwb;
import defpackage.enpw;
import defpackage.eogt;
import defpackage.eqqh;
import defpackage.ffbr;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessTelephonyChangeAction extends ThrottledAction implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR;
    private static final UriMatcher d;
    private final ffbr e;
    private final ffbr f;
    private final ctwb g;
    private final cish h;
    private final cbgf i;
    private final ffbr j;
    private final ffbr k;
    private static final cskc c = cskc.g("BugleDataModel", "ProcessTelephonyChangeAction");
    static final cfup a = cfvl.e(cfvl.b, "process_telephony_change_full_sync_threshold", 5);
    static final cfup b = cfvl.f(cfvl.b, "process_telephony_change_spot_sync_age_limit_during_full_sync_millis", 3600000);

    /* compiled from: PG */
    public interface a {
        baon ie();
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        d = uriMatcher;
        uriMatcher.addURI("sms", "#", 0);
        uriMatcher.addURI("sms", "inbox/#", 1);
        uriMatcher.addURI("sms", "sent/#", 2);
        uriMatcher.addURI("sms", "outbox/#", 3);
        uriMatcher.addURI("sms", "failed/#", 4);
        uriMatcher.addURI("mms", "#", 10);
        uriMatcher.addURI("mms", "inbox/#", 11);
        uriMatcher.addURI("mms", "sent/#", 12);
        uriMatcher.addURI("mms", "outbox/#", 13);
        CREATOR = new baom();
    }

    public ProcessTelephonyChangeAction(Context context, ffbr<bdmq> ffbrVar, ffbr<coxg> ffbrVar2, ctwb ctwbVar, albq albqVar, bbfw bbfwVar, cish cishVar, cbgf cbgfVar, cove coveVar, ffbr<coxk> ffbrVar3, ffbr<cqoh> ffbrVar4, Uri uri) {
        super(eogt.PROCESS_TELEPHONY_CHANGE_ACTION);
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ctwbVar;
        this.h = cishVar;
        this.i = cbgfVar;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(uri);
        this.t.u("uri_list", arrayList);
    }

    public static Uri l(Uri uri) {
        if (uri == null) {
            return null;
        }
        int match = d.match(uri);
        if (match == 0) {
            return uri;
        }
        if (match == 1 || match == 2 || match == 3 || match == 4) {
            return m(Telephony.Sms.CONTENT_URI, uri);
        }
        switch (match) {
            case 10:
                return uri;
            case 11:
            case 12:
            case 13:
                return m(Telephony.Mms.CONTENT_URI, uri);
            default:
                return null;
        }
    }

    private static Uri m(Uri uri, Uri uri2) {
        try {
            return Uri.withAppendedPath(uri, Long.toString(ContentUris.parseId(uri2)));
        } catch (NumberFormatException | UnsupportedOperationException unused) {
            csjb b2 = c.b();
            b2.I("invalid uri");
            b2.I(uri2);
            b2.I("for");
            b2.I(uri);
            b2.r();
            return null;
        }
    }

    private static boolean n(MessageCoreData messageCoreData) {
        return messageCoreData != null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessTelephonyChange.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 116;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return 10L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "ProcessTelephonyChangeAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        boolean z;
        int b2;
        boolean z2;
        boolean z3;
        long j;
        ctwb ctwbVar = this.g;
        ArrayList m = this.t.m("uri_list");
        int c2 = ctwbVar.c();
        Optional of = m.size() > ((Integer) a.e()).intValue() ? Optional.of(eqqh.TELEPHONY_CHANGE_TOO_MANY_CHANGES) : Collection.EL.stream(m).anyMatch(new Predicate() { // from class: baol
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
                return ProcessTelephonyChangeAction.l((Uri) obj) == null;
            }
        }) ? Optional.of(eqqh.TELEPHONY_CHANGE_NULL_URI) : Optional.empty();
        if (of.isPresent()) {
            if (((coxg) this.f.b()).u()) {
                c.p("Found sync already running, not requesting a new sync.");
                return;
            } else {
                ((coxg) this.f.b()).k((eqqh) of.get());
                return;
            }
        }
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) m.get(i);
            cskc cskcVar = c;
            csjb c3 = cskcVar.c();
            c3.I("external telephony provider change ");
            c3.I(uri);
            c3.r();
            Uri l = l(uri);
            if (l == null) {
                cskcVar.p("not single message change, force full sync");
                ((coxg) this.f.b()).k(eqqh.TELEPHONY_CHANGE);
            } else {
                cout t = ((coxk) this.j.b()).t(l, c2);
                MessageCoreData y = ((bdmq) this.e.b()).y(l);
                if (t != null) {
                    int a2 = t.a();
                    if (a2 == 0) {
                        j = ((covb) t).i;
                    } else if (a2 != 1) {
                        csix.c("ProcessTelephonyChangeAction: wrong message protocol " + t.a());
                        j = -1;
                    } else {
                        j = ((coux) t).i;
                    }
                    if (j >= 0) {
                        z = true;
                        if (z || n(y)) {
                            if (z && n(y)) {
                                csjb c4 = cskcVar.c();
                                c4.I("sync deleted message.");
                                c4.I(uri);
                                c4.r();
                                ((coxg) this.f.b()).m(uri, Instant.ofEpochMilli(y.o()));
                            } else if (z || !n(y)) {
                                cskcVar.r("changed message not found anywhere");
                            } else {
                                String[] strArr = MessagesTable.a;
                                buxr buxrVar = new buxr();
                                buxrVar.ap("ProcessTelephonyChangeAction#executeAction");
                                int b3 = t.b();
                                int a3 = t.a();
                                if (a3 == 0) {
                                    int i2 = ((covb) t).h;
                                    b2 = cpdg.b(i2 != 1, i2, b3);
                                } else if (a3 != 1) {
                                    csix.c("ProcessTelephonyChangeAction: wrong message protocol " + t.a());
                                    b2 = 0;
                                } else {
                                    coux couxVar = (coux) t;
                                    b2 = cpdg.a(couxVar.k(), couxVar.j(), b3);
                                }
                                if (b2 != y.k()) {
                                    buxrVar.U(b2);
                                    buxrVar.B(t.b());
                                }
                                int a4 = t.a();
                                if (a4 == 0) {
                                    z2 = ((covb) t).l;
                                } else if (a4 != 1) {
                                    csix.c("ProcessTelephonyChangeAction: wrong message protocol " + t.a());
                                    z2 = false;
                                } else {
                                    z2 = ((coux) t).m;
                                }
                                if (z2 != y.cN()) {
                                    buxrVar.v(z2);
                                }
                                int a5 = t.a();
                                if (a5 == 0) {
                                    z3 = ((covb) t).k;
                                } else if (a5 != 1) {
                                    csix.c("ProcessTelephonyChangeAction: wrong message protocol " + t.a());
                                    z3 = false;
                                } else {
                                    z3 = ((coux) t).l;
                                }
                                if (z3 != y.cO()) {
                                    buxrVar.F(z3);
                                }
                                if (!buxrVar.b().o()) {
                                    csjb c5 = cskcVar.c();
                                    c5.I("update message");
                                    c5.I(t.d());
                                    c5.I("with");
                                    c5.I(buxrVar);
                                    c5.r();
                                    if (((bdmq) this.e.b()).U(y.z(), y.B(), buxrVar)) {
                                        this.i.c();
                                        cish cishVar = this.h;
                                        cisd cisdVar = (cisd) cisg.a.createBuilder();
                                        cisdVar.copyOnWrite();
                                        cisg.a((cisg) cisdVar.instance);
                                        cishVar.d((cisg) cisdVar.build());
                                    } else {
                                        csjb e = cskcVar.e();
                                        e.I("failed to update message.");
                                        e.I(t.d());
                                        e.r();
                                    }
                                }
                            }
                        } else if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
                            long millis = Duration.between(Instant.ofEpochMilli(t.c()), ((cqoh) this.k.b()).f()).toMillis();
                            cfup cfupVar = b;
                            if (millis <= ((Long) cfupVar.e()).longValue() || !((coxg) this.f.b()).u()) {
                                csjb c6 = cskcVar.c();
                                c6.I("Message exists in Telephony but not in Bugle. Requesting Spot Sync.");
                                c6.A("message uri", uri);
                                c6.r();
                                ((coxg) this.f.b()).m(uri, Instant.ofEpochMilli(t.c()));
                            } else {
                                csjb c7 = cskcVar.c();
                                c7.I("Message is older than age limit while full sync in progress");
                                c7.A("message uri", uri);
                                c7.A("spotSyncAgeLimitDuringFullSyncMillis", cfupVar.e());
                                c7.r();
                            }
                        } else {
                            csjb c8 = cskcVar.c();
                            c8.I("sync new message.");
                            c8.I(uri);
                            c8.r();
                            ((coxg) this.f.b()).m(uri, Instant.ofEpochMilli(t.c()));
                        }
                    }
                }
                z = false;
                if (z) {
                }
                if (z) {
                }
                if (z) {
                }
                cskcVar.r("changed message not found anywhere");
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void j(ThrottledAction throttledAction) {
        bbcg bbcgVar = this.t;
        ArrayList m = throttledAction.t.m("uri_list");
        ArrayList m2 = bbcgVar.m("uri_list");
        HashSet g = enpw.g(m.size() + m2.size());
        g.addAll(m);
        g.addAll(m2);
        ArrayList arrayList = new ArrayList(g.size());
        arrayList.addAll(g);
        this.t.u("uri_list", arrayList);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessTelephonyChangeAction(ffbr ffbrVar, ffbr ffbrVar2, ctwb ctwbVar, cish cishVar, cbgf cbgfVar, ffbr ffbrVar3, ffbr ffbrVar4, Parcel parcel) {
        super(parcel, eogt.PROCESS_TELEPHONY_CHANGE_ACTION);
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ctwbVar;
        this.h = cishVar;
        this.i = cbgfVar;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
    }
}
