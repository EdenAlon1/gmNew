package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateAttachmentAfterResizingAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.bazl;
import defpackage.bazm;
import defpackage.bdor;
import defpackage.byzc;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emyl;
import defpackage.eogt;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateAttachmentAfterResizingAction extends Action<Void> implements Parcelable {
    public final Context b;
    public final bdor c;
    public final dtuu d;
    public static final cskc a = cskc.g("Bugle", "UpdateAttachmentAfterResizingAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bazl();

    /* compiled from: PG */
    public interface a {
        bazm iq();
    }

    public UpdateAttachmentAfterResizingAction(Context context, bdor bdorVar, dtuu dtuuVar, Parcel parcel) {
        super(parcel, eogt.UPDATE_ATTACHMENT_AFTER_RESIZING_ACTION);
        this.b = context;
        this.c = bdorVar;
        this.d = dtuuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("UpdateAttachmentAfterResizingAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        csjb c = a.c();
        c.I("UpdateAttachmentAfterResizingAction executeInScope");
        c.r();
        return (Void) this.d.b(new emyl() { // from class: bazg
            @Override // defpackage.emyl
            public final Object get() {
                byzc byzcVar;
                final UpdateAttachmentAfterResizingAction updateAttachmentAfterResizingAction = UpdateAttachmentAfterResizingAction.this;
                bbcg bbcgVar = updateAttachmentAfterResizingAction.t;
                final String l = bbcgVar.l("content_uri");
                final String l2 = bbcgVar.l("output_uri");
                final String l3 = bbcgVar.l("content_type");
                int a2 = bbcgVar.a("processing_status");
                if (a2 == 0) {
                    byzcVar = byzc.SUCCEEDED;
                } else if (a2 == 1) {
                    byzcVar = byzc.FAILED;
                } else {
                    if (a2 != 2) {
                        throw new IllegalArgumentException(a.h(a2, "code: "));
                    }
                    byzcVar = byzc.TOO_LARGE;
                }
                final byzc byzcVar2 = byzcVar;
                if (((Integer) updateAttachmentAfterResizingAction.d.c("UpdateAttachmentAfterResizingAction#executeAction", new emyl() { // from class: bazf
                    @Override // defpackage.emyl
                    public final Object get() {
                        String str = l;
                        final Uri parse = Uri.parse(l2);
                        final Uri parse2 = Uri.parse(str);
                        String[] strArr = PartsTable.a;
                        bwdi bwdiVar = new bwdi();
                        bwdiVar.ap("UpdateAttachmentAfterResizingAction#executeAction");
                        byzc byzcVar3 = byzcVar2;
                        bwdiVar.w(byzcVar3);
                        bwdiVar.v();
                        if (byzcVar3 == byzc.SUCCEEDED) {
                            String str2 = l3;
                            bwdiVar.z(parse);
                            bwdiVar.j(str2);
                        }
                        final UpdateAttachmentAfterResizingAction updateAttachmentAfterResizingAction2 = UpdateAttachmentAfterResizingAction.this;
                        bwdiVar.D(new Function() { // from class: cbhv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bwdm bwdmVar = (bwdm) obj;
                                bwdmVar.r(parse);
                                bwdmVar.v(parse2);
                                return bwdmVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        if (bwdiVar.b().e() <= 0) {
                            csjb d = UpdateAttachmentAfterResizingAction.a.d();
                            d.I("Attachment for");
                            d.I(str);
                            d.I("gone. Deleting output.");
                            d.r();
                            updateAttachmentAfterResizingAction2.d.g(new dtut() { // from class: bazh
                                @Override // defpackage.dtut
                                public final ekzz a() {
                                    cskc cskcVar = UpdateAttachmentAfterResizingAction.a;
                                    return eleg.f("UAARA::deleteContent1::runAfterCommit");
                                }
                            }, null, new Runnable() { // from class: bazi
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cbgi.j(UpdateAttachmentAfterResizingAction.this.b, parse);
                                }
                            });
                        } else if (byzcVar3 == byzc.SUCCEEDED) {
                            updateAttachmentAfterResizingAction2.d.g(new dtut() { // from class: bazj
                                @Override // defpackage.dtut
                                public final ekzz a() {
                                    cskc cskcVar = UpdateAttachmentAfterResizingAction.a;
                                    return eleg.f("UAARA::deleteContent2::runAfterCommit");
                                }
                            }, null, new Runnable() { // from class: bazk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cbgi.j(UpdateAttachmentAfterResizingAction.this.b, parse2);
                                }
                            });
                        }
                        return Integer.valueOf(updateAttachmentAfterResizingAction2.c.a());
                    }
                })).intValue() <= 0) {
                    return null;
                }
                bajq.d(6, updateAttachmentAfterResizingAction);
                return null;
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateAttachmentAfterResizing.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public UpdateAttachmentAfterResizingAction(Context context, bdor bdorVar, dtuu dtuuVar, String str, String str2, String str3, byzc byzcVar) {
        super(eogt.UPDATE_ATTACHMENT_AFTER_RESIZING_ACTION);
        this.b = context;
        this.c = bdorVar;
        this.d = dtuuVar;
        this.t.v("content_uri", str);
        this.t.v("output_uri", str2);
        if (str3 != null) {
            this.t.v("content_type", str3);
        }
        this.t.r("processing_status", byzcVar.e);
    }
}
