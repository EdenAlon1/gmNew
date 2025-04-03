package defpackage;

import com.google.android.libraries.user.profile.photopicker.art.edit.ArtEditActivity;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efwi implements ehrp {
    final /* synthetic */ ArtEditActivity a;

    public efwi(ArtEditActivity artEditActivity) {
        this.a = artEditActivity;
    }

    @Override // defpackage.ehro
    public final void b(ehrt ehrtVar) {
        this.a.s.a(dvxh.e(), ehrtVar.i);
        this.a.J.setDisplayedChild(ehrtVar.e);
        ArtEditActivity artEditActivity = this.a;
        efxc efxcVar = artEditActivity.w;
        int i = ehrtVar.e;
        efxcVar.b = i;
        boolean z = false;
        boolean z2 = i == 2;
        EditableArtView editableArtView = artEditActivity.G;
        editableArtView.i = z2;
        if (i != 1 && (i == 2 || efxcVar.d != -1)) {
            z = true;
        }
        editableArtView.i = z;
        editableArtView.k(z);
    }

    @Override // defpackage.ehro
    public final void a(ehrt ehrtVar) {
    }

    @Override // defpackage.ehro
    public final void c(ehrt ehrtVar) {
    }
}
