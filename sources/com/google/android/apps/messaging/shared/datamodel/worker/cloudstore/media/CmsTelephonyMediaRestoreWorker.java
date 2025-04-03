package com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.media;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.media.CmsTelephonyMediaRestoreWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cdpd;
import defpackage.csgj;
import defpackage.cskc;
import defpackage.ekhw;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.erog;
import defpackage.erpp;
import defpackage.errl;
import defpackage.pot;
import defpackage.ppn;
import defpackage.ppr;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class CmsTelephonyMediaRestoreWorker extends ppr {
    public static final cskc e = cskc.g("BugleCms", "CmsTelephonyMediaRestoreWorker");
    public final cdpd f;
    private final errl g;

    /* compiled from: PG */
    public interface a {
        cdpd bR();

        errl p();
    }

    public CmsTelephonyMediaRestoreWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ekhw.a(context, a.class);
        this.f = aVar.bR();
        this.g = aVar.p();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        final pot f = f();
        final int a2 = f.a("media_restore_max_retry_key", ((Integer) csgj.e.e()).intValue());
        return e() > a2 ? elfo.e(new ppn(f)) : elfo.h(new erog() { // from class: cdoz
            @Override // defpackage.erog
            public final ListenableFuture a() {
                pot potVar = f;
                String d = potVar.d("part_id_key");
                String d2 = potVar.d("parent_message_uri_key");
                final Uri parse = d2 != null ? Uri.parse(d2) : null;
                int a3 = potVar.a("account_id", -1);
                emxf.b(!TextUtils.isEmpty(d), "Empty partId get from work data");
                emxf.b(parse != null, "Null message uri from work data");
                parse.getClass();
                try {
                    d.getClass();
                    Long.parseLong(d);
                    final PartsTable.BindData a4 = PartsTable.a(d);
                    if (a4 == null) {
                        return elfo.e(false);
                    }
                    if (a3 == -1) {
                        throw new IllegalArgumentException("AccountId in the workItem is invalid or missing");
                    }
                    final cdpd cdpdVar = CmsTelephonyMediaRestoreWorker.this.f;
                    return cdpdVar.b.b(a3).i(new eroh() { // from class: cdpc
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            eisx eisxVar = (eisx) obj;
                            final HashMap hashMap = new HashMap();
                            final cdmq cdmqVar = cdpd.this.a;
                            final PartsTable.BindData bindData = a4;
                            String F = bindData.F();
                            final String H = bindData.H();
                            final ConversationIdType u = bindData.u();
                            final MessageIdType v = bindData.v();
                            final String J = bindData.J();
                            byte[] P = bindData.P();
                            if (H != null && !v.c() && !TextUtils.isEmpty(F)) {
                                final Uri uri = parse;
                                return elfl.g(cdmqVar.a.a(F, P, eisxVar)).i(new eroh() { // from class: cdmo
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        Uri uri2 = (Uri) obj2;
                                        final cdmq cdmqVar2 = cdmq.this;
                                        FileInputStream fileInputStream = new FileInputStream(cbgi.i(uri2, cdmqVar2.i));
                                        Map map = hashMap;
                                        map.put(uri2, fileInputStream);
                                        lt ltVar = new lt();
                                        ltVar.e = uri2;
                                        ltVar.h(H.getBytes());
                                        final PartsTable.BindData bindData2 = bindData;
                                        String I = bindData2.I();
                                        if (I != null) {
                                            ltVar.k(I.getBytes());
                                        }
                                        final String str = J;
                                        final MessageIdType messageIdType = v;
                                        ConversationIdType conversationIdType = u;
                                        final Uri b = cdmqVar2.e.b(ltVar, ContentUris.parseId(uri), map);
                                        cbgi.j(cdmqVar2.i, uri2);
                                        if (((Boolean) ((cfup) csfu.n.get()).e()).booleanValue()) {
                                            cdmqVar2.j.b(byyu.CMS_MEDIA_DOWNLOADED, conversationIdType, messageIdType, str);
                                        } else {
                                            cdmqVar2.a(true, conversationIdType, messageIdType, str);
                                        }
                                        csjy.i("BugleCms", "Created telephony part: ".concat(b.toString()));
                                        cdmqVar2.h.d("CmsMediaPartToTelephonyPersister#updateBugleDbForMediaUri", new Runnable() { // from class: cdmn
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                cdmq cdmqVar3 = cdmq.this;
                                                bdpt bdptVar = (bdpt) cdmqVar3.g.b();
                                                PartsTable.BindData bindData3 = bindData2;
                                                bdptVar.h(bindData3.u(), messageIdType, str, b);
                                                if (cdmqVar3.k.a()) {
                                                    bifu e2 = ((bdjk) cdmqVar3.d.b()).e(bindData3.u());
                                                    try {
                                                        if (e2.moveToFirst()) {
                                                            List asList = Arrays.asList(e2.o());
                                                            if (asList.isEmpty()) {
                                                                e2.close();
                                                                return;
                                                            }
                                                            if (asList.contains(bindData3.J())) {
                                                                MessageCoreData v2 = ((bdmq) cdmqVar3.f.b()).v(e2.g());
                                                                String[] strArr = bsom.a;
                                                                bsoe bsoeVar = new bsoe();
                                                                bsoeVar.al();
                                                                bsoeVar.ap("updateConversationPreviewContentUri");
                                                                if (v2 == null) {
                                                                    e2.close();
                                                                    return;
                                                                } else {
                                                                    bdmq.V(v2, bsoeVar, null);
                                                                    ((bczy) cdmqVar3.c.b()).W(bindData3.u(), bsoeVar);
                                                                }
                                                            }
                                                        }
                                                        e2.close();
                                                        return;
                                                    } catch (Throwable th) {
                                                        try {
                                                            e2.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                bjjd d3 = ((bdjk) cdmqVar3.d.b()).d(bindData3.u());
                                                try {
                                                    if (d3.moveToFirst()) {
                                                        List asList2 = Arrays.asList(d3.t());
                                                        if (asList2.isEmpty()) {
                                                            d3.close();
                                                            return;
                                                        }
                                                        if (asList2.contains(bindData3.J())) {
                                                            MessageCoreData v3 = ((bdmq) cdmqVar3.f.b()).v(d3.j());
                                                            String[] strArr2 = bsom.a;
                                                            bsoe bsoeVar2 = new bsoe();
                                                            bsoeVar2.al();
                                                            bsoeVar2.ap("updateConversationPreviewContentUri");
                                                            if (v3 == null) {
                                                                d3.close();
                                                                return;
                                                            } else {
                                                                bdmq.V(v3, bsoeVar2, null);
                                                                ((bczy) cdmqVar3.c.b()).W(bindData3.u(), bsoeVar2);
                                                            }
                                                        }
                                                    }
                                                    d3.close();
                                                } catch (Throwable th3) {
                                                    try {
                                                        d3.close();
                                                    } catch (Throwable th4) {
                                                        th3.addSuppressed(th4);
                                                    }
                                                    throw th3;
                                                }
                                            }
                                        });
                                        return elfo.e(true);
                                    }
                                }, cdmqVar.b).f(Throwable.class, new eroh() { // from class: cdmp
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        Throwable th = (Throwable) obj2;
                                        boolean booleanValue = ((Boolean) ((cfup) csfu.n.get()).e()).booleanValue();
                                        ConversationIdType conversationIdType = u;
                                        MessageIdType messageIdType = v;
                                        cdmq cdmqVar2 = cdmq.this;
                                        String str = J;
                                        if (booleanValue) {
                                            cdmqVar2.j.b(byyu.CMS_MEDIA_DOWNLOAD_FAILED, conversationIdType, messageIdType, str);
                                        } else {
                                            cdmqVar2.a(false, conversationIdType, messageIdType, str);
                                        }
                                        return elfo.d(th);
                                    }
                                }, cdmqVar.b);
                            }
                            if (((Boolean) ((cfup) csfu.n.get()).e()).booleanValue()) {
                                cdmqVar.j.b(byyu.CMS_MEDIA_DOWNLOAD_FAILED, u, v, J);
                            } else {
                                cdmqVar.a(false, u, v, J);
                            }
                            return elfo.e(false);
                        }
                    }, erpp.a);
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException(String.format("Invalid partId = %s", d), e2);
                }
            }
        }, this.g).h(new emwl() { // from class: cdpa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                return (bool == null || !bool.booleanValue()) ? new ppn() : new ppp();
            }
        }, erpp.a).e(Exception.class, new emwl() { // from class: cdpb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                if (!(exc instanceof CronetException)) {
                    CmsTelephonyMediaRestoreWorker.e.s("Async exception; media restore failed internally!", exc);
                    return new ppn();
                }
                int i = a2;
                CmsTelephonyMediaRestoreWorker cmsTelephonyMediaRestoreWorker = CmsTelephonyMediaRestoreWorker.this;
                csjb e2 = CmsTelephonyMediaRestoreWorker.e.e();
                e2.y("Retry due to network failure. Remaining retry:", (i - cmsTelephonyMediaRestoreWorker.e()) + 1);
                e2.s(exc);
                return new ppo();
            }
        }, erpp.a);
    }
}
