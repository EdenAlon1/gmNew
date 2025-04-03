package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ResumeRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bavo implements bbgc {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;

    public bavo(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        ffbrVar5.getClass();
        this.e = ffbrVar5;
        ffbrVar6.getClass();
        this.f = ffbrVar6;
        ffbrVar7.getClass();
        this.g = ffbrVar7;
        ffbrVar8.getClass();
        this.h = ffbrVar8;
        ffbrVar9.getClass();
        this.i = ffbrVar9;
        ffbrVar10.getClass();
        this.j = ffbrVar10;
    }

    @Override // defpackage.bbgc
    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType) {
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        akzt akztVar = (akzt) this.c.b();
        akztVar.getClass();
        errl errlVar = (errl) this.d.b();
        errlVar.getClass();
        errl errlVar2 = (errl) this.e.b();
        errlVar2.getClass();
        cqos cqosVar = (cqos) this.f.b();
        cqosVar.getClass();
        cqvy cqvyVar = (cqvy) this.g.b();
        cqvyVar.getClass();
        awah awahVar = (awah) this.i.b();
        awahVar.getClass();
        messageIdType.getClass();
        ffbr ffbrVar = this.j;
        return new ResumeRcsFileTransferAction(this.a, cqohVar, akztVar, errlVar, errlVar2, cqosVar, cqvyVar, this.h, awahVar, ffbrVar, messageIdType);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        akzt akztVar = (akzt) this.c.b();
        akztVar.getClass();
        errl errlVar = (errl) this.d.b();
        errlVar.getClass();
        errl errlVar2 = (errl) this.e.b();
        errlVar2.getClass();
        cqos cqosVar = (cqos) this.f.b();
        cqosVar.getClass();
        cqvy cqvyVar = (cqvy) this.g.b();
        cqvyVar.getClass();
        awah awahVar = (awah) this.i.b();
        awahVar.getClass();
        parcel.getClass();
        return new ResumeRcsFileTransferAction(this.a, cqohVar, akztVar, errlVar, errlVar2, cqosVar, cqvyVar, this.h, this.j, awahVar, parcel);
    }
}
