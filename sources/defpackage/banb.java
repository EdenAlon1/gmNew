package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerFavoriteAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class banb implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public banb(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
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
    }

    public final /* synthetic */ Action a(fcek fcekVar, String str, String str2, boolean z) {
        chep chepVar = (chep) this.b.b();
        chepVar.getClass();
        chez chezVar = (chez) this.c.b();
        chezVar.getClass();
        chww chwwVar = (chww) this.d.b();
        chwwVar.getClass();
        str.getClass();
        str2.getClass();
        return new ProcessExpressiveStickerFavoriteAction(this.a, chepVar, chezVar, chwwVar, this.e, fcekVar, str, str2, z);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        chep chepVar = (chep) this.b.b();
        chepVar.getClass();
        chez chezVar = (chez) this.c.b();
        chezVar.getClass();
        chww chwwVar = (chww) this.d.b();
        chwwVar.getClass();
        parcel.getClass();
        return new ProcessExpressiveStickerFavoriteAction(this.a, chepVar, chezVar, chwwVar, this.e, parcel);
    }
}
