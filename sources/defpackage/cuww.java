package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuww {
    public static int a(String str) {
        return le.f(str) ? R.string.attachment_audio_clip : le.t(str) ? R.string.attachment_location : le.n(str) ? R.string.attachment_image : le.A(str) ? R.string.attachment_video : le.z(str) ? R.string.attachment_vcard : (asma.a() && "application/x-end-of-emergency-proto".equals(str)) ? R.string.attachment_end_of_emergency : le.v(str) ? R.string.attachment_file : R.string.attachment_unsupported_file;
    }
}
