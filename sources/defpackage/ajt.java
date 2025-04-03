package defpackage;

import android.media.CamcorderProfile;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajt implements afq {
    @Override // defpackage.afq
    public final CamcorderProfile a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // defpackage.afq
    public final boolean b(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }
}
