package com.google.android.apps.messaging.shared.datamodel.action;

import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akzt;
import defpackage.ayfg;
import defpackage.bais;
import defpackage.bbbr;
import defpackage.bbfb;
import defpackage.bbfd;
import defpackage.bbfh;
import defpackage.cins;
import defpackage.cish;
import defpackage.cqoh;
import defpackage.cskc;
import defpackage.ctba;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.enru;
import defpackage.entd;
import defpackage.eogt;
import defpackage.eyja;
import defpackage.ffbr;
import defpackage.fgjz;
import defpackage.fjay;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class NoConfirmationMessageSendAction extends Action<Void> implements Parcelable {
    private final ffbr A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    public final ffbr a;
    private final cins e;
    private final bbfb f;
    private final ffbr g;
    private final ffbr h;
    private final Context i;
    private final ayfg j;
    private final ffbr k;
    private final akzt l;
    private final cish m;
    private final bbfd n;
    private final ffbr o;
    private final ffbr p;
    private final cqoh q;
    private final ffbr y;
    private final ffbr z;
    private static final entd b = entd.c("BugleNotifications");
    private static final cskc c = cskc.g("Bugle", "NoConfirmationMessageSendAction");
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/datamodel/action/NoConfirmationMessageSendAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bais();

    /* compiled from: PG */
    public interface a {
        bbfh bb();
    }

    /* compiled from: PG */
    public interface b {
        bbfb aW();

        bbfd aX();

        cins cb();
    }

    public NoConfirmationMessageSendAction(Context context, ffbr ffbrVar, ayfg ayfgVar, ffbr ffbrVar2, akzt akztVar, ffbr ffbrVar3, ffbr ffbrVar4, cish cishVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, cqoh cqohVar, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13) {
        super(eogt.NO_CONFIRMATION_MESSAGE_SEND_ACTION);
        this.z = ffbrVar;
        this.A = ffbrVar10;
        this.B = ffbrVar12;
        b bVar = (b) ctba.a(b.class);
        this.e = bVar.cb();
        this.f = bVar.aW();
        this.y = ffbrVar8;
        this.i = context;
        this.j = ayfgVar;
        this.k = ffbrVar2;
        this.l = akztVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.m = cishVar;
        this.a = ffbrVar5;
        this.o = ffbrVar6;
        this.p = ffbrVar7;
        this.q = cqohVar;
        this.n = bVar.aX();
        this.D = ffbrVar9;
        this.E = ffbrVar13;
        this.C = ffbrVar11;
    }

    private static String h(Intent intent, String str) {
        Bundle resultsFromIntent;
        CharSequence charSequence;
        String stringExtra = intent.getStringExtra(str);
        return (stringExtra != null || (resultsFromIntent = RemoteInput.getResultsFromIntent(intent)) == null || (charSequence = resultsFromIntent.getCharSequence(str)) == null) ? stringExtra : charSequence.toString();
    }

    private final void k(fjay fjayVar, eyja eyjaVar, fgjz fgjzVar) {
        ((bbbr) this.o.b()).b(fjayVar, null, 10, 21, 44, Optional.of(fgjzVar), eyjaVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("NoConfirmationMessageSendAction");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x050b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03de  */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 1419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.NoConfirmationMessageSend.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public NoConfirmationMessageSendAction(Context context, ffbr ffbrVar, ayfg ayfgVar, ffbr ffbrVar2, akzt akztVar, ffbr ffbrVar3, ffbr ffbrVar4, cish cishVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, cqoh cqohVar, Parcel parcel) {
        super(parcel, eogt.NO_CONFIRMATION_MESSAGE_SEND_ACTION);
        this.z = ffbrVar;
        this.A = ffbrVar11;
        this.C = ffbrVar12;
        this.B = ffbrVar13;
        b bVar = (b) ctba.a(b.class);
        this.e = bVar.cb();
        this.f = bVar.aW();
        this.y = ffbrVar8;
        this.i = context;
        this.j = ayfgVar;
        this.k = ffbrVar2;
        this.l = akztVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.m = cishVar;
        this.a = ffbrVar5;
        this.o = ffbrVar6;
        this.p = ffbrVar7;
        this.q = cqohVar;
        this.n = bVar.aX();
        this.D = ffbrVar9;
        this.E = ffbrVar10;
    }
}
