package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReloadCequintParticipantAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class batu implements bbfx {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public batu(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        ffbrVar5.getClass();
        this.e = ffbrVar5;
        ffbrVar6.getClass();
        this.f = ffbrVar6;
    }

    @Override // defpackage.bbfx
    public final /* bridge */ /* synthetic */ Action a(ParticipantsTable.BindData bindData) {
        Context context = (Context) this.a.b();
        context.getClass();
        bcpz bcpzVar = (bcpz) this.c.b();
        bcpzVar.getClass();
        bbfx bbfxVar = (bbfx) this.d.b();
        bbfxVar.getClass();
        cbfs cbfsVar = (cbfs) this.f.b();
        cbfsVar.getClass();
        return new ReloadCequintParticipantAction(context, this.b, bcpzVar, bbfxVar, this.e, cbfsVar, bindData);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        bcpz bcpzVar = (bcpz) this.c.b();
        bcpzVar.getClass();
        bbfx bbfxVar = (bbfx) this.d.b();
        bbfxVar.getClass();
        cbfs cbfsVar = (cbfs) this.f.b();
        cbfsVar.getClass();
        parcel.getClass();
        return new ReloadCequintParticipantAction(context, bcpzVar, bbfxVar, this.e, cbfsVar, parcel);
    }
}
