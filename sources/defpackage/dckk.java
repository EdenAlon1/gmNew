package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class dckk {
    public final /* synthetic */ LocationAttachmentPickerActivity a;
    public final /* synthetic */ dhbx b;

    public /* synthetic */ dckk(LocationAttachmentPickerActivity locationAttachmentPickerActivity, dhbx dhbxVar) {
        this.a = locationAttachmentPickerActivity;
        this.b = dhbxVar;
    }

    public final void a(dhbo dhboVar) {
        ((enrr) ((enrr) LocationAttachmentPickerActivity.K.h()).h("com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerActivity", "initializeViews", 232, "LocationAttachmentPickerActivity.java")).t("Initialized maps SDK with %s renderer", dhboVar);
        dfwv.e("getMapAsync must be called on the main thread.");
        LocationAttachmentPickerActivity locationAttachmentPickerActivity = this.a;
        dhbw dhbwVar = this.b.a;
        dggo dggoVar = dhbwVar.a;
        if (dggoVar != null) {
            ((dhbv) dggoVar).getMapAsync(locationAttachmentPickerActivity);
        } else {
            dhbwVar.d.add(locationAttachmentPickerActivity);
        }
    }
}
