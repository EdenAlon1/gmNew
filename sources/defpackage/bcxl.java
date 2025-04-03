package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcxl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        bcxm bz = ((PendingAttachmentData.a) ctba.a(PendingAttachmentData.a.class)).bz();
        ctfj ctfjVar = (ctfj) bz.a.b();
        ctfjVar.getClass();
        Context context = (Context) bz.b.b();
        context.getClass();
        csuk csukVar = (csuk) bz.c.b();
        csukVar.getClass();
        cpbs cpbsVar = (cpbs) bz.d.b();
        cpbsVar.getClass();
        csuu csuuVar = (csuu) bz.e.b();
        csuuVar.getClass();
        bcwz bcwzVar = (bcwz) bz.f.b();
        bcwzVar.getClass();
        cbar cbarVar = (cbar) bz.g.b();
        cbarVar.getClass();
        ffbr ffbrVar = bz.h;
        cpaz cpazVar = (cpaz) bz.i.b();
        cpazVar.getClass();
        bcxm bcxmVar = (bcxm) bz.w.b();
        bcxmVar.getClass();
        ctap ctapVar = (ctap) bz.j.b();
        ctapVar.getClass();
        cqoh cqohVar = (cqoh) bz.k.b();
        cqohVar.getClass();
        ctyz ctyzVar = (ctyz) bz.l.b();
        ctyzVar.getClass();
        cswf cswfVar = (cswf) bz.m.b();
        cswfVar.getClass();
        Optional optional = (Optional) bz.n.b();
        optional.getClass();
        ctfn ctfnVar = (ctfn) bz.o.b();
        ctfnVar.getClass();
        errl errlVar = (errl) bz.p.b();
        errlVar.getClass();
        asmj asmjVar = (asmj) bz.q.b();
        asmjVar.getClass();
        ffbr ffbrVar2 = bz.r;
        parcel.getClass();
        aswd aswdVar = (aswd) bz.s.b();
        aswdVar.getClass();
        return new PendingAttachmentData(ctfjVar, context, csukVar, cpbsVar, csuuVar, bcwzVar, cbarVar, ffbrVar, cpazVar, bcxmVar, ctapVar, cqohVar, ctyzVar, cswfVar, optional, ctfnVar, errlVar, asmjVar, ffbrVar2, parcel, aswdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PendingAttachmentData[i];
    }
}
