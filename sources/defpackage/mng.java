package defpackage;

import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mng {
    public static void a(AudioTrack audioTrack, mmb mmbVar) {
        audioTrack.setPreferredDevice(mmbVar == null ? null : mmbVar.a);
    }
}
