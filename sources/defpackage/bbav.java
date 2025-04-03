package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UploadAttachmentsToBlobstoreAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbav extends bbgi {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public bbav(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
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

    @Override // defpackage.bbgi
    public final /* bridge */ /* synthetic */ Action a(ArrayList arrayList, String str, boolean z) {
        bznu bznuVar = (bznu) this.a.b();
        bznuVar.getClass();
        chdj chdjVar = (chdj) this.b.b();
        chdjVar.getClass();
        errl errlVar = (errl) this.d.b();
        errlVar.getClass();
        Optional optional = (Optional) this.e.b();
        optional.getClass();
        ejar ejarVar = (ejar) this.f.b();
        ejarVar.getClass();
        return new UploadAttachmentsToBlobstoreAction(bznuVar, chdjVar, this.c, errlVar, optional, ejarVar, arrayList, str, z);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        bznu bznuVar = (bznu) this.a.b();
        bznuVar.getClass();
        chdj chdjVar = (chdj) this.b.b();
        chdjVar.getClass();
        errl errlVar = (errl) this.d.b();
        errlVar.getClass();
        Optional optional = (Optional) this.e.b();
        optional.getClass();
        ejar ejarVar = (ejar) this.f.b();
        ejarVar.getClass();
        parcel.getClass();
        return new UploadAttachmentsToBlobstoreAction(bznuVar, chdjVar, this.c, errlVar, optional, ejarVar, parcel);
    }
}
