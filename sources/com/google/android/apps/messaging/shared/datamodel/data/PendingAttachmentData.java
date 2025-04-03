package com.google.android.apps.messaging.shared.datamodel.data;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import defpackage.asmj;
import defpackage.aswd;
import defpackage.bcwz;
import defpackage.bcxl;
import defpackage.bcxm;
import defpackage.cbar;
import defpackage.cpaz;
import defpackage.cpbs;
import defpackage.cqoh;
import defpackage.cskc;
import defpackage.cslh;
import defpackage.csuk;
import defpackage.csuu;
import defpackage.cswf;
import defpackage.ctap;
import defpackage.ctfj;
import defpackage.ctfn;
import defpackage.ctyz;
import defpackage.emxf;
import defpackage.eohh;
import defpackage.errl;
import defpackage.ffbr;
import defpackage.le;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class PendingAttachmentData extends MessagePartData {
    public int k;
    public cslh l;
    public Uri m;
    public final ctfj n;
    public final Context o;
    public final csuk p;
    public final cpbs q;
    public final csuu r;
    public final bcwz s;
    private final bcxm t;
    public static final cskc i = cskc.g("Bugle", "PendingAttachmentData");
    public static final int j = (int) TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator<PendingAttachmentData> CREATOR = new bcxl();

    /* compiled from: PG */
    public interface a {
        bcxm bz();
    }

    public PendingAttachmentData(cbar cbarVar, ffbr ffbrVar, cpaz cpazVar, bcxm bcxmVar, ctap ctapVar, cqoh cqohVar, ctyz ctyzVar, cswf cswfVar, Optional optional, ctfn ctfnVar, errl errlVar, asmj asmjVar, ffbr ffbrVar2, PendingAttachmentData pendingAttachmentData, aswd aswdVar) {
        super(cbarVar, ffbrVar, cpazVar, pendingAttachmentData.s, ctapVar, cqohVar, ctyzVar, pendingAttachmentData.o, pendingAttachmentData.r, cswfVar, optional, ctfnVar, errlVar, asmjVar, ffbrVar2, pendingAttachmentData, aswdVar);
        this.t = bcxmVar;
        this.k = pendingAttachmentData.k;
        this.n = pendingAttachmentData.n;
        this.o = pendingAttachmentData.o;
        this.p = pendingAttachmentData.p;
        this.q = pendingAttachmentData.q;
        this.r = pendingAttachmentData.r;
        this.s = pendingAttachmentData.s;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final /* bridge */ /* synthetic */ MessagePartCoreData D() {
        bcxm bcxmVar = this.t;
        cbar cbarVar = (cbar) bcxmVar.g.b();
        cbarVar.getClass();
        cpaz cpazVar = (cpaz) bcxmVar.i.b();
        cpazVar.getClass();
        bcxm bcxmVar2 = (bcxm) bcxmVar.v.b();
        bcxmVar2.getClass();
        ctap ctapVar = (ctap) bcxmVar.j.b();
        ctapVar.getClass();
        cqoh cqohVar = (cqoh) bcxmVar.k.b();
        cqohVar.getClass();
        ctyz ctyzVar = (ctyz) bcxmVar.l.b();
        ctyzVar.getClass();
        cswf cswfVar = (cswf) bcxmVar.m.b();
        cswfVar.getClass();
        Optional optional = (Optional) bcxmVar.n.b();
        optional.getClass();
        ctfn ctfnVar = (ctfn) bcxmVar.o.b();
        ctfnVar.getClass();
        errl errlVar = (errl) bcxmVar.p.b();
        errlVar.getClass();
        asmj asmjVar = (asmj) bcxmVar.q.b();
        asmjVar.getClass();
        aswd aswdVar = (aswd) bcxmVar.s.b();
        aswdVar.getClass();
        return new PendingAttachmentData(cbarVar, bcxmVar.h, cpazVar, bcxmVar2, ctapVar, cqohVar, ctyzVar, cswfVar, optional, ctfnVar, errlVar, asmjVar, bcxmVar.r, this, aswdVar);
    }

    public final void bR() {
        cslh cslhVar = this.l;
        if (cslhVar != null) {
            this.l = null;
            cslhVar.cancel(false);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri v() {
        Uri v = super.v();
        return v != null ? v : this.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData
    protected final Uri y() {
        bR();
        return super.y();
    }

    public PendingAttachmentData(ctfj ctfjVar, Context context, csuk csukVar, cpbs cpbsVar, csuu csuuVar, bcwz bcwzVar, cbar cbarVar, ffbr ffbrVar, cpaz cpazVar, bcxm bcxmVar, ctap ctapVar, cqoh cqohVar, ctyz ctyzVar, cswf cswfVar, Optional optional, ctfn ctfnVar, errl errlVar, asmj asmjVar, ffbr ffbrVar2, Parcel parcel, aswd aswdVar) {
        super(cbarVar, ffbrVar, cpazVar, bcwzVar, ctapVar, cqohVar, ctyzVar, context, csuuVar, cswfVar, optional, ctfnVar, errlVar, asmjVar, ffbrVar2, parcel, aswdVar);
        this.t = bcxmVar;
        this.k = parcel.readInt();
        this.n = ctfjVar;
        this.o = context;
        this.p = csukVar;
        this.q = cpbsVar;
        this.r = csuuVar;
        this.s = bcwzVar;
    }

    public PendingAttachmentData(ctfj ctfjVar, Context context, csuk csukVar, cpbs cpbsVar, csuu csuuVar, bcwz bcwzVar, cbar cbarVar, ffbr ffbrVar, cpaz cpazVar, bcxm bcxmVar, ctap ctapVar, cqoh cqohVar, ctyz ctyzVar, cswf cswfVar, Optional optional, ctfn ctfnVar, errl errlVar, asmj asmjVar, ffbr ffbrVar2, MessagePartData messagePartData, aswd aswdVar) {
        super(cbarVar, ffbrVar, cpazVar, bcwzVar, ctapVar, cqohVar, ctyzVar, context, csuuVar, cswfVar, optional, ctfnVar, errlVar, asmjVar, ffbrVar2, messagePartData, aswdVar);
        this.t = bcxmVar;
        this.k = 0;
        this.n = ctfjVar;
        this.o = context;
        this.p = csukVar;
        this.q = cpbsVar;
        this.r = csuuVar;
        this.s = bcwzVar;
    }

    public PendingAttachmentData(ctfj ctfjVar, Context context, csuk csukVar, cpbs cpbsVar, csuu csuuVar, bcwz bcwzVar, cbar cbarVar, ffbr ffbrVar, cpaz cpazVar, bcxm bcxmVar, ctap ctapVar, cqoh cqohVar, ctyz ctyzVar, cswf cswfVar, Optional optional, ctfn ctfnVar, errl errlVar, asmj asmjVar, ffbr ffbrVar2, String str, Uri uri, eohh eohhVar, LocationInformation locationInformation, aswd aswdVar) {
        this(ctfjVar, context, csukVar, cpbsVar, csuuVar, bcwzVar, cbarVar, ffbrVar, cpazVar, bcxmVar, ctapVar, cqohVar, ctyzVar, cswfVar, optional, ctfnVar, errlVar, asmjVar, ffbrVar2, str, "application/vnd.gsma.rcspushlocation+xml", uri, null, 800, 400, null, null, -1L, eohhVar, -1L, locationInformation, null, null, aswdVar);
        emxf.a(le.q("application/vnd.gsma.rcspushlocation+xml"));
    }

    public PendingAttachmentData(ctfj ctfjVar, Context context, csuk csukVar, cpbs cpbsVar, csuu csuuVar, bcwz bcwzVar, cbar cbarVar, ffbr ffbrVar, cpaz cpazVar, bcxm bcxmVar, ctap ctapVar, cqoh cqohVar, ctyz ctyzVar, cswf cswfVar, Optional optional, ctfn ctfnVar, errl errlVar, asmj asmjVar, ffbr ffbrVar2, String str, Uri uri, Uri uri2, int i2, int i3, long j2, eohh eohhVar, String str2, String str3, long j3, String str4, String str5, aswd aswdVar) {
        this(ctfjVar, context, csukVar, cpbsVar, csuuVar, bcwzVar, cbarVar, ffbrVar, cpazVar, bcxmVar, ctapVar, cqohVar, ctyzVar, cswfVar, optional, ctfnVar, errlVar, asmjVar, ffbrVar2, null, str, uri, uri2, i2, i3, str2, str3, j2, eohhVar, j3, null, str4, str5, aswdVar);
        emxf.a(le.q(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PendingAttachmentData(defpackage.ctfj r19, android.content.Context r20, defpackage.csuk r21, defpackage.cpbs r22, defpackage.csuu r23, defpackage.bcwz r24, defpackage.cbar r25, defpackage.ffbr r26, defpackage.cpaz r27, defpackage.bcxm r28, defpackage.ctap r29, defpackage.cqoh r30, defpackage.ctyz r31, defpackage.cswf r32, j$.util.Optional r33, defpackage.ctfn r34, defpackage.errl r35, defpackage.asmj r36, defpackage.ffbr r37, java.lang.String r38, java.lang.String r39, android.net.Uri r40, android.net.Uri r41, int r42, int r43, java.lang.String r44, java.lang.String r45, long r46, defpackage.eohh r48, long r49, com.google.android.ims.rcsservice.locationsharing.LocationInformation r51, java.lang.String r52, java.lang.String r53, defpackage.aswd r54) {
        /*
            r18 = this;
            bcxb r0 = defpackage.bcxc.C()
            r1 = r0
            bcqk r1 = (defpackage.bcqk) r1
            r2 = r38
            r1.b = r2
            r2 = r39
            r1.c = r2
            r2 = r40
            r1.d = r2
            r2 = r41
            r1.e = r2
            r2 = r42
            r0.q(r2)
            r2 = r43
            r0.i(r2)
            r2 = -1
            r0.g(r2)
            r2 = r44
            r1.f = r2
            r2 = r45
            r1.g = r2
            r2 = r46
            r0.p(r2)
            r2 = r48
            r0.o(r2)
            r2 = r49
            r0.j(r2)
            r2 = r51
            r1.h = r2
            r2 = r52
            r1.i = r2
            r2 = r53
            r1.j = r2
            bcxc r16 = r0.r()
            r0 = r18
            r8 = r20
            r9 = r23
            r4 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r5 = r29
            r6 = r30
            r7 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r17 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r28
            r0.t = r1
            r1 = 0
            r0.k = r1
            r1 = r19
            r0.n = r1
            r0.o = r8
            r1 = r21
            r0.p = r1
            r1 = r22
            r0.q = r1
            r0.r = r9
            r0.s = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData.<init>(ctfj, android.content.Context, csuk, cpbs, csuu, bcwz, cbar, ffbr, cpaz, bcxm, ctap, cqoh, ctyz, cswf, j$.util.Optional, ctfn, errl, asmj, ffbr, java.lang.String, java.lang.String, android.net.Uri, android.net.Uri, int, int, java.lang.String, java.lang.String, long, eohh, long, com.google.android.ims.rcsservice.locationsharing.LocationInformation, java.lang.String, java.lang.String, aswd):void");
    }
}
