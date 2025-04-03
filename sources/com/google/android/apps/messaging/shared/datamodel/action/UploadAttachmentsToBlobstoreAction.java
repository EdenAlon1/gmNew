package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.UploadAttachmentsToBlobstoreAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.axnw;
import defpackage.bbau;
import defpackage.bbcg;
import defpackage.bbgi;
import defpackage.bznu;
import defpackage.chdj;
import defpackage.eisx;
import defpackage.ejar;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.eogt;
import defpackage.eroh;
import defpackage.errl;
import defpackage.ffbr;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UploadAttachmentsToBlobstoreAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bbau();
    public final bznu a;
    public final chdj b;
    public final ffbr c;
    public final Optional d;
    private final errl e;
    private final ejar f;

    /* compiled from: PG */
    public interface a {
        bbgi bv();
    }

    public UploadAttachmentsToBlobstoreAction(bznu bznuVar, chdj chdjVar, ffbr ffbrVar, errl errlVar, Optional optional, ejar ejarVar, Parcel parcel) {
        super(parcel, eogt.UPLOAD_ATTACHMENTS_TO_BLOBSTORE_ACTION);
        this.a = bznuVar;
        this.b = chdjVar;
        this.c = ffbrVar;
        this.e = errlVar;
        this.d = optional;
        this.f = ejarVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("UploadAttachmentsToBlobstoreAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UploadAttachmentsToBlobstore.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        bbcg bbcgVar = this.t;
        final ArrayList m = this.t.m("parts_key");
        final boolean y = bbcgVar.y("is_batch_pre_upload_key");
        final String l = bbcgVar.l("part_id_key");
        if (m == null || m.isEmpty()) {
            return null;
        }
        axnw.f((this.d.isEmpty() ? elfo.e("") : elfl.g(this.f.b((eisx) this.d.get()))).i(new eroh() { // from class: bbas
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final String str = (String) obj;
                final ArrayList arrayList = new ArrayList();
                final UploadAttachmentsToBlobstoreAction uploadAttachmentsToBlobstoreAction = UploadAttachmentsToBlobstoreAction.this;
                Iterable$EL.forEach(m, new Consumer() { // from class: bbat
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj2;
                        ((bdpt) UploadAttachmentsToBlobstoreAction.this.c.b()).d(messagePartCoreData, str);
                        if (bbgi.f(messagePartCoreData, true)) {
                            arrayList.add(messagePartCoreData);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                Optional empty = ((Boolean) cgcv.a.e()).booleanValue() ? uploadAttachmentsToBlobstoreAction.d : Optional.empty();
                chdj chdjVar = uploadAttachmentsToBlobstoreAction.b;
                return uploadAttachmentsToBlobstoreAction.a.a(arrayList, y, l, chdjVar, empty);
            }
        }, this.e), "Error uploading blobs");
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public UploadAttachmentsToBlobstoreAction(bznu bznuVar, chdj chdjVar, ffbr ffbrVar, errl errlVar, Optional optional, ejar ejarVar, ArrayList arrayList, String str, boolean z) {
        super(eogt.UPLOAD_ATTACHMENTS_TO_BLOBSTORE_ACTION);
        this.a = bznuVar;
        this.b = chdjVar;
        this.c = ffbrVar;
        this.e = errlVar;
        this.d = optional;
        this.f = ejarVar;
        if (!arrayList.isEmpty()) {
            this.t.u("parts_key", arrayList);
        }
        this.t.p("is_batch_pre_upload_key", z);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.t.v("part_id_key", str);
    }
}
