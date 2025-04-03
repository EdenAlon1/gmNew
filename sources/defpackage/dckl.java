package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dckl extends abo {
    final /* synthetic */ LocationAttachmentPickerActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dckl(LocationAttachmentPickerActivity locationAttachmentPickerActivity) {
        super(true);
        this.a = locationAttachmentPickerActivity;
    }

    @Override // defpackage.abo
    public final void b() {
        this.a.Q.c("Bugle.Share.LocationAttachmentPicker.ExitedWithoutSending");
        h(false);
        this.a.gE().d();
    }
}
